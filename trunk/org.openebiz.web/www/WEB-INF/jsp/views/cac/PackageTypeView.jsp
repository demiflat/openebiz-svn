<%@ include file="/WEB-INF/jsp/views/viewHeader.jsp" %>
<form action="openebiz" method="post">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.package.details" /></legend>
			<table class="form_tbody">
			<!-- element view start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.package.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${package.ID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.package.identifier" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.package.quantity" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${package.quantity.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.package.quantity" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.package.returnablematerialindicator.indicator" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${package.returnableMaterialIndicator.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.package.returnablematerialindicator.indicator" />" /></td>
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
		</tr>			
	
<!-- PackingMaterial list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.package.packingmaterial.text" />:</td>
			<td class="form_tdispcol">
			<c:out value="PackingMaterial List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.package.packingmaterial.text" />" /></td>
		</tr>
<!-- self-referential subflow: editContainedPackage -->
<!-- GoodsItem list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.package.goodsitem" />:</td>
			<td class="form_tdispcol">
			<c:out value="GoodsItem List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.package.goodsitem" />" /></td>
		</tr>
<!-- MeasurementDimension list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.package.measurementdimension.dimension" />:</td>
			<td class="form_tdispcol">
			<c:out value="MeasurementDimension List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.package.measurementdimension.dimension" />" /></td>
		</tr>
<!-- DeliveryUnit list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.package.deliveryunit" />:</td>
			<td class="form_tdispcol">
			<c:out value="DeliveryUnit List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.package.deliveryunit" />" /></td>
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