<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@ page pageEncoding="UTF-8" %>
<html>
<head>
    <title>JSTL XML</title>
</head>
<body>

<c:import var="xml" url="transfer.xml" />
<c:import var="xsl" url="transfer.xsl" />
<x:transform xml="${xml}" xslt="${xsl}" />

</body>
</html>
