<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.externalreference.details" /></legend>
		<spring:hasBindErrors name="externalReference">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<spring:nestedPath path="externalReference">
		<table class="form_tbody">
		<!-- form element start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.externalreference.uniformresourceidentifier.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${externalReference.URI.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.externalreference.uniformresourceidentifier.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editURI" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.externalreference.documenthash.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${externalReference.documentHash.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.externalreference.documenthash.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editDocumentHash" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.externalreference.expirydatetime.datetime" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:if test="${not empty externalReference.expiryDateTime.value}">
			<fmt:formatDate value="${externalReference.expiryDateTime.asDateType}" type="date" pattern="yyyy/MM/dd" />
			</c:if>			
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.externalreference.expirydatetime.datetime" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editExpiryDateTime" value="<fmt:message key="ui.button.edit" />" /></td>
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