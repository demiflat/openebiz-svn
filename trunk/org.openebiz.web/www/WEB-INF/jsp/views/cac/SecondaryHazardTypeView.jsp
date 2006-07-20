<%@ include file="/WEB-INF/jsp/views/viewHeader.jsp" %>
<form action="openebiz" method="post">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.secondaryhazard.details" /></legend>
			<table class="form_tbody">
			<!-- element view start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.secondaryhazard.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${secondaryHazard.ID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.secondaryhazard.identifier" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.secondaryhazard.placardnotation.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${secondaryHazard.placardNotation.languageID}" />:
			<c:out value="${secondaryHazard.placardNotation.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.secondaryhazard.placardnotation.text" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.secondaryhazard.placardendorsement.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${secondaryHazard.placardEndorsement.languageID}" />:
			<c:out value="${secondaryHazard.placardEndorsement.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.secondaryhazard.placardendorsement.text" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.secondaryhazard.emergencyprocedurescode.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${secondaryHazard.emergencyProceduresCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.secondaryhazard.emergencyprocedurescode.code" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.secondaryhazard.extension.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${secondaryHazard.extension.languageID}" />:
			<c:out value="${secondaryHazard.extension.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.secondaryhazard.extension.text" />" /></td>
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