<%@ include file="/WEB-INF/jsp/views/viewHeader.jsp" %>
<form action="openebiz" method="post">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.taxsubtotal.details" /></legend>
			<table class="form_tbody">
			<!-- element view start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.taxsubtotal.taxableamount.amount" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<fmt:formatNumber minFractionDigits="2"  value="${taxSubTotal.taxableAmount.value}" />
			<c:out value="${taxSubTotal.taxableAmount.currencyID.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.taxsubtotal.taxableamount.amount" />" /></td>
		</tr>		
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.taxsubtotal.taxamount.amount" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<fmt:formatNumber minFractionDigits="2"  value="${taxSubTotal.taxAmount.value}" />
			<c:out value="${taxSubTotal.taxAmount.currencyID.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.taxsubtotal.taxamount.amount" />" /></td>
		</tr>		
	
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.taxsubtotal.calculationsequence.numeric" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<fmt:formatNumber minFractionDigits="2"  value="${taxSubTotal.calculationSequenceNumeric.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.taxsubtotal.calculationsequence.numeric" />" /></td>
		</tr>				
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.taxsubtotal.transactioncurrencytaxamount.amount" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<fmt:formatNumber minFractionDigits="2"  value="${taxSubTotal.transactionCurrencyTaxAmount.value}" />
			<c:out value="${taxSubTotal.transactionCurrencyTaxAmount.currencyID.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.taxsubtotal.transactioncurrencytaxamount.amount" />" /></td>
		</tr>		
	
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.taxsubtotal.percent" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<fmt:formatNumber type="percent" value="${taxSubTotal.percent.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.taxsubtotal.percent" />" /></td>
		</tr>				
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.taxsubtotal.exemptionreason.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${taxSubTotal.exemptionReason.languageID}" />:
			<c:out value="${taxSubTotal.exemptionReason.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.taxsubtotal.exemptionreason.text" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.taxsubtotal.baseunitmeasure.measure" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${taxSubTotal.baseUnitMeasure.value}" />
			<c:out value="${taxSubTotal.baseUnitMeasure.unitCode.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.taxsubtotal.baseunitmeasure.measure" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.taxsubtotal.perunitamount.amount" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<fmt:formatNumber minFractionDigits="2"  value="${taxSubTotal.perUnitAmount.value}" />
			<c:out value="${taxSubTotal.perUnitAmount.currencyID.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.taxsubtotal.perunitamount.amount" />" /></td>
		</tr>		
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.taxsubtotal.tierrange.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${taxSubTotal.tierRange.languageID}" />:
			<c:out value="${taxSubTotal.tierRange.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.taxsubtotal.tierrange.text" />" /></td>
		</tr>				
	
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.taxsubtotal.tierrate.percent" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<fmt:formatNumber type="percent" value="${taxSubTotal.tierRatePercent.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.taxsubtotal.tierrate.percent" />" /></td>
		</tr>				
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.taxsubtotal.taxcategory" />:</td>
			<td class="form_tdispcol">
			<c:out value="${taxSubTotal.taxCategory.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.taxsubtotal.taxcategory" />" /></td>
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