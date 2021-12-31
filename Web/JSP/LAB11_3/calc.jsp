<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>calc.jsp</title>
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
	input, select {
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
					<form name="form1" method="POST" action="calc_result.jsp">
						<input type="text" name="op1" value="0" width=10 size=5 style="text-align: center"><br>
						<select name="operator">
							<option selected value="+">+</option>
							<option value="-">-</option>
							<option value="*">*</option>
							<option value="/">/</option>
						</select><br>
						<input type="text" name="op2" value="0" width=10 size=5 style="text-align: center"><br>
						<input type="submit" value="="><br>
						<input type="text" name="result" width=10 size=5 disabled>
					</form>
				</td>			
			</tr>
			<tr>
				<th colspan=2>&nbsp;</th>
			</tr>
		</table>
	</div>
</body>
</html>