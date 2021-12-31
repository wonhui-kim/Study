<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>session_01.jsp</title>
<style>
	input {
		margin: 0 10px 10px 0;
	}
</style>
</head>
<body>
	<form name="form1" method="POST" action="session_02.jsp">
		아이디: <input type="text" name="username"><br>
		비밀번호: <input type="password" name="userpwd"><br>
		<input type="submit" value="로그인"><input type="reset" value="취소">
	</form>
</body>
</html>