<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@ page pageEncoding="UTF-8" %>
<html>
<head>
    <title>JSTL XML</title>
</head>
<body>

<h3>Novels Information:</h3>
<c:set var="xmltext">
    <books>
        <book>
            <name>Three mistakes of my life</name>
            <author>Chetan Bhagat</author>
            <price>200</price>
        </book>
        <book>
            <name>Tomorrow land</name>
            <author>Brad Bird</author>
            <price>1000</price>
        </book>
        <book>
            <name>Wings of fire</name>
            <author>Dr. APJ Abdul Kalam</author>
            <price>500</price>
        </book>
    </books>
</c:set>

<c:import url="transfer.xsl" var="xslt"/>
<x:transform xml="${xmltext}" xslt="${xslt}">
    <x:param name="bgColor" value="yellow"/>
</x:transform>

</body>
</html>
