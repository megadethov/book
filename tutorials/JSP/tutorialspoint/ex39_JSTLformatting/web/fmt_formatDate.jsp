<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  The <fmt:formatDate> tag is used to format dates in a variety of ways
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>fmt:formatDate</title>
</head>
<body>
<h3>Number Format:</h3>
<c:set var="now" value="<%=new java.util.Date() %>" />

<p>
    Formatted Date (1): <fmt:formatDate type="time" value="${now}"/>
</p>

<%
    // TODO: 11.02.2017 coming soon... 
%>

</body>
</html>
