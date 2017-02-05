<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
Attribute:
The <c:forEach> tag has following attributes:

Attribute	Description	                                                    Required   Default
items	    Information to loop over	                                    No	        None
begin	    Element to start with (0 = first item, 1 = second item, ...)	No	        0
end	        Element to end with (0 = first item, 1 = second item, ...)	    No	        Last element
step	    Process every step items	                                    No	        1
var	        Name of the variable to expose the current item	                No	        None
varStatus	Name of the variable to expose the loop status	                No	        None
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>c:foreach</title>
</head>
<body>

<c:forEach var="i" begin="1" end="5">
    Item: <c:out value="${i}"/><br/>
</c:forEach>
</body>
</html>
