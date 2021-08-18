<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Poll Simulator</title>
</head>
<body>
	<h1>Register Candidate</h1>
	<form action="CandidateServlet" method="post">
		<label>Candidate ID:</label> <input type="text" name="id" required/><br>
		<label>Candidate name:</label> <input type="text" name="name" required/><br>
		<input type="submit" value="submit" /> <br>
		<input type="reset" value="reset"/>
	</form>
	<br> <a href="index.jsp">Return to home page</a>
</body>
</html>