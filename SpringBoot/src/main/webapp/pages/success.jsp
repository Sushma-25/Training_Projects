<%@page import="com.sushma.spring.boot.railway.Train"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Success</h1>


<% Train train=(Train) request.getAttribute("train");
out.println(train.getFromCity()+"\n");
out.println(train.getName()+"\n");
out.println(train.getToCity()+"\n");
   out.println(train.getType()+"\n");
   %> 
</body>
</html>