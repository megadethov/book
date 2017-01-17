<%
   String str = (String) session.getAttribute("textin");
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show session parameter Page</title>
</head>
<body>
<p><font color="red"><%=str%></font></p>
</body>
</html>
