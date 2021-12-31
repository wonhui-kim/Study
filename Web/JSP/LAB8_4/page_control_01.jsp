<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>LAB8_4</title>
</head>
<body>
	<form name="frm1" method="post" action="page_control_02.jsp">
		아이디: <input type="text" name="username">
		비밀번호: <input type="password" name="password">
		<input type="submit" value="forward 전송">
	</form>
	<form name="frm2" method="post" action="page_control_03.jsp">
		아이디: <input type="text" name="username">
		비밀번호: <input type="password" name="password">
		<input type="submit" value="sendRedirect 전송">
	</form>
</body>
</html>