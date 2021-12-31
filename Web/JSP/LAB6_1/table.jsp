<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

	<%
		out.println("<div align='center'>");
		out.println("<table class='time_table'>");
		
		int i, j;
		String[] week = {"월", "화", "수", "목", "금", "토", "일"};
		String[] color = {"red", "green", "blue"};
		
		int c = 0;
		for(i=0; i<week.length; i++){
			if(i%3 == 0){
				out.println("<th class='time_th' style='color:" + color[c] + ";'>");
				c++;
			}
			else
				out.println("<th class='time_th' style='color:black;'>");
			out.println(week[i] + "</th>");
		}
		
		for(i=0; i<4; i++){
			out.println("<tr>");
			for(j=0; j<week.length; j++){
				out.println("<td class='time_td' align='center'>&nbsp;</td>");
			}
			out.println("</tr>");
		}
		out.println("</table>");
		out.println("</div>");
	%>