<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend>Credit Note Document Reference List</legend>
		<spring:hasBindErrors name="creditNoteDocumentReferenceList">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<table class="form_tbody">
		<!-- form element start -->
		<tr class="form_thead">
		<th>ID</th>
		<th>Copy Indicator</th>
		<th>GUID</th>
		<th>Issue Date</th>
		<th>Qualifier</th>
		<th>Attachment</th>
		</tr>
		<c:if test="${not empty creditNoteDocumentReferenceList}">
			<c:forEach items="${creditNoteDocumentReferenceList}" var="item" varStatus="status">
			<tr>
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.ID.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.copyIndicator.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.GUID.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:if test="${not empty item.issueDate.value}">
				<fmt:formatDate value="${item.issueDate.asDateType}" type="date" pattern="yyyy/MM/dd" />
				</c:if>	
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.qualifier.languageID}" />:
				<c:out value="${item.qualifier.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem"><c:out value="${item.attachment.shortDisplay}" /></td>
				<!-- type specific end -->
			</tr>
			</c:forEach>
		</c:if>	
		<!-- form element end -->
		</table>
		<div class="submitButtons">
			<input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}" />
			<input type="submit" class="button" name="_eventId_addCreditNoteDocumentReference" value="<fmt:message key="ui.button.add" />" />
			<input type="submit" class="button" name="_eventId_clearCreditNoteDocumentReference" value="<fmt:message key="ui.button.clear" />" />
			<input type="submit" class="button" name="_eventId_submit" value="<fmt:message key="ui.button.submit" />" />
		</div>
	</fieldset>
	</div>
</form>
<!--  end form -->
<%@ include file="/WEB-INF/jsp/forms/formFooter.jsp" %>