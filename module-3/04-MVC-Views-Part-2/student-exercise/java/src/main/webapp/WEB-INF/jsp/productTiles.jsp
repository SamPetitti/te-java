<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>

<html>
<head>
    <meta name="viewport" content="width=device-width" />
    <title>Product Tiles View</title>
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
   <c:forEach var = "name" items = "${requestScope.productList}" >
   	<div>
           		<div id = "divImage"><img href src="img/${name.getImageName()}"></div>
           		<div>${name.getName()}</div>
           		<div>${name.getAverageRating()}</div>
           		<div>${name.getManufacturer()}</div>
           		<div>$${name.getPrice()}</div>
     </div>
           		
           </c:forEach>

       

    </section>
</body>
</html>