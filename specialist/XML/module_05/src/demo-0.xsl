<?xml version="1.0" encoding="UTF-8" ?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:template match="/prise/book">
        Это Книга!
    </xsl:template>
    <xsl:template match="/price/book[price=200]">
        Это Книга с ценой!
    </xsl:template>
</xsl:stylesheet>