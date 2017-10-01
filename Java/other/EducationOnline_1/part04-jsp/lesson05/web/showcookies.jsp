<%
    String myCookie = "login";
    Cookie[] cookies = request.getCookies();
    Cookie findingCookie = null;
    for (int i = 0; i < cookies.length; i++) {
        String name = cookies[i].getName();
        if (name.equals(myCookie)) {
            findingCookie = cookies[i];
            break;
        }
    }
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show cookies Page</title>
</head>
<body>
showcookies.jsp
<%if (findingCookie != null) {%>
value: <%=findingCookie.getValue()%>
<%} else {%>
Cookies not found !!!
<%}%>
</body>
</html>
