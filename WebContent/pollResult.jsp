<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page
	import="com.pollsimulator.model.Candidate,com.pollsimulator.service.CandidateService,java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Poll Simulator</title>
</head>
<body>
	<h1>Poll Result</h1>
	<br>
	<%
	List<Candidate> candidates = CandidateService.getPollResult();
	request.setAttribute("candidates", candidates);
		if(candidates.size()==2)
		{%>
			Won: ${candidates.get(0).getId()} ${candidates.get(0).getName()}(${candidates.get(0).getVote_count()}) <br>
			Lost: ${candidates.get(1).getId()} ${candidates.get(1).getName()}(${candidates.get(1).getVote_count()})
		<%}else
		{%>
			Result is not declared yet
		<%}%>
		
    <br>
	<a href="index.jsp">Return to home page</a>
</body>
</html>