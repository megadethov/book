<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="x" uri="http://java.sun.com/jsp/jstl/xml" %>
<%@ page pageEncoding="UTF-8" %>
<html>
<head>
    <title>JSTL XML</title>
</head>
<body>

<h2>Books Info:</h2>
<c:import var="bookInfo" url="novels.xml"/>
<x:parse xml="${bookInfo}" var="output"/>
<p>First Book title: <x:out select="$output/books/book[1]/name" /></p>
<p>First Book price: <x:out select="$output/books/book[1]/price" /></p>
<p>Second Book title: <x:out select="$output/books/book[2]/name" /></p>
<p>Second Book price: <x:out select="$output/books/book[2]/price" /></p>

</body>
</html>
