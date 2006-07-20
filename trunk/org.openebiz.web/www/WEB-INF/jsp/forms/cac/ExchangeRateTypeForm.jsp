<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.exchangerate.details" /></legend>
		<spring:hasBindErrors name="exchangeRate">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<spring:nestedPath path="exchangeRate">
		<table class="form_tbody">
		<!-- form element start -->
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.exchangerate.sourcecurrency.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${exchangeRate.sourceCurrencyCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.exchangerate.sourcecurrency.code" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editSourceCurrencyCode" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.exchangerate.sourcecurrencybaserate.rate" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<fmt:formatNumber minFractionDigits="2"  value="${exchangeRate.sourceCurrencyBaseRate.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.exchangerate.sourcecurrencybaserate.rate" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editSourceCurrencyBaseRate" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.exchangerate.targetcurrency.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${exchangeRate.targetCurrencyCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.exchangerate.targetcurrency.code" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editTargetCurrencyCode" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.exchangerate.targetcurrencybaserate.rate" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<fmt:formatNumber minFractionDigits="2"  value="${exchangeRate.targetCurrencyBaseRate.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.exchangerate.targetcurrencybaserate.rate" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editTargetCurrencyBaseRate" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.exchangerate.exchangemarketidentifier.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${exchangeRate.exchangeMarketID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.exchangerate.exchangemarketidentifier.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editExchangeMarketID" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>							
	
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.exchangerate.calculationrate.rate" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<fmt:formatNumber minFractionDigits="2"  value="${exchangeRate.calculationRate.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.exchangerate.calculationrate.rate" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editCalculationRate" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.exchangerate.operator.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${exchangeRate.operatorCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.exchangerate.operator.code" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editOperatorCode" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.exchangerate.date" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:if test="${not empty exchangeRate.date.value}">
			<fmt:formatDate value="${exchangeRate.date.asDateType}" type="date" pattern="yyyy/MM/dd" />
			</c:if>		
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.exchangerate.date" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editDate" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.exchangerate.foreignexchangecontract.contract" />:</td>
			<td class="form_tdispcol">
			<c:out value="${exchangeRate.foreignExchangeContract.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.exchangerate.foreignexchangecontract.contract" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editForeignExchangeContract" value="<fmt:message key="ui.button.edit" />" /></td>
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