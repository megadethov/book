<%--
GET Method Example Using URL
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>GET Method Example Using URL</title>
</head>
<body>
<center>
    <h1>Using GET Method to Read Form Data</h1>
    <ul>
        <li><p><b>First name: </b>
        <%=request.getParameter("first_name")%>
        </p></li>
        <li><p><b>Last name: </b>
            <%=request.getParameter("last_name")%>
        </p></li>
    </ul>
</center>
</body>
</html>
