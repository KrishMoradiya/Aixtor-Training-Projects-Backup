<%@page import="com.Classes.AuthUser" errorPage="ErrorPage.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
	<br>
	<center>
		<div type="circle" class="justify-content-around d-flex">
			<div><a href="index.jsp" class="btn-outline-info btn" >Home Page</a></div>
			<div><a href="Register.jsp" class="btn-outline-info btn">Add Student Data</a></div>
			<div><a href="/CRUD_Student/GetStudentData" class="btn-outline-info btn">View Student Data</a></div>
		</div>
		<hr><br>
	</center>
</body>
</html>