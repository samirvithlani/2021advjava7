<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="UserRegistationController">
		<table border="2px">
			<tr>
				<%--
			 <%=request.getAttribute("userName") %>			
				<%
					String error = (String) request.getAttribute("userName");
					if (error == null || error.equals("")) {

						out.print("");
					} else {
						out.print(error);
					}
				%>
 --%>
				<td>User NAme *</td>
				<td><input type="text" name="txtUserName"> ${uname }
				</td>
			</tr>
			<tr>
				<td>User Email *</td>
				<td><input type="email" name="txtUserEmail"></td>
			</tr>
			<tr>
				<td>User Password *</td>
				<td><input type="password" name="pwdUserPassword"></td>
			</tr>
			<tr>
				<td>User Age *18</td>
				<td><input type="text" name="txtUserAge"></td>
			</tr>
			<tr>
				<td>User Contact *</td>
				<td><input type="text" name="txtUserContact"></td>
			</tr>
			<tr>

				<td><input type="submit" value="SUBMIT"></td>
			</tr>

		</table>

	</form>
</body>
</html>