
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%!
    Object ob = new Object();
    int a = 5;
    int b = 5;
    int c = a + b;
//    if(a==b) {} // not work
%>

<% if(a==b) {%>
a = b <br/>
<% } else {%>
a != b
<% } %>

c = <%= c %>
<% System.out.println("c = " + c); %>

</body>
</html>
