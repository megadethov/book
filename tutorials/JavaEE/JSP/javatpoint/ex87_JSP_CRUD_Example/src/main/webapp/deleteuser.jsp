<%@page import="ua.mega.dao.UserDao" %>
<jsp:useBean id="u" class="ua.mega.beans.User"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>
<%
    UserDao.delete(u);
    response.sendRedirect("viewusers.jsp");
%>

