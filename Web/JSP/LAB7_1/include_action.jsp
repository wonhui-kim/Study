<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>include action</title>
<style>
	div { text-align: center; }
</style>
</head>
<body>
	<div>
		<h2>include �׼� ����</h2>
		<hr>
		
		<jsp:include page="greeting.jsp">
			<jsp:param name="name" value="DWU"/>
			<jsp:param name="date" value="2021/10/12"/>
		</jsp:include>
		
		<h3>�ٽ� include_action.jsp���� ����Դϴ�.</h3>
	</div>
	
</body>
</html>