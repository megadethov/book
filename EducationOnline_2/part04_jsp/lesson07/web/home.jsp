<%@ page import="ua.mega.User" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home Page</title>
</head>
<body>
HOME PAGE </br>
<%
    out.println("status: " + request.getAttribute("status") + "</br>");
    out.println("attribute A: " + request.getAttribute("atrA") + "</br>");
//    out.println("attribute B: " + request.getAttribute("atrB"));
%>
attribute B: <%= request.getAttribute("atrB")%> </br>
<%--<%
    out.println("name: " + ((User) request.getAttribute("user")).getName() + "</br>");
    out.println("age: " + ((User) request.getAttribute("user")).getAge() + "</br>");
%>--%>

<%--JSP EL--%>
name: ${user.name} </br>
age: ${user.age + 100} </br>

</body>
</html>
