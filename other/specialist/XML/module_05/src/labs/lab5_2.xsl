<?xml version="1.0" encoding="UTF-8" ?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">


    <xsl:template match="/">
        <html>
            <body>
                <h1>Lab 5.2</h1>
                <table border="1">
                    <xsl:apply-templates select="/lab5_2/element">
                        <xsl:sort select="@price" data-type="number"/>
                    </xsl:apply-templates>
                </table>
            </body>
        </html>
    </xsl:template>

    <xsl:template match="element">
           <tr>
               <xsl:if test="position() mod 2 != 0">
                   <xsl:attribute name="style">background:#ddd</xsl:attribute>
               </xsl:if>
               <td><xsl:value-of select="@name"/></td>
               <td><xsl:value-of select="@value"/></td>
               <td><xsl:value-of select="@price"/></td>
           </tr>
    </xsl:template>

</xsl:stylesheet>