<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>testform.jsp</title>
</head>
<body>
	<form name="form1" method="POST" action="add.jsp">
		이름: <input type="text" name="username">
		전화번호: <input type="text" name="phone">
		<input type="submit" value="등록">
	</form>
</body>
</html>