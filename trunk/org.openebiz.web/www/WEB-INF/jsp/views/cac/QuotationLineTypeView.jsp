<%@ include file="/WEB-INF/jsp/views/viewHeader.jsp" %>
<form action="openebiz" method="post">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.quotationline.details" /></legend>
			<table class="form_tbody">
			<!-- element view start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.quotationline.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${quotationLine.ID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.quotationline.identifier" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.quotationline.note.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${quotationLine.note.languageID}" />:
			<c:out value="${quotationLine.note.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.quotationline.note.text" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.quotationline.quantity" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${quotationLine.quantity.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.quotationline.quantity" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.quotationline.lineextensionamount.amount" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<fmt:formatNumber minFractionDigits="2"  value="${quotationLine.lineExtensionAmount.value}" />
			<c:out value="${quotationLine.lineExtensionAmount.currencyID.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.quotationline.lineextensionamount.amount" />" /></td>
		</tr>		
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.quotationline.totaltaxamount.amount" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<fmt:formatNumber minFractionDigits="2"  value="${quotationLine.totalTaxAmount.value}" />
			<c:out value="${quotationLine.totalTaxAmount.currencyID.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.quotationline.totaltaxamount.amount" />" /></td>
		</tr>		
	
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.quotationline.lineitem" />:</td>
			<td class="form_tdispcol">
			<c:out value="${quotationLine.lineItem.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.quotationline.lineitem" />" /></td>
		</tr>
<!-- cac item end -->
<!-- SellerProposedLineItem list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.quotationline.sellerproposedlineitem.lineitem" />:</td>
			<td class="form_tdispcol">
			<c:out value="SellerProposedLineItem List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.quotationline.sellerproposedlineitem.lineitem" />" /></td>
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