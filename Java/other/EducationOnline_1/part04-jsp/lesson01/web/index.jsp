<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--   Деректива <%@ %>   --%>
<%--    <%@ page import="" %>   импорт классов Java--%>
<%--    <%@ page session="false" %>   использовать сессию - по умолчанию = true --%>
<%--    <%@ page info="Информация о Сервлете" %>   получить можно методом Servlet.getServletInfo()  --%>
<%--    <%@ page autoFlush="true" %>   освобождение буфера при переполнении автоматически   --%>
<%--<%@ page errorPage="m.jsp" %>   страница для перехода при возникновении ошибки--%>
<%--    <%@ page isErrorPage="false" %>   является ли данная страница m.jsp    --%>
<%--<%@ include file="m.jsp"%>   включает другую страницу--%>
<html>
<head>
    <title></title>
</head>
<body>
<%! int count = 0; %>
<% count++; %>
<%=count%>
</body>
</html>
