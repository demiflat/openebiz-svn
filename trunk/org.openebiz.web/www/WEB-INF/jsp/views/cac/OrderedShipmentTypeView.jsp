<%@ include file="/WEB-INF/jsp/views/viewHeader.jsp" %>
<form action="openebiz" method="post">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.orderedshipment.details" /></legend>
			<table class="form_tbody">
			<!-- element view start -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.orderedshipment.shipment" />:</td>
			<td class="form_tdispcol">
			<c:out value="${orderedShipment.shipment.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.orderedshipment.shipment" />" /></td>
		</tr>
<!-- cac item end -->
<!-- Package list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.orderedshipment.package" />:</td>
			<td class="form_tdispcol">
			<c:out value="Package List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.orderedshipment.package" />" /></td>
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