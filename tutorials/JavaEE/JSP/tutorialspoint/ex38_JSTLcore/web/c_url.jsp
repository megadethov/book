<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
The <c:url> tag formats a URL into a string and stores it into a variable. This tag automatically performs URL rewriting when necessary. The var attribute specifies the variable that will contain the formatted URL.

The JSTL url tag is just an alternative method of writing the call to the response.encodeURL() method. The only real advantage the url tag provides is proper URL encoding, including any parameters specified by children param tag.

Attribute:
The <c:url> tag has following attributes:

Attribute	Description	                                        Required	Default
value	    Base URL	                                        Yes	        None
context	    / followed by the name of a local web application	No	        Current application
var	        Name of the variable to expose the processed URL	No	        Print to page
scope	    Scope of the variable to expose the processed URL	No	        Page
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>c:url</title>
</head>
<body>
<%--<a href="c_if.jsp">TEST</a>--%>
<a href="<c:url value="c_if.jsp"/>">TEST</a>
</body>
</html>
