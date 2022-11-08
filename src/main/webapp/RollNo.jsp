<%@ page errorPage="ErrorHandler.jsp" language="java"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
form {
	color: rgb(20, 100, 0);
}
</style>
</head>
<body>
	<center>
		<form action="UpdateCtl" method="post">
			<h1>
				<u>Enter Your RollNo</u>
			</h1>

			<table>
				<tr>
					<th>RollNo. :</th>
					<td><input type="text" name="rollNo"
						placeholder="enter rollno"></td>
				</tr>
				<tr>
					<th></th>
					<td><input type="submit" value="modify" name="operation"></td>
					<td><input type="submit" value="delete" name="operation"></td>
				</tr>

			</table>

		</form>
	</center>
</body>
</html>