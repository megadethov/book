<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Index Page</title>
</head>
<body>
<%--<h1><a href="myServlet?a=10&b=20">a + b</a></h1> </br>--%>
<form action="myServlet" name="calc" method="post">
    <input type="text" name="number1" />
    <input type="text" name="number2" />
    <input type="submit" name="result" value="go" />
</form>

</body>
</html>
