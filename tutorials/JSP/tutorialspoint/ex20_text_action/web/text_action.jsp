<%--
The <jsp:text> action can be used to write template text in JSP pages and documents.
Following is the simple syntax for this action:
<jsp:text>Template data</jsp:text>
The body of the template cannot contain other elements; it can only contain text and EL expressions
( Note: EL expressions are explained in subsequent chapter). Note that in XML files,
you cannot use expressions such as ${whatever > 0}, because the greater than signs are illegal.
Instead, use the gt form, such as ${whatever gt 0} or an alternative is to embed the value in a CDATA section.
<jsp:text><![CDATA[<br>]]></jsp:text>
If you need to include a DOCTYPE declaration, for instance for XHTML,
 you must also use the <jsp:text> element as follows:
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<jsp:text>Hello From jsp:text action</jsp:text>
<html>
<head>
    <br/>
    <title>Text Action</title>
</head>
<body>
Hello
</body>
</html>
