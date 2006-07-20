<%@ include file="/WEB-INF/jsp/views/viewHeader.jsp" %>
<form action="openebiz" method="post">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.person.details" /></legend>
			<table class="form_tbody">
			<!-- element view start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.person.first.name" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${person.firstName.languageID}" />:
			<c:out value="${person.firstName.value}" />			
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.person.first.name" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.person.family.name" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${person.familyName.languageID}" />:
			<c:out value="${person.familyName.value}" />			
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.person.family.name" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.person.title.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${person.title.languageID}" />:
			<c:out value="${person.title.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.person.title.text" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.person.middle.name" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${person.middleName.languageID}" />:
			<c:out value="${person.middleName.value}" />			
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.person.middle.name" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.person.namesuffix.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${person.nameSuffix.languageID}" />:
			<c:out value="${person.nameSuffix.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.person.namesuffix.text" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.person.jobtitle.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${person.jobTitle.languageID}" />:
			<c:out value="${person.jobTitle.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.person.jobtitle.text" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.person.organizationdepartment.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${person.organizationDepartment.languageID}" />:
			<c:out value="${person.organizationDepartment.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.person.organizationdepartment.text" />" /></td>
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