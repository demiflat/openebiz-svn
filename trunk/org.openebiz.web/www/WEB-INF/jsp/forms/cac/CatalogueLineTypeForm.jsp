<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.catalogueline.details" /></legend>
		<spring:hasBindErrors name="catalogueLine">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<spring:nestedPath path="catalogueLine">
		<table class="form_tbody">
		<!-- form element start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.catalogueline.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${catalogueLine.ID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.catalogueline.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editID" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.catalogueline.action.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${catalogueLine.actionCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.catalogueline.action.code" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editActionCode" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.catalogueline.lifecyclestatus.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${catalogueLine.lifeCycleStatusCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.catalogueline.lifecyclestatus.code" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editLifeCycleStatusCode" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.catalogueline.contractsubdivision.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${catalogueLine.contractSubdivision.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.catalogueline.contractsubdivision.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editContractSubdivision" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
<!-- Note list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.catalogueline.note.text" />:</td>
			<td class="form_tdispcol">
			<c:out value="Note List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.catalogueline.note.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editNoteList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.catalogueline.orderable.indicator" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${catalogueLine.orderableIndicator.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.catalogueline.orderable.indicator" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editOrderableIndicator" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.catalogueline.orderingunitmeasure.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${catalogueLine.orderingUnitMeasureID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.catalogueline.orderingunitmeasure.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editOrderingUnitMeasureID" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.catalogueline.contentunit.quantity" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${catalogueLine.contentUnitQuantity.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.catalogueline.contentunit.quantity" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editContentUnitQuantity" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.catalogueline.orderquantityincrement.numeric" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<fmt:formatNumber minFractionDigits="2"  value="${catalogueLine.orderQuantityIncrementNumeric.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.catalogueline.orderquantityincrement.numeric" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editOrderQuantityIncrementNumeric" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.catalogueline.minimumorder.quantity" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${catalogueLine.minimumOrderQuantity.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.catalogueline.minimumorder.quantity" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editMinimumOrderQuantity" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.catalogueline.maximumorder.quantity" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${catalogueLine.maximumOrderQuantity.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.catalogueline.maximumorder.quantity" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editMaximumOrderQuantity" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
<!-- WarrantyInformation list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.catalogueline.warrantyinformation.text" />:</td>
			<td class="form_tdispcol">
			<c:out value="WarrantyInformation List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.catalogueline.warrantyinformation.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editWarrantyInformationList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.catalogueline.packlevel.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${catalogueLine.packLevelCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.catalogueline.packlevel.code" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editPackLevelCode" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.catalogueline.informationvalidityperiod.period" />:</td>
			<td class="form_tdispcol">
			<c:out value="${catalogueLine.informationValidityPeriod.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.catalogueline.informationvalidityperiod.period" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editInformationValidityPeriod" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- ValidityPeriod list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.catalogueline.validityperiod.period" />:</td>
			<td class="form_tdispcol">
			<c:out value="ValidityPeriod List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.catalogueline.validityperiod.period" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editValidityPeriodList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- ItemComparison list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.catalogueline.itemcomparison" />:</td>
			<td class="form_tdispcol">
			<c:out value="ItemComparison List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.catalogueline.itemcomparison" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editItemComparisonList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- ComponentRelatedItem list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.catalogueline.componentrelateditem.relateditem" />:</td>
			<td class="form_tdispcol">
			<c:out value="ComponentRelatedItem List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.catalogueline.componentrelateditem.relateditem" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editComponentRelatedItemList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- AccessoryRelatedItem list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.catalogueline.accessoryrelateditem.relateditem" />:</td>
			<td class="form_tdispcol">
			<c:out value="AccessoryRelatedItem List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.catalogueline.accessoryrelateditem.relateditem" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editAccessoryRelatedItemList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- RequiredRelatedItem list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.catalogueline.requiredrelateditem.relateditem" />:</td>
			<td class="form_tdispcol">
			<c:out value="RequiredRelatedItem List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.catalogueline.requiredrelateditem.relateditem" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editRequiredRelatedItemList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- ReplacementRelatedItem list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.catalogueline.replacementrelateditem.relateditem" />:</td>
			<td class="form_tdispcol">
			<c:out value="ReplacementRelatedItem List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.catalogueline.replacementrelateditem.relateditem" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editReplacementRelatedItemList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- ComplementaryRelatedItem list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.catalogueline.complementaryrelateditem.relateditem" />:</td>
			<td class="form_tdispcol">
			<c:out value="ComplementaryRelatedItem List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.catalogueline.complementaryrelateditem.relateditem" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editComplementaryRelatedItemList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- RequiredItemLocationQuantity list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.catalogueline.requireditemlocationquantity.itemlocationquantity" />:</td>
			<td class="form_tdispcol">
			<c:out value="RequiredItemLocationQuantity List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.catalogueline.requireditemlocationquantity.itemlocationquantity" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editRequiredItemLocationQuantityList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.catalogueline.item" />:</td>
			<td class="form_tdispcol">
			<c:out value="${catalogueLine.item.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.catalogueline.item" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editItem" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
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