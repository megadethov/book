<%--
The simplest way of redirecting a request to another page is using method sendRedirect() of response object.
Following is the signature of this method:

public void response.sendRedirect(String location)
throws IOException
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Main Page</title>
</head>
<body>
<center>
    <h1>Page Redirection</h1>
</center>
<%
    // New location to be redirected
    String site = new String("http://www.google.com");
    response.setStatus(response.SC_MOVED_TEMPORARILY);
    response.setHeader("Location", site);
%>
</body>
</html>
