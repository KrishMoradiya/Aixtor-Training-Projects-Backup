<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<div class="container">
		<form action="Register" method="Post">
			Name : <input type="text" name="name" /> <br /> <br /> 
			Email : <input type="email" name="email" /> <br /> <br /> 
			Password : <input type="password" name="password" /> <br /> <br /> 
			Gender : <input	type="radio" name="gender" value="Male" />Male <input type="radio" name="gender" value="Female" />Female<br />
			Mobile: <input type="text" name="mobile" /> <br /> <br /> 
			<input type="submit" value="register">
		</form>
	</div>
</body>
</html>