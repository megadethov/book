<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page extends="java.Object" %>
<%@ page info="composed by mega" %>
<%@ page buffer="16kb" %> <%-- default=8 --%>
<%@ page language="java" %>
<%@ page isELIgnored="true" %> <%-- Now EL will be ignored --%>
<%@ page isThreadSafe="false" %> <%--default=true--%>
<%@ page errorPage="" %>
<%@ page isErrorPage="false" %> <%--default=false--%>

<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    new Date();
    application.getServerInfo();
%>


</body>
</html>
