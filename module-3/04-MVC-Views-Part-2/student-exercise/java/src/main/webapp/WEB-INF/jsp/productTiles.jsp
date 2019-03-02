<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:import url = "/WEB-INF/jsp/header.jsp"/>

    <section id="main-content">
    <h1>Toy Department</h1>
    <div id ="mainDiv">
    <c:forEach var = "name" items = "${requestScope.productList}">
   				<c:url var = "url" value = "productDetail?productId=${name.getProductId()}"></c:url>
   				<div id ="tileDiv">
           		<div id = "tilePhoto"><a href = "${url}"><img src="img/${name.getImageName()}"></a></div>
           		<h4>${name.getName()}</h4>
           		<div>${name.getAverageRating()}</div>
           		<div>${name.getManufacturer()}</div>
           		<div>$${name.getPrice()}</div>
           		<div><img id = "tileStar" src = "img/${Math.round(name.averageRating)}-star.png"/></div>
    	 </div>
           		
           </c:forEach>
</div>
       

    </section>
</body>
</html>

<%--  <section id="main-content">
    		<div id = "mainDiv">
    		<c:forEach var = "item" items = "${requestScope.recipes}">
    		<c:url var = "url" value = "recipeDetails?recipeId=${item.getRecipeId()}"/>
    		<div id = "tileDiv">
    		<div><a href = "${url}"><img id = "tilePhoto" src = "img/recipe${recipes.indexOf(item)}.jpg"/></a></div>
			<h4>${item.getName()}</h4> 
			<div><img id = "tileStar" src = "img/${Math.round(item.averageRating)}-star.png"/></div>
			<p>${item.ingredients.size()}     ingredients</p>
			</div>
			</c:forEach>
			</div> --%>