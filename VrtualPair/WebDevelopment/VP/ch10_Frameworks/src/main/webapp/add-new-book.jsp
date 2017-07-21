<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>

<html>
<head>
    <meta charset="UTF-8">
    <title>Add a new Book</title>
</head>
<body>
<h2><bean:message key="title.addbook"/></h2>
<html:form action="/addNewBook.do">
    <p><bean:message key="book.isbn"/> : <html:text property="isbn"/></p>
    <p><bean:message key="book.title"/> : <html:text property="title"/></p>
    <p><bean:message key="book.author"/> : <html:text property="author"/></p>
    <p><bean:message key="book.price"/> : <html:text property="price"/></p>

    <input type="submit" value="<bean:message key="form.submit"/>"/>
</html:form>
</body>
</html>