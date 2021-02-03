<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>NAME PAGE</h1>
	<%
		String name = (String) request.getAttribute("name");
		out.println(name);
	%>
	<h3>USING EXPRESSION</h3>
	<%=request.getAttribute("name")%>

</body>
</html>