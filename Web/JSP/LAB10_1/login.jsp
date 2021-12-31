<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login.jsp</title>
<style>
	input { margin: 5px 5px 5px 5px; }
</style>
</head>
<body>
	<%
		request.setCharacterEncoding("UTF-8");
		String username = (String)session.getAttribute("user");
		
		if(username == null){
	%>
	<form name="form1" method="POST" action="checker.jsp">
		아이디: <input type="text" name="username"><br>
		비밀번호: <input type="password" name="userpwd"><br>
		<input type="hidden" name="action" value="login">
		<input type="submit" value="로그인">
	</form>
	
	<%
		}
		else {
	%>
	
	<form name="form2" method="POST" action="checker.jsp">
		<%=username %>님 환영합니다.
		<input type="hidden" name="action" value="logout"><br>
		<input type="submit" value="로그아웃">
	</form>
	<%
		}
	%>
</body>
</html>