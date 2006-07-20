<%@ include file="/WEB-INF/jsp/views/viewHeader.jsp" %>
<form action="openebiz" method="post">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.transporthandlingunit.details" /></legend>
			<table class="form_tbody">
			<!-- element view start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transporthandlingunit.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${transportHandlingUnit.ID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transporthandlingunit.identifier" />" /></td>
		</tr>							
	
<!-- self-referential subflow: editTransportHandlingUnitTypeCode -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transporthandlingunit.handlingcode.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${transportHandlingUnit.handlingCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transporthandlingunit.handlingcode.code" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transporthandlingunit.handlinginstructions.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${transportHandlingUnit.handlingInstructions.languageID}" />:
			<c:out value="${transportHandlingUnit.handlingInstructions.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transporthandlingunit.handlinginstructions.text" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transporthandlingunit.hazardousriskindicator.indicator" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${transportHandlingUnit.hazardousRiskIndicator.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transporthandlingunit.hazardousriskindicator.indicator" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transporthandlingunit.totalgoodsitemquantity.quantity" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${transportHandlingUnit.totalGoodsItemQuantity.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transporthandlingunit.totalgoodsitemquantity.quantity" />" /></td>
		</tr>				
	
<!-- DamageRemarks list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transporthandlingunit.damageremarks.text" />:</td>
			<td class="form_tdispcol">
			<c:out value="DamageRemarks List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transporthandlingunit.damageremarks.text" />" /></td>
		</tr>
<!-- ShippingMarks list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transporthandlingunit.shippingmarks.text" />:</td>
			<td class="form_tdispcol">
			<c:out value="ShippingMarks List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transporthandlingunit.shippingmarks.text" />" /></td>
		</tr>
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transporthandlingunit.totaltransportequipmentquantity.quantity" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${transportHandlingUnit.totalTransportEquipmentQuantity.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transporthandlingunit.totaltransportequipmentquantity.quantity" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transporthandlingunit.totalpackagequantity.quantity" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${transportHandlingUnit.totalPackageQuantity.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transporthandlingunit.totalpackagequantity.quantity" />" /></td>
		</tr>				
	
<!-- DespatchLine list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transporthandlingunit.despatchline" />:</td>
			<td class="form_tdispcol">
			<c:out value="DespatchLine List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transporthandlingunit.despatchline" />" /></td>
		</tr>
<!-- ActualPackage list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transporthandlingunit.actualpackage.package" />:</td>
			<td class="form_tdispcol">
			<c:out value="ActualPackage List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transporthandlingunit.actualpackage.package" />" /></td>
		</tr>
<!-- ReceivedReceiptLine list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transporthandlingunit.receivedreceiptline.receiptline" />:</td>
			<td class="form_tdispcol">
			<c:out value="ReceivedReceiptLine List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transporthandlingunit.receivedreceiptline.receiptline" />" /></td>
		</tr>
<!-- TransportEquipment list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transporthandlingunit.transportequipment" />:</td>
			<td class="form_tdispcol">
			<c:out value="TransportEquipment List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transporthandlingunit.transportequipment" />" /></td>
		</tr>
<!-- HazardousGoodsTransit list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transporthandlingunit.hazardousgoodstransit" />:</td>
			<td class="form_tdispcol">
			<c:out value="HazardousGoodsTransit List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transporthandlingunit.hazardousgoodstransit" />" /></td>
		</tr>
<!-- MeasurementDimension list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transporthandlingunit.measurementdimension.dimension" />:</td>
			<td class="form_tdispcol">
			<c:out value="MeasurementDimension List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transporthandlingunit.measurementdimension.dimension" />" /></td>
		</tr>
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transporthandlingunit.minimumtemperature.temperature" />:</td>
			<td class="form_tdispcol">
			<c:out value="${transportHandlingUnit.minimumTemperature.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transporthandlingunit.minimumtemperature.temperature" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transporthandlingunit.maximumtemperature.temperature" />:</td>
			<td class="form_tdispcol">
			<c:out value="${transportHandlingUnit.maximumTemperature.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transporthandlingunit.maximumtemperature.temperature" />" /></td>
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