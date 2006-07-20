<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.transportequipmentseal.details" /></legend>
		<spring:hasBindErrors name="transportEquipmentSeal">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<spring:nestedPath path="transportEquipmentSeal">
		<table class="form_tbody">
		<!-- form element start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transportequipmentseal.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${transportEquipmentSeal.ID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transportequipmentseal.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editID" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transportequipmentseal.sealissuertype.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${transportEquipmentSeal.sealIssuerTypeCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transportequipmentseal.sealissuertype.code" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editSealIssuerTypeCode" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transportequipmentseal.condition.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${transportEquipmentSeal.condition.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transportequipmentseal.condition.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editCondition" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transportequipmentseal.sealstatus.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${transportEquipmentSeal.sealStatusCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transportequipmentseal.sealstatus.code" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editSealStatusCode" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transportequipmentseal.sealingpartytype.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${transportEquipmentSeal.sealingPartyType.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transportequipmentseal.sealingpartytype.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editSealingPartyType" value="<fmt:message key="ui.button.edit" />" /></td>
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