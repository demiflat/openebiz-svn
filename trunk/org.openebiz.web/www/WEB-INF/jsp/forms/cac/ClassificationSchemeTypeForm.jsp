<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.classificationscheme.details" /></legend>
		<spring:hasBindErrors name="classificationScheme">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<spring:nestedPath path="classificationScheme">
		<table class="form_tbody">
		<!-- form element start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.classificationscheme.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${classificationScheme.ID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.classificationscheme.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editID" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.classificationscheme.globallyuniqueidentifier.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${classificationScheme.GUID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.classificationscheme.globallyuniqueidentifier.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editGUID" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.classificationscheme.lastrevisiondatetime.datetime" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:if test="${not empty classificationScheme.lastRevisionDateTime.value}">
			<fmt:formatDate value="${classificationScheme.lastRevisionDateTime.asDateType}" type="date" pattern="yyyy/MM/dd" />
			</c:if>			
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.classificationscheme.lastrevisiondatetime.datetime" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editLastRevisionDateTime" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.classificationscheme.status.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${classificationScheme.statusCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.classificationscheme.status.code" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editStatusCode" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.classificationscheme.note.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${classificationScheme.note.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.classificationscheme.note.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editNote" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.classificationscheme.name" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${classificationScheme.name.value}" />			
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.classificationscheme.name" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editName" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.classificationscheme.description.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${classificationScheme.description.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.classificationscheme.description.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editDescription" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.classificationscheme.agency.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${classificationScheme.agencyID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.classificationscheme.agency.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editAgencyID" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.classificationscheme.agencyname.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${classificationScheme.agencyName.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.classificationscheme.agencyname.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editAgencyName" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.classificationscheme.version.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${classificationScheme.versionID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.classificationscheme.version.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editVersionID" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.classificationscheme.uniformresourceidentifier.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${classificationScheme.URI.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.classificationscheme.uniformresourceidentifier.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editURI" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.classificationscheme.schemeuniformresourceidentifier.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${classificationScheme.schemeURI.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.classificationscheme.schemeuniformresourceidentifier.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editSchemeURI" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.classificationscheme.language.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${classificationScheme.languageID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.classificationscheme.language.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editLanguageID" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>							
	
<!-- ClassificationCategory list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.classificationscheme.classificationcategory" />:</td>
			<td class="form_tdispcol">
			<c:out value="ClassificationCategory List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.classificationscheme.classificationcategory" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editClassificationCategoryList" value="<fmt:message key="ui.button.edit" />" /></td>
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