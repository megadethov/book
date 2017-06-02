<%@ page import="ua.mega.domain.Book" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    List<Book> allBooksByAuthor = (List<Book>) request.getAttribute("allBooksByAuthor");
%>
<html>
<head>
    <title>Search result</title>
</head>
<body>
<h1>Your search result</h1>
<ul>
    <% for (Book next : allBooksByAuthor) { %>
    <li>
        <%= next.getTitle() %>
    </li>
    <% } %>
</ul>
</body>
</html>
