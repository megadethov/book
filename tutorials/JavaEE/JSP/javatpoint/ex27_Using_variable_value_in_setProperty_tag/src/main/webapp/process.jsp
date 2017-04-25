<jsp:useBean id="u" class="ua.mega.User"/>

<%!
    String name = "Aaron";
%>

<jsp:setProperty name="u" property="name" value="<%= name %>"/>

Record:<br/>
<jsp:getProperty name="u" property="name"/><br/>

