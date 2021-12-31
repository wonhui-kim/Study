<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>LAB7_3</title>
<style>
	div { text-align: center; }
	table { 
		margin-left: auto;
		margin-right:auto;
		vertical-align: center;
		width: 600px;
	}
	th, td {
		padding: 20px;
		
	}
</style>
</head>
<body>
	<div>
		<h2>Include Action Practice</h2>
	
		<table>
			<tr>
				<td>
					<jsp:include page="calendar.jsp">
						<jsp:param name="year" value="2020"/>
						<jsp:param name="month" value="2"/>
					</jsp:include>
				</td>
				<td>
					<jsp:include page="news.jsp">
						<jsp:param name="task2" value="take a class"/>
						<jsp:param name="task3" value="Homework"/>
					</jsp:include>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>