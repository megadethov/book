<%@ page import="java.util.Calendar" %>
<%@ page import="java.util.GregorianCalendar" %>
<%--
When a Web server responds to a HTTP request to the browser,
the response typically consists of a status line, some response headers,
a blank line, and the document.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>HTTP Header Response Example</title>
</head>
<body>
<center>
    <h2>HTTP Header Response Example</h2>
    <%
        // Set refresh, autoload time as 5 seconds
        response.setIntHeader("Refresh", 5);
        // Get current time
        Calendar calendar = new GregorianCalendar();
        String am_pm;
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        if (calendar.get(Calendar.AM_PM) == 0) {
            am_pm = "AM";
        } else {
            am_pm = "PM";
        }
        String ct = hour+":"+ minute +":"+ second +" "+ am_pm;
        out.println("Current Time is: " + ct + "\n");
    %>
</center>
</body>
</html>
