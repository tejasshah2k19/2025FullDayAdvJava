<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="InputNumServlet" method="post">

		N1: <input type="text" name="n1" /><Br>
		<br> N2: <input type="text" name="n2" /><Br>
		<br>
		Add <input type="radio" name="opr" value="add"/>

		Sub <input type="radio" name="opr" value="sub"/>
				Mul <input type="radio" name="opr" value="mul"/>
				Div <input type="radio" name="opr" value="div"/>
		<br>   
		<br> <input type="submit" value="Submit" />
	</form>

</body>
</html>