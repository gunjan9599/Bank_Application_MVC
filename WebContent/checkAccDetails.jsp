<%@page import="com.spring.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Account Details</title>
</head>
<body
	style="background-image: url('https://wallpapers.com/images/featured/bank-background-3m2869ucap3327qs.webp'); background-size: cover;">

	 <%
		User user = (User) request.getAttribute("User");
	%>
	<%--  <%=user.getId() %>
	<%=user.getName() %>
<h1 style="color: red">Hello <%=user.getName() %>,Here's your Account Details</h1>
<label style="color: green;">Name : <%=user.getName() %></label><br><br>
<label style="green">ID : <%=user.getId() %></label><br><br>
<label style="green">Address : <%=user.getAdhar() %></label><br><br>
<label style="green">Account Number : <%=user.getAccountNo()%></label><br><br>
<label style="green">Adhaar Card Number : <%=user.getAdhar() %></label><br><br>+
<label style="green">Amount : <%=user.getDepositeAmount() %></label><br><br>
 --%>


	<p>User ID : ${user.id }
</body>
</html>