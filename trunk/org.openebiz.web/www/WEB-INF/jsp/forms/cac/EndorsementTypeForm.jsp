<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.endorsement.details" /></legend>
		<spring:hasBindErrors name="endorsement">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<spring:nestedPath path="endorsement">
		<table class="form_tbody">
		<!-- form element start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.endorsement.document.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${endorsement.documentID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.endorsement.document.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editDocumentID" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.endorsement.approvalstatus.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${endorsement.approvalStatus.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.endorsement.approvalstatus.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editApprovalStatus" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
<!-- Remarks list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.endorsement.remarks.text" />:</td>
			<td class="form_tdispcol">
			<c:out value="Remarks List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.endorsement.remarks.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editRemarksList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.endorsement.endorserparty" />:</td>
			<td class="form_tdispcol">
			<c:out value="${endorsement.endorserParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.endorsement.endorserparty" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editEndorserParty" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- Signature list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.endorsement.signature" />:</td>
			<td class="form_tdispcol">
			<c:out value="Signature List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.endorsement.signature" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editSignatureList" value="<fmt:message key="ui.button.edit" />" /></td>
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