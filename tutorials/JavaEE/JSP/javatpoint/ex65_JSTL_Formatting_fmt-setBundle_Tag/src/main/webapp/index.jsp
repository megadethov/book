<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page pageEncoding="UTF-8" %>
<html>
<head>
    <title>fmt:timeZone Tag</title>
</head>
<body>

<fmt:setBundle basename="com.javatpoint.Main" var="lang"/>
<fmt:message key="vegetable.Potato" bundle="${lang}"/><br/>
<fmt:message key="vegetable.Tomato" bundle="${lang}"/><br/>
<fmt:message key="vegetable.Carrot" bundle="${lang}"/><br/>

</body>
</html>
