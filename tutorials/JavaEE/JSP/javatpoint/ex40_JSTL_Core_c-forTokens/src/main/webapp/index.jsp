<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>Tag Example</title></head>
<body>
<c:forTokens items="Rahul-Nakul-Rajesh" delims="-" var="name">
    <c:out value="${name}"/><br/>
</c:forTokens>
</body>
</html>
