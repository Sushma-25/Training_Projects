package com.sushma.learn.web;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateEmployeeServlet
 */
public class CreateEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateEmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	System.out.println("Sushma web app get method----");
	int id = 0;
	String name=request.getParameter("username");
	String project=request.getParameter("projectname");
	String department=request.getParameter("departmentname");
	System.out.println("Name :"+name+" Project :"+project+"Department :"+department);
	
	EmployeeController controller=new EmployeeController();
	try {
		id=controller.createEmployee(name,project,department);
	} catch (ClassNotFoundException | SQLException e) {
		
		e.printStackTrace();
	}
	System.out.println("id is :" +id);
	request.setAttribute("gid", id);
	request.getRequestDispatcher("success.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
