<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.deliveryterms.details" /></legend>
		<spring:hasBindErrors name="deliveryTerms">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<spring:nestedPath path="deliveryTerms">
		<table class="form_tbody">
		<!-- form element start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.deliveryterms.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${deliveryTerms.ID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.deliveryterms.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editID" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.deliveryterms.relevantlocationconditions.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${deliveryTerms.relevantLocationConditions.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.deliveryterms.relevantlocationconditions.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editRelevantLocationConditions" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.deliveryterms.specialterms.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${deliveryTerms.specialTerms.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.deliveryterms.specialterms.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editSpecialTerms" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.deliveryterms.lossriskresponsibility.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${deliveryTerms.lossRiskResponsibilityCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.deliveryterms.lossriskresponsibility.code" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editLossRiskResponsibilityCode" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.deliveryterms.lossrisk.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${deliveryTerms.lossRisk.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.deliveryterms.lossrisk.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editLossRisk" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.deliveryterms.allowancecharge" />:</td>
			<td class="form_tdispcol">
			<c:out value="${deliveryTerms.allowanceCharge.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.deliveryterms.allowancecharge" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editAllowanceCharge" value="<fmt:message key="ui.button.edit" />" /></td>
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