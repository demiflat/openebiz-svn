<%@ include file="/WEB-INF/jsp/views/viewHeader.jsp" %>
<form action="openebiz" method="post">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.invoice.details" /></legend>
			<table class="form_tbody">
			<!-- element view start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.invoice.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${invoice.ID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.invoice.identifier" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.invoice.copyindicator.indicator" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${invoice.copyIndicator.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.invoice.copyindicator.indicator" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.invoice.globallyuniqueidentifier.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${invoice.GUID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.invoice.globallyuniqueidentifier.identifier" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.invoice.issuedate.date" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:if test="${not empty invoice.issueDate.value}">
			<fmt:formatDate value="${invoice.issueDate.asDateType}" type="date" pattern="yyyy/MM/dd" />
			</c:if>			
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.invoice.issuedate.date" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.invoice.issuetime.time" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:if test="${not empty invoice.issueTime.value}">
			<fmt:formatDate value="${invoice.issueTime.asDateType}" type="time" timeStyle="short" />
			</c:if>
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.invoice.issuetime.time" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.invoice.invoicetype.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${invoice.invoiceTypeCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.invoice.invoicetype.code" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.invoice.note.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${invoice.note.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.invoice.note.text" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.invoice.taxpointdate.date" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:if test="${not empty invoice.taxPointDate.value}">
			<fmt:formatDate value="${invoice.taxPointDate.asDateType}" type="date" pattern="yyyy/MM/dd" />
			</c:if>			
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.invoice.taxpointdate.date" />" /></td>
		</tr>				
	
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.invoice.transactioncurrency.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${invoice.transactionCurrencyCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.invoice.transactioncurrency.code" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.invoice.documentcurrency.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${invoice.documentCurrencyCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.invoice.documentcurrency.code" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.invoice.taxcurrency.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${invoice.taxCurrencyCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.invoice.taxcurrency.code" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.invoice.pricingcurrency.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${invoice.pricingCurrencyCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.invoice.pricingcurrency.code" />" /></td>
		</tr>			
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.invoice.accountingcostcode.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${invoice.accountingCostCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.invoice.accountingcostcode.code" />" /></td>
		</tr>			
	
<!-- InvoicePeriod list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.invoice.invoiceperiod.period" />:</td>
			<td class="form_tdispcol">
			<c:out value="InvoicePeriod List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.invoice.invoiceperiod.period" />" /></td>
		</tr>		
<!-- OrderReference list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.invoice.orderreference" />:</td>
			<td class="form_tdispcol">
			<c:out value="OrderReference List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.invoice.orderreference" />" /></td>
		</tr>		
<!-- DespatchDocumentReference list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.invoice.despatchdocumentreference.documentreference" />:</td>
			<td class="form_tdispcol">
			<c:out value="DespatchDocumentReference List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.invoice.despatchdocumentreference.documentreference" />" /></td>
		</tr>		
<!-- ReceiptDocumentReference list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.invoice.receiptdocumentreference.documentreference" />:</td>
			<td class="form_tdispcol">
			<c:out value="ReceiptDocumentReference List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.invoice.receiptdocumentreference.documentreference" />" /></td>
		</tr>		
<!-- AccountingDocumentReference list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.invoice.accountingdocumentreference" />:</td>
			<td class="form_tdispcol">
			<c:out value="AccountingDocumentReference List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.invoice.accountingdocumentreference" />" /></td>
		</tr>		
<!-- OriginatorDocumentReference list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.invoice.originatordocumentreference.documentreference" />:</td>
			<td class="form_tdispcol">
			<c:out value="OriginatorDocumentReference List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.invoice.originatordocumentreference.documentreference" />" /></td>
		</tr>		
<!-- ContractDocumentReference list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.invoice.contractdocumentreference.documentreference" />:</td>
			<td class="form_tdispcol">
			<c:out value="ContractDocumentReference List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.invoice.contractdocumentreference.documentreference" />" /></td>
		</tr>		
<!-- AdditionalDocumentReference list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.invoice.additionaldocumentreference.documentreference" />:</td>
			<td class="form_tdispcol">
			<c:out value="AdditionalDocumentReference List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.invoice.additionaldocumentreference.documentreference" />" /></td>
		</tr>		
<!-- Signature list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.invoice.signature" />:</td>
			<td class="form_tdispcol">
			<c:out value="Signature List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.invoice.signature" />" /></td>
		</tr>		
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.invoice.creditorsupplierparty.supplierparty" />:</td>
			<td class="form_tdispcol">
			<c:out value="${invoice.creditorSupplierParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.invoice.creditorsupplierparty.supplierparty" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.invoice.debtorcustomerparty.customerparty" />:</td>
			<td class="form_tdispcol">
			<c:out value="${invoice.debtorCustomerParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.invoice.debtorcustomerparty.customerparty" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.invoice.payeeparty.party" />:</td>
			<td class="form_tdispcol">
			<c:out value="${invoice.payeeParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.invoice.payeeparty.party" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.invoice.buyercustomerparty.customerparty" />:</td>
			<td class="form_tdispcol">
			<c:out value="${invoice.buyerCustomerParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.invoice.buyercustomerparty.customerparty" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.invoice.sellersupplierparty.supplierparty" />:</td>
			<td class="form_tdispcol">
			<c:out value="${invoice.sellerSupplierParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.invoice.sellersupplierparty.supplierparty" />" /></td>
		</tr>
<!-- cac item end -->
<!-- Delivery list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.invoice.delivery" />:</td>
			<td class="form_tdispcol">
			<c:out value="Delivery List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.invoice.delivery" />" /></td>
		</tr>		
<!-- DeliveryTerms list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.invoice.deliveryterms" />:</td>
			<td class="form_tdispcol">
			<c:out value="DeliveryTerms List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.invoice.deliveryterms" />" /></td>
		</tr>		
<!-- PaymentMeans list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.invoice.paymentmeans" />:</td>
			<td class="form_tdispcol">
			<c:out value="PaymentMeans List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.invoice.paymentmeans" />" /></td>
		</tr>		
<!-- PaymentTerms list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.invoice.paymentterms" />:</td>
			<td class="form_tdispcol">
			<c:out value="PaymentTerms List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.invoice.paymentterms" />" /></td>
		</tr>		
<!-- AllowanceCharge list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.invoice.allowancecharge" />:</td>
			<td class="form_tdispcol">
			<c:out value="AllowanceCharge List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.invoice.allowancecharge" />" /></td>
		</tr>		
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.invoice.transactionexchangerate.exchangerate" />:</td>
			<td class="form_tdispcol">
			<c:out value="${invoice.transactionExchangeRate.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.invoice.transactionexchangerate.exchangerate" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.invoice.taxexchangerate.exchangerate" />:</td>
			<td class="form_tdispcol">
			<c:out value="${invoice.taxExchangeRate.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.invoice.taxexchangerate.exchangerate" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.invoice.pricingexchangerate.exchangerate" />:</td>
			<td class="form_tdispcol">
			<c:out value="${invoice.pricingExchangeRate.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.invoice.pricingexchangerate.exchangerate" />" /></td>
		</tr>
<!-- cac item end -->
<!-- TaxTotal list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.invoice.taxtotal" />:</td>
			<td class="form_tdispcol">
			<c:out value="TaxTotal List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.invoice.taxtotal" />" /></td>
		</tr>		
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.invoice.legaltotal" />:</td>
			<td class="form_tdispcol">
			<c:out value="${invoice.legalTotal.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.invoice.legaltotal" />" /></td>
		</tr>
<!-- cac item end -->
<!-- InvoiceLine list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.invoice.invoiceline" />:</td>
			<td class="form_tdispcol">
			<c:out value="InvoiceLine List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.invoice.invoiceline" />" /></td>
		</tr>		
		<!-- element view end -->
		</table>
		<div class="submitButtons">
			<input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}">
			<input type="submit" class="button" name="_eventId_edit" value="Re-Edit">
			<input type="submit" class="button" name="_eventId_save" value="Save">
		</div>
	</fieldset>
	</div>
</form>
<%@ include file="/WEB-INF/jsp/views/viewFooter.jsp" %>