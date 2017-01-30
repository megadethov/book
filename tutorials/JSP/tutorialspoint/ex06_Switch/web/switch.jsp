<%--
Now look at the following switch...case block which has been written
a bit differentlty using out.println() and inside Scriptletas
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%! int day = 1; %>
<html>
<head>
    <title>Switch</title>
</head>
<body>
<%
    switch (day) {
        case 0:
            out.println("It\'s Sunday.");
            break;
        case 1:
            out.println("It\'s Monday.");
            break;
        case 2:
            out.println("It\'s Tuesday.");
            break;
        case 3:
            out.println("It\'s Wednesday.");
            break;
        case 4:
            out.println("It\'s Thursday.");
            break;
        case 5:
            out.println("It\'s Friday.");
            break;
        default:
            out.println("It's Saturday.");
    }
%>

</body>
</html>
