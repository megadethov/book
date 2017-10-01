<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head><title>Tag Example</title></head>
<body>
<c:catch var="catchTheException">
    <% int x = 2 / 0; %>
</c:catch>
<c:if test="${catchTheException != null}">
    <p>The type of exception is : ${catchTheException} <br/>
        There is an exception: ${catchTheException.message}</p>
</c:if>
</body>
</html>