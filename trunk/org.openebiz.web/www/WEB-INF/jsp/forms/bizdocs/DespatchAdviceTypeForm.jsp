<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.despatchadvice.details" /></legend>
		<spring:hasBindErrors name="despatchAdvice">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<spring:nestedPath path="despatchAdvice">
		<table class="form_tbody">
		<!-- form element start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.despatchadvice.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${despatchAdvice.ID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.despatchadvice.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editID" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.despatchadvice.copyindicator.indicator" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${despatchAdvice.copyIndicator.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.despatchadvice.copyindicator.indicator" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editCopyIndicator" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.despatchadvice.globallyuniqueidentifier.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${despatchAdvice.GUID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.despatchadvice.globallyuniqueidentifier.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editGUID" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.despatchadvice.issuedate.date" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:if test="${not empty despatchAdvice.issueDate.value}">
			<fmt:formatDate value="${despatchAdvice.issueDate.asDateType}" type="date" pattern="yyyy/MM/dd" />
			</c:if>
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.despatchadvice.issuedate.date" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editIssueDate" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.despatchadvice.issuetime.time" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:if test="${not empty despatchAdvice.issueTime.value}">
			<fmt:formatDate value="${despatchAdvice.issueTime.asDateType}" type="time" timeStyle="short" />
			</c:if>
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.despatchadvice.issuetime.time" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editIssueTime" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.despatchadvice.documentstatus.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${despatchAdvice.documentStatusCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.despatchadvice.documentstatus.code" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editDocumentStatusCode" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.despatchadvice.despatchadvicetype.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${despatchAdvice.despatchAdviceTypeCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.despatchadvice.despatchadvicetype.code" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editDespatchAdviceTypeCode" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.despatchadvice.note.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${despatchAdvice.note.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.despatchadvice.note.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editNote" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
<!-- OrderReference list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.despatchadvice.orderreference" />:</td>
			<td class="form_tdispcol">
			<c:out value="OrderReference List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.despatchadvice.orderreference" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editOrderReferenceList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- OrderReference list element end-->		
<!-- AdditionalDocumentReference list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.despatchadvice.additionaldocumentreference.documentreference" />:</td>
			<td class="form_tdispcol">
			<c:out value="AdditionalDocumentReference List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.despatchadvice.additionaldocumentreference.documentreference" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editAdditionalDocumentReferenceList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- AdditionalDocumentReference list element end-->		
<!-- Signature list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.despatchadvice.signature" />:</td>
			<td class="form_tdispcol">
			<c:out value="Signature List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.despatchadvice.signature" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editSignatureList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- Signature list element end-->		
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.despatchadvice.buyercustomerparty.customerparty" />:</td>
			<td class="form_tdispcol">
			<c:out value="${despatchAdvice.buyerCustomerParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.despatchadvice.buyercustomerparty.customerparty" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editBuyerCustomerParty" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.despatchadvice.sellersupplierparty.supplierparty" />:</td>
			<td class="form_tdispcol">
			<c:out value="${despatchAdvice.sellerSupplierParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.despatchadvice.sellersupplierparty.supplierparty" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editSellerSupplierParty" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.despatchadvice.originatorcustomerparty.customerparty" />:</td>
			<td class="form_tdispcol">
			<c:out value="${despatchAdvice.originatorCustomerParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.despatchadvice.originatorcustomerparty.customerparty" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editOriginatorCustomerParty" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.despatchadvice.shipment" />:</td>
			<td class="form_tdispcol">
			<c:out value="${despatchAdvice.shipment.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.despatchadvice.shipment" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editShipment" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- DespatchLine list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.despatchadvice.despatchline" />:</td>
			<td class="form_tdispcol">
			<c:out value="DespatchLine List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.despatchadvice.despatchline" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editDespatchLineList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- DespatchLine list element end-->		
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