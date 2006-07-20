<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.creditnote.details" /></legend>
		<spring:hasBindErrors name="creditNote">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<spring:nestedPath path="creditNote">
		<table class="form_tbody">
		<!-- form element start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.creditnote.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${creditNote.ID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.creditnote.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editID" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.creditnote.copyindicator.indicator" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${creditNote.copyIndicator.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.creditnote.copyindicator.indicator" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editCopyIndicator" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.creditnote.globallyuniqueidentifier.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${creditNote.GUID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.creditnote.globallyuniqueidentifier.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editGUID" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.creditnote.issuedate.date" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:if test="${not empty creditNote.issueDate.value}">
			<fmt:formatDate value="${creditNote.issueDate.asDateType}" type="date" pattern="yyyy/MM/dd" />
			</c:if>
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.creditnote.issuedate.date" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editIssueDate" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.creditnote.issuetime.time" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:if test="${not empty creditNote.issueTime.value}">
			<fmt:formatDate value="${creditNote.issueTime.asDateType}" type="time" timeStyle="short" />
			</c:if>
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.creditnote.issuetime.time" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editIssueTime" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.creditnote.taxpointdate.date" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:if test="${not empty creditNote.taxPointDate.value}">
			<fmt:formatDate value="${creditNote.taxPointDate.asDateType}" type="date" pattern="yyyy/MM/dd" />
			</c:if>
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.creditnote.taxpointdate.date" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editTaxPointDate" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.creditnote.note.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${creditNote.note.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.creditnote.note.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editNote" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.creditnote.transactioncurrency.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${creditNote.transactionCurrencyCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.creditnote.transactioncurrency.code" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editTransactionCurrencyCode" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.creditnote.documentcurrency.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${creditNote.documentCurrencyCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.creditnote.documentcurrency.code" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editDocumentCurrencyCode" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.creditnote.taxcurrency.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${creditNote.taxCurrencyCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.creditnote.taxcurrency.code" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editTaxCurrencyCode" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.creditnote.pricingcurrency.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${creditNote.pricingCurrencyCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.creditnote.pricingcurrency.code" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editPricingCurrencyCode" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.creditnote.accountingcostcode.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${creditNote.accountingCostCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.creditnote.accountingcostcode.code" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editAccountingCostCode" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
<!-- InvoicePeriod list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.creditnote.invoiceperiod.period" />:</td>
			<td class="form_tdispcol">
			<c:out value="InvoicePeriod List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.creditnote.invoiceperiod.period" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editInvoicePeriodList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- InvoicePeriod list element end-->		
<!-- DiscrepancyResponse list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.creditnote.discrepancyresponse.response" />:</td>
			<td class="form_tdispcol">
			<c:out value="DiscrepancyResponse List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.creditnote.discrepancyresponse.response" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editDiscrepancyResponseList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- DiscrepancyResponse list element end-->		
<!-- OrderReference list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.creditnote.orderreference" />:</td>
			<td class="form_tdispcol">
			<c:out value="OrderReference List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.creditnote.orderreference" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editOrderReferenceList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- OrderReference list element end-->		
<!-- AccountingDocumentReference list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.creditnote.accountingdocumentreference" />:</td>
			<td class="form_tdispcol">
			<c:out value="AccountingDocumentReference List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.creditnote.accountingdocumentreference" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editAccountingDocumentReferenceList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- AccountingDocumentReference list element end-->		
<!-- ContractDocumentReference list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.creditnote.contractdocumentreference.documentreference" />:</td>
			<td class="form_tdispcol">
			<c:out value="ContractDocumentReference List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.creditnote.contractdocumentreference.documentreference" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editContractDocumentReferenceList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- ContractDocumentReference list element end-->		
<!-- AdditionalDocumentReference list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.creditnote.additionaldocumentreference.documentreference" />:</td>
			<td class="form_tdispcol">
			<c:out value="AdditionalDocumentReference List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.creditnote.additionaldocumentreference.documentreference" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editAdditionalDocumentReferenceList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- AdditionalDocumentReference list element end-->		
<!-- Signature list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.creditnote.signature" />:</td>
			<td class="form_tdispcol">
			<c:out value="Signature List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.creditnote.signature" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editSignatureList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- Signature list element end-->		
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.creditnote.debtorcustomerparty.customerparty" />:</td>
			<td class="form_tdispcol">
			<c:out value="${creditNote.debtorCustomerParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.creditnote.debtorcustomerparty.customerparty" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editDebtorCustomerParty" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.creditnote.creditorsupplierparty.supplierparty" />:</td>
			<td class="form_tdispcol">
			<c:out value="${creditNote.creditorSupplierParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.creditnote.creditorsupplierparty.supplierparty" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editCreditorSupplierParty" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.creditnote.payeeparty.party" />:</td>
			<td class="form_tdispcol">
			<c:out value="${creditNote.payeeParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.creditnote.payeeparty.party" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editPayeeParty" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.creditnote.transactionexchangerate.exchangerate" />:</td>
			<td class="form_tdispcol">
			<c:out value="${creditNote.transactionExchangeRate.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.creditnote.transactionexchangerate.exchangerate" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editTransactionExchangeRate" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.creditnote.taxexchangerate.exchangerate" />:</td>
			<td class="form_tdispcol">
			<c:out value="${creditNote.taxExchangeRate.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.creditnote.taxexchangerate.exchangerate" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editTaxExchangeRate" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.creditnote.pricingexchangerate.exchangerate" />:</td>
			<td class="form_tdispcol">
			<c:out value="${creditNote.pricingExchangeRate.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.creditnote.pricingexchangerate.exchangerate" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editPricingExchangeRate" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- TaxTotal list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.creditnote.taxtotal" />:</td>
			<td class="form_tdispcol">
			<c:out value="TaxTotal List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.creditnote.taxtotal" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editTaxTotalList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- TaxTotal list element end-->		
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.creditnote.legaltotal" />:</td>
			<td class="form_tdispcol">
			<c:out value="${creditNote.legalTotal.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.creditnote.legaltotal" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editLegalTotal" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- CreditNoteLine list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.creditnote.creditnoteline" />:</td>
			<td class="form_tdispcol">
			<c:out value="CreditNoteLine List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.creditnote.creditnoteline" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editCreditNoteLineList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- CreditNoteLine list element end-->		
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