<%@page import="com.spring.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Deposit Money</title>
</head>
<body style="background-image: url('https://wallpapers.com/images/featured/bank-background-3m2869ucap3327qs.webp'); background-size: cover;">

<form action="deposit">
<%-- <%
		User user=(User)request.getAttribute("User");
	%> --%>
<%-- Current Balance : <%=user.getDepositeAmount() %> --%>
Enter ID : <input type="text"  placeholder="Enter ID" name="id"><br><br>
Enter Pin : <input type="text" placeholder="Enter Pin" name="pin"><br><br>
Enter Deposit Amount : <input type="number" placeholder="Enter Amount" name="depositeMoney">
<input type="submit" value="Deposit"> 






</form>

</body>
</html>