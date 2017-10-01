<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<html>
<head><title>Using JSTL Functions</title></head>
<body>

<c:set var="str1" value="It is first String"/>
<c:set var="str2" value="It is <xyz>second String.</xyz>"/>

<p>With escapeXml() Function:</p>
<p>str-1 : ${fn:escapeXml(str1)}</p>
<p>str-2 : ${fn:escapeXml(str2)}</p>

<p>Without escapeXml() Function:</p>
<p>str-1 : ${str1}</p>
<p>str-2 : ${str2}</p>

</body>
</html>


