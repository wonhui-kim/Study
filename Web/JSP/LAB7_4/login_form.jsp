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
				<td><input type="text" placeholder="���̵�" name="id"/></td>
			</tr>
			<tr>
				<td><input type="password" placeholder="��й�ȣ" name="pwd"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="�α���"/>
					<input type="reset" value="�ٽ��Է�"/></td>
			</tr>
		</table>
	</form>
</body>
</html>