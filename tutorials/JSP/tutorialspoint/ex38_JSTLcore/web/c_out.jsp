<%--
The <c:out> tag displays the result of an expression, similar to the way <%= %>
works with a difference that <c:out> tag lets you use the simpler "." notation to access properties.
For example, to access customer.address.street just use tag is <c:out value="customer.address.street"/>.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>c:out</title>
</head>
<body>
<c:out value="Hello from c:out"/>
<br/>
<c:out value="${Math.PI}"/>
</body>
</html>
