package com.niit.shoppingcart.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.niit.shoppingcart.dao.UserDAO;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public loginServlet() {
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
	     String userid =(String) request.getParameter("userid");	
	     String password =(String)request.getParameter("password");
	     
	     UserDAO userDAO = new UserDAO();
	     if(userDAO.isValidCredentials( userid,password ) == true)
	     
	      {
	    	RequestDispatcher dispatcher = request.getRequestDispatcher("login.html");
	    	{
	    		dispatcher.forward(request,response);
	    		
	    	}
	      }
	    	else
	    	{
	    	PrintWriter out =response.getWriter();
	    	    out.print("invalid Credentials");
	    	    		RequestDispatcher dispatcher = request.getRequestDispatcher("sample.html");
	    	    		
	    	    		dispatcher.include(request, response);
	      
	    	    
	    	
	    	      
	      }
	    
	     

	}

}
