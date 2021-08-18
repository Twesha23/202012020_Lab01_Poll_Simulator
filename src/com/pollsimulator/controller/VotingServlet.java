package com.pollsimulator.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pollsimulator.model.Student;
import com.pollsimulator.service.CandidateService;
import com.pollsimulator.service.StudentService;

/**
 * Servlet implementation class VotingServlet
 */
@WebServlet("/VotingServlet")
public class VotingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VotingServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String message="";
		Student s = new Student();
		try {
		s.setId(Long.parseLong(request.getParameter("studentId")));
		
		if(StudentService.regiserVote(s)) {
			CandidateService.registerVote(Long.parseLong(request.getParameter("candidateId")));
			message=s.getId() + " your vote has been recorded successfully!";
		}
		else
			message=s.getId() + " you have already voted!";
		}
		catch (NumberFormatException e) {
			message="Invalid Id";
		}
		finally {
		 HttpSession session = request.getSession(true);
         //session.setAttribute("candidate",new Candidate());
         session.setAttribute("message", message);
         response.sendRedirect("message.jsp");
		}
	}


}
