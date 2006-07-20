<%@ include file="/WEB-INF/jsp/views/viewHeader.jsp" %>
<form action="openebiz" method="post">
	<fieldset>
		<legend>Embedded Document Binary Object</legend>
		<div class="form_wrapper">
		<div class="form_content">
			<table class="form_tbody">
			<!-- element view start -->
		<tr>
			<td class="form_tlabelcol">Embedded Document Binary Object:</td>
			<td class="form_tdispcol">
			<!-- type specific start -->
			<c:out value="${embeddedDocumentBinaryObject.filename}" />|
			<c:out value="${embeddedDocumentBinaryObject.size}" />|
			<c:out value="${embeddedDocumentBinaryObject.encodingCode}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="BinaryObjectType" /></td>
		</tr>			
		<!-- element view end -->
		</table>	
		</div>
		<div class="submitButtons">
			<input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}">
			<input type="submit" class="button" name="_eventId_end" value="Return">
		</div>
	</div>
	</fieldset>
</form>
<%@ include file="/WEB-INF/jsp/views/viewFooter.jsp" %>