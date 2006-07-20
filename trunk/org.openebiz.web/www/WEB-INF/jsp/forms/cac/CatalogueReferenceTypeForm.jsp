<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.cataloguereference.details" /></legend>
		<spring:hasBindErrors name="catalogueReference">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<spring:nestedPath path="catalogueReference">
		<table class="form_tbody">
		<!-- form element start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.cataloguereference.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${catalogueReference.ID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.cataloguereference.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editID" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.cataloguereference.globallyuniqueidentifier.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${catalogueReference.GUID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.cataloguereference.globallyuniqueidentifier.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editGUID" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.cataloguereference.issuedate.date" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:if test="${not empty catalogueReference.issueDate.value}">
			<fmt:formatDate value="${catalogueReference.issueDate.asDateType}" type="date" pattern="yyyy/MM/dd" />
			</c:if>		
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.cataloguereference.issuedate.date" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editIssueDate" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.cataloguereference.issuetime.time" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:if test="${not empty catalogueReference.issueTime.value}">
			<fmt:formatDate value="${catalogueReference.issueTime.asDateType}" type="time" timeStyle="short" />
			</c:if>
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.cataloguereference.issuetime.time" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editIssueTime" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.cataloguereference.revisiondatetime.datetime" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:if test="${not empty catalogueReference.revisionDateTime.value}">
			<fmt:formatDate value="${catalogueReference.revisionDateTime.asDateType}" type="date" pattern="yyyy/MM/dd" />
			</c:if>			
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.cataloguereference.revisiondatetime.datetime" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editRevisionDateTime" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
<!-- Note list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.cataloguereference.note.text" />:</td>
			<td class="form_tdispcol">
			<c:out value="Note List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.cataloguereference.note.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editNoteList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- Description list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.cataloguereference.description.text" />:</td>
			<td class="form_tdispcol">
			<c:out value="Description List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.cataloguereference.description.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editDescriptionList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.cataloguereference.version.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${catalogueReference.versionID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.cataloguereference.version.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editVersionID" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.cataloguereference.previousversion.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${catalogueReference.previousVersionID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.cataloguereference.previousversion.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editPreviousVersionID" value="<fmt:message key="ui.button.edit" />" /></td>
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