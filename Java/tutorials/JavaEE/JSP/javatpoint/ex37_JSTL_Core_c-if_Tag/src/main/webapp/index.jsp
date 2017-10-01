<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>Tag Example</title></head>
<body>
<c:set var="income" value="${4000*4}" scope="session"/>
<c:if test="${income > 8000}">
    <p>My income is: <c:out value="${income}"/></p>
</c:if>
</body>
</html>