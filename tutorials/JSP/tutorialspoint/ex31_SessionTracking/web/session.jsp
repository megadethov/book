<%--This example describes how to use the HttpSession object to find out
the creation time and the last-accessed time for a session.
We would associate a new session with the request if one does not already exist.--%>

<%@ page import="java.util.Date" %>
<%
    // Get session creation time.
    Date createTime = new Date(session.getCreationTime());
    // Get last access time of this web page.
    Date lastAccessTime = new Date(session.getLastAccessedTime());

    String title = "Welcome Back to my website";
    Integer visitCount = 0;
    String visitCountKey = "visitCount";
    String userIDKey = "userID";
    String userID = "ABCD";

    // Check if this is new comer on your web page.
    if (session.isNew()) {
        title = "Welcome to my website";
        session.setAttribute(userIDKey, userID);
        session.setAttribute(visitCountKey, visitCount);
    }
    visitCount = (Integer) session.getAttribute(visitCountKey);
    visitCount = visitCount + 1;
    userID = (String)session.getAttribute(userIDKey);
    session.setAttribute(visitCountKey,  visitCount);
%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Session Page</title>
</head>
<body>
<center>
    <h1>Session Tracking</h1>
</center>
<table border="1" align="center">
    <tr bgcolor="#949494">
        <th>Session info</th>
        <th>Value</th>
    </tr>
    <tr>
        <td>id</td>
        <td><% out.print( session.getId()); %></td>
    </tr>
    <tr>
        <td>Creation Time</td>
        <td><% out.print(createTime); %></td>
    </tr>
    <tr>
        <td>Time of Last Access</td>
        <td><% out.print(lastAccessTime); %></td>
    </tr>
    <tr>
        <td>User ID</td>
        <td><% out.print(userID); %></td>
    </tr>
    <tr>
        <td>Number of visits</td>
        <td><% out.print(visitCount); %></td>
    </tr>
</table>
</body>
</html>
