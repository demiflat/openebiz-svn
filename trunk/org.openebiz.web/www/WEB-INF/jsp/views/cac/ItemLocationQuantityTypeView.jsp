<%@ include file="/WEB-INF/jsp/views/viewHeader.jsp" %>
<form action="openebiz" method="post">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.itemlocationquantity.details" /></legend>
			<table class="form_tbody">
			<!-- element view start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.itemlocationquantity.leadtime.measure" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${itemLocationQuantity.leadTimeMeasure.value}" />
			<c:out value="${itemLocationQuantity.leadTimeMeasure.unitCode.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.itemlocationquantity.leadtime.measure" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.itemlocationquantity.minimumquantity.quantity" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${itemLocationQuantity.minimumQuantity.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.itemlocationquantity.minimumquantity.quantity" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.itemlocationquantity.maximumquantity.quantity" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${itemLocationQuantity.maximumQuantity.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.itemlocationquantity.maximumquantity.quantity" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.itemlocationquantity.hazardousriskindicator.indicator" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${itemLocationQuantity.hazardousRiskIndicator.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.itemlocationquantity.hazardousriskindicator.indicator" />" /></td>
		</tr>			
	
<!-- TradingRestrictions list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.itemlocationquantity.tradingrestrictions.text" />:</td>
			<td class="form_tdispcol">
			<c:out value="TradingRestrictions List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.itemlocationquantity.tradingrestrictions.text" />" /></td>
		</tr>
<!-- ApplicableTerritoryAddress list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.itemlocationquantity.applicableterritoryaddress.address" />:</td>
			<td class="form_tdispcol">
			<c:out value="ApplicableTerritoryAddress List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.itemlocationquantity.applicableterritoryaddress.address" />" /></td>
		</tr>
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.itemlocationquantity.baseprice" />:</td>
			<td class="form_tdispcol">
			<c:out value="${itemLocationQuantity.basePrice.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.itemlocationquantity.baseprice" />" /></td>
		</tr>
<!-- cac item end -->
<!-- DeliveryUnit list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.itemlocationquantity.deliveryunit" />:</td>
			<td class="form_tdispcol">
			<c:out value="DeliveryUnit List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.itemlocationquantity.deliveryunit" />" /></td>
		</tr>
<!-- ApplicableTaxCategory list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.itemlocationquantity.applicabletaxcategory.taxcategory" />:</td>
			<td class="form_tdispcol">
			<c:out value="ApplicableTaxCategory List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.itemlocationquantity.applicabletaxcategory.taxcategory" />" /></td>
		</tr>
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