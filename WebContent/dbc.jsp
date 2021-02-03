<%@page import= "java.sql.Connection"%>
<%@page import= "java.sql.DriverManager"%>
<%@page  import= "java.sql.SQLException"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	 String userName = "root";
	 String password = "root";
	
	 String connectionURL = "jdbc:mysql://localhost:3306/jdbc";
	 String driverClass = "com.mysql.cj.jdbc.Driver";
	 
	 Connection conn =null;
	 
	 Class.forName(driverClass);
	 
	 conn = DriverManager.getConnection(connectionURL,userName,password);
	 
	 if(conn !=null){
	
		 out.println("Connected..");
	 }
	 
	 else{
		 out.println("Not connected");
		 }
	 
 
