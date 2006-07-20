<%@ include file="/WEB-INF/jsp/views/viewHeader.jsp" %>
<form action="openebiz" method="post">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.remittanceadviceline.details" /></legend>
			<table class="form_tbody">
			<!-- element view start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.remittanceadviceline.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${remittanceAdviceLine.ID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.remittanceadviceline.identifier" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.remittanceadviceline.note.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${remittanceAdviceLine.note.languageID}" />:
			<c:out value="${remittanceAdviceLine.note.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.remittanceadviceline.note.text" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.remittanceadviceline.globallyuniqueidentifier.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${remittanceAdviceLine.GUID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.remittanceadviceline.globallyuniqueidentifier.identifier" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.remittanceadviceline.debitlineamount.amount" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<fmt:formatNumber minFractionDigits="2"  value="${remittanceAdviceLine.debitLineAmount.value}" />
			<c:out value="${remittanceAdviceLine.debitLineAmount.currencyID.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.remittanceadviceline.debitlineamount.amount" />" /></td>
		</tr>		
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.remittanceadviceline.creditlineamount.amount" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<fmt:formatNumber minFractionDigits="2"  value="${remittanceAdviceLine.creditLineAmount.value}" />
			<c:out value="${remittanceAdviceLine.creditLineAmount.currencyID.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.remittanceadviceline.creditlineamount.amount" />" /></td>
		</tr>		
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.remittanceadviceline.balanceamount.amount" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<fmt:formatNumber minFractionDigits="2"  value="${remittanceAdviceLine.balanceAmount.value}" />
			<c:out value="${remittanceAdviceLine.balanceAmount.currencyID.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.remittanceadviceline.balanceamount.amount" />" /></td>
		</tr>		
	
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.remittanceadviceline.creditorsupplierparty.supplierparty" />:</td>
			<td class="form_tdispcol">
			<c:out value="${remittanceAdviceLine.creditorSupplierParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.remittanceadviceline.creditorsupplierparty.supplierparty" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.remittanceadviceline.debtorsupplierparty.supplierparty" />:</td>
			<td class="form_tdispcol">
			<c:out value="${remittanceAdviceLine.debtorSupplierParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.remittanceadviceline.debtorsupplierparty.supplierparty" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.remittanceadviceline.buyercustomerparty.customerparty" />:</td>
			<td class="form_tdispcol">
			<c:out value="${remittanceAdviceLine.buyerCustomerParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.remittanceadviceline.buyercustomerparty.customerparty" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.remittanceadviceline.sellersupplierparty.supplierparty" />:</td>
			<td class="form_tdispcol">
			<c:out value="${remittanceAdviceLine.sellerSupplierParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.remittanceadviceline.sellersupplierparty.supplierparty" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.remittanceadviceline.originatorcustomerparty.customerparty" />:</td>
			<td class="form_tdispcol">
			<c:out value="${remittanceAdviceLine.originatorCustomerParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.remittanceadviceline.originatorcustomerparty.customerparty" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.remittanceadviceline.payeeparty.party" />:</td>
			<td class="form_tdispcol">
			<c:out value="${remittanceAdviceLine.payeeParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.remittanceadviceline.payeeparty.party" />" /></td>
		</tr>
<!-- cac item end -->
<!-- InvoicePeriod list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.remittanceadviceline.invoiceperiod.period" />:</td>
			<td class="form_tdispcol">
			<c:out value="InvoicePeriod List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.remittanceadviceline.invoiceperiod.period" />" /></td>
		</tr>
<!-- AccountingDocumentReference list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.remittanceadviceline.accountingdocumentreference" />:</td>
			<td class="form_tdispcol">
			<c:out value="AccountingDocumentReference List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.remittanceadviceline.accountingdocumentreference" />" /></td>
		</tr>
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.remittanceadviceline.exchangerate" />:</td>
			<td class="form_tdispcol">
			<c:out value="${remittanceAdviceLine.exchangeRate.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.remittanceadviceline.exchangerate" />" /></td>
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