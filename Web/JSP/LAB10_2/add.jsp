<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>add.jsp</title>
<style>
	div { text-align: center; }
</style>
</head>
<body>
	<div>
		<h2>주소록</h2>
		<hr>
		<%
			request.setCharacterEncoding("UTF-8");
			
			String username = request.getParameter("username");
			String phone = request.getParameter("phone");
			
			ArrayList<String> addrbook = (ArrayList<String>)application.getAttribute("addrbook");
			
			if(addrbook == null){
				addrbook = new ArrayList<String>();
				application.setAttribute("addrbook", addrbook);
			}
			
			addrbook.add(username + ", " + phone);
			
			out.println("<ol>");
			if(addrbook != null){
				for(String addr : addrbook){
					out.println("<li>" + addr + "</li>");
				}
			}
			out.println("</ol>");
			
		%>
	</div>
</body>
</html>