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
            <th>Header Name</th><th>Value</th>
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
</center>
</body>
</html>
