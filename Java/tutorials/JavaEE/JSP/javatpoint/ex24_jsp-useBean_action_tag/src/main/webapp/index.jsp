<jsp:useBean id="obj" class="ua.mega.Calculator"/>

<%
    int m = obj.cube(5);
    out.print("Cube of 5 is: " + m);
%>
