<%@ page import="java.util.Enumeration" %><%--
HTTP Header Request Example:
Following is the example which uses getHeaderNames() method of HttpServletRequest to read the HTTP header infromation.
This method returns an Enumeration that contains the header information associated with the current HTTP request.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>HTTP Header Request Example</title>
</head>
<body>
<center>
    <h2>HTTP Header Request Example</h2>
    <table width="100%" border="1" align="center">
        <tr bgcolor="#ffe4c4">
            <th>Header Name</th>
            <th>Value</th>
        </tr>
        <%
            Enumeration headerNames = request.getHeaderNames();
            while (headerNames.hasMoreElements()) {
                String paramName = (String) headerNames.nextElement();
                out.print("<tr><td> " + paramName + "</td>\n");
                String paramValue = request.getHeader(paramName);
                out.println("<td> " + paramValue + "</td></tr>\n");
            }
        %>
    </table>

    <table width="100%" border="1" align="center">
        <tr bgcolor="#7fffd4">
            <th>Cookie name</th>
            <th>Cookie value</th>
        </tr>
        <%
            Cookie[] cookies = request.getCookies();
            for (Cookie c : cookies) {
                out.print("<tr><td>" + c.getName() + "</td><td>" + c.getValue() + "</td></tr>");
            }
        %>
    </table>

    <table width="100%" border="1" align="center">
        <tr bgcolor="#ffebcd">
            <th>Attribute name</th>
            <th>Attribute value</th>
        </tr>
        <%
            request.setAttribute("oneAttribute", 100);
            request.setAttribute("twoAttribute", "HelloAttribute");

            Enumeration attributeNames = request.getAttributeNames();
            while (attributeNames.hasMoreElements()) {
                String attrName = (String) attributeNames.nextElement();
                out.print("<tr><td>" + attrName + "</td><td>" + request.getAttribute(attrName) + "</td></tr>");
            }
        %>
    </table>
</center>
</body>
</html>
