<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
<%
	//변수 설정
	int result = 0;

	//웹페이지 요청이 POST인 경우에만 수행. 즉 form을 통해 전달된 것만 수행
	//초기 로딩 시 오류 방지
	if(request.getMethod().equals("POST")){
		
		//연산자를 가지고 옴
		String op = request.getParameter("operator");
		
		//문자열 형태로 전달된 인자들을 int로 변환
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));
		
		//각 연산자별 처리
		if(op.equals("+")){
			result = num1 + num2;
		}
		else if(op.equals("-")){
			result = num1 - num2;
		}
		else if(op.equals("*")){
			result = num1 * num2;
		}
		else if(op.equals("/")){
			result = num1 / num2;
		}
	}
	
	session.setAttribute("result", result);
%>

<div>
		<table>
			<tr>
				<th colspan=2><i>CalCuLaTor</i></th>
			</tr>
			<tr>
				<td><img src="images/calculator.jpg"></td>
				<td>
					<input type="text" name="num1" value=<%=request.getParameter("num1")%> width=10 size=5 style="text-align: center" readonly><br>
					<%=request.getParameter("operator") %><br>
					<input type="text" name="num2" value=<%=request.getParameter("num2")%> width=10 size=5 style="text-align: center" readonly><br>
					=<br>
					<input type="text" name="result" value=<%=result %> width=10 size=5 style="text-align: center" readonly>
				</td>			
			</tr>
			<tr>
				<th colspan=2>&nbsp;</th>
			</tr>
		</table>
	</div>
</body>
</html>