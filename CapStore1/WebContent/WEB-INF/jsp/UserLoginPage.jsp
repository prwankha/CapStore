<%@taglib prefix="m" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
	<div align="center">
		<h3>Login Page</h3>
	 <m:form action="ValidateUser.obj" modelAttribute="user" method="post"> 
			<table>
				<tr>
					<td>User name</td>
					<td><m:input path="email" /></td>
				</tr>
				<tr>
					<td>Password</td>
					<td><m:input path="password" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="Login"></td>
					<td><input type="reset" value="Reset"></td>
				</tr>
			</table>
	</m:form>
	</div>
</body>
</html>