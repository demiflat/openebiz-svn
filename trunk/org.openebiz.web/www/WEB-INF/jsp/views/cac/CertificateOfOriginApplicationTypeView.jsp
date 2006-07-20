<%@ include file="/WEB-INF/jsp/views/viewHeader.jsp" %>
<form action="openebiz" method="post">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.certificateoforiginapplication.details" /></legend>
			<table class="form_tbody">
			<!-- element view start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.certificateoforiginapplication.reference.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${certificateOfOriginApplication.referenceID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.certificateoforiginapplication.reference.identifier" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.certificateoforiginapplication.certificatetype.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${certificateOfOriginApplication.certificateType.languageID}" />:
			<c:out value="${certificateOfOriginApplication.certificateType.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.certificateoforiginapplication.certificatetype.text" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.certificateoforiginapplication.status.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${certificateOfOriginApplication.statusCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.certificateoforiginapplication.status.code" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.certificateoforiginapplication.originaljob.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${certificateOfOriginApplication.originalJobID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.certificateoforiginapplication.originaljob.identifier" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.certificateoforiginapplication.previousjob.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${certificateOfOriginApplication.previousJobID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.certificateoforiginapplication.previousjob.identifier" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.certificateoforiginapplication.remarks.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${certificateOfOriginApplication.remarks.languageID}" />:
			<c:out value="${certificateOfOriginApplication.remarks.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.certificateoforiginapplication.remarks.text" />" /></td>
		</tr>				
	
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.certificateoforiginapplication.shipment" />:</td>
			<td class="form_tdispcol">
			<c:out value="${certificateOfOriginApplication.shipment.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.certificateoforiginapplication.shipment" />" /></td>
		</tr>
<!-- cac item end -->
<!-- EndorserParty list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.certificateoforiginapplication.endorserparty" />:</td>
			<td class="form_tdispcol">
			<c:out value="EndorserParty List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.certificateoforiginapplication.endorserparty" />" /></td>
		</tr>
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.certificateoforiginapplication.preparationparty.party" />:</td>
			<td class="form_tdispcol">
			<c:out value="${certificateOfOriginApplication.preparationParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.certificateoforiginapplication.preparationparty.party" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.certificateoforiginapplication.issuerparty.party" />:</td>
			<td class="form_tdispcol">
			<c:out value="${certificateOfOriginApplication.issuerParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.certificateoforiginapplication.issuerparty.party" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.certificateoforiginapplication.issuingcountry.country" />:</td>
			<td class="form_tdispcol">
			<c:out value="${certificateOfOriginApplication.issuingCountry.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.certificateoforiginapplication.issuingcountry.country" />" /></td>
		</tr>
<!-- cac item end -->
<!-- DocumentDistribution list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.certificateoforiginapplication.documentdistribution" />:</td>
			<td class="form_tdispcol">
			<c:out value="DocumentDistribution List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.certificateoforiginapplication.documentdistribution" />" /></td>
		</tr>
<!-- SupportingDocumentReference list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.certificateoforiginapplication.supportingdocumentreference.documentreference" />:</td>
			<td class="form_tdispcol">
			<c:out value="SupportingDocumentReference List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.certificateoforiginapplication.supportingdocumentreference.documentreference" />" /></td>
		</tr>
<!-- Signature list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.certificateoforiginapplication.signature" />:</td>
			<td class="form_tdispcol">
			<c:out value="Signature List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.certificateoforiginapplication.signature" />" /></td>
		</tr>
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