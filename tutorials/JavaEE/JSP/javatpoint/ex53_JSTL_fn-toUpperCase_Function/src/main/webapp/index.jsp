<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head><title>Using JSTL Functions</title></head>
<body>

<c:set var="string" value="welcome to jsp programming"/>
${fn:toUpperCase("hello,")}
${fn:toUpperCase(string)}

</body>
</html>

