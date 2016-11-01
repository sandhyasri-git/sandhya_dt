<%@include file="header.jsp" %>
	<form action="validate" method="get">
		<table>
			<tr>
				<td>User Name</td>
				<td><input type="text" name="txtFName"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="txtPass"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Login"></td>
				<td><input type="reset" name="Cancel"></td>
			</tr>

		</table>
	</form>
	 ${info} user
</body>
</html>