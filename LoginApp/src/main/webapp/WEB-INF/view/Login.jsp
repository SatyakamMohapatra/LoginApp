<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LoginApp</title>
</head>
<body>
<h1>LoginAPP</h1>
<form:form action="/LoginApp/rest/login" modelAttribute="userForm" method="post">
UserName :- <form:input  path="userName"/>
Password :- <form:password path="password"/>
<input type="submit" value="Login">
</form:form>
<a href="/LoginApp/rest/forgot">forgot password</a>
</body>
</html>