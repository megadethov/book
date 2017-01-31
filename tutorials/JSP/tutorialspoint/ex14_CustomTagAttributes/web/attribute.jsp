<%--
Now let us try following JSP with message attribute as follows:
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="my" uri="WEB-INF/custom.tld" %>
<html>
<head>
    <title>Custom tag attribute</title>
</head>
<body>
<my:hello message="ATTRIBUTE MESSAGE"> >BODY MESSAGE</my:hello>
</body>
</html>
