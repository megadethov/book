<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
The <c:import> tag provides all of the functionality of the <include> action but also allows for inclusion of absolute URLs.
For example, using the import tag allows for inclusion of content from a different Web site or an FTP server.
Attribute:
The <c:import> tag has following attributes:
Attribute            Description	                                                                            Required	Default
url	                 URL to retrieve and import into the page	                                                Yes	        None
context	             / followed by the name of a local web application	                                        No	        Current application
charEncoding	    Character set to use for imported data	                                                    No	        ISO-8859-1
var	                Name of the variable to store imported text	                                                No	        Print to page
scope	            Scope of the variable used to store imported text	                                        No	        Page
varReader	        Name of an alternate variable to expose java.io.Reader	                                    No	        None
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>c:import</title>
</head>
<body>

<c:import var="data" url="c_if.jsp"/>
<c:out value="${data}"/>

</body>
</html>
