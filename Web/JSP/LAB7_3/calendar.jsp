<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.Calendar"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%
		Calendar cal = Calendar.getInstance();
	
		int year, month;
		
		String year_string = request.getParameter("year");
		String month_string = request.getParameter("month");
		
		
		if(year_string == null || month_string == null){
			year = cal.get(Calendar.YEAR);
			month = cal.get(Calendar.MONTH) + 1;
		} else {
			year = Integer.parseInt(year_string);
			month = Integer.parseInt(month_string);
		}
			
		
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