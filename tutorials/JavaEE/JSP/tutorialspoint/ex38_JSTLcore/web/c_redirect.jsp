<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
The <c:redirect> tag redirects the browser to an alternate URL by providing automatically URL rewriting,
it supports context-relative URLs, and it supports the <c:param> tag.
Attribute:
The <c:redirect> tag has following attributes:
Attribute	 Description	                                     Required	Default
url	         URL to redirect the user's browser to	             Yes	    None
context	     / followed by the name of a local web application	 No	        Current application
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>c:redirect</title>
</head>
<body>

<c:redirect url="c_if.jsp"/>

</body>
</html>
