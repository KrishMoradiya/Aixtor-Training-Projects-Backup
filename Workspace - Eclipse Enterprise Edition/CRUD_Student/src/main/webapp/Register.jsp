<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.Classes.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register here</title>
<script type="text/javascript" src="FormValidation.js"></script>
	<style>
		.error-text {
			color: red;
		}
	</style>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<%
	if (request.getParameter("id") == null) {
	%>
	<div class="container">
		<form name="registerForm" action="Register" method="Post">

			Name : <input class="form-control" type="text" name="name" /> 
			<span class="error-text" id="nameValidation"></span><br /><br /> 
			Email : <input class="form-control" type="email" name="email" />
			<span class="error-text" id="emailValidation"></span><br /> <br /> 
			Password : <input class="form-control" type="password" name="password" />
			<span class="error-text" id="passwordValidation"></span> <br /> <br /> 
			Gender : <input type="radio" name="gender" value="Male" />Male 
					<input type="radio" name="gender" value="Female" />Female<br /> 
					<span class="error-text" id="genderValidation"></span><br /> <br>
			Mobile: <input type="text" class="form-control" name="mobile" maxlength="10" minlength="10" />
			<span class="error-text" id="mobileValidation"></span> <br /> <br />
			<!-- <input type="submit" class="form-control btn btn-primary" value="register"> -->
			<input type="submit" class="form-control btn btn-primary" value="register" onclick="return registerFormValidation();">
		</form>
	</div>
	<%
	} else {
	int id = Integer.parseInt(request.getParameter("id"));
	DBClass db = new DBClass();
	Student st = db.getDataByID(id);
	%>
	<div class="container">
		<form action="Edit?id=<%=st.getId()%>" name="editForm" method="Post">
			Name : 
			<input type="text" name="name" id="name" value="<%=st.getName()%>" />
			<span class="error-text" id="nameValidationEdit"></span><br /><br /> 
			<input id="gender" type="hidden" value="<%=st.getGender()%>" /> 
			Email : 
			<input type="email" name="email" id="email" value="<%=st.getEmail()%>" />
			<span class="error-text" id="emailValidationEdit"></span><br /><br /> <br /> <br /> 
			Password : 
			<input type="password" name="password" id="password" value="<%=st.getPassword()%>" />
			<span class="error-text" id="passwordValidationEdit"></span><br /><br /> <br /> <br />
			Gender : 
			<input type="radio" name="gender" id="male" value="Male" />Male
			<input type="radio" id="female" name="gender" value="Female" />Female<br />
			<span class="error-text" id="genderValidation"></span><br /> <br>
			Mobile: 
			<input type="text" name="mobile" id="mobile" minlength="10" maxlength="10" value="<%=st.getMobile()%>" required/>
			<span class="error-text" id="mobileValidationEdit"></span><br /><br />  <br /> <br /> <input
				type="submit" value="Update" onclick="return editFormValidation();">
			<!--  <input type="submit" value="Update"> -->

		</form>
	</div>
	<%
	}
	%>
	<script>
		let gender = document.getElementById("gender")
		{
			if (gender.value == "Male")
				document.getElementById("male").checked = true;
			else if(gender.value == "Female")
				document.getElementById("female").checked = true;
			else{
				document.getElementById("female").checked = false;
				document.getElementById("male").checked = false;
			}
		}
	</script>
</body>
</html>