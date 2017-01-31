<%--
Now let us call above tag with proper body as follows:
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="my" uri="WEB-INF/custom.tld" %>
<html>
<head>
    <title>A sample custom tag with body</title>
</head>
<body>
<my:hello>This is message body</my:hello>
</body>
</html>
