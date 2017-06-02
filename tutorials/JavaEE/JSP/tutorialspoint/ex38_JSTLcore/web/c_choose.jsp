<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
The <c:choose> works like a Java switch statement in that it lets you choose between a number of alternatives.
Where the switch statement has case statements, the <c:choose> tag has <c:when> tags.
A a switch statement has default clause to specify a default action and similar way <c:choose> has <c:otherwise> as default clause.
Attribute:
The <c:choose> tag does not have any attribute.
The <c:when> tag has one attributes which is listed below.
The <c:otherwise> tag does not have any attribute.
The <c:when> tag has following attributes:
Attribute	Description	            Required	Default
test	    Condition to evaluate	Yes	        None
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>c:choose</title>
</head>
<body>

<c:set var="salary" value="${2000*2}" scope="session"/>
<p>Your salary is - ${salary}</p>
<c:choose>
    <c:when test="${salary<=0}">
        Salary is very low to survive.
    </c:when>
    <c:when test="${salary>0}">
        Salary is very good.
    </c:when>
</c:choose>

</body>
</html>
