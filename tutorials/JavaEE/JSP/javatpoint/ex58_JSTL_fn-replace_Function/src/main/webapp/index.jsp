<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head><title>Using JSTL Functions</title></head>
<body>

<c:set var="str" value="Hello World"/>
${fn:replace(str, "World", "JSTL")}

</body>
</html>

