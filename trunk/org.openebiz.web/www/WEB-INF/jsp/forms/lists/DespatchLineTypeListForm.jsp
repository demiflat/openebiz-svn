<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend>Despatch Line List</legend>
		<spring:hasBindErrors name="despatchLineList">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<table class="form_tbody">
		<!-- form element start -->
		<tr class="form_thead">
		<th>ID</th>
		<th>GUID</th>
		<th>Note</th>
		<th>Line Status Code</th>
		<th>Delivered Quantity</th>
		<th>Back Order Quantity</th>
		<th>Back Order Reason</th>
		<th>Outstanding Quantity</th>
		<th>Outstanding Reason</th>
		<th>Over Supply Quantity</th>
		<th>Item</th>
		</tr>
		<c:if test="${not empty despatchLineList}">
			<c:forEach items="${despatchLineList}" var="item" varStatus="status">
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
				<c:out value="${item.lineStatusCode.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.deliveredQuantity.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.backOrderQuantity.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.backOrderReason.languageID}" />:
				<c:out value="${item.backOrderReason.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.outstandingQuantity.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.outstandingReason.languageID}" />:
				<c:out value="${item.outstandingReason.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.overSupplyQuantity.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem"><c:out value="${item.item.shortDisplay}" /></td>
				<!-- type specific end -->
			</tr>
			</c:forEach>
		</c:if>	
		<!-- form element end -->
		</table>
		<div class="submitButtons">
			<input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}" />
			<input type="submit" class="button" name="_eventId_addDespatchLine" value="<fmt:message key="ui.button.add" />" />
			<input type="submit" class="button" name="_eventId_clearDespatchLine" value="<fmt:message key="ui.button.clear" />" />
			<input type="submit" class="button" name="_eventId_submit" value="<fmt:message key="ui.button.submit" />" />
		</div>
	</fieldset>
	</div>
</form>
<!--  end form -->
<%@ include file="/WEB-INF/jsp/forms/formFooter.jsp" %>