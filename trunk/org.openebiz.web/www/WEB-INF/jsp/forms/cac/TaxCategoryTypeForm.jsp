<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.taxcategory.details" /></legend>
		<spring:hasBindErrors name="taxCategory">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<spring:nestedPath path="taxCategory">
		<table class="form_tbody">
		<!-- form element start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.taxcategory.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${taxCategory.ID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.taxcategory.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editID" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.taxcategory.name" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${taxCategory.name.value}" />			
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.taxcategory.name" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editName" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.taxcategory.percent" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<fmt:formatNumber type="percent" value="${taxCategory.percent.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.taxcategory.percent" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editPercent" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.taxcategory.baseunitmeasure.measure" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${taxCategory.baseUnitMeasure.value}" />|
			<c:out value="${taxCategory.baseUnitMeasure.unitCode.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.taxcategory.baseunitmeasure.measure" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editBaseUnitMeasure" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.taxcategory.perunitamount.amount" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<fmt:formatNumber minFractionDigits="2"  value="${taxCategory.perUnitAmount.value}" />
			<c:out value="${taxCategory.perUnitAmount.currencyID.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.taxcategory.perunitamount.amount" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editPerUnitAmount" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>		
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.taxcategory.tierrange.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${taxCategory.tierRange.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.taxcategory.tierrange.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editTierRange" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.taxcategory.tierrate.percent" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<fmt:formatNumber type="percent" value="${taxCategory.tierRatePercent.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.taxcategory.tierrate.percent" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editTierRatePercent" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.taxcategory.taxscheme" />:</td>
			<td class="form_tdispcol">
			<c:out value="${taxCategory.taxScheme.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.taxcategory.taxscheme" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editTaxScheme" value="<fmt:message key="ui.button.edit" />" /></td>
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