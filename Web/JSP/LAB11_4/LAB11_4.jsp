<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import = "java.util.ArrayList" %>
    <%@page import = "labhw11.LectureBean" %>
    
    <jsp:useBean id="lecture" class="labhw11.LectureBean" scope="page"/>
    <jsp:setProperty name="lecture" property="*"/>
    <jsp:useBean id="lm" class="labhw11.LectureManager" scope="application"/>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LAB11_4</title>
<style>
	div { text-align: center; }
	select { margin-right: 10px; }
	input { margin-left: 20px; }
</style>
</head>
<body>
	<div>
		<form name="form1" method="POST" action="LAB11_4.jsp">
			과목타입: <select name="type">
						<option value=0>전공필수</option>
						<option value=1>전공선택</option>
						<option value=2>교양</option>
						<option value=3>자유선택</option>
					</select>
			과목명: <select name="title">
						<option value=0>웹프로그래밍</option>
						<option value=1>운영체제</option>
						<option value=2>객체지향프로그래밍</option>
						<option value=3>데이터베이스개론</option>
						<option value=4>자료구조</option>
						<option value=5>네트워크</option>
						<option value=6>창의와감성</option>
						<option value=7>사회봉사</option>
				  </select>
			요일: <select name="day">
				 	<option value=0>월</option>
				 	<option value=1>화</option>
				 	<option value=2>수</option>
				 	<option value=3>목</option>
				 	<option value=4>금</option>
				 </select>
			시간: <select name="time">
				 	<option value=1>1</option>
				 	<option value=2>2</option>
				 	<option value=3>3</option>
				 	<option value=4>4</option>
				 	<option value=5>5</option>
				 	<option value=6>6</option>
				 </select>
			연강: <select name="consecutive">
				 	<option value=1>1</option>
				 	<option value=2>2</option>
				 </select>
			<input type="submit" value="등록">
		</form>
		<hr>
		<%
			request.setCharacterEncoding("UTF-8");
			lm.add(lecture);
			
			for(LectureBean lb : lm.getLectureList()){
				if(lb.getType() != -1){				
					if(lb.getConsecutive() == 2){
		%>
					
					<p><%=lb.toType(lb.getType()) %> / <%=lb.toTitle(lb.getTitle()) %> 
					/ <%=lb.toDay(lb.getDay()) %> / <%=lb.getTime() %> / <%=lb.getTime() + 1%></p>
		<%
					}
					else{
		%>
					<p><%=lb.toType(lb.getType()) %> / <%=lb.toTitle(lb.getTitle()) %> 
					/ <%=lb.toDay(lb.getDay()) %> / <%=lb.getTime() %></p>
		<%		
					}
				}
			}
		%>
		
		
		<%-- 
			session.setAttribute("lectureType", request.getAttribute("lectureType"));
			session.setAttribute("lectureTitle", request.getAttribute("lectureTitle"));
			session.setAttribute("day", request.getAttribute("day"));
			session.setAttribute("time", request.getAttribute("time"));
			session.setAttribute("consecutive", request.getAttribute("consecutive"));
		
			String[] typeNames = {"전공필수", "전공선택", "교양", "자유선택"};
			String[] titleNames = {"웹프로그래밍", "운영체제", "객체지향프로그래밍",
					"데이터베이스개론", "자료구조", "네트워크", "창의와감성", "사회봉사"};
			String[] days = {"월", "화", "수", "목", "금"};
			
			@SuppressWarnings("unchecked")
			ArrayList<String> timetable = (ArrayList<String>)session.getAttribute("timetable");
			
			if(timetable == null){
				timetable = new ArrayList<String>();
				session.setAttribute("timetable", timetable);
			}
			
			String lectureType = typeNames[Integer.parseInt(request.getParameter("lectureType"))];
			String lectureTitle = titleNames[Integer.parseInt(request.getParameter("lectureTitle"))];
			String day = days[Integer.parseInt(request.getParameter("day"))];
			int time = Integer.parseInt(request.getParameter("time"));
			int consecutive = Integer.parseInt(request.getParameter("consecutive"));
			
			String t = "";
			if(consecutive == 1){
				t = time + "";
			} else {
				t = time + "/" + (time+1);
			}
			
			timetable.add(lectureType + "/" + lectureTitle + "/" + day + "/" + t);
			
			if(timetable != null){
				for(String lecture : timetable){
					out.println(lecture+"<br>");
				}
			}
		--%>
	</div>
</body>
</html>