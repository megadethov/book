<?xml version="1.0" encoding="UTF-8" ?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/pricelist/book">
        <xsl:value-of select="./title"/>
    </xsl:template>
    <!--<xsl:template match="/pricelist/book[price=200]">-->
        <!--Это Книга с ценой!-->
    <!--</xsl:template>-->
</xsl:stylesheet>