<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>
<head>
    <meta name="viewport" content="width=device-width" />
    <title>Product Table View</title>
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
            <table>
            <tr>
           <th></th>
           	<c:forEach var = "image" items = "${requestScope.productList}" >
           		<td><img href src="img/${image.getImageName()}"/>
           </td>
           </c:forEach>
           </tr>
            <tr class = "table-image"> 
            	<th>name:</th>                    <!-- look in controller for what it's mapping to -->
            	<c:forEach var = "name" items = "${requestScope.productList}">
            	<td>${name.getName()}</td>
   				</c:forEach>
            </tr>
              <tr> <!-- class = "table-image" -->
            	<th>rating:</th>                    <!-- look in controller for what it's mapping to -->
            	<c:forEach var = "rating" items = "${requestScope.productList}">
            	<td>${rating.getAverageRating()}</td>
   				</c:forEach>
              </tr>
                <tr> <!-- class = "table-image" -->
            	<th>mfr:</th>                    <!-- look in controller for what it's mapping to -->
            	<c:forEach var = "mfr" items = "${requestScope.productList}">
            	<td>${mfr.getManufacturer()}</td>
   				</c:forEach>
              </tr>
                <tr> <!-- class = "table-image" -->
            	<th>price:</th>                    <!-- look in controller for what it's mapping to -->
            	<c:forEach var = "price" items = "${requestScope.productList}">
            	<td>$${price.getPrice()}</td>
   				</c:forEach>
              </tr>
                <tr> <!-- class = "table-image" -->
            	<th>weight:</th>                    <!-- look in controller for what it's mapping to -->
            	<c:forEach var = "wt" items = "${requestScope.productList}">
            	<td>${wt.getWeightInLbs()}</td>
   				</c:forEach>
              </tr>
              
            
            
            </table>

       

    </section>
</body>
</html>