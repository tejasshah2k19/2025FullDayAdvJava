<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="SignupServletF" method="post">
		FirstName: <input type="text" name="firstName"/> ${firstNameError}<br><br> 
		LastName:<input type="text" name="lastName"/> ${lastNameError} <br><br>
		<input type="submit" value="Signup"/>  
	</form>
</body>
</html>