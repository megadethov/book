<%--
The <jsp:element>, lt;jsp:attribute> and <jsp:body> actions are used to define XML elements dynamically.
The word dynamically is important, because it means that the XML elements can be generated at request time
rather than statically at compile time.
Following is a simple example to define XML elements dynamically:
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns="http://www.w3c.org/1999/xhtml"
      xmlns:jsp="http://java.sun.com/JSP/Page">
<html>
<head>
    <title>Generate XML Element</title>
</head>
<body>

<jsp:element name="tagName">
    <jsp:attribute name="attrName">
        attrValue
    </jsp:attribute>
    <jsp:body>
        bodyValue
    </jsp:body>
</jsp:element>

</body>
</html>
