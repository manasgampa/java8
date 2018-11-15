package net.antra.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FourthServlet extends HttpServlet {
	
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException {
		//new cookies will be added
		//new commite for fourth servlet
		/*Cookie c1=new Cookie("uname","Anna");
		response.addCookie(c1);*/
		
		/*HttpSession sc=request.getSession(false);//if session object is not
		PrintWriter out=response.getWriter();
		
		out.print(sc.getId());
		out.println(sc.isNew());*/
		request.getRequestDispatcher("Insert.html").include(request, response);
		
	}

}
