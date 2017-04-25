<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>Tag Example</title></head>
<body>
<c:forEach var="j" begin="0" end="3" step="1">
    Item <c:out value="${j}"/><br/>
</c:forEach>
</body>
</html>