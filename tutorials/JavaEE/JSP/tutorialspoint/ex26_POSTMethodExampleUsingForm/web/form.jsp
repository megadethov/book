<%--
POST Method Example Using Form
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form Page</title>
</head>
<body>
<form action="handler.jsp" method="post">
    Input your first name: <input type="text" name="first_name" /><br/>
    Input your last name: <input type="text" name="last_name" /><br/>
    <input type="submit" name="submit" value="click!" />
</form>
</body>
</html>
