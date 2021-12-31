<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index.jsp</title>
<style>
	div { text-align: center; }
	table {
		margin: auto;
		width: 600px;
		border: 1px solid black;
		table-layout: fixed;
	}
	th { font-size: 20px; }
	img {
		max-width: 100%;
	}
</style>
</head>
<body>
	<div>
		<table>
			<tr>
				<th colspan=2>LALALAND</th>
			</tr>
			<tr>
				<td><jsp:include page="viewer.jsp"></jsp:include></td>
				<td><jsp:include page="login.jsp"></jsp:include></td>
			</tr>
		</table>
	</div>
</body>
</html>