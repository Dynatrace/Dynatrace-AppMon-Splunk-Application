<?xml version="1.0" encoding="UTF-8"?>

<!-- New document created with EditiX at Tue Apr 09 13:30:13 CEST 2013 -->

<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

	<xsl:output method="text" indent="no"/>

<xsl:template match="/">
<xsl:apply-templates select="dashboardreport/data/chartdashlet/measures/measure/measurement"/>
</xsl:template>
<xsl:template match="measurement" >{ "measure" : "<xsl:value-of select="../@measure"/>", "metric" : { <xsl:for-each select="@*[name()!='timestamp']"> "<xsl:value-of select="name()"/>" : "<xsl:value-of select="."/>", </xsl:for-each> "timestamp" : "<xsl:value-of select="@timestamp"/>" } }
</xsl:template>
</xsl:stylesheet>


