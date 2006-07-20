<%@ include file="/WEB-INF/jsp/views/viewHeader.jsp" %>
<form action="openebiz" method="post">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.attachment.details" /></legend>
			<table class="form_tbody">
			<!-- element view start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.attachment.mimereference.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${attachment.MIMEReference.languageID}" />:
			<c:out value="${attachment.MIMEReference.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.attachment.mimereference.text" />" /></td>
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
		</tr>			
	
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.attachment.externalreference" />:</td>
			<td class="form_tdispcol">
			<c:out value="${attachment.externalReference.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.attachment.externalreference" />" /></td>
		</tr>
<!-- cac item end -->
		<!-- element view end -->
		</table>	
		<div class="submitButtons">
			<input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}">
			<input type="submit" class="button" name="_eventId_end" value="Return">
		</div>
	</fieldset>
	</div>
</form>
<%@ include file="/WEB-INF/jsp/views/viewFooter.jsp" %>