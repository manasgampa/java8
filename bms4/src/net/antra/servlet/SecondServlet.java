package net.antra.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SecondServlet extends HttpServlet {
	
	public void service(HttpServletRequest request,HttpServletResponse response) {
		/*ServletContext context=getServletContext();
		String url=context.getInitParameter("url");
		System.out.println(url);
		System.out.println	("in servlet 2");*/
		ServletConfig config=getServletConfig();
		String str=config.getInitParameter("abcd");
		System.out.println(str);
		
	}
	

}
