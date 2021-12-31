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
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		if(id.equals("admin") && pwd.equals("1234")){
	%>
			<jsp:forward page="main.jsp"/>
	<%
		}else {
	%>
			<jsp:forward page="login_form.jsp">
				<jsp:param name="msg" value="Enter the id('admin') and password('1234')"/>
			</jsp:forward>
	<%
		}
	%>
</body>
</html>