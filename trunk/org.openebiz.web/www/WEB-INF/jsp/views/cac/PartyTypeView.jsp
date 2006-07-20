<%@ include file="/WEB-INF/jsp/views/viewHeader.jsp" %>
<form action="openebiz" method="post">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.party.details" /></legend>
			<table class="form_tbody">
			<!-- element view start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.party.markcareindicator.indicator" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${party.markCareIndicator.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.party.markcareindicator.indicator" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.party.markattentionindicator.indicator" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${party.markAttentionIndicator.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.party.markattentionindicator.indicator" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.party.logoreference.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${party.logoReferenceID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.party.logoreference.identifier" />" /></td>
		</tr>							
	
<!-- PartyIdentification list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.party.partyidentification" />:</td>
			<td class="form_tdispcol">
			<c:out value="PartyIdentification List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.party.partyidentification" />" /></td>
		</tr>
<!-- PartyName list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.party.partyname" />:</td>
			<td class="form_tdispcol">
			<c:out value="PartyName List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.party.partyname" />" /></td>
		</tr>
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.party.language" />:</td>
			<td class="form_tdispcol">
			<c:out value="${party.language.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.party.language" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.party.address" />:</td>
			<td class="form_tdispcol">
			<c:out value="${party.address.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.party.address" />" /></td>
		</tr>
<!-- cac item end -->
<!-- PartyTaxScheme list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.party.partytaxscheme" />:</td>
			<td class="form_tdispcol">
			<c:out value="PartyTaxScheme List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.party.partytaxscheme" />" /></td>
		</tr>
<!-- PartyLegalEntity list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.party.partylegalentity" />:</td>
			<td class="form_tdispcol">
			<c:out value="PartyLegalEntity List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.party.partylegalentity" />" /></td>
		</tr>
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.party.contact" />:</td>
			<td class="form_tdispcol">
			<c:out value="${party.contact.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.party.contact" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.party.person" />:</td>
			<td class="form_tdispcol">
			<c:out value="${party.person.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.party.person" />" /></td>
		</tr>
<!-- cac item end -->
<!-- self-referential subflow: editAgentParty -->
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