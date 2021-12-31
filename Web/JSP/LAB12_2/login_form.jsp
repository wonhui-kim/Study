<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LAB12_2:커스텀태그</title>
<style>
	input { margin: 10px 5px 10px 0; }
</style>
</head>
<body>
	<div>
		<form name="form1" method="POST" action="print_login.jsp">
			아이디 : <input type="text" name="id"/> <br>
			비밀번호 : <input type="password" name="pw"/> <br>
			<input type="submit" value="로그인"/> <input type="reset" value="취소"/>
		</form>
	</div>
</body>
</html>