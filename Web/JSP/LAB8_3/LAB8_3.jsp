<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%request.setCharacterEncoding("UTF-8"); %>
<%@ page import="java.util.Enumeration" %>
<%@ page import="java.util.ArrayList" %>
<%!
		String[] mChoices = {"hobby"};
		String[] hobbyNames = {"뉴스", "맛집", "책", "영화", "여행"};
		String[] telArea = {"010", "080", "070", "02"};
		String[] gNames = {"남", "여"};
		
		ArrayList<String> getParameterNames(HttpServletRequest request)
		{
			int i = 0;
			ArrayList<String> arr = new ArrayList<String>();
			Enumeration<String> en = request.getParameterNames();
			while(en.hasMoreElements()){
				String s = en.nextElement();
				arr.add(s);
			}
			return arr;
		}
		
		boolean isMultipleChoice(String paramName)
		{
			for(int i = 0; i < mChoices.length; i++)
				if(paramName.equals(mChoices[i]))
					return true;
			return false;
		}
	%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>LAB8_3.jsp</title>
</head>
<body>
	<%
		ArrayList<String> list = getParameterNames(request);
		for(String str:list){
			out.println(str + ": ");
			if(isMultipleChoice(str) == true)
			{
				String values[] = request.getParameterValues(str);
				for(String value: values)
					out.println(value + "/");
			}
			else
				out.println(request.getParameter(str));
			out.println("<br>");
		}
		out.println("<hr>");
		out.println("<h2>Processing Parameters</h2>");
		
		for(String str:list){
			out.println(str + ": ");
			if(isMultipleChoice(str) == true)
			{
				String values[] = request.getParameterValues(str);
				for(String value: values)
					if(str.equals("hobby"))
						out.println(hobbyNames[Integer.parseInt(value)] + "/");
					else
						out.println(value + "/");
				out.println("<br>");
			}
			else
			{
				if(str.equals("gender"))
					out.println(gNames[Integer.parseInt(request.getParameter(str))]);
				else if(str.equals("phone1"))
					out.println(telArea[Integer.parseInt(request.getParameter(str))]);
				else
					out.println(request.getParameter(str));
				out.println("<br>");
			}
		}
	%>
</body>
</html>