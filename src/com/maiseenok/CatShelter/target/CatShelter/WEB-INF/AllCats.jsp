<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<html>
<head>
<title>Наши кошки</title>
</head>
<body>
	<a href="./Shelter"><img src="logo.jpg" /></a>
	<hr>
	<c:out value="${ errorMessage }" />
	<br><br>
	<form action="Shelter" method="post">
		<input type="submit" name="action" value="Добавить" /> 
		<input type="submit" name="action" value="Редактировать" /> 
		<input type="submit" name="action" value="Просмотреть" />
			<br/>
			<br>
		<table border=1>
			<caption>Кошки нашего приюта</caption>
			<tr>
				<th></th>
				<th>ID</th>
				<th>NAME</th>
				<th>DAD ID</th>
				<th>MOM ID</th>
			</tr>
			<c:forEach items="${ allCats }" var="cat">
				<tr>
					<td><input type="radio" name="radioId" value="${ cat.id }"></td>
					<td><c:out value="${ cat.id }"></c:out></td>
					<td><c:out value="${ cat.name }"></c:out></td>
					<td><c:out value="${ cat.dad.id }"></c:out></td>
					<td><c:out value="${ cat.mom.id }"></c:out></td>
				</tr>
			</c:forEach>
		</table>
		<br />
	</form>
	<br />
</body>
</html>