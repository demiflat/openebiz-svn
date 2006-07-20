<%@ include file="/WEB-INF/jsp/views/viewHeader.jsp" %>
<form action="openebiz" method="post">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.supplierparty.details" /></legend>
			<table class="form_tbody">
			<!-- element view start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.supplierparty.customerassignedaccountidentifier.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${supplierParty.customerAssignedAccountID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.supplierparty.customerassignedaccountidentifier.identifier" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.supplierparty.supplierassignedaccountidentifier.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${supplierParty.supplierAssignedAccountID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.supplierparty.supplierassignedaccountidentifier.identifier" />" /></td>
		</tr>							
	
<!-- AdditionalAccountID list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.supplierparty.additionalaccountidentifier.identifier" />:</td>
			<td class="form_tdispcol">
			<c:out value="AdditionalAccountID List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.supplierparty.additionalaccountidentifier.identifier" />" /></td>
		</tr>
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.supplierparty.datasendingcapability.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${supplierParty.dataSendingCapability.languageID}" />:
			<c:out value="${supplierParty.dataSendingCapability.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.supplierparty.datasendingcapability.text" />" /></td>
		</tr>				
	
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.supplierparty.party" />:</td>
			<td class="form_tdispcol">
			<c:out value="${supplierParty.party.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.supplierparty.party" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.supplierparty.shippingcontact.contact" />:</td>
			<td class="form_tdispcol">
			<c:out value="${supplierParty.shippingContact.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.supplierparty.shippingcontact.contact" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.supplierparty.accountscontact.contact" />:</td>
			<td class="form_tdispcol">
			<c:out value="${supplierParty.accountsContact.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.supplierparty.accountscontact.contact" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.supplierparty.ordercontact.contact" />:</td>
			<td class="form_tdispcol">
			<c:out value="${supplierParty.orderContact.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.supplierparty.ordercontact.contact" />" /></td>
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