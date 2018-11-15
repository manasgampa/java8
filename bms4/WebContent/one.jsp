<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.util.*" %>
 <%@ page import="net.antra.servlet.*" %>   
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Hii//templet text

<c:forEach items="${person}" var="per">
	
<br>
<c:out value="${per.name}"></c:out>

<br>
<c:out value="${per.gender}"></c:out>

<br>
<c:out value="${per.age}"></c:out>
	
</c:forEach>
<br>

<%-- 
<br>
<c:out value="${person.name}"></c:out>

<br>
<c:out value="${person.gender}"></c:out>

<br>
<c:out value="${person.age}"></c:out>
 --%>

<%-- <%

/*Object obj=request.getAttribute("person");
List li=(List)obj;*/
HttpSession se=request.getSession();
List li=(List)se.getAttribute("person"); 

for(int i=0;i<li.size();i++){
	Object o=li.get(i);
	Person p=(Person)o;
	out.println(p.getName());
	out.println(p.getAge());
	out.println(p.getGender());
	
}
ArrayList al=new ArrayList();


//Scriptlet tag
int a=10;
int b=30;
/* System.out.println(a);
System.out.println("hi i am jsp");
out.print(a); */
m1(out);
//impicit varaiables
//out
//request
//response
//session
//application//config
%>
<%=b%>
<%!
int i=10;
public void m1(JspWriter out){
	try{
		int i =30;
	/* out.println("hiii"); */
	}catch(Exception e){
		
	}
}

%> --%>


</body>
</html>