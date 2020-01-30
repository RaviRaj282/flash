<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<h1>Student Registration Form</h1>

<form:form method="POST" modelAttribute="user">
	<table>
		<tr>
			<td>First Name</td>
			<td><form:input path="firstname" /></td>
		</tr>
		<tr>
			<td>last Name</td>
			<td><form:input path="lastname" /></td>
		</tr>
		<tr>
			<td>email</td>
			<td><form:input path="email" /></td>
		</tr>
		<tr>
			<td>password</td>
			<td><form:password path="password" /></td>
		</tr>
		<tr>
			<td>select gender</td>
			<td><form:radiobuttons path="gender" items="${genders}" /></td>
		</tr>
		<td><input type="reset" value="reset"></td>
		<td><input type="submit" value="register"></td>
	</table>
</form:form>