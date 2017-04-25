<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>Tag Example</title></head>
<body>
<c:set var="income" scope="session" value="${4000*4}"/>
<c:out value="${income}"/>
</body>
</html>