<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
The <c:forTokens> tag has similar attributes as <c:forEach> except one additional attribute delims which specifies sharacters to use as delimiters.

Attribute	Description	                      Required	Default
delims	    Characters to use as delimiters	  Yes	    None
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>forTokens</title>
</head>
<body>
<c:forTokens items="Zara,nuha,roshy" delims="," var="name">
    <c:out value="${name}"/><br/>
</c:forTokens>
</body>
</html>
