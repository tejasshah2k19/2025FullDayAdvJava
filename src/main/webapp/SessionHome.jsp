<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"    isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>

<%
	String userName = (String) session.getAttribute("userName");
%>
<body>
	Welcome ,
	<%=userName%>
	
		<br><br>
		Welcome, ${sessionScope.userName}

	<br><br> 
	<a href="SessionLogoutController">Logout</a>
</body>
</html>