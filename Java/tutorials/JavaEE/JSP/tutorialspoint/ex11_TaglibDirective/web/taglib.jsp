<%--
The taglib directive declares that your JSP page uses a set of custom tags, identifies the location of the library,
and provides a means for identifying the custom tags in your JSP page.
Where the uri attribute value resolves to a location the container understands and
the prefix attribute informs a container what bits of markup are custom actions.

A custom tag is a user-defined JSP language element. When a JSP page containing a custom tag is translated into a servlet,
the tag is converted to operations on an object called a tag handler. The Web container then invokes those operations when
the JSP page's servlet is executed.
To write a custom tag you can simply extend SimpleTagSupport class and override the doTag() method,
where you can place your code to generate content for the tag.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--The taglib directive follows the following syntax:--%>  <%@ taglib uri="uri" prefix="prefixOfTag" %>
<%--You can write XML equivalent of the above syntax as follows:--%>    <jsp:directive.taglib uri="uri" prefix="prefixOfTag" />

<html>
<head>
    <title>Taglib</title>
</head>
<body>

</body>
</html>
