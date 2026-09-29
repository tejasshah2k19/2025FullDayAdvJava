<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>


	<%
		Cookie c[] = 	(Cookie[])request.getAttribute("c");
	%>


	<table border="1" > 
	<tr>
		<th>Cookie Name</th>
		<th>Cookie Value</th>
		<th>Action</th>
	</tr>
	<%
		for(Cookie x:c){
	%>
	
			<tr>
			<td><%=x.getName() %></td> <td><%=x.getValue() %></td>
			<td><a href="DeleteCookieServlet?cName=<%=x.getName()%>">Delete</a></td>
			
			</tr>
	<%} %>
	
	</table>

</body>
</html>