<%@page import="in.co.rays.model.StudentModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="s" scope="session" class="in.co.rays.bean.StudentBean"/>

<jsp:setProperty name="s" property="*"/>


<%-- <jsp:getProperty name="s" property="rollNo" />
<jsp:getProperty name="s" property="fname" />
<jsp:getProperty name="s" property="lname" />
<jsp:getProperty name="s" property="session" /> --%>

<% String op = request.getParameter("operation");
    StudentModel model= new StudentModel();
   if(op.equals("Add")){
	   model.add(s);
	   
   }else{
	   if(op.equals("Modify")){
	   model.update(s);
   }else{
	   model.delete(s);
   }
	   
   }
%>


</body>
</html>