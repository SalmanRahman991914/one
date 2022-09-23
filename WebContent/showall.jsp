<%@page import="com.testcurud.Bean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h2>This is All record in dataBase</h2>
		<form>
			<table border="2">
				<tr>
					<th>Name</th>
					<th>Email</th>
					<th>City</th>
					
					
					<th>Delete</th>
				


				</tr>



				<%
					if (request.getAttribute("status") != null) {

					ArrayList list = (ArrayList) request.getAttribute("status");
					for (int i = 0; i < list.size(); i++) {

						Bean bean = (Bean) list.get(i);
				%>


				<tr>
					<td><%=bean.getName()%></td>
					<td><%=bean.getEmail()%></td>
					<td><%=bean.getCity()%></td>
					<td><a href="DeleteController?name=<%=bean.getName()%>">Delete</a></td>

				</tr>



				<%
					}
				}
				%>





			</table>




		</form>


	</center>

</body>
</html>