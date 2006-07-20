<%@ include file="/WEB-INF/jsp/views/viewHeader.jsp" %>
<form action="openebiz" method="post">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.consignment.details" /></legend>
			<table class="form_tbody">
			<!-- element view start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.consignment.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${consignment.ID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.consignment.identifier" />" /></td>
		</tr>							
	
<!-- SummaryDescription list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.consignment.summarydescription.text" />:</td>
			<td class="form_tdispcol">
			<c:out value="SummaryDescription List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.consignment.summarydescription.text" />" /></td>
		</tr>
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.consignment.totalinvoiceamount.amount" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<fmt:formatNumber minFractionDigits="2"  value="${consignment.totalInvoiceAmount.value}" />
			<c:out value="${consignment.totalInvoiceAmount.currencyID.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.consignment.totalinvoiceamount.amount" />" /></td>
		</tr>		
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.consignment.declaredcustomsvalue.amount" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<fmt:formatNumber minFractionDigits="2"  value="${consignment.declaredCustomsValueAmount.value}" />
			<c:out value="${consignment.declaredCustomsValueAmount.currencyID.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.consignment.declaredcustomsvalue.amount" />" /></td>
		</tr>		
	
<!-- TariffDescription list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.consignment.tariffdescription.text" />:</td>
			<td class="form_tdispcol">
			<c:out value="TariffDescription List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.consignment.tariffdescription.text" />" /></td>
		</tr>
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.consignment.tariffcode.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${consignment.tariffCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.consignment.tariffcode.code" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.consignment.insurancepremiumamount.amount" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<fmt:formatNumber minFractionDigits="2"  value="${consignment.insurancePremiumAmount.value}" />
			<c:out value="${consignment.insurancePremiumAmount.currencyID.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.consignment.insurancepremiumamount.amount" />" /></td>
		</tr>		
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.consignment.grossweight.measure" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${consignment.grossWeightMeasure.value}" />
			<c:out value="${consignment.grossWeightMeasure.unitCode.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.consignment.grossweight.measure" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.consignment.netweight.measure" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${consignment.netWeightMeasure.value}" />
			<c:out value="${consignment.netWeightMeasure.unitCode.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.consignment.netweight.measure" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.consignment.netnetweight.measure" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${consignment.netNetWeightMeasure.value}" />
			<c:out value="${consignment.netNetWeightMeasure.unitCode.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.consignment.netnetweight.measure" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.consignment.chargeableweight.measure" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${consignment.chargeableWeightMeasure.value}" />
			<c:out value="${consignment.chargeableWeightMeasure.unitCode.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.consignment.chargeableweight.measure" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.consignment.grossvolume.measure" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${consignment.grossVolumeMeasure.value}" />
			<c:out value="${consignment.grossVolumeMeasure.unitCode.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.consignment.grossvolume.measure" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.consignment.netvolume.measure" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${consignment.netVolumeMeasure.value}" />
			<c:out value="${consignment.netVolumeMeasure.unitCode.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.consignment.netvolume.measure" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.consignment.loadinglength.measure" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${consignment.loadingLengthMeasure.value}" />
			<c:out value="${consignment.loadingLengthMeasure.unitCode.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.consignment.loadinglength.measure" />" /></td>
		</tr>				
	
<!-- Remarks list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.consignment.remarks.text" />:</td>
			<td class="form_tdispcol">
			<c:out value="Remarks List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.consignment.remarks.text" />" /></td>
		</tr>
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.consignment.hazardousriskindicator.indicator" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${consignment.hazardousRiskIndicator.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.consignment.hazardousriskindicator.indicator" />" /></td>
		</tr>			
	
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.consignment.consigneeparty.party" />:</td>
			<td class="form_tdispcol">
			<c:out value="${consignment.consigneeParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.consignment.consigneeparty.party" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.consignment.exporterparty.party" />:</td>
			<td class="form_tdispcol">
			<c:out value="${consignment.exporterParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.consignment.exporterparty.party" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.consignment.consignorparty.party" />:</td>
			<td class="form_tdispcol">
			<c:out value="${consignment.consignorParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.consignment.consignorparty.party" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.consignment.importerparty.party" />:</td>
			<td class="form_tdispcol">
			<c:out value="${consignment.importerParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.consignment.importerparty.party" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.consignment.carrierparty.party" />:</td>
			<td class="form_tdispcol">
			<c:out value="${consignment.carrierParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.consignment.carrierparty.party" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.consignment.freightforwarderparty.party" />:</td>
			<td class="form_tdispcol">
			<c:out value="${consignment.freightForwarderParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.consignment.freightforwarderparty.party" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.consignment.notifyparty.party" />:</td>
			<td class="form_tdispcol">
			<c:out value="${consignment.notifyParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.consignment.notifyparty.party" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.consignment.originaldespatchparty.party" />:</td>
			<td class="form_tdispcol">
			<c:out value="${consignment.originalDespatchParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.consignment.originaldespatchparty.party" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.consignment.finaldeliveryparty.party" />:</td>
			<td class="form_tdispcol">
			<c:out value="${consignment.finalDeliveryParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.consignment.finaldeliveryparty.party" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.consignment.originaldeparturecountry.country" />:</td>
			<td class="form_tdispcol">
			<c:out value="${consignment.originalDepartureCountry.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.consignment.originaldeparturecountry.country" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.consignment.finaldestinationcountry.country" />:</td>
			<td class="form_tdispcol">
			<c:out value="${consignment.finalDestinationCountry.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.consignment.finaldestinationcountry.country" />" /></td>
		</tr>
<!-- cac item end -->
<!-- TransitCountry list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.consignment.transitcountry.country" />:</td>
			<td class="form_tdispcol">
			<c:out value="TransitCountry List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.consignment.transitcountry.country" />" /></td>
		</tr>
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.consignment.originaldespatchtransportationservice.transportationservice" />:</td>
			<td class="form_tdispcol">
			<c:out value="${consignment.originalDespatchTransportationService.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.consignment.originaldespatchtransportationservice.transportationservice" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.consignment.finaldeliverytransportationservice.transportationservice" />:</td>
			<td class="form_tdispcol">
			<c:out value="${consignment.finalDeliveryTransportationService.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.consignment.finaldeliverytransportationservice.transportationservice" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.consignment.deliveryterms" />:</td>
			<td class="form_tdispcol">
			<c:out value="${consignment.deliveryTerms.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.consignment.deliveryterms" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.consignment.paymentterms" />:</td>
			<td class="form_tdispcol">
			<c:out value="${consignment.paymentTerms.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.consignment.paymentterms" />" /></td>
		</tr>
<!-- cac item end -->
<!-- FreightAllowanceCharge list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.consignment.freightallowancecharge.allowancecharge" />:</td>
			<td class="form_tdispcol">
			<c:out value="FreightAllowanceCharge List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.consignment.freightallowancecharge.allowancecharge" />" /></td>
		</tr>
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