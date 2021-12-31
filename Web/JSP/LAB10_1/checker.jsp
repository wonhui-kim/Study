<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>checker.jsp</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
		String action = request.getParameter("action");
	
		if(action.equals("login")){
			String id = request.getParameter("username");
			String pwd = request.getParameter("userpwd");
			
			if(id != null && pwd.equals("mia")){
				session.setAttribute("user", id);
			}
		} else {
			session.invalidate();
		}
		
		response.sendRedirect("index.jsp");
	%>
</body>
</html>