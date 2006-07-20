<%@ include file="/WEB-INF/jsp/views/viewHeader.jsp" %>
<form action="openebiz" method="post">
	<div class="form_wrapper">
	<fieldset>
		<legend>Shipment List</legend>
		<table class="form_tbody">
		<!-- element view start -->
		<tr class="form_thead">
		<th>ID</th>
		<th>Priority Level Code</th>
		<th>Handling Code</th>
		<th>Handling Instructions</th>
		<th>Information</th>
		<th>Gross Weight Measure</th>
		<th>Net Weight Measure</th>
		<th>Net Net Weight Measure</th>
		<th>Gross Volume Measure</th>
		<th>Net Volume Measure</th>
		<th>Total Goods Item Quantity</th>
		<th>Total Transport Handling Unit Quantity</th>
		<th>Insurance Value Amount</th>
		<th>Declared Customs Value Amount</th>
		<th>Declared For Carriage Value Amount</th>
		<th>Declared Statistics Value Amount</th>
		<th>Free On Board Value Amount</th>
		<th>Consignment</th>
		<th>Contract</th>
		<th>Delivery</th>
		<th>Address</th>
		<th>Port</th>
		<th>Port</th>
		<th>Country</th>
		</tr>
		<c:if test="${not empty shipmentList}">
			<c:forEach items="${shipmentList}" var="item" varStatus="status">
			<tr>
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.ID.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.priorityLevelCode.value}" />
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
				<c:out value="${item.information.languageID}" />:
				<c:out value="${item.information.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.grossWeightMeasure.value}" />
				<c:out value="${item.grossWeightMeasure.unitCode.literal}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.netWeightMeasure.value}" />
				<c:out value="${item.netWeightMeasure.unitCode.literal}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.netNetWeightMeasure.value}" />
				<c:out value="${item.netNetWeightMeasure.unitCode.literal}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.grossVolumeMeasure.value}" />
				<c:out value="${item.grossVolumeMeasure.unitCode.literal}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.netVolumeMeasure.value}" />
				<c:out value="${item.netVolumeMeasure.unitCode.literal}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.totalGoodsItemQuantity.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.totalTransportHandlingUnitQuantity.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<fmt:formatNumber minFractionDigits="2"  value="${item.insuranceValueAmount.value}" />
				<c:out value="${item.insuranceValueAmount.currencyID.literal}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<fmt:formatNumber minFractionDigits="2"  value="${item.declaredCustomsValueAmount.value}" />
				<c:out value="${item.declaredCustomsValueAmount.currencyID.literal}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<fmt:formatNumber minFractionDigits="2"  value="${item.declaredForCarriageValueAmount.value}" />
				<c:out value="${item.declaredForCarriageValueAmount.currencyID.literal}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<fmt:formatNumber minFractionDigits="2"  value="${item.declaredStatisticsValueAmount.value}" />
				<c:out value="${item.declaredStatisticsValueAmount.currencyID.literal}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<fmt:formatNumber minFractionDigits="2"  value="${item.freeOnBoardValueAmount.value}" />
				<c:out value="${item.freeOnBoardValueAmount.currencyID.literal}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem"><c:out value="${item.consignment.shortDisplay}" /></td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem"><c:out value="${item.transportContract.shortDisplay}" /></td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem"><c:out value="${item.delivery.shortDisplay}" /></td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem"><c:out value="${item.originAddress.shortDisplay}" /></td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem"><c:out value="${item.firstArrivalPort.shortDisplay}" /></td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem"><c:out value="${item.lastExitPort.shortDisplay}" /></td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem"><c:out value="${item.exportCountry.shortDisplay}" /></td>
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