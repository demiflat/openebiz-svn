<%@ include file="/WEB-INF/jsp/views/viewHeader.jsp" %>
<form action="openebiz" method="post">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.requestforquotation.details" /></legend>
			<table class="form_tbody">
			<!-- element view start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.requestforquotation.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${requestForQuotation.ID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.requestforquotation.identifier" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.requestforquotation.copyindicator.indicator" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${requestForQuotation.copyIndicator.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.requestforquotation.copyindicator.indicator" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.requestforquotation.globallyuniqueidentifier.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${requestForQuotation.GUID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.requestforquotation.globallyuniqueidentifier.identifier" />" /></td>
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
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.requestforquotation.note.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${requestForQuotation.note.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.requestforquotation.note.text" />" /></td>
		</tr>				
	
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.requestforquotation.transactioncurrency.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${requestForQuotation.transactionCurrencyCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.requestforquotation.transactioncurrency.code" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.requestforquotation.pricingcurrency.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${requestForQuotation.pricingCurrencyCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.requestforquotation.pricingcurrency.code" />" /></td>
		</tr>			
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.requestforquotation.cataloguedocumentreference.documentreference" />:</td>
			<td class="form_tdispcol">
			<c:out value="${requestForQuotation.catalogueDocumentReference.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.requestforquotation.cataloguedocumentreference.documentreference" />" /></td>
		</tr>
<!-- cac item end -->
<!-- AdditionalDocumentReference list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.requestforquotation.additionaldocumentreference.documentreference" />:</td>
			<td class="form_tdispcol">
			<c:out value="AdditionalDocumentReference List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.requestforquotation.additionaldocumentreference.documentreference" />" /></td>
		</tr>		
<!-- Signature list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.requestforquotation.signature" />:</td>
			<td class="form_tdispcol">
			<c:out value="Signature List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.requestforquotation.signature" />" /></td>
		</tr>		
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.requestforquotation.originatorcustomerparty.customerparty" />:</td>
			<td class="form_tdispcol">
			<c:out value="${requestForQuotation.originatorCustomerParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.requestforquotation.originatorcustomerparty.customerparty" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.requestforquotation.sellersupplierparty.supplierparty" />:</td>
			<td class="form_tdispcol">
			<c:out value="${requestForQuotation.sellerSupplierParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.requestforquotation.sellersupplierparty.supplierparty" />" /></td>
		</tr>
<!-- cac item end -->
<!-- Delivery list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.requestforquotation.delivery" />:</td>
			<td class="form_tdispcol">
			<c:out value="Delivery List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.requestforquotation.delivery" />" /></td>
		</tr>		
<!-- DeliveryTerms list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.requestforquotation.deliveryterms" />:</td>
			<td class="form_tdispcol">
			<c:out value="DeliveryTerms List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.requestforquotation.deliveryterms" />" /></td>
		</tr>		
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.requestforquotation.destinationcountry.country" />:</td>
			<td class="form_tdispcol">
			<c:out value="${requestForQuotation.destinationCountry.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.requestforquotation.destinationcountry.country" />" /></td>
		</tr>
<!-- cac item end -->
<!-- Contract list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.requestforquotation.contract" />:</td>
			<td class="form_tdispcol">
			<c:out value="Contract List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.requestforquotation.contract" />" /></td>
		</tr>		
<!-- RequestForQuotationLine list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.requestforquotation.requestforquotationline" />:</td>
			<td class="form_tdispcol">
			<c:out value="RequestForQuotationLine List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.requestforquotation.requestforquotationline" />" /></td>
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