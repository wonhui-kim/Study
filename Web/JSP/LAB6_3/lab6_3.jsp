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
			korDay = "��";
			break;
		case 2:
			korDay = "��";
			break;
		case 3:
			korDay = "ȭ";
			break;
		case 4:
			korDay = "��";
			break;
		case 5:
			korDay = "��";
			break;
		case 6:
			korDay = "��";
			break;
		case 7:
			korDay = "��";
			break;
		}
		
		int start = cal.getMinimum(Calendar.DATE);
		int end = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

		cal.set(Calendar.YEAR, 2020);
		cal.set(Calendar.MONTH, Calendar.JANUARY);
		cal.set(Calendar.DATE, 23);
		
		switch(cal.get(Calendar.DAY_OF_WEEK)){
		case 1:
			korDay = "��";
			break;
		case 2:
			korDay = "��";
			break;
		case 3:
			korDay = "ȭ";
			break;
		case 4:
			korDay = "��";
			break;
		case 5:
			korDay = "��";
			break;
		case 6:
			korDay = "��";
			break;
		case 7:
			korDay = "��";
			break;
		}
	%>
	
	<p>������ <%=year %>�� <%=month %>�� <%=date %>�� <%=korDay %>�����Դϴ�</p>
	<p>�̹����� <%=start %>�Ϻ��� �����Ͽ� <%=end %>�Ͽ� �����ϴ�.</p>
	<p>�ڷγ� ������ 2020�� 1�� 23�� <%=korDay %>�����Դϴ�</p>
</body>
</html>