<%@page import="com.example.demo.Ticket"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Booking Historyyyy </h1>
<% List<Ticket> ticket=(List<Ticket>) request.getAttribute("userticketlist");
out.println(ticket.getTicketId()+"\n");
out.println(ticket.getUserid()+"\n");
out.println(ticket.getServiceid()+"\n");
 out.println(ticket.getFromCity()+"\n");
 out.println(ticket.getToCity()+"\n");
 out.println(ticket.getCost()+"\n");
 out.println(ticket.getNumberOfSeats());
   %>  
</body>
</html>