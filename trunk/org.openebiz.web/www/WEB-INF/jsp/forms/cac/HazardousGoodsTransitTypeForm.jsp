<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.hazardousgoodstransit.details" /></legend>
		<spring:hasBindErrors name="hazardousGoodsTransit">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<spring:nestedPath path="hazardousGoodsTransit">
		<table class="form_tbody">
		<!-- form element start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.hazardousgoodstransit.transportemergencycard.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${hazardousGoodsTransit.transportEmergencyCardCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.hazardousgoodstransit.transportemergencycard.code" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editTransportEmergencyCardCode" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.hazardousgoodstransit.packingcriteria.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${hazardousGoodsTransit.packingCriteriaCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.hazardousgoodstransit.packingcriteria.code" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editPackingCriteriaCode" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.hazardousgoodstransit.regulationcode.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${hazardousGoodsTransit.regulationCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.hazardousgoodstransit.regulationcode.code" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editRegulationCode" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.hazardousgoodstransit.inhalationtoxicityzone.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${hazardousGoodsTransit.inhalationToxicityZoneCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.hazardousgoodstransit.inhalationtoxicityzone.code" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editInhalationToxicityZoneCode" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.hazardousgoodstransit.transportauthorizationcode.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${hazardousGoodsTransit.transportAuthorizationCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.hazardousgoodstransit.transportauthorizationcode.code" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editTransportAuthorizationCode" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.hazardousgoodstransit.maximumtemperature.temperature" />:</td>
			<td class="form_tdispcol">
			<c:out value="${hazardousGoodsTransit.maximumTemperature.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.hazardousgoodstransit.maximumtemperature.temperature" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editMaximumTemperature" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.hazardousgoodstransit.minimumtemperature.temperature" />:</td>
			<td class="form_tdispcol">
			<c:out value="${hazardousGoodsTransit.minimumTemperature.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.hazardousgoodstransit.minimumtemperature.temperature" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editMinimumTemperature" value="<fmt:message key="ui.button.edit" />" /></td>
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