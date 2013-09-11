package edu.training.param;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/param")
public class ParamDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ParamDemo() {
        super();
      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<h1> This is working ");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		String paramName = request.getParameter("name");
		String[] paramArray = request.getParameterValues("state");
		Enumeration<String> paramEnum = request.getParameterNames();
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		out.println("Param Name: " + paramName.toString() + "<br>");
		
		for (String p : paramArray) {
			out.println("Param Array: "+ p + "<br>");
		}
		
		while(paramEnum.hasMoreElements()) {
			
			out.println("Parameter Field: " + paramEnum.nextElement() + "<br>");
		}
		
		
		Enumeration headerNames = request.getHeaderNames();
		
		while(headerNames.hasMoreElements()) {
			String header = (String)headerNames.nextElement();
			out.println("<b>Header:</b> " + header );
			out.println(" <b>Value:</b> " + request.getHeader(header) + "<br>");
			
		}
		
		
	}

}
