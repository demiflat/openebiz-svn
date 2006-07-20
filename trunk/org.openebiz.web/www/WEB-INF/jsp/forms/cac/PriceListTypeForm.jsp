<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.pricelist.details" /></legend>
		<spring:hasBindErrors name="priceList">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<spring:nestedPath path="priceList">
		<table class="form_tbody">
		<!-- form element start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.pricelist.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${priceList.ID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.pricelist.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editID" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.pricelist.status.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${priceList.statusCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.pricelist.status.code" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editStatusCode" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
<!-- ValidityPeriod list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.pricelist.validityperiod.period" />:</td>
			<td class="form_tdispcol">
			<c:out value="ValidityPeriod List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.pricelist.validityperiod.period" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editValidityPeriodList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- self-referential subflow: editPreviousPriceList -->
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