<%@ include file="/WEB-INF/jsp/views/viewHeader.jsp" %>
<form action="openebiz" method="post">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.documentresponse.details" /></legend>
			<table class="form_tbody">
			<!-- element view start -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.documentresponse.response" />:</td>
			<td class="form_tdispcol">
			<c:out value="${documentResponse.response.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.documentresponse.response" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.documentresponse.documentreference" />:</td>
			<td class="form_tdispcol">
			<c:out value="${documentResponse.documentReference.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.documentresponse.documentreference" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.documentresponse.issuerparty.party" />:</td>
			<td class="form_tdispcol">
			<c:out value="${documentResponse.issuerParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.documentresponse.issuerparty.party" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.documentresponse.recipientparty.party" />:</td>
			<td class="form_tdispcol">
			<c:out value="${documentResponse.recipientParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.documentresponse.recipientparty.party" />" /></td>
		</tr>
<!-- cac item end -->
<!-- LineResponse list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.documentresponse.lineresponse" />:</td>
			<td class="form_tdispcol">
			<c:out value="LineResponse List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.documentresponse.lineresponse" />" /></td>
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