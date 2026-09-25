<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Amazon Login</h2>

<form method="post" action="AmazonLoginController">
	Email :<input type="text" name="email"/><br><BR> 
	Password : <input type="password" name="password"/><br><Br> 
	
	<input  type="submit" value="Login"/>

</form>

<a href="AmazonSignup.jsp">Signup</a>

<Br> 
${error}

</body>
</html>