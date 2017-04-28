<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page pageEncoding="UTF-8" %>
<html>
<head>
    <title>fmt:timeZone Tag</title>
</head>
<body>

<h3>Formatting of Number:</h3>
<c:set var="Amount" value="9850.14115"/>
<p> Formatted Number-1:
    <fmt:formatNumber type="currency" value="${Amount}"/></p>
<p>Formatted Number-2:
    <fmt:formatNumber type="number" value="${Amount}" groupingUsed="true"/></p>
<p>Formatted Number-3:
    <fmt:formatNumber type="number" value="${Amount}" maxIntegerDigits="3"/></p>
<p>Formatted Number-4:
    <fmt:formatNumber type="number" maxFractionDigits="6" value="${Amount}"/></p>
<p>Formatted Number-5:
    <fmt:formatNumber type="percent" maxIntegerDigits="4" value="${Amount}"/></p>
<p>Formatted Number-6:
    <fmt:formatNumber type="number" pattern="###.###$" value="${Amount}"/></p>

</body>
</html>
