<%--
 Now it's time to use above defined custom tag Hello in our JSP program as follows:
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="my" uri="WEB-INF/custom.tld" %>
<html>
<head>
    <title>A sample custom tag</title>
</head>
<body>
<my:hello/>
</body>
</html>
