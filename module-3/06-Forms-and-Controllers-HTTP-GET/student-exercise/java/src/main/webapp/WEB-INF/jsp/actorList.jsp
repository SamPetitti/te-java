<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:set var="pageTitle" value="All Actors List"/>

<%@include file="common/header.jspf"%>
<c:url var="formAction" value="/searchActors"/>
<form method="GET" action="${formAction}">
<input type ="text" name ="actor" id= "actor"/>
<input type="submit" name= "searchActors" id= "searchActors" />
</form>
<!-- Form goes here -->
<table class="table">
<tr>
<th>Name</th>
</tr>
<c:forEach items="${actors}" var="actor">
<tr>
    <!-- What do we print here for each actor? -->
</tr>
</c:forEach>
</table>
<%@include file="common/footer.jspf"%>