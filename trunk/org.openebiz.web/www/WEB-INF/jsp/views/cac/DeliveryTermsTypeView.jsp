<%@ include file="/WEB-INF/jsp/views/viewHeader.jsp" %>
<form action="openebiz" method="post">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.deliveryterms.details" /></legend>
			<table class="form_tbody">
			<!-- element view start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.deliveryterms.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${deliveryTerms.ID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.deliveryterms.identifier" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.deliveryterms.relevantlocationconditions.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${deliveryTerms.relevantLocationConditions.languageID}" />:
			<c:out value="${deliveryTerms.relevantLocationConditions.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.deliveryterms.relevantlocationconditions.text" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.deliveryterms.specialterms.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${deliveryTerms.specialTerms.languageID}" />:
			<c:out value="${deliveryTerms.specialTerms.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.deliveryterms.specialterms.text" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.deliveryterms.lossriskresponsibility.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${deliveryTerms.lossRiskResponsibilityCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.deliveryterms.lossriskresponsibility.code" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.deliveryterms.lossrisk.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${deliveryTerms.lossRisk.languageID}" />:
			<c:out value="${deliveryTerms.lossRisk.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.deliveryterms.lossrisk.text" />" /></td>
		</tr>				
	
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.deliveryterms.allowancecharge" />:</td>
			<td class="form_tdispcol">
			<c:out value="${deliveryTerms.allowanceCharge.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.deliveryterms.allowancecharge" />" /></td>
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