package net.antra.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ThirdServlet extends HttpServlet{

	public void init() {
		
		System.out.println("in init method");
	}
	
	int i=10;
	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException{
		
		List<Person> list=Arrays.asList(new Person("Sara","F",20),
				new Person("Sara","F",27),
				new Person("Bob","M",20),
				new Person("Paula","F",32),
				new Person("Paul","M",32),
				new Person("Jack","M",2),
				new Person("Jack","M",72),
				new Person("Jill","F",12)
				);
		
		request.setAttribute("person",list);
		HttpSession session=request.getSession();
		//session.setAttribute("person",list);//--10,000
		String id=request.getParameter("empid");
		String name=request.getParameter("empName");
		String sal=request.getParameter("empsal");
		request.getRequestDispatcher("one.jsp").forward(request, response);
		
		/*
		Cookie c[]=request.getCookies();
		System.out.println(c[0].getName());
		System.out.println(c[0].getValue());*/
		/*String id=request.getParameter("empid");
		String name=request.getParameter("empName");
		String sal=request.getParameter("empsal");
		int id1=Integer.parseInt(id);
		int sal1=Integer.parseInt(sal);
		System.out.println("Name:"+name);
		System.out.println("id:"+id);
		System.out.println("sal:"+sal);
		ServletContext context=getServletContext();
		String url=context.getInitParameter("url");
		System.out.println(url);
		ServletConfig config=getServletConfig();
		String str=config.getInitParameter("abcd");
		System.out.println(str);
		
		PrintWriter out=response.getWriter();
		out.println("Name:"+name);
		out.println("id:"+id);
		out.println("sal:"+sal);
		
		m1();*/
	}
	public void m1() {
		System.out.println("in m1 method");
		
	}
	public void destroy() {
		
		System.out.println("in destroy");
	}
	
}
