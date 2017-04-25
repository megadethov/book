<jsp:useBean id="u" class="ua.mega.User" scope="session"/>
<jsp:setProperty name="u" property="*"/>

Record:<br/>
<jsp:getProperty name="u" property="name"/><br/>
<jsp:getProperty name="u" property="password"/><br/>
<jsp:getProperty name="u" property="email"/><br/>

<a href="second.jsp">Visit Page</a>
