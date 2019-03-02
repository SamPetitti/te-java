<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
	<head>
		<title>Exercise 3 - Echo</title>
		<style>
			li {
				color: rgb(0,122,51);
				list-style-type: none;
				font-size: "${count}"
			}
		</style>
	</head>
	<body>
		<h1>Exercise 3 - Echo</h1>
		
		<ul>
		
		<c:choose>
			<c:when test="${empty param.count}">
				<c:set var="count" value="100" />
			</c:when>
			<c:otherwise>
				<c:set var="count" value="${param.count}" />
			</c:otherwise>
		</c:choose>
			
		<c:choose>
			<c:when test="${empty param.word}">
				<c:set var="word" value="Celtics" />
			</c:when>
			<c:otherwise>
				<c:set var="word" value="${param.word}" />
			</c:otherwise>
		</c:choose>
		<c:forEach begin = "0" end = "${count}"  var = "nums">	
			<li style = "font-size: ${count-nums}px">${word}</li>
		</c:forEach>
		
		<%--
			Given two query string parameters, "word" and "count":
			
			Add a number of list items equal to "count".  Each list item should contain the value passed in "word".
			
			The font size of the first list item should be equal to "count".  The font size of each subsequent list
			item should be decreased by 1.
			 
			See exercise3-echo.png for example output
		 --%>
		</ul>
		
	</body>
</html>