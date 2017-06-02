<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page pageEncoding="UTF-8" %>
<html>
<head>
    <title>fmt:timeZone Tag</title>
</head>
<body>

<h3>Parsed Date:</h3>
<c:set var="date" value="12-08-2016"/>

<fmt:parseDate value="${date}" var="parsedDate" pattern="dd-MM-yyyy"/>
<p><c:out value="${parsedDate}"/></p>


</body>
</html>
