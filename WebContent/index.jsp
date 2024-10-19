<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index page</title>
<style type="text/css">
.center {
	text-align: center;
	height: 250px;
	margin-top: 200px;
}
</style>
</head>
<body
	style="background-image: url('https://wallpapers.com/images/featured/bank-background-3m2869ucap3327qs.webp'); background-size: cover;">
	<form action="login">
		<div class="center">
			<h2 style="font-family: monospace; font-size: xx-large; color:red;">WELCOME
				TO BANK APPLICATION !!!</h2>
			<input type="text" placeholder="Enter your user ID : " name="id"><br><br>
			<input type="text" placeholder="Enter your ATM Pin : " name="accPin"><br><br>
			<input type="submit" placeholder="Login"><br><br>
			 Don't have an Account?<br><a href="register.jsp">Create New Account</a><br>
		</div>
	</form>

</body>
</html>