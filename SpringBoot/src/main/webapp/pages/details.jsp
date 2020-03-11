<%@page import="com.sushma.spring.boot.airport.Airport"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Details are as follows</h1>
<% Airport air=(Airport) request.getAttribute("ap");
out.println(air.getId()+"\n");
out.println(air.getName()+"\n");
out.println(air.getCity()+"\n");
   out.println(air.getState()+"\n");
   %>  
</body>
</html>