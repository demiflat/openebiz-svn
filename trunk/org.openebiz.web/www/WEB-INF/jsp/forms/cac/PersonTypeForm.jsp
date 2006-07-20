<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.person.details" /></legend>
		<spring:hasBindErrors name="person">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<spring:nestedPath path="person">
		<table class="form_tbody">
		<!-- form element start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.person.first.name" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${person.firstName.value}" />			
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.person.first.name" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editFirstName" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.person.family.name" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${person.familyName.value}" />			
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.person.family.name" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editFamilyName" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.person.title.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${person.title.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.person.title.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editTitle" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.person.middle.name" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${person.middleName.value}" />			
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.person.middle.name" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editMiddleName" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.person.namesuffix.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${person.nameSuffix.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.person.namesuffix.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editNameSuffix" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.person.jobtitle.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${person.jobTitle.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.person.jobtitle.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editJobTitle" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.person.organizationdepartment.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${person.organizationDepartment.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.person.organizationdepartment.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editOrganizationDepartment" value="<fmt:message key="ui.button.edit" />" /></td>
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