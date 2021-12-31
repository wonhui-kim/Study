<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h2>오늘의 일정</h2>
	<hr>
	
	<ul>
		<%
			String task1 = request.getParameter("task1");
			String task2 = request.getParameter("task2");
			String task3 = request.getParameter("task3");
			
			if(task1 == null)
				task1 = "일정 없음";
			if(task2 == null)
				task2 = "일정 없음";
			if(task3 == null)
				task3 = "일정 없음";
			
			out.println("<li>"+ task1 + "</li>");
			out.println("<li>"+ task2 + "</li>");
			out.println("<li>"+ task3 + "</li>");
		%>
	</ul>
</body>
</html>