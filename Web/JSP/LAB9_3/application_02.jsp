<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>application_02.jsp</title>
</head>
<%
	request.setCharacterEncoding("UTF-8");
	session.setAttribute("username", request.getParameter("username"));
	String t = request.getParameter("time");
	int time = Integer.parseInt(t) * 60;
	session.setMaxInactiveInterval(time);
	
	Integer count = (Integer)application.getAttribute("count");
	int cnt = count.intValue() + 1;
	application.setAttribute("count", cnt);
%>
<body>
	<%=session.getAttribute("username")%>님 환영합니다.<br><br>
	
	세션 ID: <%=session.getId() %><br>
	세션 지속시간: <%=time %>초<br><br>
	
	오늘의 접속자수: <%=cnt %>
</body>
</html>