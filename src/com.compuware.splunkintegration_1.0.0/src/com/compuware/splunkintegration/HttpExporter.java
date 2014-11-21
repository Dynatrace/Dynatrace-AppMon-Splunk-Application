package com.compuware.splunkintegration;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.StringUtils;

import com.dynatrace.diagnostics.global.ConnectionStatusResponse;
import com.dynatrace.diagnostics.global.ConnectionStatusResponse.ConnectionState;
import com.dynatrace.diagnostics.pdk.ActionEnvironment;


/**
 *
 * @author cwat-pkaiser
 *
 */
public class HttpExporter {

	//public static final String HEADER_DYNATRACE_VERSION = "X-dynaTrace-Version";

	private static final int CONNECTION_TIMEOUT_MILLISECONDS = 10000;
	private static final int READ_TIMEOUT_MILLISECONDS = 10000;

	private static final int DATA_SIZE_WARNING_THRESHOLD = Integer.parseInt(System.getProperty("com.dynatrace.diagnostics.export.sizeWarningThreshold", String.valueOf(1024 * 1024)));

	private static final SSLSocketFactory TRUST_ALL_SOCKET_FACTORY;

	private static final ConnectionStatusResponse OK_STATUS = new ConnectionStatusResponse(ConnectionState.CONNECTION_OK, null, ConnectionStatusResponse.RESPONSE_CODE_NOT_SET);

	private static final Logger log = Logger.getLogger((HttpExporter.class.getName()));


	private static final HostnameVerifier VERIFY_ALL_HOSTS = new HostnameVerifier() {
		@Override
		public boolean verify(String hostname, SSLSession session) {
			return true;
		}
	};


	static {
		SSLSocketFactory tmp = null;
		try {
			SSLContext context = SSLContext.getInstance("SSL");
			context.init(null, new TrustManager[] {
					new X509TrustManager() {

						@Override
						public X509Certificate[] getAcceptedIssuers() {
							return null;
						}

						@Override
						public void checkServerTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {
						}

						@Override
						public void checkClientTrusted(X509Certificate[] arg0, String arg1) throws CertificateException {
						}
					}
			}, null);
			tmp = context.getSocketFactory();
		} catch (KeyManagementException kme) {
			log.log(Level.WARNING, "Can't initialize SSL Context.", kme);
		} catch (NoSuchAlgorithmException nsae) {
			log.log(Level.SEVERE, "SSL not an algorithm?", nsae);
		}
		TRUST_ALL_SOCKET_FACTORY = tmp;
	}


	private volatile ConnectionStatusResponse status = new ConnectionStatusResponse(ConnectionState.UNKNOWN, null, ConnectionStatusResponse.RESPONSE_CODE_NOT_SET);
	private final URL url;
	private final Boolean allowUntrustedSSL;
	private final Boolean useAuthentication;
	private final String authString;


	/**
	 *
	 *
	 * @param httpExportConfig
	 * @throws MalformedURLException 
	 */
	public HttpExporter(ActionEnvironment httpExportConfig) throws MalformedURLException {
		String urls = httpExportConfig.getConfigUrl("url").toString();
		while (urls.endsWith("/"))
			urls = urls.substring(0,urls.length() -1);
		url = new URL(urls + "/alerts");
		Boolean b = httpExportConfig.getConfigBoolean("AllowUntrustedSSL");
		allowUntrustedSSL = b == null ? false : b;
		b = httpExportConfig.getConfigBoolean("UseAuthentication");
		useAuthentication = b == null ? false : b;
		if (useAuthentication)
			authString = getAuthString(httpExportConfig.getConfigString("AuthenticationUser"), httpExportConfig.getConfigPassword("AuthenticationPassword"));
		else
			authString = null;
	}

	//can we detect faulty connections as well? maybe provide a test-button (good idea!!)
	/**
	 *
	 */
	public void doExport(byte[] data) {
		HttpURLConnection connection = null;
		try {
			connection = (HttpURLConnection)url.openConnection();
			connection.setConnectTimeout(CONNECTION_TIMEOUT_MILLISECONDS);
			connection.setReadTimeout(READ_TIMEOUT_MILLISECONDS);
			if (connection instanceof HttpsURLConnection && allowUntrustedSSL) {
				HttpsURLConnection httpsConnection = (HttpsURLConnection)connection;
				if (TRUST_ALL_SOCKET_FACTORY != null) {
					httpsConnection.setSSLSocketFactory(TRUST_ALL_SOCKET_FACTORY);
				}
				httpsConnection.setHostnameVerifier(VERIFY_ALL_HOSTS);
			}

			connection.setRequestMethod("POST");
			connection.setDoOutput(true);
			connection.setDoInput(true);
			connection.setInstanceFollowRedirects(false);
			connection.setRequestProperty("Content-Type", "application/octet-stream");
			connection.setRequestProperty("Content-Length", String.valueOf(data.length));
			if (useAuthentication) {
				connection.setRequestProperty("Authorization", authString);
			}
			DataOutputStream os = new DataOutputStream(connection.getOutputStream());
			os.write(data);
			os.flush();
			os.close();
			Reader reader = new InputStreamReader(connection.getInputStream());
			while (reader.read() > -1) {
				//have to read all from the inputstream, so the connection can be reused
			}
			reader.close();
			connection.disconnect();
			if (data.length > DATA_SIZE_WARNING_THRESHOLD) {
				log.warning("More than " + DATA_SIZE_WARNING_THRESHOLD + " bytes have been exported in one request. Verify bulkSize has not been set too high and the server accepts that request size");
			}
			status = OK_STATUS;
		} catch (IOException ioe) {
			int responseCode = ConnectionStatusResponse.RESPONSE_CODE_NOT_SET;
			if (connection != null) {
				try {
					responseCode = connection.getResponseCode();
				} catch (IOException e) {
					//do nothing
				}
			}
			ConnectionStatusResponse oldStatus = status;
			if (oldStatus.getReponse() != ConnectionState.CONNECTION_FAILED || oldStatus.getResponseCode() != responseCode || !StringUtils.equals(oldStatus.getResponseMsg(), ioe.getMessage())) {
				status = new ConnectionStatusResponse(ConnectionState.CONNECTION_FAILED, ioe.getMessage(), responseCode);
			}
		}
	}


	/**
	 *
	 * @return
	 */
	private static String getAuthString(String userName, String password) {
		StringBuilder sb = new StringBuilder(userName.length() + password.length() + 1);
		sb.append(userName).append(':').append(password);
		String base64 = Base64.encodeBase64String(sb.toString().getBytes());
		return new StringBuilder(base64.length() + 6).append("Basic ").append(base64).toString();
	}

	public ConnectionStatusResponse getLastExportStatus() {
		return status;
	}

}
