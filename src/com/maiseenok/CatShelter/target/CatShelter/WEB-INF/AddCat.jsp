<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Новая кошка</title>
</head>

<body>
	<a href="./Shelter"><img src="logo.jpg" /></a>
	<hr>
	<c:out value="${ errorMessage }" />
	<br>
	<br>
	<form action="./AddCat" method="post">
		Введите имя кота: <input name="catName" value="${ cat.name }"><br>

		Отец (id): <select name="dadName">
			<option></option>
			<c:forEach items="${ catDad }" var="catD">
				<c:choose>
					<c:when test="${catD.id eq cat.dad.id }">
						<option value="${ catD.id }" selected="selected">${ catD.name }</option>
					</c:when>
					<c:otherwise>
						<option value="${ catD.id }">${ catD.name }</option>
					</c:otherwise>
				</c:choose>
			</c:forEach>
		</select><br> 
		
		Мать (id): <select name="momName">
			<option></option>
			<c:forEach items="${ catMom }" var="catM">
				<c:choose>
					<c:when test="${catM.id eq cat.mom.id }">
						<option value="${ catM.id }" selected="selected">${ catM.name }</option>
					</c:when>
					<c:otherwise>
						<option value="${ catM.id }">${ catM.name }</option>
					</c:otherwise>
				</c:choose>
			</c:forEach>
		</select><br> 
		
		<c:if test="${ cat == null }">
		Пол: <select name="gender">
			<option value="MALE" selected="selected">MALE</option>
			<option value="FEMALE">FEMALE</option>
		</select><br></c:if>
		
		 Возраст: <input name="age" value="${ cat.age }">

		<br>Цвет: <input name="color" value="${ cat.color }">
		<br> <input	type="submit" name="button" value="Ок"> 
		<br> <input	type="hidden" name="radioId" value=${ cat.id } > 
	</form>
			<input type="submit" name="button" value="Отмена" onclick="history.back() ">
		
</body>
</html>