<%@page import="java.util.List"%>
<%@page import="com.bean.BookBean"%>
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
		<table border="2px" bordercolor="BLUE">
			<tr>
				<th>BOOK NAME</th>
				<th>BOOK PRICE</th>
				<th>BOOK QTY</th>
				<th>ACTION</th>
			</tr>
			<%
				List<BookBean> booksList = (List<BookBean>) request.getAttribute("bookList");
				//null check
				for (int i = 0; i < booksList.size(); i++) {

					BookBean bean = booksList.get(i);
			%>
			<tr>
				<td><%=bean.getbName()%></td>
				<td><%=bean.getbPrice()%></td>
				<td><%=bean.getbQty()%></td>
				<td><a href="BookDeleteController?bname=<%=bean.getbName()%>&bqty=50000">DELETE</a></td>
			</tr>



			<%
				}
			%>




		</table>
	</center>

</body>
</html>