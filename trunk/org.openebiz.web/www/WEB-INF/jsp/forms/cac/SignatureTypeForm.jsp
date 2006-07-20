<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.signature.details" /></legend>
		<spring:hasBindErrors name="signature">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<spring:nestedPath path="signature">
		<table class="form_tbody">
		<!-- form element start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.signature.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${signature.ID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.signature.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editID" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.signature.note.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${signature.note.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.signature.note.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editNote" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.signature.validationdatetime.datetime" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:if test="${not empty signature.validationDateTime.value}">
			<fmt:formatDate value="${signature.validationDateTime.asDateType}" type="date" pattern="yyyy/MM/dd" />
			</c:if>			
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.signature.validationdatetime.datetime" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editValidationDateTime" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.signature.validatoridentifier.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${signature.validatorID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.signature.validatoridentifier.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editValidatorID" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.signature.canonicalizationmethod.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${signature.canonicalizationMethod.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.signature.canonicalizationmethod.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editCanonicalizationMethod" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
<!-- self-referential subflow: editSignatureMethod -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.signature.signatoryparty.party" />:</td>
			<td class="form_tdispcol">
			<c:out value="${signature.signatoryParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.signature.signatoryparty.party" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editSignatoryParty" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.signature.digitalsignatureattachment.attachment" />:</td>
			<td class="form_tdispcol">
			<c:out value="${signature.digitalSignatureAttachment.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.signature.digitalsignatureattachment.attachment" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editDigitalSignatureAttachment" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.signature.originaldocumentreference.documentreference" />:</td>
			<td class="form_tdispcol">
			<c:out value="${signature.originalDocumentReference.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.signature.originaldocumentreference.documentreference" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editOriginalDocumentReference" value="<fmt:message key="ui.button.edit" />" /></td>
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