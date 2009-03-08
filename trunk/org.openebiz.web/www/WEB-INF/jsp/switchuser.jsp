<c:if test="${not empty param.login_error}">
	<font color="red"> Your 'su' attempt was not successful, try again.<BR>
	<BR>
	Reason: 
	
</font>
</c:if>

<form action="<c:url value='/_switch_user.openebiz'/>" method="POST">
<table>
	<tr>
		<td>User:</td>
		<td><input type='text' name='j_username'></td>
	</tr>
	<tr>
		<td colspan='2'><input name="switch" type="submit"
			value="Switch to User"></td>
	</tr>
</table>

</form>
