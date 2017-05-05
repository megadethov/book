<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<body>
<h1>Which Author's Books?</h1>

<c:out value="${message}"/>

<form method="get" action="FindBooksByAuthor.html">
    <p>Requared Author:
        <input type="text" name="author"/>
    </p>
    <p><input type="submit" value="Find"/> </p>
    <p><input type="reset"/> </p>
</form>
</body>
</html>