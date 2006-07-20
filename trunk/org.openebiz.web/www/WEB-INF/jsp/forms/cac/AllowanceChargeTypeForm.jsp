<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.allowancecharge.details" /></legend>
		<spring:hasBindErrors name="allowanceCharge">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<spring:nestedPath path="allowanceCharge">
		<table class="form_tbody">
		<!-- form element start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.allowancecharge.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${allowanceCharge.ID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.allowancecharge.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editID" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.allowancecharge.chargeindicator.indicator" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${allowanceCharge.chargeIndicator.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.allowancecharge.chargeindicator.indicator" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editChargeIndicator" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.allowancecharge.reason.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${allowanceCharge.reasonCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.allowancecharge.reason.code" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editReasonCode" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.allowancecharge.multiplierfactor.numeric" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<fmt:formatNumber minFractionDigits="2"  value="${allowanceCharge.multiplierFactorNumeric.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.allowancecharge.multiplierfactor.numeric" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editMultiplierFactorNumeric" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.allowancecharge.prepaidindicator.indicator" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${allowanceCharge.prepaidIndicator.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.allowancecharge.prepaidindicator.indicator" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editPrepaidIndicator" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.allowancecharge.sequence.numeric" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<fmt:formatNumber minFractionDigits="2"  value="${allowanceCharge.sequenceNumeric.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.allowancecharge.sequence.numeric" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editSequenceNumeric" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.allowancecharge.amount" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<fmt:formatNumber minFractionDigits="2"  value="${allowanceCharge.amount.value}" />
			<c:out value="${allowanceCharge.amount.currencyID.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.allowancecharge.amount" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editAmount" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>		
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.allowancecharge.baseamount.amount" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<fmt:formatNumber minFractionDigits="2"  value="${allowanceCharge.baseAmount.value}" />
			<c:out value="${allowanceCharge.baseAmount.currencyID.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.allowancecharge.baseamount.amount" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editBaseAmount" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>		
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.allowancecharge.accountingcostcode.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${allowanceCharge.accountingCostCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.allowancecharge.accountingcostcode.code" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editAccountingCostCode" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
<!-- TaxCategory list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.allowancecharge.taxcategory" />:</td>
			<td class="form_tdispcol">
			<c:out value="TaxCategory List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.allowancecharge.taxcategory" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editTaxCategoryList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- PaymentMeans list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.allowancecharge.paymentmeans" />:</td>
			<td class="form_tdispcol">
			<c:out value="PaymentMeans List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.allowancecharge.paymentmeans" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editPaymentMeansList" value="<fmt:message key="ui.button.edit" />" /></td>
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