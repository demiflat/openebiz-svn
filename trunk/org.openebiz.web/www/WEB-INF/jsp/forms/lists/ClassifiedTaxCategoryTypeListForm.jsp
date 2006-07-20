<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend>Classified Tax Category List</legend>
		<spring:hasBindErrors name="classifiedTaxCategoryList">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<table class="form_tbody">
		<!-- form element start -->
		<tr class="form_thead">
		<th>ID</th>
		<th>Name</th>
		<th>Percent</th>
		<th>Base Unit Measure</th>
		<th>Per Unit Amount</th>
		<th>Tier Range</th>
		<th>Tier Rate Percent</th>
		<th>Tax Scheme</th>
		</tr>
		<c:if test="${not empty classifiedTaxCategoryList}">
			<c:forEach items="${classifiedTaxCategoryList}" var="item" varStatus="status">
			<tr>
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.ID.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.name.languageID}" />:
				<c:out value="${item.name.value}" />			
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<fmt:formatNumber type="percent" value="${item.percent.value}" />
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
				<td class="form_titem"><c:out value="${item.taxScheme.shortDisplay}" /></td>
				<!-- type specific end -->
			</tr>
			</c:forEach>
		</c:if>	
		<!-- form element end -->
		</table>
		<div class="submitButtons">
			<input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}" />
			<input type="submit" class="button" name="_eventId_addClassifiedTaxCategory" value="<fmt:message key="ui.button.add" />" />
			<input type="submit" class="button" name="_eventId_clearClassifiedTaxCategory" value="<fmt:message key="ui.button.clear" />" />
			<input type="submit" class="button" name="_eventId_submit" value="<fmt:message key="ui.button.submit" />" />
		</div>
	</fieldset>
	</div>
</form>
<!--  end form -->
<%@ include file="/WEB-INF/jsp/forms/formFooter.jsp" %>