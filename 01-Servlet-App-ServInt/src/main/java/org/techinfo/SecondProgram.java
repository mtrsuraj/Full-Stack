package org.techinfo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SecondProgram extends GenericServlet{
	ServletResponse res;
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Generic Servlet");
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.print("date= "+new Date().toString());
	}

}
