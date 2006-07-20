<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.transporthandlingunit.details" /></legend>
		<spring:hasBindErrors name="transportHandlingUnit">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<spring:nestedPath path="transportHandlingUnit">
		<table class="form_tbody">
		<!-- form element start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transporthandlingunit.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${transportHandlingUnit.ID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transporthandlingunit.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editID" value="<fmt:message key="ui.button.edit" />" /></td>
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
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editHandlingCode" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transporthandlingunit.handlinginstructions.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${transportHandlingUnit.handlingInstructions.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transporthandlingunit.handlinginstructions.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editHandlingInstructions" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transporthandlingunit.hazardousriskindicator.indicator" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${transportHandlingUnit.hazardousRiskIndicator.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transporthandlingunit.hazardousriskindicator.indicator" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editHazardousRiskIndicator" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transporthandlingunit.totalgoodsitemquantity.quantity" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${transportHandlingUnit.totalGoodsItemQuantity.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transporthandlingunit.totalgoodsitemquantity.quantity" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editTotalGoodsItemQuantity" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
<!-- DamageRemarks list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transporthandlingunit.damageremarks.text" />:</td>
			<td class="form_tdispcol">
			<c:out value="DamageRemarks List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transporthandlingunit.damageremarks.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editDamageRemarksList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- ShippingMarks list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transporthandlingunit.shippingmarks.text" />:</td>
			<td class="form_tdispcol">
			<c:out value="ShippingMarks List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transporthandlingunit.shippingmarks.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editShippingMarksList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transporthandlingunit.totaltransportequipmentquantity.quantity" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${transportHandlingUnit.totalTransportEquipmentQuantity.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transporthandlingunit.totaltransportequipmentquantity.quantity" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editTotalTransportEquipmentQuantity" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transporthandlingunit.totalpackagequantity.quantity" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${transportHandlingUnit.totalPackageQuantity.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transporthandlingunit.totalpackagequantity.quantity" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editTotalPackageQuantity" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
<!-- DespatchLine list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transporthandlingunit.despatchline" />:</td>
			<td class="form_tdispcol">
			<c:out value="DespatchLine List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transporthandlingunit.despatchline" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editDespatchLineList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- ActualPackage list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transporthandlingunit.actualpackage.package" />:</td>
			<td class="form_tdispcol">
			<c:out value="ActualPackage List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transporthandlingunit.actualpackage.package" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editActualPackageList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- ReceivedReceiptLine list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transporthandlingunit.receivedreceiptline.receiptline" />:</td>
			<td class="form_tdispcol">
			<c:out value="ReceivedReceiptLine List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transporthandlingunit.receivedreceiptline.receiptline" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editReceivedReceiptLineList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- TransportEquipment list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transporthandlingunit.transportequipment" />:</td>
			<td class="form_tdispcol">
			<c:out value="TransportEquipment List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transporthandlingunit.transportequipment" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editTransportEquipmentList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- HazardousGoodsTransit list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transporthandlingunit.hazardousgoodstransit" />:</td>
			<td class="form_tdispcol">
			<c:out value="HazardousGoodsTransit List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transporthandlingunit.hazardousgoodstransit" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editHazardousGoodsTransitList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- MeasurementDimension list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transporthandlingunit.measurementdimension.dimension" />:</td>
			<td class="form_tdispcol">
			<c:out value="MeasurementDimension List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transporthandlingunit.measurementdimension.dimension" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editMeasurementDimensionList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transporthandlingunit.minimumtemperature.temperature" />:</td>
			<td class="form_tdispcol">
			<c:out value="${transportHandlingUnit.minimumTemperature.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transporthandlingunit.minimumtemperature.temperature" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editMinimumTemperature" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transporthandlingunit.maximumtemperature.temperature" />:</td>
			<td class="form_tdispcol">
			<c:out value="${transportHandlingUnit.maximumTemperature.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transporthandlingunit.maximumtemperature.temperature" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editMaximumTemperature" value="<fmt:message key="ui.button.edit" />" /></td>
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