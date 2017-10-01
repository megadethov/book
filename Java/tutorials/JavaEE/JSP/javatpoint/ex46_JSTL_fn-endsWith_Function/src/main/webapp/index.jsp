<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head><title>Using JSTL Functions</title></head>
<body>

<c:set var="str" value="Welcome to JSP programming"/>

<c:if test="${fn:endsWith(str, 'programming')}">
    <p>String ends with programming<p/>
</c:if>

<c:if test="${fn:endsWith(str, 'JSP')}">
    <p>String ends with JSP<p/>
</c:if>

</body>
</html>


