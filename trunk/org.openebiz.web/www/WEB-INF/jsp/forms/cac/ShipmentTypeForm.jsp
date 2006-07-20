<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.shipment.details" /></legend>
		<spring:hasBindErrors name="shipment">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<spring:nestedPath path="shipment">
		<table class="form_tbody">
		<!-- form element start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.shipment.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${shipment.ID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.shipment.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editID" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.shipment.prioritylevel.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${shipment.priorityLevelCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.shipment.prioritylevel.code" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editPriorityLevelCode" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.shipment.handlingcode.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${shipment.handlingCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.shipment.handlingcode.code" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editHandlingCode" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.shipment.handlinginstructions.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${shipment.handlingInstructions.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.shipment.handlinginstructions.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editHandlingInstructions" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.shipment.information.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${shipment.information.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.shipment.information.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editInformation" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.shipment.grossweight.measure" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${shipment.grossWeightMeasure.value}" />|
			<c:out value="${shipment.grossWeightMeasure.unitCode.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.shipment.grossweight.measure" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editGrossWeightMeasure" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.shipment.netweight.measure" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${shipment.netWeightMeasure.value}" />|
			<c:out value="${shipment.netWeightMeasure.unitCode.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.shipment.netweight.measure" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editNetWeightMeasure" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.shipment.netnetweight.measure" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${shipment.netNetWeightMeasure.value}" />|
			<c:out value="${shipment.netNetWeightMeasure.unitCode.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.shipment.netnetweight.measure" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editNetNetWeightMeasure" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.shipment.grossvolume.measure" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${shipment.grossVolumeMeasure.value}" />|
			<c:out value="${shipment.grossVolumeMeasure.unitCode.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.shipment.grossvolume.measure" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editGrossVolumeMeasure" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.shipment.netvolume.measure" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${shipment.netVolumeMeasure.value}" />|
			<c:out value="${shipment.netVolumeMeasure.unitCode.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.shipment.netvolume.measure" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editNetVolumeMeasure" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.shipment.totalgoodsitemquantity.quantity" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${shipment.totalGoodsItemQuantity.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.shipment.totalgoodsitemquantity.quantity" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editTotalGoodsItemQuantity" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.shipment.totaltransporthandlingunitquantity.quantity" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${shipment.totalTransportHandlingUnitQuantity.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.shipment.totaltransporthandlingunitquantity.quantity" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editTotalTransportHandlingUnitQuantity" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.shipment.insurancevalue.amount" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<fmt:formatNumber minFractionDigits="2"  value="${shipment.insuranceValueAmount.value}" />
			<c:out value="${shipment.insuranceValueAmount.currencyID.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.shipment.insurancevalue.amount" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editInsuranceValueAmount" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>		
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.shipment.declaredcustomsvalue.amount" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<fmt:formatNumber minFractionDigits="2"  value="${shipment.declaredCustomsValueAmount.value}" />
			<c:out value="${shipment.declaredCustomsValueAmount.currencyID.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.shipment.declaredcustomsvalue.amount" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editDeclaredCustomsValueAmount" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>		
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.shipment.declaredforcarriagevalue.amount" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<fmt:formatNumber minFractionDigits="2"  value="${shipment.declaredForCarriageValueAmount.value}" />
			<c:out value="${shipment.declaredForCarriageValueAmount.currencyID.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.shipment.declaredforcarriagevalue.amount" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editDeclaredForCarriageValueAmount" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>		
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.shipment.declaredstatisticsvalue.amount" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<fmt:formatNumber minFractionDigits="2"  value="${shipment.declaredStatisticsValueAmount.value}" />
			<c:out value="${shipment.declaredStatisticsValueAmount.currencyID.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.shipment.declaredstatisticsvalue.amount" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editDeclaredStatisticsValueAmount" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>		
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.shipment.freeonboardvalue.amount" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<fmt:formatNumber minFractionDigits="2"  value="${shipment.freeOnBoardValueAmount.value}" />
			<c:out value="${shipment.freeOnBoardValueAmount.currencyID.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.shipment.freeonboardvalue.amount" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editFreeOnBoardValueAmount" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>		
	
<!-- SpecialInstructions list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.shipment.specialinstructions.text" />:</td>
			<td class="form_tdispcol">
			<c:out value="SpecialInstructions List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.shipment.specialinstructions.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editSpecialInstructionsList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- DeliveryInstructions list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.shipment.deliveryinstructions.text" />:</td>
			<td class="form_tdispcol">
			<c:out value="DeliveryInstructions List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.shipment.deliveryinstructions.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editDeliveryInstructionsList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.shipment.consignment" />:</td>
			<td class="form_tdispcol">
			<c:out value="${shipment.consignment.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.shipment.consignment" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editConsignment" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.shipment.transportcontract.contract" />:</td>
			<td class="form_tdispcol">
			<c:out value="${shipment.transportContract.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.shipment.transportcontract.contract" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editTransportContract" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- GoodsItem list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.shipment.goodsitem" />:</td>
			<td class="form_tdispcol">
			<c:out value="GoodsItem List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.shipment.goodsitem" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editGoodsItemList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- ShipmentStage list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.shipment.shipmentstage" />:</td>
			<td class="form_tdispcol">
			<c:out value="ShipmentStage List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.shipment.shipmentstage" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editShipmentStageList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.shipment.delivery" />:</td>
			<td class="form_tdispcol">
			<c:out value="${shipment.delivery.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.shipment.delivery" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editDelivery" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- TransportHandlingUnit list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.shipment.transporthandlingunit" />:</td>
			<td class="form_tdispcol">
			<c:out value="TransportHandlingUnit List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.shipment.transporthandlingunit" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editTransportHandlingUnitList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.shipment.originaddress.address" />:</td>
			<td class="form_tdispcol">
			<c:out value="${shipment.originAddress.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.shipment.originaddress.address" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editOriginAddress" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.shipment.firstarrivalport.port" />:</td>
			<td class="form_tdispcol">
			<c:out value="${shipment.firstArrivalPort.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.shipment.firstarrivalport.port" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editFirstArrivalPort" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.shipment.lastexitport.port" />:</td>
			<td class="form_tdispcol">
			<c:out value="${shipment.lastExitPort.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.shipment.lastexitport.port" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editLastExitPort" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.shipment.exportcountry.country" />:</td>
			<td class="form_tdispcol">
			<c:out value="${shipment.exportCountry.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.shipment.exportcountry.country" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editExportCountry" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- FreightAllowanceCharge list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.shipment.freightallowancecharge.allowancecharge" />:</td>
			<td class="form_tdispcol">
			<c:out value="FreightAllowanceCharge List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.shipment.freightallowancecharge.allowancecharge" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editFreightAllowanceChargeList" value="<fmt:message key="ui.button.edit" />" /></td>
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