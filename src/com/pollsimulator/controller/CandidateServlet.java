package com.pollsimulator.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pollsimulator.model.Candidate;
import com.pollsimulator.service.CandidateService;

/**
 * Servlet implementation class CandidateServlet
 */
@WebServlet("/CandidateServlet")
public class CandidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CandidateServlet() {
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
		// TODO Auto-generated method stub
		String message="";
		Candidate c=new Candidate();
		try {
		c.setId(Long.parseLong(request.getParameter("id")));
		c.setName(request.getParameter("name"));
		
		if(CandidateService.register(c))
			message="Candidate successfully registered";
		else
			message="Candidate registration unsuccessful";
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
