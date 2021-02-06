<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<table border="2px" bordercolor="RED">
			
			<form action="BookController">

				<tr>
					<td>Enter BookName</td>
					<td><input type="text" name="txtBookName"></td>
				</tr>
				<tr>
					<td>Enter BookPrice</td>
					<td><input type="text" name="txtBookPrice"></td>
				</tr>
				<tr>
					<td>Enter BookQty</td>
					<td><input type="text" name="txtBookQty"></td>
				</tr>

				<tr>

					<td><input type="submit" value="SUBMIT"></td>
				</tr>


			</form>
		</table>
	</center>
</body>
</html>