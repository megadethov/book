<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>

<head>
    <title>All books for our store</title>
    <link href="styles.css" rel="Stylesheet" type="text/css"/>
</head>

<body>

<jsp:include page="/header.jsp"/>

<div id="books">
    <ul>
        <c:forEach items="${allBooks}" var="nextBook">
            <li>
                <h2><c:out value="${nextBook.title}"/></h2>
                <p>
					<span> by <c:out value="${nextBook.author}"/>
					       $<c:out value="${nextBook.price}"/>
				
					<form method='post' action='addToCart.html'>
						<input type='hidden' name='id' value='${nextBook.id}'/>
						<input type='image' src='cart-button.png'/>
				    </form>
				    </span>
                </p>

            </li>
        </c:forEach>
    </ul>
</div>

<jsp:include page="/footer.jsp"/>

</body>

</html>