<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cookies Page</title>
</head>
<body>
Cookies Page <br>
<%
    Cookie[] cookies = request.getCookies();
    String str = "";
    for (Cookie cookie : cookies) {
        if (cookie != null && cookie.getName().equals("name1")) {
            str = cookie.getValue();
            out.println(str);
        }
    }
%>

</body>
</html>
