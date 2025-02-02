<%@ page import="java.util.List"%>
<%@ page import="com.Classes.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<html>
<head>
<title>Student Data</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>

	<center>
		<h1>Student Data</h1>
		<div class="container align-item-around d-flex">

			<table border="1" class="table table-striped">
				<thead>
					<tr>
						<th>ID</th>
						<th>Name</th>
						<th>Email</th>
						<th>Gender</th>
						<th>Mobile</th>
						<th>Action</th>
						<!-- Add other column headers as needed -->
					</tr>
				</thead>
				<tbody>
					<%
					try {

						List<Student> studentDataList = (List<Student>) request.getAttribute("studentData");
						if (studentDataList == null) {
							out.print("<script>alert('No data found...');</script>");
							response.sendRedirect("index.jsp");
						} else {
							for (Student student : studentDataList) {
								%>
								<tr>
									<td><%=student.getId()%></td>
									<td><%=student.getName()%></td>
									<td><%=student.getEmail()%></td>
									<td><%=student.getGender()%></td>
									<td><%=student.getMobile()%></td>
									<td><a class="btn btn-primary"
										href="/CRUD_Student/Register.jsp?id=<%=student.getId()%>">Update
											Data</a>&nbsp;&nbsp;<a class="btn btn-danger"
										href="/CRUD_Student/Delete?id=<%=student.getId()%>">Delete
											Data</a></td>
								</tr>
								<%
								}
						}
					} catch (Exception e) {

					}
					%>
				</tbody>
			</table>
		</div>
	</center>
</body>
</html>
