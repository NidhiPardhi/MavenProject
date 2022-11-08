<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<%@ include file="Header.jsp"%>
		<h1>
			<a href="Login.jsp">Maven Project</a>
			<p>
				<a href="list">User List</a>
			</p>
		</h1>
	</center>
	<%
		String msg = (String) request.getAttribute("msg");
		if (msg != null) {
	%>

	<%=msg%>
	<%
		}
	%>
	<a href="visit">User VisitCount</a>
	<center>
		<br></br> <br></br> <br></br> <br></br> <br></br> <br></br> <br></br>
		<br></br> <br></br> 
		<br><%@ include file="Footer.jsp"%></br>
	</center>
</body>
</html>