<?xml version="1.0" encoding="UTF-8" ?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="xml"/>

    <xsl:template match="/">
        <result>
            <xsl:apply-templates select="//a"/>
        </result>
    </xsl:template>

    <xsl:template match="a">
        <xsl:copy>
            <xsl:attribute name="href">
                <xsl:value-of select="@href"/>
            </xsl:attribute>
            <xsl:value-of select="."/>
        </xsl:copy>
    </xsl:template>

</xsl:stylesheet>