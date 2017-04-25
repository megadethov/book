<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>Tag Example</title></head>
<body>
<c:url value="/index.jsp" var="completeURL">
    <c:param name="trackingId" value="786"/>
    <c:param name="user" value="Aaron"/>
</c:url>
${completeURL}
</body>
</html>


