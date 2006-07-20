<%@ include file="/WEB-INF/jsp/views/viewHeader.jsp" %>
<form action="openebiz" method="post">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.transportationservice.details" /></legend>
			<table class="form_tbody">
			<!-- element view start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transportationservice.service.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${transportationService.serviceCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transportationservice.service.code" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transportationservice.tariffclass.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${transportationService.tariffClassCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transportationservice.tariffclass.code" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transportationservice.priority.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${transportationService.priority.languageID}" />:
			<c:out value="${transportationService.priority.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transportationservice.priority.text" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transportationservice.freightrateclass.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${transportationService.freightRateClassCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transportationservice.freightrateclass.code" />" /></td>
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