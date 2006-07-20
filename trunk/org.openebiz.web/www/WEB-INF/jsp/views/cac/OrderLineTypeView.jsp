<%@ include file="/WEB-INF/jsp/views/viewHeader.jsp" %>
<form action="openebiz" method="post">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.orderline.details" /></legend>
			<table class="form_tbody">
			<!-- element view start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.orderline.substitutionstatus.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${orderLine.substitutionStatusCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.orderline.substitutionstatus.code" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.orderline.note.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${orderLine.note.languageID}" />:
			<c:out value="${orderLine.note.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.orderline.note.text" />" /></td>
		</tr>				
	
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.orderline.lineitem" />:</td>
			<td class="form_tdispcol">
			<c:out value="${orderLine.lineItem.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.orderline.lineitem" />" /></td>
		</tr>
<!-- cac item end -->
<!-- SellerProposedLineItem list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.orderline.sellerproposedlineitem.lineitem" />:</td>
			<td class="form_tdispcol">
			<c:out value="SellerProposedLineItem List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.orderline.sellerproposedlineitem.lineitem" />" /></td>
		</tr>
<!-- SellerSubstitutedLineItem list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.orderline.sellersubstitutedlineitem.lineitem" />:</td>
			<td class="form_tdispcol">
			<c:out value="SellerSubstitutedLineItem List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.orderline.sellersubstitutedlineitem.lineitem" />" /></td>
		</tr>
<!-- BuyerProposedLineItem list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.orderline.buyerproposedlineitem.lineitem" />:</td>
			<td class="form_tdispcol">
			<c:out value="BuyerProposedLineItem List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.orderline.buyerproposedlineitem.lineitem" />" /></td>
		</tr>
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.orderline.quotationlinereference.linereference" />:</td>
			<td class="form_tdispcol">
			<c:out value="${orderLine.quotationLineReference.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.orderline.quotationlinereference.linereference" />" /></td>
		</tr>
<!-- cac item end -->
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