<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib tagdir="/WEB-INF/tags" prefix="ddwutag" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LAB12_2:커스텀태그</title>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
		session.setAttribute("id", request.getParameter("id"));
	%>
	
	<div>
		<ddwutag:greeting color="green"/>
		<ddwutag:greeting color="blue"/>
	</div>
</body>
</html>