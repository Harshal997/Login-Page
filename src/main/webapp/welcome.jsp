<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	response.setHeader("Cache-Control", "no-cache, no-control, must-revalidate");
	response.setHeader("Pragma", "no-cache");
	response.setHeader("Expires", "0");
		if(session.getAttribute("username") == null) {
			response.sendRedirect("login.jsp");
		}
	%>       
		Welcome ${username}! <br>
		<a href="videos.jsp">Link to Videos</a>
		
		<form action="Logout">
			<input type='submit' value='Logout'>
		</form>
</body>
</html>