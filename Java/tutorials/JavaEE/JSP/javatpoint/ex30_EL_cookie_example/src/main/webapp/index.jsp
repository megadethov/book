<h1>First JSP</h1>
<%
  Cookie ck = new Cookie("name", "Aaron");
  response.addCookie(ck);
%>

<a href="process.jsp">click</a>