<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Squirrel Cigar Party Reviews</title>
</head>
<body>
<h1>Squirrel Cigar Party Reviews</h1>
<c:forEach var="review" items= "${reviews}">
<div>${review.username}</div>
<div>${review.text}</div>
<div>${review.rating}</div>

</c:forEach>
</body>
</html>