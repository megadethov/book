<%@ page import="javafx.scene.shape.Circle" %><%--
  JSP Declarations:
A declaration declares one or more variables or methods
that you can use in Java code later in the JSP file.
You must declare the variable or method before you use it in the JSP file.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Declarations Page</title>
</head>
<body>

<%! int i = 0; %>
<%! int a, b, c; %>
<%! Circle circle1 = new Circle(2.0); %>

<jsp:declaration> int i = 0; </jsp:declaration>
<jsp:declaration> int e, f, g </jsp:declaration>
<jsp:declaration> Circle circle2 = new Circle(3.0); </jsp:declaration>

</body>
</html>
