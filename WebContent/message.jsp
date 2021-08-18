<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Poll Simulator</title>
</head>
<body>
<span> 
		<%
		 if ((String) session.getAttribute("message") != null) {
		 %> <%
		 out.print((String) session.getAttribute("message"));
		 }
		 %>
	</span>
	<br> <a href="index.jsp">Return to home page</a>
</body>
</html>