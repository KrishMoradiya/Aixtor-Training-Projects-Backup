<%@ page import="com.Classes.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Edit Data</title>
<script type="text/javascript" src="FormValidation.js"></script>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<div class="container">
	<%
		int id= Integer.parseInt(request.getParameter("id"));
		DBClass db = new DBClass();
		Student st = db.getDataByID(id);
	%>
		<form action="Edit?id=<%= st.getId() %>" name="editForm" method="Post">
			Name : <input type="text" name="name" id="name" value="<%= st.getName() %>" required/> <br /> <br /> 
			<input id="gender" type="hidden" value="<%= st.getGender() %>"/>
			Email : <input type="email" name="email" id="email" value="<%= st.getEmail() %>" required/> <br /> <br /> 
			Password : <input type="password" name="password" id="password" value="<%= st.getPassword() %>" required/> <br /> <br /> 
			Gender : <input	type="radio" name="gender" id="male" value="Male" />Male <input type="radio" id="female" name="gender" value="Female" />Female<br />
			Mobile: <input type="text" name="mobile" id="mobile" minlength="10" maxlength="10" value="<%= st.getMobile() %>" required/> <br /> <br /> 
			<!-- <input type="submit" value="Update" onclick="return editFormValidation();"> -->
			<input type="submit" value="Update">
			
		</form>
	</div>
	<script>
		let gender = document.getElementById("gender")
		{			
			if(gender.value == "Male")
				document.getElementById("male").checked = true;
			else
				document.getElementById("female").checked = true;
		}
	</script>
</body>
</html>