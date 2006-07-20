<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.orderedshipment.details" /></legend>
		<spring:hasBindErrors name="orderedShipment">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<spring:nestedPath path="orderedShipment">
		<table class="form_tbody">
		<!-- form element start -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.orderedshipment.shipment" />:</td>
			<td class="form_tdispcol">
			<c:out value="${orderedShipment.shipment.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.orderedshipment.shipment" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editShipment" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- Package list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.orderedshipment.package" />:</td>
			<td class="form_tdispcol">
			<c:out value="Package List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.orderedshipment.package" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editPackageList" value="<fmt:message key="ui.button.edit" />" /></td>
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