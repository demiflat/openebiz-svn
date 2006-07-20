<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.package.details" /></legend>
		<spring:hasBindErrors name="package">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<spring:nestedPath path="package">
		<table class="form_tbody">
		<!-- form element start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.package.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${package.ID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.package.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editID" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.package.quantity" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${package.quantity.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.package.quantity" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editQuantity" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.package.returnablematerialindicator.indicator" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${package.returnableMaterialIndicator.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.package.returnablematerialindicator.indicator" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editReturnableMaterialIndicator" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
<!-- self-referential subflow: editPackageLevelCode -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.package.packagingtype.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${package.packagingTypeCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.package.packagingtype.code" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editPackagingTypeCode" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
<!-- PackingMaterial list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.package.packingmaterial.text" />:</td>
			<td class="form_tdispcol">
			<c:out value="PackingMaterial List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.package.packingmaterial.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editPackingMaterialList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- self-referential subflow: editContainedPackage -->
<!-- GoodsItem list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.package.goodsitem" />:</td>
			<td class="form_tdispcol">
			<c:out value="GoodsItem List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.package.goodsitem" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editGoodsItemList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- MeasurementDimension list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.package.measurementdimension.dimension" />:</td>
			<td class="form_tdispcol">
			<c:out value="MeasurementDimension List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.package.measurementdimension.dimension" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editMeasurementDimensionList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- DeliveryUnit list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.package.deliveryunit" />:</td>
			<td class="form_tdispcol">
			<c:out value="DeliveryUnit List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.package.deliveryunit" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editDeliveryUnitList" value="<fmt:message key="ui.button.edit" />" /></td>
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