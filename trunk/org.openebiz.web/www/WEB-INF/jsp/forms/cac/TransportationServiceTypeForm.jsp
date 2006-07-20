<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.transportationservice.details" /></legend>
		<spring:hasBindErrors name="transportationService">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<spring:nestedPath path="transportationService">
		<table class="form_tbody">
		<!-- form element start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transportationservice.service.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${transportationService.serviceCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transportationservice.service.code" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editServiceCode" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transportationservice.tariffclass.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${transportationService.tariffClassCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transportationservice.tariffclass.code" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editTariffClassCode" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transportationservice.priority.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${transportationService.priority.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transportationservice.priority.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editPriority" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transportationservice.freightrateclass.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${transportationService.freightRateClassCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transportationservice.freightrateclass.code" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editFreightRateClassCode" value="<fmt:message key="ui.button.edit" />" /></td>
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