<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Новый кот</title>
</head>

<body>
<a href="./Shelter"><img src="logo.jpg" /></a>
<hr>
	<form action="" method="post">
		Введите имя кота: <input name="catName" value="${ cat.name }"><br>
		Отец (id): <select>
			<c:forEach items="${ cat }" var="cat">
				<option>"${ cat.name }"</option>
			</c:forEach>
		</select><br> Мать (id): <select>
			<c:forEach items="${ cat }" var="cat">
				<option>"${ cat.name }"</option>
			</c:forEach>
		</select><br> Пол: <select name="gender">
			<option value=""></option>
			<option value="MALE">MALE</option>
			<option value="FEMALE">FEMALE</option>
		</select><br> Возраст: <input name="age" value="${ cat.age }"><br>
		Цвет: <input name="color" value="${ cat.color }"><br> <input
			type="submit" value="Ок"> <input type="button" value="Отмена">
	</form>
</body>
</html>