<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.attachment.details" /></legend>
		<spring:hasBindErrors name="attachment">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<spring:nestedPath path="attachment">
		<table class="form_tbody">
		<!-- form element start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.attachment.mimereference.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${attachment.MIMEReference.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.attachment.mimereference.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editMIMEReference" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.attachment.embeddeddocument.binaryobject" />:</td>
			<td class="form_tdispcol">
			<!-- type specific start -->
			<c:out value="${attachment.embeddedDocumentBinaryObject.filename}" />|
			<c:out value="${attachment.embeddedDocumentBinaryObject.size}" />|
			<c:out value="${attachment.embeddedDocumentBinaryObject.encodingCode}" />	
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.attachment.embeddeddocument.binaryobject" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editEmbeddedDocumentBinaryObject" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.attachment.externalreference" />:</td>
			<td class="form_tdispcol">
			<c:out value="${attachment.externalReference.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.attachment.externalreference" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editExternalReference" value="<fmt:message key="ui.button.edit" />" /></td>
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