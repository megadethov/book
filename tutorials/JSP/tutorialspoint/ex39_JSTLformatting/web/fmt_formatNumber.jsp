<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
The <fmt:formatNumber> tag is used to format numbers, percentages, and currencies.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>fmt:formatNumber</title>
</head>
<body>
<h3>Number Format:</h3>
<c:set var="balance" value="120000.2309"/>
<p>Formatted Number (1):
    <fmt:formatNumber value="${balance}" type="currency"/>
</p>
<p>Formatted Number (2):
    <fmt:formatNumber value="${balance}" type="number" maxIntegerDigits="2"/>
</p>
<p>Formatted Number (3):
    <fmt:formatNumber value="${balance}" type="number" maxFractionDigits="2"/>
</p>
<p>Formatted Number (4):
    <fmt:formatNumber value="${balance}" type="number" groupingUsed="false"/>
</p>
<p>Formatted Number (5):
    <fmt:formatNumber value="${balance}" type="percent" maxIntegerDigits="3"/>
</p>
<p>Formatted Number (6):
    <fmt:formatNumber value="${balance}" type="percent" minFractionDigits="3"/>
</p>
<p>Formatted Number (7):
    <fmt:formatNumber value="${balance}" type="percent" maxIntegerDigits="3"/>
</p>
<p>Formatted Number (8):
    <fmt:formatNumber value="${balance}" type="number" pattern="###.###E0"/>
</p>
<p>Currency in USA :
    <fmt:setLocale value="en_US"/>
    <fmt:formatNumber value="${balance}" type="currency"/>
</p>
</body>
</html>
