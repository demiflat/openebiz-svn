<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.orderline.details" /></legend>
		<spring:hasBindErrors name="orderLine">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<spring:nestedPath path="orderLine">
		<table class="form_tbody">
		<!-- form element start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.orderline.substitutionstatus.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${orderLine.substitutionStatusCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.orderline.substitutionstatus.code" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editSubstitutionStatusCode" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.orderline.note.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${orderLine.note.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.orderline.note.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editNote" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.orderline.lineitem" />:</td>
			<td class="form_tdispcol">
			<c:out value="${orderLine.lineItem.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.orderline.lineitem" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editLineItem" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- SellerProposedLineItem list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.orderline.sellerproposedlineitem.lineitem" />:</td>
			<td class="form_tdispcol">
			<c:out value="SellerProposedLineItem List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.orderline.sellerproposedlineitem.lineitem" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editSellerProposedLineItemList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- SellerSubstitutedLineItem list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.orderline.sellersubstitutedlineitem.lineitem" />:</td>
			<td class="form_tdispcol">
			<c:out value="SellerSubstitutedLineItem List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.orderline.sellersubstitutedlineitem.lineitem" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editSellerSubstitutedLineItemList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- BuyerProposedLineItem list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.orderline.buyerproposedlineitem.lineitem" />:</td>
			<td class="form_tdispcol">
			<c:out value="BuyerProposedLineItem List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.orderline.buyerproposedlineitem.lineitem" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editBuyerProposedLineItemList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.orderline.quotationlinereference.linereference" />:</td>
			<td class="form_tdispcol">
			<c:out value="${orderLine.quotationLineReference.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.orderline.quotationlinereference.linereference" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editQuotationLineReference" value="<fmt:message key="ui.button.edit" />" /></td>
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