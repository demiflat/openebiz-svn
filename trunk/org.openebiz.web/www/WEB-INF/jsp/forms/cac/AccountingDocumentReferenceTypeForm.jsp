<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.accountingdocumentreference.details" /></legend>
		<spring:hasBindErrors name="accountingDocumentReference">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<spring:nestedPath path="accountingDocumentReference">
		<table class="form_tbody">
		<!-- form element start -->
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.accountingdocumentreference.documentcurrency.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${accountingDocumentReference.documentCurrencyCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.accountingdocumentreference.documentcurrency.code" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editDocumentCurrencyCode" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.accountingdocumentreference.taxcurrency.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${accountingDocumentReference.taxCurrencyCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.accountingdocumentreference.taxcurrency.code" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editTaxCurrencyCode" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
<!-- AdditionalDocumentReference list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.accountingdocumentreference.additionaldocumentreference.documentreference" />:</td>
			<td class="form_tdispcol">
			<c:out value="AdditionalDocumentReference List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.accountingdocumentreference.additionaldocumentreference.documentreference" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editAdditionalDocumentReferenceList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- StatementDocumentReference list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.accountingdocumentreference.statementdocumentreference.documentreference" />:</td>
			<td class="form_tdispcol">
			<c:out value="StatementDocumentReference List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.accountingdocumentreference.statementdocumentreference.documentreference" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editStatementDocumentReferenceList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- InvoiceDocumentReference list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.accountingdocumentreference.invoicedocumentreference.documentreference" />:</td>
			<td class="form_tdispcol">
			<c:out value="InvoiceDocumentReference List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.accountingdocumentreference.invoicedocumentreference.documentreference" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editInvoiceDocumentReferenceList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- SelfBilledInvoiceDocumentReference list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.accountingdocumentreference.selfbilledinvoicedocumentreference.documentreference" />:</td>
			<td class="form_tdispcol">
			<c:out value="SelfBilledInvoiceDocumentReference List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.accountingdocumentreference.selfbilledinvoicedocumentreference.documentreference" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editSelfBilledInvoiceDocumentReferenceList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- CreditNoteDocumentReference list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.accountingdocumentreference.creditnotedocumentreference.documentreference" />:</td>
			<td class="form_tdispcol">
			<c:out value="CreditNoteDocumentReference List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.accountingdocumentreference.creditnotedocumentreference.documentreference" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editCreditNoteDocumentReferenceList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- SelfBilledCreditNoteDocumentReference list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.accountingdocumentreference.selfbilledcreditnotedocumentreference.documentreference" />:</td>
			<td class="form_tdispcol">
			<c:out value="SelfBilledCreditNoteDocumentReference List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.accountingdocumentreference.selfbilledcreditnotedocumentreference.documentreference" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editSelfBilledCreditNoteDocumentReferenceList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- DebitNoteDocumentReference list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.accountingdocumentreference.debitnotedocumentreference.documentreference" />:</td>
			<td class="form_tdispcol">
			<c:out value="DebitNoteDocumentReference List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.accountingdocumentreference.debitnotedocumentreference.documentreference" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editDebitNoteDocumentReferenceList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- RemittanceDocumentReference list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.accountingdocumentreference.remittancedocumentreference.documentreference" />:</td>
			<td class="form_tdispcol">
			<c:out value="RemittanceDocumentReference List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.accountingdocumentreference.remittancedocumentreference.documentreference" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editRemittanceDocumentReferenceList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.accountingdocumentreference.paymentmeans" />:</td>
			<td class="form_tdispcol">
			<c:out value="${accountingDocumentReference.paymentMeans.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.accountingdocumentreference.paymentmeans" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editPaymentMeans" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- PaymentTerms list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.accountingdocumentreference.paymentterms" />:</td>
			<td class="form_tdispcol">
			<c:out value="PaymentTerms List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.accountingdocumentreference.paymentterms" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editPaymentTermsList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- LegalTotal list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.accountingdocumentreference.legaltotal" />:</td>
			<td class="form_tdispcol">
			<c:out value="LegalTotal List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.accountingdocumentreference.legaltotal" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editLegalTotalList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- TaxTotal list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.accountingdocumentreference.taxtotal" />:</td>
			<td class="form_tdispcol">
			<c:out value="TaxTotal List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.accountingdocumentreference.taxtotal" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editTaxTotalList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- self-referential subflow: editAccountingDocumentReferenceLine -->
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