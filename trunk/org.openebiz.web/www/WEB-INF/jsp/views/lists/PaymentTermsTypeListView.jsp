<%@ include file="/WEB-INF/jsp/views/viewHeader.jsp" %>
<form action="openebiz" method="post">
	<div class="form_wrapper">
	<fieldset>
		<legend>Payment Terms List</legend>
		<table class="form_tbody">
		<!-- element view start -->
		<tr class="form_thead">
		<th>ID</th>
		<th>Note</th>
		<th>Reference Event Code</th>
		<th>Settlement Discount Percent</th>
		<th>Penalty Surcharge Percent</th>
		<th>Amount</th>
		<th>Period</th>
		<th>Period</th>
		<th>Payment Means</th>
		</tr>
		<c:if test="${not empty paymentTermsList}">
			<c:forEach items="${paymentTermsList}" var="item" varStatus="status">
			<tr>
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.ID.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.note.languageID}" />:
				<c:out value="${item.note.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.referenceEventCode.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<fmt:formatNumber type="percent" value="${item.settlementDiscountPercent.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<fmt:formatNumber type="percent" value="${item.penaltySurchargePercent.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<fmt:formatNumber minFractionDigits="2"  value="${item.amount.value}" />
				<c:out value="${item.amount.currencyID.literal}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem"><c:out value="${item.settlementPeriod.shortDisplay}" /></td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem"><c:out value="${item.penaltyPeriod.shortDisplay}" /></td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem"><c:out value="${item.paymentMeans.shortDisplay}" /></td>
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