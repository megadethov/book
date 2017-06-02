<%--
Here is a simple example which passes two values using HTML FORM and submit button.
We are going to use same JSP handler.jsp to handle this input.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form Page</title>
</head>
<body>
<form action="handler.jsp" method="get">
Enter your first name:<br/> <input type="text" name="first_name"/><br/>
Enter your last name:<br/> <input type="text" name="last_name"/><br/>
<input type="submit" name="submit" value="go"/>
</form>
</body>
</html>
