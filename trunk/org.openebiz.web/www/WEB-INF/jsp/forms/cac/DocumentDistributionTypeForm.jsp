<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.documentdistribution.details" /></legend>
		<spring:hasBindErrors name="documentDistribution">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<spring:nestedPath path="documentDistribution">
		<table class="form_tbody">
		<!-- form element start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.documentdistribution.printqualifier.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${documentDistribution.printQualifier.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.documentdistribution.printqualifier.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editPrintQualifier" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.documentdistribution.maximumcopies.numeric" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<fmt:formatNumber minFractionDigits="2"  value="${documentDistribution.maximumCopiesNumeric.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.documentdistribution.maximumcopies.numeric" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editMaximumCopiesNumeric" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.documentdistribution.party" />:</td>
			<td class="form_tdispcol">
			<c:out value="${documentDistribution.party.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.documentdistribution.party" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editParty" value="<fmt:message key="ui.button.edit" />" /></td>
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