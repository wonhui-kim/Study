<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>application_01.jsp</title>
</head>
<%
	application.setAttribute("count", 1);
%>
<body>
	<form name="form1" method="POST" action="application_02.jsp">
		<table>
			<tr>
				<td>아이디:</td>
				<td><input type="text" name="username" width=30 size=20></td>
			</tr>
			<tr>
				<td>원하는 세션 지속시간(분):</td>
				<td><input type="text" name="time" width=30 size=20></td>
			</tr>
			<tr>
				<td colspan=2>
					<input type="submit" value="로그인" style="margin: 10px 5px 0 0"><input type="reset" value="취소" style="margin: 10px 0 0 0">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>