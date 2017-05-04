<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Find book by author</title>
</head>
<body>
<h1>Which Author's Books?</h1>

<% String message = (String) request.getAttribute("message"); %>
<% if (message != null) {%>
<%= message %>
<% } %>

<form method="get" action="FindBooksByAuthor.html">
    <p>Requared Author:
        <input type="text" name="author"/>
    </p>
    <p><input type="submit" value="Find"/> </p>
    <p><input type="reset"/> </p>
</form>
</body>
</html>