<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Users</title>
</head>
<body>
<c:forEach items="${ userList }" var="user">
	<c:out value="User Id: ${ user.userId }"></c:out>
	<br/>
	<c:out value="User Name:  ${ user.userName }"></c:out>
<table><tr><td>
	<form action="update" method="post">
	<input type="hidden" name="id" value="${ user.userId }">
	<input type="hidden" name="name" value="${ user.userName }">
	<input type="submit" name="update" value="UPDATE">
	</form></td><td>
	<form action="user" method="post">
	<input type="hidden" name="id" value="${ user.userId }">
	<input type="submit" name="delete" value="DELETE" onclick="return confirm('Вы уверены?');">
	</form></td></tr></table>
	<br/>
	<br/></c:forEach>
</body>
</html>