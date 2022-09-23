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
		<form action = "InsertCntroller" method = "Post">
			<table>
				Name:
				<input type="text" name="name">
				<br> Email:
				<input type="text" name="email">
				<br> City:
				<input type="text" name="city"><br>
				<input type="submit" value="submit">
				<br><br>
				<a href ="FatchCotroller">showAllData On Click</a>

			</table>

		</form>
	</center>
</body>
</html>