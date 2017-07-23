<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>

<head>
	<title>Find By Author</title>
	<link href="styles.css" rel="Stylesheet" type="text/css"/>
</head>
  
<body>

	<jsp:include page="/header.jsp"/>

    <div id="addBook">
	
		<h1>Which Author's Books?</h1>
		
		<c:out value="${message}"/>
		
		<form method="GET" action="findByAuthor.do">
			<label>Required Author:</label><input type="texy" name="author"/>
			<p><input type="submit" value="Find"/></p>
		</form>
		
	</div>
	
	<jsp:include page="/footer.jsp"/>
				
	</body>
</html>