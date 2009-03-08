<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<form action="<c:url value='_security_check.openebiz'/>" method="POST">
	<fieldset>
		<legend><fmt:message key="ui.login" /></legend>

		<div class="form_wrapper">
			<table class="form_tbody">
			
			 <tr>
			   <td class="form_tlabelcol"><fmt:message key="ui.username" />:</td>
			   <td class="form_tdispcol"><input name="j_username" type="text" /></td>
			 </tr>
			 
			 <tr>
			   <td class="form_tlabelcol"><fmt:message key="ui.password" />:</td>
			   <td class="form_tdispcol"><input name="j_password" type="password" /></td>
			 </tr>
			
			 <tr>
			   <td class="form_tlabelcol"><fmt:message key="ui.rememberme" />:</td>
			   <td class="form_tdispcol"><input name="_acegi_security_remember_me" type="checkbox" /></td>
			 </tr>		  
			
			</table>
		</div>
			
			<div class="submitButtons">
			<input name="submit" type="submit" value="Submit" >
			<input name="reset" type="reset">
			</div>
	</fieldset>
</form>

<%@ include file="/WEB-INF/jsp/forms/formFooter.jsp" %>