<%@page import="com.bean.StudentBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Internship Success</h1>

	<%
		ArrayList<StudentBean> list = (ArrayList<StudentBean>) request.getAttribute("list");
	%>
	
	
	<%for(StudentBean s:list){ %>
		<%=s.getName() %><br>
	<%} %>
	

</body>
</html>