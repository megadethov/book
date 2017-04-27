<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head><title>Using JSTL Functions</title></head>
<body>

<c:set var="str1" value="Welcome-to-JSP-Programming."/>

<c:set var="str2" value="${fn:split(str1, '-')}" />
<c:set var="str2" value="${fn:join(str2, '_')}" />

<c:out value="${str1}"/><br/>
<c:out value="${str2}"/>

</body>
</html>

