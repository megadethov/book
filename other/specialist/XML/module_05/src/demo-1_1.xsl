<?xml version="1.0" encoding="UTF-8" ?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

    <xsl:template match="/">
        <html>
            <mydata>
                <xsl:apply-templates select="/pricelist/book"/>
            </mydata>
        </html>
    </xsl:template>

    <xsl:attribute-set name="setX">
        <xsl:attribute name="atr1">attribute1</xsl:attribute>
        <xsl:attribute name="atr2">attribute2</xsl:attribute>
    </xsl:attribute-set>

    <xsl:attribute-set name="setY">
        <xsl:attribute name="atr3">attribute1</xsl:attribute>
        <xsl:attribute name="atr4">attribute2</xsl:attribute>
    </xsl:attribute-set>

    <xsl:template match="book">
        <xsl:element use-attribute-sets="setX setY" name="item-{position()}">
            <xsl:attribute name="price">
                <xsl:value-of select="price"/>
            </xsl:attribute>
            <xsl:value-of select="title"/>
        </xsl:element>
    </xsl:template>

</xsl:stylesheet>
