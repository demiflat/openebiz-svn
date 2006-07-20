<%@ include file="/WEB-INF/jsp/views/viewHeader.jsp" %>
<form action="openebiz" method="post">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.language.details" /></legend>
			<table class="form_tbody">
			<!-- element view start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.language.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${language.ID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.language.identifier" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.language.name" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${language.name.languageID}" />:
			<c:out value="${language.name.value}" />			
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.language.name" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.language.locale.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${language.localeCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.language.locale.code" />" /></td>
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