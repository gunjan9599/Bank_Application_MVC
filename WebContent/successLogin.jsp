<%@page import="com.spring.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to your account</title>
</head>
<body
	style="background-image: url('https://wallpapers.com/images/featured/bank-background-3m2869ucap3327qs.webp'); background-size: cover;">

	<%
		User user = (User) request.getAttribute("User");
	%>

	<h1 style="color: red">
		Hello
		<%=user.getName()%>,Welcome to your bank Account !!!
	</h1>
    User ID : <%=user.getAccountNo() %><br><br>
    Name : <%=user.getName() %><br><br>
    Adhaar card : <%=user.getAdhar() %><br><br>
    Address : <%=user.getAddress()%><br><br>
    Current Balance  : <%=user.getDepositeAmount() %><br><br>
    

	<a href="checkAccDetails.jsp">Check your Account details</a>
	<a href="deposite.jsp">Deposit Money</a>
	<a href="withdraw.jsp">Withdraw Money</a>


</body>
</html>