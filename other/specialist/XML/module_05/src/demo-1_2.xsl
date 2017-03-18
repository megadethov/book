<?xml version="1.0" encoding="UTF-8" ?>
        <xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">

    <xsl:template match="/">
        <html>
            <body>
                <xsl:apply-templates select="/pricelist/book"/>
            </body>
        </html>
    </xsl:template>

    <xsl:template match="book">
        <div>
            <!--Какой-то комментарий-->
            Заголовок:
            <xsl:value-of select="title"/>
            <xsl:text><![CDATA[&nbsp;]]></xsl:text>
            <xsl:value-of select="author"/>!!!
        </div>
    </xsl:template>

</xsl:stylesheet>