<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="InputCookieController" method="post">

	Cookie Name :  <input type="text" name="cname"/><br><Br>
	Cookie Value : <input type="text" name="cvalue"/><br><Br>

	<input type="submit" value="Add Cookie"> 
</form>
<br><br>
	
	<a href="ListCookieController">List All Cookie</a>
	
<br>
<h2>${msg}</h2>
</body>
</html>