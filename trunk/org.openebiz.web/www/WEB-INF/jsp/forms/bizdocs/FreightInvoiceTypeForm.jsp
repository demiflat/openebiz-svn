<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.freightinvoice.details" /></legend>
		<spring:hasBindErrors name="freightInvoice">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<spring:nestedPath path="freightInvoice">
		<table class="form_tbody">
		<!-- form element start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.freightinvoice.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${freightInvoice.ID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.freightinvoice.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editID" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.freightinvoice.copyindicator.indicator" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${freightInvoice.copyIndicator.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.freightinvoice.copyindicator.indicator" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editCopyIndicator" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.freightinvoice.globallyuniqueidentifier.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${freightInvoice.GUID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.freightinvoice.globallyuniqueidentifier.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editGUID" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.freightinvoice.issuedate.date" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:if test="${not empty freightInvoice.issueDate.value}">
			<fmt:formatDate value="${freightInvoice.issueDate.asDateType}" type="date" pattern="yyyy/MM/dd" />
			</c:if>
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.freightinvoice.issuedate.date" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editIssueDate" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.freightinvoice.issuetime.time" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:if test="${not empty freightInvoice.issueTime.value}">
			<fmt:formatDate value="${freightInvoice.issueTime.asDateType}" type="time" timeStyle="short" />
			</c:if>
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.freightinvoice.issuetime.time" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editIssueTime" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.freightinvoice.invoicetype.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${freightInvoice.invoiceTypeCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.freightinvoice.invoicetype.code" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editInvoiceTypeCode" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.freightinvoice.note.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${freightInvoice.note.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.freightinvoice.note.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editNote" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.freightinvoice.taxpointdate.date" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:if test="${not empty freightInvoice.taxPointDate.value}">
			<fmt:formatDate value="${freightInvoice.taxPointDate.asDateType}" type="date" pattern="yyyy/MM/dd" />
			</c:if>
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.freightinvoice.taxpointdate.date" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editTaxPointDate" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.freightinvoice.transactioncurrency.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${freightInvoice.transactionCurrencyCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.freightinvoice.transactioncurrency.code" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editTransactionCurrencyCode" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.freightinvoice.documentcurrency.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${freightInvoice.documentCurrencyCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.freightinvoice.documentcurrency.code" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editDocumentCurrencyCode" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.freightinvoice.taxcurrency.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${freightInvoice.taxCurrencyCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.freightinvoice.taxcurrency.code" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editTaxCurrencyCode" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.freightinvoice.pricingcurrency.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${freightInvoice.pricingCurrencyCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.freightinvoice.pricingcurrency.code" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editPricingCurrencyCode" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.freightinvoice.accountingcostcode.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${freightInvoice.accountingCostCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.freightinvoice.accountingcostcode.code" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editAccountingCostCode" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
<!-- InvoicePeriod list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.freightinvoice.invoiceperiod.period" />:</td>
			<td class="form_tdispcol">
			<c:out value="InvoicePeriod List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.freightinvoice.invoiceperiod.period" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editInvoicePeriodList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- InvoicePeriod list element end-->		
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.freightinvoice.shipment" />:</td>
			<td class="form_tdispcol">
			<c:out value="${freightInvoice.shipment.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.freightinvoice.shipment" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editShipment" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- OrderReference list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.freightinvoice.orderreference" />:</td>
			<td class="form_tdispcol">
			<c:out value="OrderReference List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.freightinvoice.orderreference" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editOrderReferenceList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- OrderReference list element end-->		
<!-- DespatchDocumentReference list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.freightinvoice.despatchdocumentreference.documentreference" />:</td>
			<td class="form_tdispcol">
			<c:out value="DespatchDocumentReference List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.freightinvoice.despatchdocumentreference.documentreference" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editDespatchDocumentReferenceList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- DespatchDocumentReference list element end-->		
<!-- ReceiptDocumentReference list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.freightinvoice.receiptdocumentreference.documentreference" />:</td>
			<td class="form_tdispcol">
			<c:out value="ReceiptDocumentReference List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.freightinvoice.receiptdocumentreference.documentreference" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editReceiptDocumentReferenceList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- ReceiptDocumentReference list element end-->		
<!-- AccountingDocumentReference list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.freightinvoice.accountingdocumentreference" />:</td>
			<td class="form_tdispcol">
			<c:out value="AccountingDocumentReference List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.freightinvoice.accountingdocumentreference" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editAccountingDocumentReferenceList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- AccountingDocumentReference list element end-->		
<!-- OriginatorDocumentReference list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.freightinvoice.originatordocumentreference.documentreference" />:</td>
			<td class="form_tdispcol">
			<c:out value="OriginatorDocumentReference List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.freightinvoice.originatordocumentreference.documentreference" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editOriginatorDocumentReferenceList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- OriginatorDocumentReference list element end-->		
<!-- ContractDocumentReference list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.freightinvoice.contractdocumentreference.documentreference" />:</td>
			<td class="form_tdispcol">
			<c:out value="ContractDocumentReference List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.freightinvoice.contractdocumentreference.documentreference" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editContractDocumentReferenceList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- ContractDocumentReference list element end-->		
<!-- AdditionalDocumentReference list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.freightinvoice.additionaldocumentreference.documentreference" />:</td>
			<td class="form_tdispcol">
			<c:out value="AdditionalDocumentReference List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.freightinvoice.additionaldocumentreference.documentreference" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editAdditionalDocumentReferenceList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- AdditionalDocumentReference list element end-->		
<!-- Signature list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.freightinvoice.signature" />:</td>
			<td class="form_tdispcol">
			<c:out value="Signature List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.freightinvoice.signature" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editSignatureList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- Signature list element end-->		
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.freightinvoice.creditorsupplierparty.supplierparty" />:</td>
			<td class="form_tdispcol">
			<c:out value="${freightInvoice.creditorSupplierParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.freightinvoice.creditorsupplierparty.supplierparty" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editCreditorSupplierParty" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.freightinvoice.debtorcustomerparty.customerparty" />:</td>
			<td class="form_tdispcol">
			<c:out value="${freightInvoice.debtorCustomerParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.freightinvoice.debtorcustomerparty.customerparty" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editDebtorCustomerParty" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.freightinvoice.payeeparty.party" />:</td>
			<td class="form_tdispcol">
			<c:out value="${freightInvoice.payeeParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.freightinvoice.payeeparty.party" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editPayeeParty" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- PaymentMeans list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.freightinvoice.paymentmeans" />:</td>
			<td class="form_tdispcol">
			<c:out value="PaymentMeans List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.freightinvoice.paymentmeans" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editPaymentMeansList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- PaymentMeans list element end-->		
<!-- PaymentTerms list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.freightinvoice.paymentterms" />:</td>
			<td class="form_tdispcol">
			<c:out value="PaymentTerms List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.freightinvoice.paymentterms" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editPaymentTermsList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- PaymentTerms list element end-->		
<!-- AllowanceCharge list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.freightinvoice.allowancecharge" />:</td>
			<td class="form_tdispcol">
			<c:out value="AllowanceCharge List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.freightinvoice.allowancecharge" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editAllowanceChargeList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- AllowanceCharge list element end-->		
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.freightinvoice.transactionexchangerate.exchangerate" />:</td>
			<td class="form_tdispcol">
			<c:out value="${freightInvoice.transactionExchangeRate.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.freightinvoice.transactionexchangerate.exchangerate" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editTransactionExchangeRate" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.freightinvoice.taxexchangerate.exchangerate" />:</td>
			<td class="form_tdispcol">
			<c:out value="${freightInvoice.taxExchangeRate.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.freightinvoice.taxexchangerate.exchangerate" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editTaxExchangeRate" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.freightinvoice.pricingexchangerate.exchangerate" />:</td>
			<td class="form_tdispcol">
			<c:out value="${freightInvoice.pricingExchangeRate.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.freightinvoice.pricingexchangerate.exchangerate" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editPricingExchangeRate" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- TaxTotal list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.freightinvoice.taxtotal" />:</td>
			<td class="form_tdispcol">
			<c:out value="TaxTotal List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.freightinvoice.taxtotal" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editTaxTotalList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- TaxTotal list element end-->		
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.freightinvoice.legaltotal" />:</td>
			<td class="form_tdispcol">
			<c:out value="${freightInvoice.legalTotal.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.freightinvoice.legaltotal" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editLegalTotal" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- InvoiceLine list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.freightinvoice.invoiceline" />:</td>
			<td class="form_tdispcol">
			<c:out value="InvoiceLine List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.freightinvoice.invoiceline" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editInvoiceLineList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- InvoiceLine list element end-->		
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