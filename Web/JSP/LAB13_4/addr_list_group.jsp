<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="lab13.*"%>

<!DOCTYPE html>
	<jsp:useBean id="am" class="lab13.AddrManager" scope="application"/>
	<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>LAB13_4 : 주소록 목록</title>
<style>
	div {
		text-align:center;
	}
	table { 
		width: 500px;
		margin: 0px auto;
	}
	table, td {
		border: 1px solid;
		border-collapse: collapse;
	}
</style>
</head>
<body>
<div>
	<h2>주소록(그룹보기)</h2>
	<hr>
	<a href="addr_form.html">주소추가</a><br>
	<table>
	<tr><td>이름</td><td>전화번호</td><td>이메일</td><td>성별</td><td>그룹</td></tr>
	
	<c:forEach var="i" items="${am}">
		<tr>
			<td>${i.username}</td>
			<td>${i.tel}</td>
			<td>${i.email}</td>
			<td>${i.sex}</td>
			<td>${i.group}</td>
		</tr>
	</c:forEach>
	
	</table>
</div>
</body>
</html>


