<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.item.details" /></legend>
		<spring:hasBindErrors name="item">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<spring:nestedPath path="item">
		<table class="form_tbody">
		<!-- form element start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.item.description.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${item.description.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.item.description.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editDescription" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.item.packquantity.quantity" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${item.packQuantity.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.item.packquantity.quantity" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editPackQuantity" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.item.packsize.numeric" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<fmt:formatNumber minFractionDigits="2"  value="${item.packSizeNumeric.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.item.packsize.numeric" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editPackSizeNumeric" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.item.catalogueindicator.indicator" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${item.catalogueIndicator.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.item.catalogueindicator.indicator" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editCatalogueIndicator" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.item.name" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${item.name.value}" />			
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.item.name" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editName" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.item.hazardousriskindicator.indicator" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${item.hazardousRiskIndicator.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.item.hazardousriskindicator.indicator" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editHazardousRiskIndicator" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.item.additionalinformation.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${item.additionalInformation.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.item.additionalinformation.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editAdditionalInformation" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
<!-- Keyword list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.item.keyword.text" />:</td>
			<td class="form_tdispcol">
			<c:out value="Keyword List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.item.keyword.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editKeywordList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- BrandName list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.item.brandname.name" />:</td>
			<td class="form_tdispcol">
			<c:out value="BrandName List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.item.brandname.name" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editBrandNameList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- ModelName list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.item.modelname.name" />:</td>
			<td class="form_tdispcol">
			<c:out value="ModelName List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.item.modelname.name" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editModelNameList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- self-referential subflow: editBuyersItemIdentification -->
<!-- self-referential subflow: editSellersItemIdentification -->
<!-- self-referential subflow: editManufacturersItemIdentification -->
<!-- self-referential subflow: editStandardItemIdentification -->
<!-- self-referential subflow: editCatalogueItemIdentification -->
<!-- AdditionalItemIdentification list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.item.additionalitemidentification.itemidentification" />:</td>
			<td class="form_tdispcol">
			<c:out value="AdditionalItemIdentification List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.item.additionalitemidentification.itemidentification" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editAdditionalItemIdentificationList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.item.cataloguedocumentreference.documentreference" />:</td>
			<td class="form_tdispcol">
			<c:out value="${item.catalogueDocumentReference.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.item.cataloguedocumentreference.documentreference" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editCatalogueDocumentReference" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.item.lotidentification" />:</td>
			<td class="form_tdispcol">
			<c:out value="${item.lotIdentification.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.item.lotidentification" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editLotIdentification" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.item.origincountry.country" />:</td>
			<td class="form_tdispcol">
			<c:out value="${item.originCountry.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.item.origincountry.country" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editOriginCountry" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.item.commodityclassification" />:</td>
			<td class="form_tdispcol">
			<c:out value="${item.commodityClassification.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.item.commodityclassification" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editCommodityClassification" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- TransactionConditions list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.item.transactionconditions" />:</td>
			<td class="form_tdispcol">
			<c:out value="TransactionConditions List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.item.transactionconditions" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editTransactionConditionsList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- HazardousItem list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.item.hazardousitem" />:</td>
			<td class="form_tdispcol">
			<c:out value="HazardousItem List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.item.hazardousitem" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editHazardousItemList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- ClassifiedTaxCategory list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.item.classifiedtaxcategory.taxcategory" />:</td>
			<td class="form_tdispcol">
			<c:out value="ClassifiedTaxCategory List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.item.classifiedtaxcategory.taxcategory" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editClassifiedTaxCategoryList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- AdditionalItemProperty list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.item.additionalitemproperty.itemproperty" />:</td>
			<td class="form_tdispcol">
			<c:out value="AdditionalItemProperty List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.item.additionalitemproperty.itemproperty" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editAdditionalItemPropertyList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- ManufacturerParty list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.item.manufacturerparty.party" />:</td>
			<td class="form_tdispcol">
			<c:out value="ManufacturerParty List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.item.manufacturerparty.party" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editManufacturerPartyList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.item.informationcontentproviderparty.party" />:</td>
			<td class="form_tdispcol">
			<c:out value="${item.informationContentProviderParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.item.informationcontentproviderparty.party" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editInformationContentProviderParty" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- OriginAddress list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.item.originaddress.address" />:</td>
			<td class="form_tdispcol">
			<c:out value="OriginAddress List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.item.originaddress.address" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editOriginAddressList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- ItemInstance list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.item.iteminstance" />:</td>
			<td class="form_tdispcol">
			<c:out value="ItemInstance List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.item.iteminstance" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editItemInstanceList" value="<fmt:message key="ui.button.edit" />" /></td>
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