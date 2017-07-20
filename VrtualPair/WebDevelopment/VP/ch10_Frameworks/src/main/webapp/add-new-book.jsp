<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>

<html>
<head>
    <meta charset="UTF-8">
    <title>Add a new Book</title>
</head>
<body>
<h2>Add new Book</h2>
<html:form action="/addNewBook.do">
    <p>ISBN: <html:text property="isbn"/></p>
    <p>Title: <html:text property="title"/></p>
    <p>Author: <html:text property="author"/></p>
    <p>Price: <html:text property="price"/></p>

    <html:submit value="Add the Book"/>
</html:form>
</body>
</html>