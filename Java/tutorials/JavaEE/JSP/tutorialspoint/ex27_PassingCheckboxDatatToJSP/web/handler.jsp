<%--
Passing Checkbox Data to JSP Program
Checkboxes are used when more than one option is required to be selected.
Here is example HTML code, CheckBox.htm, for a form with two checkboxes
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Checkbox Page</title>
</head>
<body>
<center>
    <h1>Reading Checkbox Data</h1>
    <ul>
        <li>
            <p><b>Maths Flag:</b>
            <%=request.getParameter("maths")%>
            </p></li>
        <li>
            <p><b>Physics Flag:</b>
                <%=request.getParameter("physics")%>
            </p></li>
        <li>
            <p><b>Chemistry Flag:</b>
                <%=request.getParameter("chemistry")%>
            </p></li>

    </ul>
</center>
</body>
</html>
