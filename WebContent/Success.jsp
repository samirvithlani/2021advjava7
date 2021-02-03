<%@page import="com.bean.UserBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>USER DETAIL</h1>
<hr>
<%-- <script>
	<%
		UserBean userBean = (UserBean)request.getAttribute("userBean");
		
	%>
	<%=userBean.getuName() %>
	<%=userBean.getuId() %
	<!-- //alias name . bean variable name -->
	</script> --%>
	
	${userBean.uName }
	${userBean.uId }
	
	
	
</body>
</html>