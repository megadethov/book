<%--
The <c:set> tag is JSTL-friendly version of the setProperty action. The tag is helpful because it evaluates an expression and uses the results to set a value of a JavaBean or a java.util.Map object.

Attribute:
The <c:set> tag has following attributes:

Attribute       Description	                                            Required	      Default
value	        Information to save	                                    No	                body
target	        Name of the variable whose property should be modified	No	                None
property	    Property to modify	                                    No	                None
var	            Name of the variable to store information	            No	                None
scope	        Scope of variable to store information	                No	                Page
If target is specified, property must also be specified.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>c:out</title>
</head>
<body>

<c:set var="salary" scope="session" value="${2000*2}"/>
<c:out value="${salary}"/>

</body>
</html>
