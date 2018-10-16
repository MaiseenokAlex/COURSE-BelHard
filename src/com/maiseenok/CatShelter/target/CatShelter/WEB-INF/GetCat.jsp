<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Просмотр</title>
</head>
<body>
	<a href="./Shelter"><img src="logo.jpg" /></a>
	<hr>
	<form action="./AddCat" method="post">
		<table border=1>
			<caption>Выбранная кошка</caption>
			<tr>
				<th>ID</th>
				<th>NAME</th>
				<th>DAD ID</th>
				<th>DAD NAME</th>
				<th>MOM ID</th>
				<th>MOM NAME</th>
				<th>AGE</th>
				<th>COLOR</th>
				<th>GENDER</th>
			</tr>
				<tr>
					<td><c:out value="${ cat.id }"></c:out></td>
					<td><c:out value="${ cat.name }"></c:out></td>
					<td><c:out value="${ cat.dad.id }"></c:out></td>
					<td><c:out value="${ cat.dad.name }"></c:out></td>
					<td><c:out value="${ cat.mom.id }"></c:out></td>
					<td><c:out value="${ cat.mom.name }"></c:out></td>
					<td><c:out value="${ cat.age }"></c:out></td>
					<td><c:out value="${ cat.color }"></c:out></td>
					<td><c:out value="${ cat.gender }"></c:out></td>
				</tr>
		</table>
		<input type=hidden name=radioId value="${ cat.id }" />
		<br> <br> <input type="submit" name="action" value="Редактировать">
		</form>
		<form action="./DeleteCat">
		<input type=hidden name=radioId value="${ cat.id }" />
		<input type="submit" name="action" value="Удалить" onclick="return confirm('Вы уверены что хотите удалить кошку ${ cat.name }?');">
		</form>
</body>
</html>