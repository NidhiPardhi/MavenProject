<%@ page errorPage="ErrorHandler.jsp" language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student View</title>
<style>
#m1{
border-width: 20px;
border-style: groove;
border-color:teal;
padding: 15px;
}

 h1{
color: teal;
text-shadow: -1px 0 black, 0 1px aqua, 1px 0 black , 0 -1px aqua;
 }
 #m2{
    
 }
</style>
</head>
<body>
	<center>
		<%
			String up = (String) request.getAttribute("up");
		%>
		<font color="green"><%=up%></font> <u><h1>Student Management</h1></u>
		<form action="Stud" method="post">
			<table id="m1" border="3px solid black">
				<tr>
					<th>RollNO. :</th>
					<td><input type="text" name="rollNo" placeholder="enterr"></td>
				</tr>
				<tr>
					<th>First Name :</th>
					<td><input type="text" name="fname" placeholder="enterr"></td>
				</tr>
				<tr>
					<th>Last Name :</th>
					<td><input type="text" name="lname" placeholder="enterr"></td>
				</tr>
				<tr>
					<th>Session :</th>
					<td><input type="text" name="session" placeholder="enterr"></td>
				</tr>
				<tr>
					<th></th>
					<td id = "m2"><input type="submit" value="Add" name="operation">
						<input type="submit" value="Modify" name="operation"> <input
						type="submit" value="Delete" name="operation"> <input
						type="submit" value="Get" name="operation"> </td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>