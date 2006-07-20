<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.temperature.details" /></legend>
		<spring:hasBindErrors name="temperature">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<spring:nestedPath path="temperature">
		<table class="form_tbody">
		<!-- form element start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.temperature.attribute.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${temperature.attributeID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.temperature.attribute.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editAttributeID" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.temperature.measure" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${temperature.measure.value}" />|
			<c:out value="${temperature.measure.unitCode.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.temperature.measure" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editMeasure" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.temperature.description.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${temperature.description.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.temperature.description.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editDescription" value="<fmt:message key="ui.button.edit" />" /></td>
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