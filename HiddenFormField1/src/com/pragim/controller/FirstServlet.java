package com.pragim.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		String name=request.getParameter("uname");
		String fname=request.getParameter("fname");
		pw.println("<form=ssrv> <table><tr><td>income:</td><td><input type=text name=income></td></tr>");
		pw.println("<tr><td>tax:</td><td><input type=text  name=tax ></td></tr>");
		pw.println("<tr><td><input type=hidden  name=uname value="+name+"></td></tr>");
		pw.println("<tr><td><input type=hidden name=fname value="+fname+"></td></tr>");
		pw.println("<tr><td><input type=submit value=store></tr></td>");
		pw.println("</table></form>");
		
		
		
		
	}

}
