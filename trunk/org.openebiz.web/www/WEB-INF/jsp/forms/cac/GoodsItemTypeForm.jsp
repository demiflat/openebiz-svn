<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.goodsitem.details" /></legend>
		<spring:hasBindErrors name="goodsItem">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<spring:nestedPath path="goodsItem">
		<table class="form_tbody">
		<!-- form element start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.goodsitem.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${goodsItem.ID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.goodsitem.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editID" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.goodsitem.sequencenumber.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${goodsItem.sequenceNumberID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.goodsitem.sequencenumber.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editSequenceNumberID" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>							
	
<!-- Description list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.goodsitem.description.text" />:</td>
			<td class="form_tdispcol">
			<c:out value="Description List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.goodsitem.description.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editDescriptionList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.goodsitem.hazardousriskindicator.indicator" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${goodsItem.hazardousRiskIndicator.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.goodsitem.hazardousriskindicator.indicator" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editHazardousRiskIndicator" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.goodsitem.declaredcustomsvalue.amount" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<fmt:formatNumber minFractionDigits="2"  value="${goodsItem.declaredCustomsValueAmount.value}" />
			<c:out value="${goodsItem.declaredCustomsValueAmount.currencyID.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.goodsitem.declaredcustomsvalue.amount" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editDeclaredCustomsValueAmount" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>		
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.goodsitem.declaredforcarriagevalue.amount" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<fmt:formatNumber minFractionDigits="2"  value="${goodsItem.declaredForCarriageValueAmount.value}" />
			<c:out value="${goodsItem.declaredForCarriageValueAmount.currencyID.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.goodsitem.declaredforcarriagevalue.amount" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editDeclaredForCarriageValueAmount" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>		
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.goodsitem.declaredstatisticsvalue.amount" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<fmt:formatNumber minFractionDigits="2"  value="${goodsItem.declaredStatisticsValueAmount.value}" />
			<c:out value="${goodsItem.declaredStatisticsValueAmount.currencyID.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.goodsitem.declaredstatisticsvalue.amount" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editDeclaredStatisticsValueAmount" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>		
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.goodsitem.freeonboardvalue.amount" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<fmt:formatNumber minFractionDigits="2"  value="${goodsItem.freeOnBoardValueAmount.value}" />
			<c:out value="${goodsItem.freeOnBoardValueAmount.currencyID.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.goodsitem.freeonboardvalue.amount" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editFreeOnBoardValueAmount" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>		
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.goodsitem.insurancevalue.amount" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<fmt:formatNumber minFractionDigits="2"  value="${goodsItem.insuranceValueAmount.value}" />
			<c:out value="${goodsItem.insuranceValueAmount.currencyID.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.goodsitem.insurancevalue.amount" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editInsuranceValueAmount" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>		
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.goodsitem.value.amount" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<fmt:formatNumber minFractionDigits="2"  value="${goodsItem.valueAmount.value}" />
			<c:out value="${goodsItem.valueAmount.currencyID.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.goodsitem.value.amount" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editValueAmount" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>		
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.goodsitem.grossweight.measure" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${goodsItem.grossWeightMeasure.value}" />|
			<c:out value="${goodsItem.grossWeightMeasure.unitCode.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.goodsitem.grossweight.measure" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editGrossWeightMeasure" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.goodsitem.netweight.measure" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${goodsItem.netWeightMeasure.value}" />|
			<c:out value="${goodsItem.netWeightMeasure.unitCode.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.goodsitem.netweight.measure" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editNetWeightMeasure" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.goodsitem.netnetweight.measure" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${goodsItem.netNetWeightMeasure.value}" />|
			<c:out value="${goodsItem.netNetWeightMeasure.unitCode.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.goodsitem.netnetweight.measure" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editNetNetWeightMeasure" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.goodsitem.chargeableweight.measure" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${goodsItem.chargeableWeightMeasure.value}" />|
			<c:out value="${goodsItem.chargeableWeightMeasure.unitCode.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.goodsitem.chargeableweight.measure" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editChargeableWeightMeasure" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.goodsitem.grossvolume.measure" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${goodsItem.grossVolumeMeasure.value}" />|
			<c:out value="${goodsItem.grossVolumeMeasure.unitCode.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.goodsitem.grossvolume.measure" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editGrossVolumeMeasure" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.goodsitem.netvolume.measure" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${goodsItem.netVolumeMeasure.value}" />|
			<c:out value="${goodsItem.netVolumeMeasure.unitCode.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.goodsitem.netvolume.measure" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editNetVolumeMeasure" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.goodsitem.quantity.numeric" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<fmt:formatNumber minFractionDigits="2"  value="${goodsItem.quantityNumeric.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.goodsitem.quantity.numeric" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editQuantityNumeric" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.goodsitem.preferencecriterion.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${goodsItem.preferenceCriterionCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.goodsitem.preferencecriterion.code" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editPreferenceCriterionCode" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.goodsitem.requiredcustomsidentifier.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${goodsItem.requiredCustomsID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.goodsitem.requiredcustomsidentifier.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editRequiredCustomsID" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.goodsitem.customsstatus.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${goodsItem.customsStatusCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.goodsitem.customsstatus.code" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editCustomsStatusCode" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.goodsitem.customstariffquantity.quantity" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${goodsItem.customsTariffQuantity.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.goodsitem.customstariffquantity.quantity" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editCustomsTariffQuantity" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
<!-- Item list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.goodsitem.item" />:</td>
			<td class="form_tdispcol">
			<c:out value="Item List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.goodsitem.item" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editItemList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- GoodsItemContainer list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.goodsitem.goodsitemcontainer" />:</td>
			<td class="form_tdispcol">
			<c:out value="GoodsItemContainer List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.goodsitem.goodsitemcontainer" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editGoodsItemContainerList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- FreightAllowanceCharge list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.goodsitem.freightallowancecharge.allowancecharge" />:</td>
			<td class="form_tdispcol">
			<c:out value="FreightAllowanceCharge List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.goodsitem.freightallowancecharge.allowancecharge" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editFreightAllowanceChargeList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- InvoiceLine list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.goodsitem.invoiceline" />:</td>
			<td class="form_tdispcol">
			<c:out value="InvoiceLine List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.goodsitem.invoiceline" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editInvoiceLineList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- Temperature list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.goodsitem.temperature" />:</td>
			<td class="form_tdispcol">
			<c:out value="Temperature List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.goodsitem.temperature" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editTemperatureList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- ContainedGoodsItem list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.goodsitem.containedgoodsitem.goodsitem" />:</td>
			<td class="form_tdispcol">
			<c:out value="ContainedGoodsItem List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.goodsitem.containedgoodsitem.goodsitem" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editContainedGoodsItemList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.goodsitem.originaddress.address" />:</td>
			<td class="form_tdispcol">
			<c:out value="${goodsItem.originAddress.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.goodsitem.originaddress.address" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editOriginAddress" value="<fmt:message key="ui.button.edit" />" /></td>
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