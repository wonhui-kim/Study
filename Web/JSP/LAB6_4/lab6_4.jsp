<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.Calendar"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>LAB6_4</title>
<style>
	div { font-size: 20px; }
</style>
</head>
<body>
	<%
		Calendar cal = Calendar.getInstance();
	
		int year = 2021;
		int month = 10;
		
		out.println("<h2>" + year +"년 " + month + "월</h2><hr>");
		
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month - 1);
		cal.set(Calendar.DATE, 1);
		
		int end = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		int day = cal.get(Calendar.DAY_OF_WEEK);
		
		out.println("<div>");
		for(int i=1; i<day; i++){
			out.println("<span>&nbsp;</span>");
		}
		
		for(int i=1; i<=end; i++){
			out.println(i);
			if(day%7==0){
				out.println("<br>");
			}
			day++;
		}
		out.println("</div>");
	%>
</body>
</html>