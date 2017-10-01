
<html>
<body>
<%
    out.println("Today is: " + java.util.Calendar.getInstance().getTime());
%>
<br/>
<%= request.getParameter("name") %>
</body>
</html>
