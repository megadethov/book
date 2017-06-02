<%--
The page directive is used to provide instructions to the container that pertain to the current JSP page.
You may code page directives anywhere in your JSP page.
By convention, page directives are coded at the top of the JSP page.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%--Following is the basic syntax of page directive:--%>
<%@ page attribute="value" %>
<%--You can write XML equivalent of the above syntax as follows:--%>
<jsp:directive.page attribute="value"/>

<%--To direct the servlet to write output directly to the response output object, use the following:--%>
<%@ page buffer="none" %>
<%--Use the following to direct the servlet to write output to a buffer of size not less than 8 kilobytes:--%>
<%@ page buffer="8kb" %>
<%--The following directive causes the servlet to throw an exception when the servlet's output buffer is full:--%>
<%@ page autoFlush="false" %>
<%--This directive causes the servlet to flush the output buffer when full:--%>
<%@ page autoFlush="true" %>
<%--Usually, the buffer and autoFlush attributes are coded on a single page directive as follows:--%>
<%@ page buffer="16kb" autoFlush="true" %>

<%--If you want to write out XML from your JSP, use the following page directive:--%>
<%@ page contentType="text/xml" %>
<%--The following statement directs the browser to render the generated page as HTML:--%>
<%@ page contentType="text/html" %>
<%--The following directive sets the content type as a Microsoft Word document:--%>
<%@ page contentType="application/msword" %>
<%--specify that the resulting page that is returned to the browser uses ISO Latin 1, you would use the following page directive:--%>
<%@ page contentType="text/html; ISO-8859-1" %>

<%--The errorPage attribute tells the JSP engine which page to display if there is an error while the current page runs.--%>
<%--The following directive displays MyErrorPage.jsp when all uncaught exceptions are thrown--%>
<%@ page errorPage="MyErrorPage.jsp" %>
<%--The isErrorPage attribute indicates that the current JSP can be used as the error page for another JSP.--%>
<%--The default value of the isErrorPage attribute is false.--%>
<%--The handleError.jsp sets the isErrorPage option to true because it is supposed to handle errors:--%>
<%@ page isErrorPage="true" %>

<%--The following directive directs the JSP translator to generate the servlet such that the servlet extends somePackage.SomeClass:--%>
<%@ page extends="somePackage.SomeClass" %>

<%--To import java.sql.*, use the following page directive:--%>
<%@ page import="java.sql.*" %>
<%--By default, a container automatically imports java.lang.*, javax.servlet.*, javax.servlet.jsp.*, and javax.servlet.http.*.--%>

<%--The info attribute lets you provide a description of the JSP.--%>
<%@ page info="This JSP Page Written By ZARA" %>

<%--The isThreadSafe option marks a page as being thread-safe.
By default, all JSPs are considered thread-safe.
If you set the isThreadSafe option to false, the JSP engine makes sure that only one thread at a time is executing your JSP.--%>
<%@page isThreadSafe="false" %>

<%--The language attribute indicates the programming language used in scripting the JSP page.--%>
<%--For example, because you usually use Java as the scripting language, your language option looks like this:--%>
<%@page language="java" %>

<%--The session attribute indicates whether or not the JSP page uses HTTP sessions.
A value of true means that the JSP page has access to a builtin session object and
a value of false means that the JSP page cannot access the builtin session object.--%>
<%@page session="true" %>

<%--The isELIgnored option gives you the ability to disable the evaluation
of Expression Language (EL) expressions which has been introduced in JSP 2.0--%>
<%--The default value of the attribute is true, meaning that expressions, ${...},
are evaluated as dictated by the JSP specification. If the attribute is set to false,
then expressions are not evaluated but rather treated as static text.--%>
<%--Following directive set an expressions not to be evaluated:--%>
<%@page isELIgnored="false" %>

<%--The isScriptingEnabled attribute determines if scripting elements are allowed for use.--%>
<%--The default value (true) enables scriptlets, expressions, and declarations. If the attribute's value is set to false, a translation-time error will be raised if the JSP uses any scriptlets, expressions (non-EL), or declarations.--%>
<%--You can set this value to false if you want to restrict usage of scriptlets, expressions (non-EL), or declarations:--%>
<%@ page isScriptingEnabled="true" %>


<html>
<head>
    <title>Directive</title>
</head>
<body>

</body>
</html>
