<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.despatch.details" /></legend>
		<spring:hasBindErrors name="despatch">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<spring:nestedPath path="despatch">
		<table class="form_tbody">
		<!-- form element start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.despatch.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${despatch.ID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.despatch.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editID" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.despatch.requesteddespatchdatetime.datetime" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:if test="${not empty despatch.requestedDespatchDateTime.value}">
			<fmt:formatDate value="${despatch.requestedDespatchDateTime.asDateType}" type="date" pattern="yyyy/MM/dd" />
			</c:if>			
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.despatch.requesteddespatchdatetime.datetime" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editRequestedDespatchDateTime" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.despatch.estimateddespatchdatetime.datetime" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:if test="${not empty despatch.estimatedDespatchDateTime.value}">
			<fmt:formatDate value="${despatch.estimatedDespatchDateTime.asDateType}" type="date" pattern="yyyy/MM/dd" />
			</c:if>			
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.despatch.estimateddespatchdatetime.datetime" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editEstimatedDespatchDateTime" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.despatch.actualdespatchdatetime.datetime" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:if test="${not empty despatch.actualDespatchDateTime.value}">
			<fmt:formatDate value="${despatch.actualDespatchDateTime.asDateType}" type="date" pattern="yyyy/MM/dd" />
			</c:if>			
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.despatch.actualdespatchdatetime.datetime" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editActualDespatchDateTime" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.despatch.despatchaddress.address" />:</td>
			<td class="form_tdispcol">
			<c:out value="${despatch.despatchAddress.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.despatch.despatchaddress.address" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editDespatchAddress" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.despatch.despatchparty.party" />:</td>
			<td class="form_tdispcol">
			<c:out value="${despatch.despatchParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.despatch.despatchparty.party" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editDespatchParty" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.despatch.contact" />:</td>
			<td class="form_tdispcol">
			<c:out value="${despatch.contact.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.despatch.contact" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editContact" value="<fmt:message key="ui.button.edit" />" /></td>
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