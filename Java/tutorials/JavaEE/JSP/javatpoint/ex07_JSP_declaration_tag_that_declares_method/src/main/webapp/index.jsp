<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%!
    int cube(int n) {
        return n*n*n;
    }
%>
<%=
    "Cube of 3 is: " + cube(3)
%>
</body>
</html>
