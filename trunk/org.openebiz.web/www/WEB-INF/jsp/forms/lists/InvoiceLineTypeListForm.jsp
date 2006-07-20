<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend>Invoice Line List</legend>
		<spring:hasBindErrors name="invoiceLineList">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<table class="form_tbody">
		<!-- form element start -->
		<tr class="form_thead">
		<th>ID</th>
		<th>GUID</th>
		<th>Note</th>
		<th>Invoiced Quantity</th>
		<th>Line Extension Amount</th>
		<th>Tax Point Date</th>
		<th>Accounting Cost Code</th>
		<th>Item</th>
		<th>Base Price</th>
		<th>Delivery Terms</th>
		</tr>
		<c:if test="${not empty invoiceLineList}">
			<c:forEach items="${invoiceLineList}" var="item" varStatus="status">
			<tr>
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.ID.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.GUID.value}" />
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
				<c:out value="${item.invoicedQuantity.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<fmt:formatNumber minFractionDigits="2"  value="${item.lineExtensionAmount.value}" />
				<c:out value="${item.lineExtensionAmount.currencyID.literal}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:if test="${not empty item.taxPointDate.value}">
				<fmt:formatDate value="${item.taxPointDate.asDateType}" type="date" pattern="yyyy/MM/dd" />
				</c:if>	
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.accountingCostCode.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem"><c:out value="${item.item.shortDisplay}" /></td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem"><c:out value="${item.basePrice.shortDisplay}" /></td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem"><c:out value="${item.deliveryTerms.shortDisplay}" /></td>
				<!-- type specific end -->
			</tr>
			</c:forEach>
		</c:if>	
		<!-- form element end -->
		</table>
		<div class="submitButtons">
			<input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}" />
			<input type="submit" class="button" name="_eventId_addInvoiceLine" value="<fmt:message key="ui.button.add" />" />
			<input type="submit" class="button" name="_eventId_clearInvoiceLine" value="<fmt:message key="ui.button.clear" />" />
			<input type="submit" class="button" name="_eventId_submit" value="<fmt:message key="ui.button.submit" />" />
		</div>
	</fieldset>
	</div>
</form>
<!--  end form -->
<%@ include file="/WEB-INF/jsp/forms/formFooter.jsp" %>