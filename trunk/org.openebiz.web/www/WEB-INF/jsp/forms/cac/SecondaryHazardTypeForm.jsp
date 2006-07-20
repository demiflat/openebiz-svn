<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.secondaryhazard.details" /></legend>
		<spring:hasBindErrors name="secondaryHazard">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<spring:nestedPath path="secondaryHazard">
		<table class="form_tbody">
		<!-- form element start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.secondaryhazard.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${secondaryHazard.ID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.secondaryhazard.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editID" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.secondaryhazard.placardnotation.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${secondaryHazard.placardNotation.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.secondaryhazard.placardnotation.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editPlacardNotation" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.secondaryhazard.placardendorsement.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${secondaryHazard.placardEndorsement.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.secondaryhazard.placardendorsement.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editPlacardEndorsement" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.secondaryhazard.emergencyprocedurescode.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${secondaryHazard.emergencyProceduresCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.secondaryhazard.emergencyprocedurescode.code" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editEmergencyProceduresCode" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.secondaryhazard.extension.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${secondaryHazard.extension.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.secondaryhazard.extension.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editExtension" value="<fmt:message key="ui.button.edit" />" /></td>
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