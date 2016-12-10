<?xml version="1.0" encoding="UTF-8" ?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

    <xsl:template match="/">
        <html>
            <mydata>
                <xsl:apply-templates select="/pricelist/book"/>
            </mydata>
        </html>
    </xsl:template>

    <xsl:template match="book">
        <xsl:element name="item-{position()}">
            <xsl:attribute name="price">
                <xsl:value-of select="price"/>
            </xsl:attribute>
            <xsl:value-of select="title"/>
        </xsl:element>
    </xsl:template>

</xsl:stylesheet>
