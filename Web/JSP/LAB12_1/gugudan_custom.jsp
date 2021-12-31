<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib tagdir="/WEB-INF/tags" prefix="ddwutag" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LAB12_1:커스텀태그</title>
<style>
	table { 
		margin: auto;
		width: 500px; 
	}
	table, td { border: 1px solid black; }
</style>
</head>
<body>
	<div align="center">
		<ddwutag:gugudan>구구단 출력</ddwutag:gugudan>
	</div>
</body>
</html>