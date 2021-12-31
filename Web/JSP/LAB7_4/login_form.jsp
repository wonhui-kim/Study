<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>LAB7_4: forward</title>
</head>
<body>

<%
	String msg = request.getParameter("msg");
	
	if(msg != null)
		out.println("<p>" + msg + "</p>");
%>
	<form action="login.jsp" method="post">
		<table>
			<tr>
				<td><input type="text" placeholder="아이디" name="id"/></td>
			</tr>
			<tr>
				<td><input type="password" placeholder="비밀번호" name="pwd"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="로그인"/>
					<input type="reset" value="다시입력"/></td>
			</tr>
		</table>
	</form>
</body>
</html>