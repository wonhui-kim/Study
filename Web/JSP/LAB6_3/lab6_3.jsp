<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.util.Calendar"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>LAB6_3</title>
<style>
	p { font-size: 25px; }
</style>
</head>
<body>
	<%
		Calendar cal = Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int date = cal.get(Calendar.DATE);
		int day = cal.get(Calendar.DAY_OF_WEEK);
		String korDay = "";
		
		switch(day){
		case 1:
			korDay = "일";
			break;
		case 2:
			korDay = "월";
			break;
		case 3:
			korDay = "화";
			break;
		case 4:
			korDay = "수";
			break;
		case 5:
			korDay = "목";
			break;
		case 6:
			korDay = "금";
			break;
		case 7:
			korDay = "토";
			break;
		}
		
		int start = cal.getMinimum(Calendar.DATE);
		int end = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

		cal.set(Calendar.YEAR, 2020);
		cal.set(Calendar.MONTH, Calendar.JANUARY);
		cal.set(Calendar.DATE, 23);
		
		switch(cal.get(Calendar.DAY_OF_WEEK)){
		case 1:
			korDay = "일";
			break;
		case 2:
			korDay = "월";
			break;
		case 3:
			korDay = "화";
			break;
		case 4:
			korDay = "수";
			break;
		case 5:
			korDay = "목";
			break;
		case 6:
			korDay = "금";
			break;
		case 7:
			korDay = "토";
			break;
		}
	%>
	
	<p>오늘은 <%=year %>년 <%=month %>월 <%=date %>일 <%=korDay %>요일입니다</p>
	<p>이번달은 <%=start %>일부터 시작하여 <%=end %>일에 끝납니다.</p>
	<p>코로나 시작은 2020년 1월 23일 <%=korDay %>요일입니다</p>
</body>
</html>