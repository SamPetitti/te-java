<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Squirel Cigar Party Reviews</title>
</head>
<body>
<h1>Squirel Cigar Party Reviews</h1>
<c:forEach items= "${reviews}" var="review">
<div>${review.username}</div>
<div>${review.text}</div>
<div>${review.rating}</div>

</c:forEach>
</body>
</html>