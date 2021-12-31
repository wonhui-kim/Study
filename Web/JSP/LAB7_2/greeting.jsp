<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>greeting message</title>
</head>
<body>
	<h3>greeting.jsp에서 출력한 메시지 입니다.</h3>
	<%
		out.println(request.getParameter("name") + "님 환영합니다.<br>");
		out.println("오늘은 " + request.getParameter("date") + "입니다.");	
	%>

</body>
</html>