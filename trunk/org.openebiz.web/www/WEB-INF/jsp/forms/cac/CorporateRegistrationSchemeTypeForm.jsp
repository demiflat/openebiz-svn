<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.corporateregistrationscheme.details" /></legend>
		<spring:hasBindErrors name="corporateRegistrationScheme">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<spring:nestedPath path="corporateRegistrationScheme">
		<table class="form_tbody">
		<!-- form element start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.corporateregistrationscheme.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${corporateRegistrationScheme.ID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.corporateregistrationscheme.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editID" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.corporateregistrationscheme.name" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${corporateRegistrationScheme.name.value}" />			
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.corporateregistrationscheme.name" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editName" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.corporateregistrationscheme.corporateregistrationtype.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${corporateRegistrationScheme.corporateRegistrationTypeCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.corporateregistrationscheme.corporateregistrationtype.code" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editCorporateRegistrationTypeCode" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
<!-- JurisdictionRegionAddress list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.corporateregistrationscheme.jurisdictionregionaddress.address" />:</td>
			<td class="form_tdispcol">
			<c:out value="JurisdictionRegionAddress List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.corporateregistrationscheme.jurisdictionregionaddress.address" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editJurisdictionRegionAddressList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
		<!-- form element end -->
		</table>
		</spring:nestedPath>
		<div class="submitButtons">
			<input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}" />
			<input type="submit" class="button" name="_eventId_submit" value="<fmt:message key="ui.button.submit" />" />
		</div>
	</fieldset>
	</div>
</form>
<!--  end form -->
<%@ include file="/WEB-INF/jsp/forms/formFooter.jsp" %>