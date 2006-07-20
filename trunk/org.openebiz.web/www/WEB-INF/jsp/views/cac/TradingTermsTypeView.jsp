<%@ include file="/WEB-INF/jsp/views/viewHeader.jsp" %>
<form action="openebiz" method="post">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.tradingterms.details" /></legend>
			<table class="form_tbody">
			<!-- element view start -->
<!-- Information list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.tradingterms.information.text" />:</td>
			<td class="form_tdispcol">
			<c:out value="Information List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.tradingterms.information.text" />" /></td>
		</tr>
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.tradingterms.reference.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${tradingTerms.reference.languageID}" />:
			<c:out value="${tradingTerms.reference.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.tradingterms.reference.text" />" /></td>
		</tr>				
	
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.tradingterms.applicableaddress.address" />:</td>
			<td class="form_tdispcol">
			<c:out value="${tradingTerms.applicableAddress.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.tradingterms.applicableaddress.address" />" /></td>
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