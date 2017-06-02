<%--
use the following code in main.jsp file which loads
the bean and sets/gets a simple String parameter:
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Using JavaBeans in JSP</title>
</head>
<body>
<center>
    <h2>Using JavaBeans in JSP</h2>

    <%--<jsp:useBean id="test" class="ua.mega.model.TestBean">
        <jsp:setProperty name="test" property="message"/>
    </jsp:useBean>--%>

    <jsp:useBean id="test" class="ua.mega.model.TestBean"/>

    <jsp:setProperty name="test" property="message" value="Hello JSP..."/>

    <p>Got message:</p>

    <jsp:getProperty name="test" property="message"/>
</center>
</body>
</html>
