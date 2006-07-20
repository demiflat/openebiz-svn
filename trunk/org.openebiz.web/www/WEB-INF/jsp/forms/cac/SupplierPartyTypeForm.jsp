<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.supplierparty.details" /></legend>
		<spring:hasBindErrors name="supplierParty">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<spring:nestedPath path="supplierParty">
		<table class="form_tbody">
		<!-- form element start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.supplierparty.customerassignedaccountidentifier.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${supplierParty.customerAssignedAccountID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.supplierparty.customerassignedaccountidentifier.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editCustomerAssignedAccountID" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.supplierparty.supplierassignedaccountidentifier.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${supplierParty.supplierAssignedAccountID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.supplierparty.supplierassignedaccountidentifier.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editSupplierAssignedAccountID" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>							
	
<!-- AdditionalAccountID list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.supplierparty.additionalaccountidentifier.identifier" />:</td>
			<td class="form_tdispcol">
			<c:out value="AdditionalAccountID List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.supplierparty.additionalaccountidentifier.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editAdditionalAccountIDList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.supplierparty.datasendingcapability.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${supplierParty.dataSendingCapability.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.supplierparty.datasendingcapability.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editDataSendingCapability" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.supplierparty.party" />:</td>
			<td class="form_tdispcol">
			<c:out value="${supplierParty.party.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.supplierparty.party" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editParty" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.supplierparty.shippingcontact.contact" />:</td>
			<td class="form_tdispcol">
			<c:out value="${supplierParty.shippingContact.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.supplierparty.shippingcontact.contact" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editShippingContact" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.supplierparty.accountscontact.contact" />:</td>
			<td class="form_tdispcol">
			<c:out value="${supplierParty.accountsContact.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.supplierparty.accountscontact.contact" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editAccountsContact" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.supplierparty.ordercontact.contact" />:</td>
			<td class="form_tdispcol">
			<c:out value="${supplierParty.orderContact.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.supplierparty.ordercontact.contact" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editOrderContact" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
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