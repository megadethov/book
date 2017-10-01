<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@ page pageEncoding="UTF-8" %>
<html>
<head>
    <title>JSTL XML</title>
</head>
<body>

<h2>Vegetable Information:</h2>

<c:set var="vegetable">
    <vegetables>
        <vegetable>
            <name>Onion</name>
            <price>40/kg</price>
        </vegetable>
        <vegetable>
            <name>Potato</name>
            <price>30/kg</price>
        </vegetable>
        <vegetable>
            <name>Tomato</name>
            <price>90/kg</price>
        </vegetable>
    </vegetables>
</c:set>

<x:parse xml="${vegetable}" var="output"/>
<b>Name of the vegetable is</b>:
<x:out select="$output/vegetables/vegetable[1]/name"/><br/>
<b>Price of the Tomato is</b>:
<x:out select="$output/vegetables/vegetable[3]/price"/><br/>

</body>
</html>
