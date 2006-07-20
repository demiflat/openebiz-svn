<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.documentresponse.details" /></legend>
		<spring:hasBindErrors name="documentResponse">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<spring:nestedPath path="documentResponse">
		<table class="form_tbody">
		<!-- form element start -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.documentresponse.response" />:</td>
			<td class="form_tdispcol">
			<c:out value="${documentResponse.response.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.documentresponse.response" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editResponse" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.documentresponse.documentreference" />:</td>
			<td class="form_tdispcol">
			<c:out value="${documentResponse.documentReference.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.documentresponse.documentreference" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editDocumentReference" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.documentresponse.issuerparty.party" />:</td>
			<td class="form_tdispcol">
			<c:out value="${documentResponse.issuerParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.documentresponse.issuerparty.party" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editIssuerParty" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.documentresponse.recipientparty.party" />:</td>
			<td class="form_tdispcol">
			<c:out value="${documentResponse.recipientParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.documentresponse.recipientparty.party" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editRecipientParty" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- LineResponse list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.documentresponse.lineresponse" />:</td>
			<td class="form_tdispcol">
			<c:out value="LineResponse List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.documentresponse.lineresponse" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editLineResponseList" value="<fmt:message key="ui.button.edit" />" /></td>
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