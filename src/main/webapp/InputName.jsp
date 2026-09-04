<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">

.error{
	color: red;
}
</style>
</head>
<body>

	<% 
	
		String emailError = (String)request.getAttribute("emailError");
		String passwordError = (String)request.getAttribute("passwordError");
 
		
	%> 
	


	<form action="InputNameServlet" method="post">
		Name : <input type="text" name="name"  value="${nameValue}"/>
	
	<span class="error"> 
	 ${nameError}		
	</span>
		<br><br>
		
		
		
		Email : <input type="text" name="email" value="${emailValue}">
		
	<span class="error"> 
	<%=emailError==null?"":emailError %>			
	</span>
		<br><br>
		
		Password : 
		 <input type="password" name="password">
		 
	<span class="error"> 
	<%=passwordError==null?"":passwordError %>			
	</span>
		 <br><br>
		 
		
		<input type="submit" value="Submit"/>	
	
	</form>

</body>
</html>