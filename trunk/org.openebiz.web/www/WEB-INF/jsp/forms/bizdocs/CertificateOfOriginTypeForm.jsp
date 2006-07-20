<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.certificateoforigin.details" /></legend>
		<spring:hasBindErrors name="certificateOfOrigin">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<spring:nestedPath path="certificateOfOrigin">
		<table class="form_tbody">
		<!-- form element start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.certificateoforigin.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${certificateOfOrigin.ID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.certificateoforigin.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editID" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.certificateoforigin.globallyuniqueidentifier.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${certificateOfOrigin.GUID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.certificateoforigin.globallyuniqueidentifier.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editGUID" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.certificateoforigin.issuedate.date" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:if test="${not empty certificateOfOrigin.issueDate.value}">
			<fmt:formatDate value="${certificateOfOrigin.issueDate.asDateType}" type="date" pattern="yyyy/MM/dd" />
			</c:if>
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.certificateoforigin.issuedate.date" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editIssueDate" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.certificateoforigin.issuetime.time" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:if test="${not empty certificateOfOrigin.issueTime.value}">
			<fmt:formatDate value="${certificateOfOrigin.issueTime.asDateType}" type="time" timeStyle="short" />
			</c:if>
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.certificateoforigin.issuetime.time" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editIssueTime" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
<!-- Description list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.certificateoforigin.description.text" />:</td>
			<td class="form_tdispcol">
			<c:out value="Description List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.certificateoforigin.description.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editDescriptionList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- Description list element end-->		
<!-- Note list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.certificateoforigin.note.text" />:</td>
			<td class="form_tdispcol">
			<c:out value="Note List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.certificateoforigin.note.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editNoteList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- Note list element end-->		
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.certificateoforigin.versionidentifier.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${certificateOfOrigin.versionID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.certificateoforigin.versionidentifier.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editVersionID" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>							
	
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.certificateoforigin.exporterparty.party" />:</td>
			<td class="form_tdispcol">
			<c:out value="${certificateOfOrigin.exporterParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.certificateoforigin.exporterparty.party" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editExporterParty" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.certificateoforigin.importerparty.party" />:</td>
			<td class="form_tdispcol">
			<c:out value="${certificateOfOrigin.importerParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.certificateoforigin.importerparty.party" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editImporterParty" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- EndorserParty list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.certificateoforigin.endorserparty" />:</td>
			<td class="form_tdispcol">
			<c:out value="EndorserParty List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.certificateoforigin.endorserparty" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editEndorserPartyList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- EndorserParty list element end-->		
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.certificateoforigin.certificateoforiginapplication" />:</td>
			<td class="form_tdispcol">
			<c:out value="${certificateOfOrigin.certificateOfOriginApplication.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.certificateoforigin.certificateoforiginapplication" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editCertificateOfOriginApplication" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.certificateoforigin.issuerendorsement.endorsement" />:</td>
			<td class="form_tdispcol">
			<c:out value="${certificateOfOrigin.issuerEndorsement.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.certificateoforigin.issuerendorsement.endorsement" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editIssuerEndorsement" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.certificateoforigin.embassyendorsement.endorsement" />:</td>
			<td class="form_tdispcol">
			<c:out value="${certificateOfOrigin.embassyEndorsement.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.certificateoforigin.embassyendorsement.endorsement" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editEmbassyEndorsement" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.certificateoforigin.insuranceendorsement.endorsement" />:</td>
			<td class="form_tdispcol">
			<c:out value="${certificateOfOrigin.insuranceEndorsement.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.certificateoforigin.insuranceendorsement.endorsement" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editInsuranceEndorsement" value="<fmt:message key="ui.button.edit" />" /></td>
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