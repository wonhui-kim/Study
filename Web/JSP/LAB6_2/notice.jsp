<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>LAB6_2 에러페이지</title>
<style>
	div { text-align: center; }
	table {
		width: 1000px;
		margin-left: auto;
		margin-right: auto;
		font-size: 25px;
		font-weight: bold;
		
	}
	table, td, th {
		border-collapse: collapse;
	}
	td{ padding: 1em; }
	tr.t1 { background-color: rgb(255,218,186);}
	tr.t2 { background-color: rgb(255,240,214) }
	img.flower { width: 200px; height: 300px;}
</style>
</head>
<body>
	<div>
		<%
		out.println("<img src='images/main.PNG'>");
		%>
		<table>
			<tr class="t1"><td>오류가 발생하였습니다.</td></tr>
			<tr class="t2">
				<td><img src="images/flower.png" class="flower"><br>
					오류 발생 시간: <%= new java.util.Date() %> <br><br>
					최대한 빨리 조치하겠습니다.
				</td>
			</tr>
		</table>
	</div>
</body>
</html>