<%-- ��ǻ���а� 20180215 �����, ũ�� --%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>forward action</title>
</head>
<body>
	<jsp:forward page="greeting.jsp">
		<jsp:param name="name" value="DWU"/>
		<jsp:param name="date" value="2021/10/12"/>
	</jsp:forward>
</body>
</html>