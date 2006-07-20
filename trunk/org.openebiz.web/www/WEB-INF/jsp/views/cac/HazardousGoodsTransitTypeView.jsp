<%@ include file="/WEB-INF/jsp/views/viewHeader.jsp" %>
<form action="openebiz" method="post">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.hazardousgoodstransit.details" /></legend>
			<table class="form_tbody">
			<!-- element view start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.hazardousgoodstransit.transportemergencycard.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${hazardousGoodsTransit.transportEmergencyCardCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.hazardousgoodstransit.transportemergencycard.code" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.hazardousgoodstransit.packingcriteria.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${hazardousGoodsTransit.packingCriteriaCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.hazardousgoodstransit.packingcriteria.code" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.hazardousgoodstransit.regulationcode.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${hazardousGoodsTransit.regulationCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.hazardousgoodstransit.regulationcode.code" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.hazardousgoodstransit.inhalationtoxicityzone.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${hazardousGoodsTransit.inhalationToxicityZoneCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.hazardousgoodstransit.inhalationtoxicityzone.code" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.hazardousgoodstransit.transportauthorizationcode.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${hazardousGoodsTransit.transportAuthorizationCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.hazardousgoodstransit.transportauthorizationcode.code" />" /></td>
		</tr>			
	
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.hazardousgoodstransit.maximumtemperature.temperature" />:</td>
			<td class="form_tdispcol">
			<c:out value="${hazardousGoodsTransit.maximumTemperature.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.hazardousgoodstransit.maximumtemperature.temperature" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.hazardousgoodstransit.minimumtemperature.temperature" />:</td>
			<td class="form_tdispcol">
			<c:out value="${hazardousGoodsTransit.minimumTemperature.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.hazardousgoodstransit.minimumtemperature.temperature" />" /></td>
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