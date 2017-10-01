<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %><%--
The <fmt:parseNumber> tag is used to parse numbers, percentages, and currencies.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>fmt:parseNumber</title>
</head>
<body>
<h3>Number Parsing:</h3>
<c:set var="balance" value="1250003.350"/>

<fmt:parseNumber var="i" type="number" value="${balance}"/>
<p>Parsed Number (1) :
    <c:out value="${i}"/>
</p>

<fmt:parseNumber var="j" integerOnly="true" type="number" value="${balance}"/>
<p>Parsed Number (2) :
    <c:out value="${i}"/>
</p>
</body>
</html>
