<%@page import="com.sushma.app.restaurant.Restaurant"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2> Restaurant Creation successful </h2>
<%=request.getAttribute("abc") %> <br>
<%=request.getAttribute("xyz") %><br>
<%  Restaurant rester=(Restaurant) request.getAttribute("resinput");
  out.print(rester);
%>
</body>
</html>