<%@ page errorPage="ErrorHandler.jsp" language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<style>
body {
	background-color: rgb(125, 71, 96, 0.4);
}
</style>
<body>
	<center>
	<%@ include file= "Header.jsp" %>
		<h1>Registration Form</h1>
		<form action="reg" method="post">
			<table>
				<tr>
					<th>First Name :</th>
					<td><input type="text" name="fname"></td>
				</tr>
				<tr>
					<th>Last Name :</th>
					<td><input type="text" name="lname"></td>
				</tr>
				<tr>

					<th>Login :</th>
					<td><input type="email" name="login"></td>
				</tr>
				<tr>
					<th>Password :</th>
					<td><input type="password" name="pass"></td>
				</tr>
				<tr>
					<th>Mob No :</th>
					<td><input type="text" name="mob"></td>
				</tr>
				<tr>
					<th>Date of Birth :</th>
					<td><input type="date" name="dob"></td>
				</tr>
				<tr>
					<th></th>
					<td><input type="submit" value="Sign Up?"></td>
				</tr>

			</table>


		</form>
		<br></br>
		<br></br>
		<br></br>
		<br></br>
		<br></br>
		<br></br>
		<br></br>
		<br></br>
		<br></br>
		<br><%@ include file="Footer.jsp" %></br>
	</center>
</body>
</html>