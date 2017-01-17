<%--
  Created by IntelliJ IDEA.
  User: mega
  Date: 17.01.2017
  Time: 9:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration Page</title>
</head>
<body>
<form action="myServlet" method="post">
    Login: <input type="text" name="login"/><br/>
    Password: <input type="text" name="password"/><br/>
    First Name: <input type="text" name="firstName"/><br/>
    Last Name: <input type="text" name="lastName"/><br/>
    Middle Name: <input type="text" name="middleName"/><br/>
    <input type="submit" name="register" value="Registration"/>
</form>
</body>
</html>
