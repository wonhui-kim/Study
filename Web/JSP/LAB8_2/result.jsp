<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <% request.setCharacterEncoding("UTF-8"); %>
<%@ page import="java.util.Enumeration" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>result.jsp</title>
</head>
<body>
	<h2>전달된 파라미터 이름들</h2>
	<%
		Enumeration<String> pnames = request.getParameterNames();
	
		while(pnames.hasMoreElements()){
			String pname = (String)pnames.nextElement();
	%>
	<%=pname %><br>
	<%
		}
	%>
	<hr>	
	타입: <%=request.getParameter("type") %><br>
	아이디: <%=request.getParameter("strID") %><br>
	비밀번호: <%=request.getParameter("strPwd") %><br>
</body>
</html>