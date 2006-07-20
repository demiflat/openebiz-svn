<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.endorserparty.details" /></legend>
		<spring:hasBindErrors name="endorserParty">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<spring:nestedPath path="endorserParty">
		<table class="form_tbody">
		<!-- form element start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.endorserparty.role.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${endorserParty.roleCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.endorserparty.role.code" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editRoleCode" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.endorserparty.sequence.numeric" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<fmt:formatNumber minFractionDigits="2"  value="${endorserParty.sequenceNumeric.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.endorserparty.sequence.numeric" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editSequenceNumeric" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.endorserparty.party" />:</td>
			<td class="form_tdispcol">
			<c:out value="${endorserParty.party.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.endorserparty.party" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editParty" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.endorserparty.signatorycontact.contact" />:</td>
			<td class="form_tdispcol">
			<c:out value="${endorserParty.signatoryContact.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.endorserparty.signatorycontact.contact" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editSignatoryContact" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
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