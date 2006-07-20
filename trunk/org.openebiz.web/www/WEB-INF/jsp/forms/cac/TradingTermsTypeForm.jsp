<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.tradingterms.details" /></legend>
		<spring:hasBindErrors name="tradingTerms">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<spring:nestedPath path="tradingTerms">
		<table class="form_tbody">
		<!-- form element start -->
<!-- Information list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.tradingterms.information.text" />:</td>
			<td class="form_tdispcol">
			<c:out value="Information List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.tradingterms.information.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editInformationList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.tradingterms.reference.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${tradingTerms.reference.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.tradingterms.reference.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editReference" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.tradingterms.applicableaddress.address" />:</td>
			<td class="form_tdispcol">
			<c:out value="${tradingTerms.applicableAddress.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.tradingterms.applicableaddress.address" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editApplicableAddress" value="<fmt:message key="ui.button.edit" />" /></td>
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