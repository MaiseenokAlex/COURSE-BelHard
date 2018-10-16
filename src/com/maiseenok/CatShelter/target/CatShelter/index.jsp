<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<html>
<head>
<title>Наши коты</title>
</head>
<body>
	<a href="/CatShelter"><img src="logo.jpg" /></a>
	<hr>
	<form action="">
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
			<c:forEach items="${ cats }" var="cat">
				<tr>
					<td><c:out value="${ cat.id }"></c:out></td>
					<td><input type="radio" name="radioId" value="${ cat.id }"></td>
					<td><c:out value="${ cat.name }"></c:out></td>
					<td><c:out value="${ cat.dad }"></c:out></td>
					<td><c:out value="${ cat.mom }"></c:out></td>
				</tr>
			</c:forEach>
		</table>
		<br />
	</form>
	<br />
</body>
</html>