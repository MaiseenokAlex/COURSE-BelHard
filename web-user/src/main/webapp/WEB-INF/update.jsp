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

<form action="user" method="POST">
<input type="hidden" name="id" value="${ user.userId }">
	<c:out value="User Id: ${ user.userId }"></c:out><br/>
	<c:out value="New User Name: "></c:out>
	<input name="name" value="${ user.userName }">	<br/>
	<input type="submit" name="update" value="Confirm">
</form>
</body>
</html>