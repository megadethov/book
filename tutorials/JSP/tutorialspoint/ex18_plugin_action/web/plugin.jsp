<%--
  The plugin action is used to insert Java components into a JSP page.
  It determines the type of browser and inserts the <object> or <embed> tags as needed.
If the needed plugin is not present, it downloads the plugin and then executes the Java component.
The Java component can be either an Applet or a JavaBean.
The plugin action has several attributes that correspond to common HTML tags used to format Java components.
The <param> element can also be used to send parameters to the Applet or Bean.
Following is the typical syntax of using plugin action:
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Plugin Example</title>
</head>
<body>
<jsp:plugin type="applet" codebase="dirname" code="MyApplet.class"
            width="60" height="80">

<%--the <fallback> element, can be used to specify an error string to be sent to the user in case the component fails.--%>
    <jsp:fallback>
        Unable to initialize Java Plugin
    </jsp:fallback>

</jsp:plugin>
</body>
</html>
