<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
<form action="loginServlet" method="post">
    <label>username:</label>
    <input type="text" name="username" value=""/>
    <label>password:</label>
    <input type="password" name="password" value=""/>
    <input type="submit" name="submit" value="LOG IN" />
</form>
</body>
</html>
