<%@ include file="/WEB-INF/jsp/views/viewHeader.jsp" %>
<form action="openebiz" method="post">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.lineresponse.details" /></legend>
			<table class="form_tbody">
			<!-- element view start -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.lineresponse.linereference" />:</td>
			<td class="form_tdispcol">
			<c:out value="${lineResponse.lineReference.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.lineresponse.linereference" />" /></td>
		</tr>
<!-- cac item end -->
<!-- Response list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.lineresponse.response" />:</td>
			<td class="form_tdispcol">
			<c:out value="Response List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.lineresponse.response" />" /></td>
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