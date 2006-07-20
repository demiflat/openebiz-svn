<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.catalogue.details" /></legend>
		<spring:hasBindErrors name="catalogue">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<spring:nestedPath path="catalogue">
		<table class="form_tbody">
		<!-- form element start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.catalogue.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${catalogue.ID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.catalogue.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editID" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.catalogue.globallyuniqueidentifier.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${catalogue.GUID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.catalogue.globallyuniqueidentifier.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editGUID" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.catalogue.name" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${catalogue.name.value}" />			
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.catalogue.name" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editName" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.catalogue.issuedate.date" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:if test="${not empty catalogue.issueDate.value}">
			<fmt:formatDate value="${catalogue.issueDate.asDateType}" type="date" pattern="yyyy/MM/dd" />
			</c:if>
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.catalogue.issuedate.date" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editIssueDate" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.catalogue.issuetime.time" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:if test="${not empty catalogue.issueTime.value}">
			<fmt:formatDate value="${catalogue.issueTime.asDateType}" type="time" timeStyle="short" />
			</c:if>
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.catalogue.issuetime.time" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editIssueTime" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.catalogue.revisiondatetime.datetime" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:if test="${not empty catalogue.revisionDateTime.value}">
			<fmt:formatDate value="${catalogue.revisionDateTime.asDateType}" type="date" pattern="yyyy/MM/dd" />
			</c:if>
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.catalogue.revisiondatetime.datetime" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editRevisionDateTime" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
<!-- Note list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.catalogue.note.text" />:</td>
			<td class="form_tdispcol">
			<c:out value="Note List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.catalogue.note.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editNoteList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- Note list element end-->		
<!-- Description list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.catalogue.description.text" />:</td>
			<td class="form_tdispcol">
			<c:out value="Description List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.catalogue.description.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editDescriptionList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- Description list element end-->		
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.catalogue.version.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${catalogue.versionID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.catalogue.version.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editVersionID" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.catalogue.previousversion.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${catalogue.previousVersionID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.catalogue.previousversion.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editPreviousVersionID" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>							
	
<!-- ValidityPeriod list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.catalogue.validityperiod.period" />:</td>
			<td class="form_tdispcol">
			<c:out value="ValidityPeriod List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.catalogue.validityperiod.period" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editValidityPeriodList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- ValidityPeriod list element end-->		
<!-- ReferencedContract list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.catalogue.referencedcontract.contract" />:</td>
			<td class="form_tdispcol">
			<c:out value="ReferencedContract List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.catalogue.referencedcontract.contract" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editReferencedContractList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- ReferencedContract list element end-->		
<!-- Signature list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.catalogue.signature" />:</td>
			<td class="form_tdispcol">
			<c:out value="Signature List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.catalogue.signature" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editSignatureList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- Signature list element end-->		
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.catalogue.sellersupplierparty.supplierparty" />:</td>
			<td class="form_tdispcol">
			<c:out value="${catalogue.sellerSupplierParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.catalogue.sellersupplierparty.supplierparty" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editSellerSupplierParty" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.catalogue.cataloguemanagingparty.party" />:</td>
			<td class="form_tdispcol">
			<c:out value="${catalogue.catalogueManagingParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.catalogue.cataloguemanagingparty.party" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editCatalogueManagingParty" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- TradingTerms list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.catalogue.tradingterms" />:</td>
			<td class="form_tdispcol">
			<c:out value="TradingTerms List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.catalogue.tradingterms" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editTradingTermsList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- TradingTerms list element end-->		
<!-- CatalogueLine list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.catalogue.catalogueline" />:</td>
			<td class="form_tdispcol">
			<c:out value="CatalogueLine List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.catalogue.catalogueline" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editCatalogueLineList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- CatalogueLine list element end-->		
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