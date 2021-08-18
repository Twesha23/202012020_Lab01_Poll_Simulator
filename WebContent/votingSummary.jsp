<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page
	import="com.pollsimulator.model.Candidate,com.pollsimulator.service.*,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Poll Simulator</title>
</head>
<body>
	<h1>Voting Summary</h1>
	<br>
	<%
	List<Candidate> candidates = CandidateService.getCandidates();
	request.setAttribute("candidates", candidates);
	%>
	<c:forEach items="${candidates}" var="candidate">
		${candidate.getId()} ${candidate.getName()}: ${candidate.getVote_count()} <br>
	</c:forEach>

	<br>
	<br>
	<a href="index.jsp">Return to home page</a>
</body>
</html>