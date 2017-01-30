<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello page</title>
</head>
<body>
Hello World!<br/>
<%
    out.println("Your IP address is " + request.getRemoteAddr());
%>
<br/>
<jsp:scriptlet>
    out.println("Your IP address is " + request.getRemoteAddr());
</jsp:scriptlet>
</body>
</html>
