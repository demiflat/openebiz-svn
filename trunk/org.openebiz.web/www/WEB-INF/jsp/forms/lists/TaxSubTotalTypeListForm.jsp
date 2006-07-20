<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend>Tax Sub Total List</legend>
		<spring:hasBindErrors name="taxSubTotalList">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<table class="form_tbody">
		<!-- form element start -->
		<tr class="form_thead">
		<th>Taxable Amount</th>
		<th>Tax Amount</th>
		<th>Calculation Sequence Numeric</th>
		<th>Transaction Currency Tax Amount</th>
		<th>Percent</th>
		<th>Exemption Reason</th>
		<th>Base Unit Measure</th>
		<th>Per Unit Amount</th>
		<th>Tier Range</th>
		<th>Tier Rate Percent</th>
		<th>Tax Category</th>
		</tr>
		<c:if test="${not empty taxSubTotalList}">
			<c:forEach items="${taxSubTotalList}" var="item" varStatus="status">
			<tr>
				<!-- type specific start -->
				<td class="form_titem">
				<fmt:formatNumber minFractionDigits="2"  value="${item.taxableAmount.value}" />
				<c:out value="${item.taxableAmount.currencyID.literal}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<fmt:formatNumber minFractionDigits="2"  value="${item.taxAmount.value}" />
				<c:out value="${item.taxAmount.currencyID.literal}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<fmt:formatNumber minFractionDigits="2"  value="${item.calculationSequenceNumeric.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<fmt:formatNumber minFractionDigits="2"  value="${item.transactionCurrencyTaxAmount.value}" />
				<c:out value="${item.transactionCurrencyTaxAmount.currencyID.literal}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<fmt:formatNumber type="percent" value="${item.percent.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.exemptionReason.languageID}" />:
				<c:out value="${item.exemptionReason.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.baseUnitMeasure.value}" />
				<c:out value="${item.baseUnitMeasure.unitCode.literal}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<fmt:formatNumber minFractionDigits="2"  value="${item.perUnitAmount.value}" />
				<c:out value="${item.perUnitAmount.currencyID.literal}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.tierRange.languageID}" />:
				<c:out value="${item.tierRange.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<fmt:formatNumber type="percent" value="${item.tierRatePercent.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem"><c:out value="${item.taxCategory.shortDisplay}" /></td>
				<!-- type specific end -->
			</tr>
			</c:forEach>
		</c:if>	
		<!-- form element end -->
		</table>
		<div class="submitButtons">
			<input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}" />
			<input type="submit" class="button" name="_eventId_addTaxSubTotal" value="<fmt:message key="ui.button.add" />" />
			<input type="submit" class="button" name="_eventId_clearTaxSubTotal" value="<fmt:message key="ui.button.clear" />" />
			<input type="submit" class="button" name="_eventId_submit" value="<fmt:message key="ui.button.submit" />" />
		</div>
	</fieldset>
	</div>
</form>
<!--  end form -->
<%@ include file="/WEB-INF/jsp/forms/formFooter.jsp" %>