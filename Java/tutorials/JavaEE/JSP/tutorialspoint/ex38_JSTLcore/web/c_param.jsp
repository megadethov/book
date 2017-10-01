<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
The <c:param> tag allows proper URL request parameter to be specified with URL and it does any necessary URL encoding required.

Within a <c:param> tag, the name attribute indicates the parameter name, and the value attribute indicates the parameter value:

Attribute:
The <c:param> tag has following attributes:

Attribute	Description	                                        Required	Default
name	    Name of the request parameter to set in the URL	    Yes	        None
value	    Value of the request parameter to set in the URL	No	        Body
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>c:param</title>
</head>
<body>--%>

<c:url value="c_if.jsp" var="myURL">
    <c:param name="trackingId" value="12345"/>
    <c:param name="reportType" value="summary"/>
</c:url>

<c:import url="${myURL}"/>

<%--</body>
</html>--%>
