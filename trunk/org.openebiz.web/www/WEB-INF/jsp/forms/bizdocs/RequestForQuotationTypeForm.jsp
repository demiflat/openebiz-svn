<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.requestforquotation.details" /></legend>
		<spring:hasBindErrors name="requestForQuotation">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<spring:nestedPath path="requestForQuotation">
		<table class="form_tbody">
		<!-- form element start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.requestforquotation.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${requestForQuotation.ID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.requestforquotation.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editID" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.requestforquotation.copyindicator.indicator" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${requestForQuotation.copyIndicator.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.requestforquotation.copyindicator.indicator" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editCopyIndicator" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.requestforquotation.globallyuniqueidentifier.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${requestForQuotation.GUID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.requestforquotation.globallyuniqueidentifier.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editGUID" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.requestforquotation.issuedate.date" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:if test="${not empty requestForQuotation.issueDate.value}">
			<fmt:formatDate value="${requestForQuotation.issueDate.asDateType}" type="date" pattern="yyyy/MM/dd" />
			</c:if>
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.requestforquotation.issuedate.date" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editIssueDate" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.requestforquotation.issuetime.time" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:if test="${not empty requestForQuotation.issueTime.value}">
			<fmt:formatDate value="${requestForQuotation.issueTime.asDateType}" type="time" timeStyle="short" />
			</c:if>
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.requestforquotation.issuetime.time" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editIssueTime" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.requestforquotation.note.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${requestForQuotation.note.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.requestforquotation.note.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editNote" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.requestforquotation.transactioncurrency.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${requestForQuotation.transactionCurrencyCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.requestforquotation.transactioncurrency.code" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editTransactionCurrencyCode" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.requestforquotation.pricingcurrency.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${requestForQuotation.pricingCurrencyCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.requestforquotation.pricingcurrency.code" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editPricingCurrencyCode" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.requestforquotation.cataloguedocumentreference.documentreference" />:</td>
			<td class="form_tdispcol">
			<c:out value="${requestForQuotation.catalogueDocumentReference.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.requestforquotation.cataloguedocumentreference.documentreference" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editCatalogueDocumentReference" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- AdditionalDocumentReference list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.requestforquotation.additionaldocumentreference.documentreference" />:</td>
			<td class="form_tdispcol">
			<c:out value="AdditionalDocumentReference List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.requestforquotation.additionaldocumentreference.documentreference" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editAdditionalDocumentReferenceList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- AdditionalDocumentReference list element end-->		
<!-- Signature list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.requestforquotation.signature" />:</td>
			<td class="form_tdispcol">
			<c:out value="Signature List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.requestforquotation.signature" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editSignatureList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- Signature list element end-->		
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.requestforquotation.originatorcustomerparty.customerparty" />:</td>
			<td class="form_tdispcol">
			<c:out value="${requestForQuotation.originatorCustomerParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.requestforquotation.originatorcustomerparty.customerparty" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editOriginatorCustomerParty" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.requestforquotation.sellersupplierparty.supplierparty" />:</td>
			<td class="form_tdispcol">
			<c:out value="${requestForQuotation.sellerSupplierParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.requestforquotation.sellersupplierparty.supplierparty" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editSellerSupplierParty" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- Delivery list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.requestforquotation.delivery" />:</td>
			<td class="form_tdispcol">
			<c:out value="Delivery List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.requestforquotation.delivery" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editDeliveryList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- Delivery list element end-->		
<!-- DeliveryTerms list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.requestforquotation.deliveryterms" />:</td>
			<td class="form_tdispcol">
			<c:out value="DeliveryTerms List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.requestforquotation.deliveryterms" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editDeliveryTermsList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- DeliveryTerms list element end-->		
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.requestforquotation.destinationcountry.country" />:</td>
			<td class="form_tdispcol">
			<c:out value="${requestForQuotation.destinationCountry.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.requestforquotation.destinationcountry.country" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editDestinationCountry" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- Contract list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.requestforquotation.contract" />:</td>
			<td class="form_tdispcol">
			<c:out value="Contract List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.requestforquotation.contract" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editContractList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- Contract list element end-->		
<!-- RequestForQuotationLine list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.requestforquotation.requestforquotationline" />:</td>
			<td class="form_tdispcol">
			<c:out value="RequestForQuotationLine List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.requestforquotation.requestforquotationline" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editRequestForQuotationLineList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- RequestForQuotationLine list element end-->		
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