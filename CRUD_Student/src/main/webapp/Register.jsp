<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Register here</title>
<script type="text/javascript" src="FormValidation.js"></script>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<div class="container">
		<form name="registerForm" action="Register" method="Post">
			Name : <input class="form-control" type="text" name="name" required/> <br /> <br /> 
			Email : <input class="form-control" type="email" name="email" required/> <br /> <br /> 
			Password : <input class="form-control" type="password" name="password" required/> <br /> <br /> 
			Gender : <input	type="radio" name="gender" value="Male" />Male <input type="radio" name="gender" value="Female" />Female<br />
			Mobile: <input type="text" class="form-control" name="mobile" maxlength="10" minlength="10" required/> <br /> <br /> 
			<input type="submit" class="form-control btn btn-primary" value="register">
			<!--<input type="submit" class="form-control btn btn-primary" value="register" onclick="return registerFormValidation();">-->
		</form>
	</div>
</body>
</html>