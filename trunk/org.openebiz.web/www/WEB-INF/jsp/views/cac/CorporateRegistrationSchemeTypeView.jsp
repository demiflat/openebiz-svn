<%@ include file="/WEB-INF/jsp/views/viewHeader.jsp" %>
<form action="openebiz" method="post">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.corporateregistrationscheme.details" /></legend>
			<table class="form_tbody">
			<!-- element view start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.corporateregistrationscheme.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${corporateRegistrationScheme.ID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.corporateregistrationscheme.identifier" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.corporateregistrationscheme.name" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${corporateRegistrationScheme.name.languageID}" />:
			<c:out value="${corporateRegistrationScheme.name.value}" />			
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.corporateregistrationscheme.name" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.corporateregistrationscheme.corporateregistrationtype.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${corporateRegistrationScheme.corporateRegistrationTypeCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.corporateregistrationscheme.corporateregistrationtype.code" />" /></td>
		</tr>			
	
<!-- JurisdictionRegionAddress list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.corporateregistrationscheme.jurisdictionregionaddress.address" />:</td>
			<td class="form_tdispcol">
			<c:out value="JurisdictionRegionAddress List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.corporateregistrationscheme.jurisdictionregionaddress.address" />" /></td>
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