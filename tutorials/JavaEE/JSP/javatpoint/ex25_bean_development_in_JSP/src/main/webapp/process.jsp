<jsp:useBean id="u" class="ua.mega.User"/>
<jsp:setProperty name="u" property="*"/>
<%--<jsp:setProperty name="u" property="name"/>--%>

Record:<br/>
<jsp:getProperty name="u" property="name"/><br/>
<jsp:getProperty name="u" property="password"/><br/>
<jsp:getProperty name="u" property="email"/><br/>
