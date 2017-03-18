<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%--
The <fmt:parseDate> tag is used to parse dates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>fmt:parseDate</title>
</head>
<body>
<h3>Date Parsing:</h3>
<c:set var="now" value="20-10-2010"/>

<fmt:parseDate var="parsedEmpDate" value="${now}" pattern="dd-MM-yyyy"/>

<p>
    Parsed Date: <c:out value="${parsedEmpDate}"/>
</p>
</body>
</html>
