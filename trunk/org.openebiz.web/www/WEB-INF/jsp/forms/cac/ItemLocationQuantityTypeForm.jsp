<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.itemlocationquantity.details" /></legend>
		<spring:hasBindErrors name="itemLocationQuantity">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<spring:nestedPath path="itemLocationQuantity">
		<table class="form_tbody">
		<!-- form element start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.itemlocationquantity.leadtime.measure" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${itemLocationQuantity.leadTimeMeasure.value}" />|
			<c:out value="${itemLocationQuantity.leadTimeMeasure.unitCode.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.itemlocationquantity.leadtime.measure" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editLeadTimeMeasure" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.itemlocationquantity.minimumquantity.quantity" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${itemLocationQuantity.minimumQuantity.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.itemlocationquantity.minimumquantity.quantity" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editMinimumQuantity" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.itemlocationquantity.maximumquantity.quantity" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${itemLocationQuantity.maximumQuantity.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.itemlocationquantity.maximumquantity.quantity" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editMaximumQuantity" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.itemlocationquantity.hazardousriskindicator.indicator" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${itemLocationQuantity.hazardousRiskIndicator.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.itemlocationquantity.hazardousriskindicator.indicator" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editHazardousRiskIndicator" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
<!-- TradingRestrictions list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.itemlocationquantity.tradingrestrictions.text" />:</td>
			<td class="form_tdispcol">
			<c:out value="TradingRestrictions List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.itemlocationquantity.tradingrestrictions.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editTradingRestrictionsList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- ApplicableTerritoryAddress list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.itemlocationquantity.applicableterritoryaddress.address" />:</td>
			<td class="form_tdispcol">
			<c:out value="ApplicableTerritoryAddress List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.itemlocationquantity.applicableterritoryaddress.address" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editApplicableTerritoryAddressList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.itemlocationquantity.baseprice" />:</td>
			<td class="form_tdispcol">
			<c:out value="${itemLocationQuantity.basePrice.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.itemlocationquantity.baseprice" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editBasePrice" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- DeliveryUnit list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.itemlocationquantity.deliveryunit" />:</td>
			<td class="form_tdispcol">
			<c:out value="DeliveryUnit List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.itemlocationquantity.deliveryunit" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editDeliveryUnitList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- ApplicableTaxCategory list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.itemlocationquantity.applicabletaxcategory.taxcategory" />:</td>
			<td class="form_tdispcol">
			<c:out value="ApplicableTaxCategory List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.itemlocationquantity.applicabletaxcategory.taxcategory" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editApplicableTaxCategoryList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
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