<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.itemidentification.details" /></legend>
		<spring:hasBindErrors name="itemIdentification">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<spring:nestedPath path="itemIdentification">
		<table class="form_tbody">
		<!-- form element start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.itemidentification.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${itemIdentification.ID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.itemidentification.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editID" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>							
	
<!-- PhysicalAttribute list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.itemidentification.physicalattribute" />:</td>
			<td class="form_tdispcol">
			<c:out value="PhysicalAttribute List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.itemidentification.physicalattribute" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editPhysicalAttributeList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- MeasurementDimension list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.itemidentification.measurementdimension.dimension" />:</td>
			<td class="form_tdispcol">
			<c:out value="MeasurementDimension List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.itemidentification.measurementdimension.dimension" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editMeasurementDimensionList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.itemidentification.issuerparty.party" />:</td>
			<td class="form_tdispcol">
			<c:out value="${itemIdentification.issuerParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.itemidentification.issuerparty.party" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editIssuerParty" value="<fmt:message key="ui.button.edit" />" /></td>
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