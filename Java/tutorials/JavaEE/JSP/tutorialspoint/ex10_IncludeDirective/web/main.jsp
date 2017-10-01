<%--
A good example of include directive is including a common header and footer with multiple pages of content.
Let us define following three files (a) header.jps (b)footer.jsp and (c)main.jsp
The general usage form of this directive is as follows:   <%@ include file="relative url" >
You can write XML equivalent of the above syntax as follows:   <jsp:directive.include file="relative url" />
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@include file="header.jsp"%>

<center>
    <p>Thanks for visiting my page.</p>
</center>

<%@include file=""%>
