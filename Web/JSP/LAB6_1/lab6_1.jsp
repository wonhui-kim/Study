<%-- 컴퓨터학과 20180215 김원희, 크롬 --%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>LAB6_1</title>
<style>
	div { text-align: center; }
	.time_table {
		width: 500px; 
		border: 1px solid black;
		border-collapse: collapse;
	}
	.time_td, .time_th {
		border: 1px solid black;
	}
	li { text-align: left; }
	table { margin: auto; }
</style>
</head>
<body>
	<div>
		<p>[지시어 연습]</p>
		<%@ include file="include.jsp" %>
		
		<table>
			<tr>
				<td class="t1"><%@ include file="table.jsp" %></td>
				<td class="t2"><%@ include file="news.jsp" %></td>
			</tr>
		</table>
	</div>
</body>
</html>