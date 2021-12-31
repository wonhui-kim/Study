<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LAB12_1:스크립트릿</title>
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
		<h2>구구단 출력</h2>
		<hr>
			<%
			out.println("<table>");
				out.println("<tr>");
					for(int i = 2; i < 6; i++){
						out.println("<td>");
						for(int j = 1; j < 10; j++){
							out.println(i + " * " + j + " = " + i*j + "<br>"); 
						}
						out.println("</td>");
					}
				out.println("</tr>");
				
				out.println("<tr>");
				for(int i = 6; i < 10; i++){
					out.println("<td>");
					for(int j = 1; j < 10; j++){
						out.println(i + " * " + j + " = " + i*j + "<br>"); 
					}
					out.println("</td>");
				}
				
				out.println("</tr>");
			out.println("</table>");
			%>
	</div>
</body>
</html>