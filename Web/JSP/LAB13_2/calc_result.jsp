<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
    <jsp:useBean id="calc" class="lab13.CalcBean" scope="page"/>
    <jsp:setProperty name="calc" property="*"/>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>calc_result.jsp</title>
<style>
	div { text-align: center; }
	table, td, th {
		margin: auto;
		width: 500px;
		border: 1px solid black;
		table-layout: fixed;
	}
	th {
		background-color: lightgray;
		font-size: 30px;
	}
	input, span {
		margin: 10px 10px 10px 10px;
	}
	img {
		max-width: 100%;
	}
</style>
</head>
<body>

<div>
		<table>
			<tr>
				<th colspan=2><i>CalCuLaTor</i></th>
			</tr>
			<tr>
				<td><img src="images/calculator.jpg"></td>
				<td>
					
					<%
						//연산자를 가지고 옴
						String operator = request.getParameter("operator");
					
						//문자열 형태로 전달된 인자들을 int로 변환
						int op1 = Integer.parseInt(request.getParameter("op1"));
						int op2 = Integer.parseInt(request.getParameter("op2"));
						
						int result = calc.calc(op1, op2, operator);
					%>
					<c:set value="<%=op1%>" var="op1"/>
					<input type="text" name="op1" value="${op1}" width=10 size=5 style="text-align: center" readonly><br>
					<c:set value="<%=operator %>" var="operator"/>
					<c:out value="${operator}"/> <br>
					<c:set value="<%=op2%>" var="op2"/>
					<input type="text" name="op2" value="${op2}" width=10 size=5 style="text-align: center" readonly><br>
					=<br>
					<c:set value="<%=result%>" var="result"/>
					<input type="text" name="result" value="${result}" width=10 size=5 style="text-align: center" readonly>
					
				</td>			
			</tr>
			<tr>
				<th colspan=2>&nbsp;</th>
			</tr>
		</table>
	</div>
</body>
</html>