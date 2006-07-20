<%@ include file="/WEB-INF/jsp/views/viewHeader.jsp" %>
<form action="openebiz" method="post">
	<div class="form_wrapper">
	<fieldset>
		<legend>Transport Handling Unit List</legend>
		<table class="form_tbody">
		<!-- element view start -->
		<tr class="form_thead">
		<th>ID</th>
		<th>Transport Handling Unit Type Code</th>
		<th>Handling Code</th>
		<th>Handling Instructions</th>
		<th>Hazardous Risk Indicator</th>
		<th>Total Goods Item Quantity</th>
		<th>Total Transport Equipment Quantity</th>
		<th>Total Package Quantity</th>
		<th>Temperature</th>
		<th>Temperature</th>
		</tr>
		<c:if test="${not empty transportHandlingUnitList}">
			<c:forEach items="${transportHandlingUnitList}" var="item" varStatus="status">
			<tr>
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.ID.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.transportHandlingUnitTypeCode.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.handlingCode.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.handlingInstructions.languageID}" />:
				<c:out value="${item.handlingInstructions.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.hazardousRiskIndicator.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.totalGoodsItemQuantity.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.totalTransportEquipmentQuantity.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.totalPackageQuantity.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem"><c:out value="${item.minimumTemperature.shortDisplay}" /></td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem"><c:out value="${item.maximumTemperature.shortDisplay}" /></td>
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