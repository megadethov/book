<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>Tag Example</title></head>
<body>
<c:out value="Start index page"/><br/>
<c:import var="data" url="page2.jsp"/>
<c:out value="${data}"/>
</body>
</html>