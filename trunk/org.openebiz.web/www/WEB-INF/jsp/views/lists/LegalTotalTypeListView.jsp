<%@ include file="/WEB-INF/jsp/views/viewHeader.jsp" %>
<form action="openebiz" method="post">
	<div class="form_wrapper">
	<fieldset>
		<legend>Legal Total List</legend>
		<table class="form_tbody">
		<!-- element view start -->
		<tr class="form_thead">
		<th>Line Extension Amount</th>
		<th>Tax Exclusive Amount</th>
		<th>Tax Inclusive Amount</th>
		<th>Prepaid Amount</th>
		<th>Line Extension Rounding Amount</th>
		<th>To Be Paid Amount</th>
		</tr>
		<c:if test="${not empty legalTotalList}">
			<c:forEach items="${legalTotalList}" var="item" varStatus="status">
			<tr>
				<!-- type specific start -->
				<td class="form_titem">
				<fmt:formatNumber minFractionDigits="2"  value="${item.lineExtensionAmount.value}" />
				<c:out value="${item.lineExtensionAmount.currencyID.literal}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<fmt:formatNumber minFractionDigits="2"  value="${item.taxExclusiveAmount.value}" />
				<c:out value="${item.taxExclusiveAmount.currencyID.literal}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<fmt:formatNumber minFractionDigits="2"  value="${item.taxInclusiveAmount.value}" />
				<c:out value="${item.taxInclusiveAmount.currencyID.literal}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<fmt:formatNumber minFractionDigits="2"  value="${item.prepaidAmount.value}" />
				<c:out value="${item.prepaidAmount.currencyID.literal}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<fmt:formatNumber minFractionDigits="2"  value="${item.lineExtensionRoundingAmount.value}" />
				<c:out value="${item.lineExtensionRoundingAmount.currencyID.literal}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<fmt:formatNumber minFractionDigits="2"  value="${item.toBePaidAmount.value}" />
				<c:out value="${item.toBePaidAmount.currencyID.literal}" />
				</td>
				<!-- type specific end -->
			</tr>
			</c:forEach>
		</c:if>	
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