<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.statement.details" /></legend>
		<spring:hasBindErrors name="statement">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<spring:nestedPath path="statement">
		<table class="form_tbody">
		<!-- form element start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.statement.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${statement.ID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.statement.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editID" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.statement.copyindicator.indicator" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${statement.copyIndicator.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.statement.copyindicator.indicator" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editCopyIndicator" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.statement.globallyuniqueidentifier.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${statement.GUID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.statement.globallyuniqueidentifier.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editGUID" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.statement.issuedate.date" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:if test="${not empty statement.issueDate.value}">
			<fmt:formatDate value="${statement.issueDate.asDateType}" type="date" pattern="yyyy/MM/dd" />
			</c:if>
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.statement.issuedate.date" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editIssueDate" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.statement.issuetime.time" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:if test="${not empty statement.issueTime.value}">
			<fmt:formatDate value="${statement.issueTime.asDateType}" type="time" timeStyle="short" />
			</c:if>
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.statement.issuetime.time" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editIssueTime" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.statement.note.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${statement.note.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.statement.note.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editNote" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.statement.documentcurrency.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${statement.documentCurrencyCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.statement.documentcurrency.code" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editDocumentCurrencyCode" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.statement.totaldebitamount.amount" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<fmt:formatNumber minFractionDigits="2"  value="${statement.totalDebitAmount.value}" />
			<c:out value="${statement.totalDebitAmount.currencyID.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.statement.totaldebitamount.amount" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editTotalDebitAmount" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>		
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.statement.totalcreditamount.amount" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<fmt:formatNumber minFractionDigits="2"  value="${statement.totalCreditAmount.value}" />
			<c:out value="${statement.totalCreditAmount.currencyID.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.statement.totalcreditamount.amount" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editTotalCreditAmount" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>		
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.statement.totalbalanceamount.amount" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<fmt:formatNumber minFractionDigits="2"  value="${statement.totalBalanceAmount.value}" />
			<c:out value="${statement.totalBalanceAmount.currencyID.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.statement.totalbalanceamount.amount" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editTotalBalanceAmount" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>		
	
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.statement.statementperiod.period" />:</td>
			<td class="form_tdispcol">
			<c:out value="${statement.statementPeriod.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.statement.statementperiod.period" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editStatementPeriod" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- AdditionalDocumentReference list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.statement.additionaldocumentreference.documentreference" />:</td>
			<td class="form_tdispcol">
			<c:out value="AdditionalDocumentReference List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.statement.additionaldocumentreference.documentreference" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editAdditionalDocumentReferenceList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- AdditionalDocumentReference list element end-->		
<!-- Signature list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.statement.signature" />:</td>
			<td class="form_tdispcol">
			<c:out value="Signature List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.statement.signature" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editSignatureList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- Signature list element end-->		
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.statement.creditorsupplierparty.supplierparty" />:</td>
			<td class="form_tdispcol">
			<c:out value="${statement.creditorSupplierParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.statement.creditorsupplierparty.supplierparty" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editCreditorSupplierParty" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.statement.debtorcustomerparty.customerparty" />:</td>
			<td class="form_tdispcol">
			<c:out value="${statement.debtorCustomerParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.statement.debtorcustomerparty.customerparty" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editDebtorCustomerParty" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.statement.buyercustomerparty.customerparty" />:</td>
			<td class="form_tdispcol">
			<c:out value="${statement.buyerCustomerParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.statement.buyercustomerparty.customerparty" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editBuyerCustomerParty" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.statement.sellersupplierparty.supplierparty" />:</td>
			<td class="form_tdispcol">
			<c:out value="${statement.sellerSupplierParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.statement.sellersupplierparty.supplierparty" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editSellerSupplierParty" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.statement.originatorcustomerparty.customerparty" />:</td>
			<td class="form_tdispcol">
			<c:out value="${statement.originatorCustomerParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.statement.originatorcustomerparty.customerparty" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editOriginatorCustomerParty" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.statement.payeeparty.party" />:</td>
			<td class="form_tdispcol">
			<c:out value="${statement.payeeParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.statement.payeeparty.party" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editPayeeParty" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.statement.paymentmeans" />:</td>
			<td class="form_tdispcol">
			<c:out value="${statement.paymentMeans.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.statement.paymentmeans" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editPaymentMeans" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- PaymentTerms list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.statement.paymentterms" />:</td>
			<td class="form_tdispcol">
			<c:out value="PaymentTerms List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.statement.paymentterms" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editPaymentTermsList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- PaymentTerms list element end-->		
<!-- AllowanceCharge list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.statement.allowancecharge" />:</td>
			<td class="form_tdispcol">
			<c:out value="AllowanceCharge List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.statement.allowancecharge" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editAllowanceChargeList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- AllowanceCharge list element end-->		
<!-- TaxTotal list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.statement.taxtotal" />:</td>
			<td class="form_tdispcol">
			<c:out value="TaxTotal List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.statement.taxtotal" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editTaxTotalList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- TaxTotal list element end-->		
<!-- StatementLine list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.statement.statementline" />:</td>
			<td class="form_tdispcol">
			<c:out value="StatementLine List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.statement.statementline" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editStatementLineList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- StatementLine list element end-->		
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