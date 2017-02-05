<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
The <c:if> tag evaluates an expression and displays its body content only if the expression evaluates to true.

Attribute:
The <c:if> tag has following attributes:

Attribute	            Description	                                             Required	            Default
test	                Condition to evaluate	                                 Yes	                None
var                 	Name of the variable to store the condition's result	 No                 	None
scope	                Scope of the variable to store the condition's result	 No	                    page
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>c:if</title>
</head>
<body>

<c:set var="salary" scope="session" value="${2000*2}"/>
<c:if test="${salary > 2000}">
    <p>My salary is: <c:out value="${salary}"/></p>
</c:if>

</body>
</html>
