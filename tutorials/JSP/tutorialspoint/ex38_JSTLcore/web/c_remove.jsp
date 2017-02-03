<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
The <c:remove> tag removes a variable from either a specified scope or the first scope where the variable is found
(if no scope is specified). This action is not normally particularly helpful, but it can aid in ensuring
that a JSP cleans up any scoped resources it is responsible for.
Attribute:
The <c:remove> tag has following attributes:

Attribute	            Description	                                Required	            Default
var	                    Name of the variable to remove	            Yes	                    None
scope	                Scope of the variable to remove	            No	                    All scopes
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>c:remove</title>
</head>
<body>

<c:set var="salary" scope="session" value="${2000*2}" />
<p>Before remove value:  <c:out value="${salary}"/></p>
<c:remove var="salary"/>
<p>After remove value: <c:out value="${salary}"/> </p>

</body>
</html>
