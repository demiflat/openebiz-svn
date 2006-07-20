<%@ include file="/WEB-INF/jsp/views/viewHeader.jsp" %>
<form action="openebiz" method="post">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.stowage.details" /></legend>
			<table class="form_tbody">
			<!-- element view start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.stowage.locationidentifier.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${stowage.locationID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.stowage.locationidentifier.identifier" />" /></td>
		</tr>							
	
<!-- Location list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.stowage.location.text" />:</td>
			<td class="form_tdispcol">
			<c:out value="Location List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.stowage.location.text" />" /></td>
		</tr>
<!-- MeasurementDimension list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.stowage.measurementdimension.dimension" />:</td>
			<td class="form_tdispcol">
			<c:out value="MeasurementDimension List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.stowage.measurementdimension.dimension" />" /></td>
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