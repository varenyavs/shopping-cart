<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register User</title>
</head>
<body>



	<h2>Please fill the details</h2>
	<c:url var="addAction" value="/register"></c:url>
	<form:form action="${addAction}" commandName="register" method="post">
		<table align="center">
			<tr>
				<td>User ID:</td>
				<td><input type="text" name="id" path="id"></td>
			</tr>
			<tr>
				<td>User Name:</td>
				<td><input type="text" name="name" path="name"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="text" name="password" path="password"></td>
			</tr>
			<tr>
				<td>Mobile No:</td>
				<td><input type="text" name="mobile" path="mobile"></td>
			</tr>
			
			<tr>
				<td>Email:</td>
				<td><input type="email" name="email" path="email"></td>
			</tr>
			<tr>
				<td>Addres:</td>
				<td><input type="text" width="20" height="10" name="address" path="address"></td>
			</tr>
			

			<tr>
				<td><input type="submit" value="Register"></td>
				<td><c:if test="${empty register.name }">
				<td><input type="reset"  value="<spring:message text="reset"/>"/>
				</td>
			</c:if></tr>
			
		</table>

	</form:form>

</body>
</html>