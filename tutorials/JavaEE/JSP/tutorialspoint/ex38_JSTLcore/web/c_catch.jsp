<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
The <c:catch> tag catches any Throwable that occurs in its body and optionally exposes it.
Simply it is used for error handling and to deal more gracefully with the problem.

Attribute:
The <c:catch> tag has following attributes:

Attribute	        Description	                                                                                    Required    Default
var	                The name of the variable to hold the java.lang.Throwable if thrown by elements in the body. 	No	        None
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>c:catch</title>
</head>
<body>

<c:catch var = "catchException">
    <jsp:scriptlet> int x = 5 / 0; </jsp:scriptlet>
</c:catch>
<c:if test="${catchException != null}">
    <p>
        The exception is : ${catchException} <br/>
        There is an exception: ${catchException.message}
    </p>
</c:if>
</body>
</html>
