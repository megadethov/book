<%--
Below is handler.jsp JSP program to handle input given by web browser for checkbox button.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Handler Page</title>
</head>
<body>
<form action="handler.jsp" method="post" target="_blank">
    <input type="checkbox" name="maths" checked="checked" /> Maths
    <input type="checkbox" name="physics" /> Physics
    <input type="checkbox" name="chemistry" checked="checked" /> Chemistry
<input type="submit" value="Select Subject" />
</form>
</body>
</html>
