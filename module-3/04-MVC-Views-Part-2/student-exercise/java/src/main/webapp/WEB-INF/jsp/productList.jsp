<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>
<head>
    <meta name="viewport" content="width=device-width" />
    <title>Product List View</title>
    <link rel="stylesheet" href="css/site.css" />
</head>
<body>
    <header>
        <h1>MVC Exercises - Views Part 2: Models</h1>        
    </header>
    <nav>
        <ul> 
             <li><a href="productTable">Table</a></li>
            <li><a href="productList">List</a></li>
            <li><a href="productTiles">Tiles</a></li>
        
        </ul>
        
    </nav>
    <section id="main-content">
    		<h1>Toy Department</h1>
            <ul id = "listFlex">
  
	<c:forEach var = "name" items = "${requestScope.productList}" >
           		<li id = "listImage"><img href src="img/${name.getImageName()}"></li>
           		<div id = "listItems">
           		<li>${name.getName()}</li>
           		<li>${name.getAverageRating()}</li>
           		<li>${name.getManufacturer()}</li>
           		<li>$${name.getPrice()}</li>
           		</div>
            </c:forEach>
           </ul>
          <%--    <tr>
            	<th class = "row-names">Name</th>
            	<c:forEach var = "name" items = "${requestScope.recipes}">
           		<td>${name.getName()}</td>
            	</c:forEach>
            </tr>
            <tr> --%>

       

    </section>
</body>
</html>