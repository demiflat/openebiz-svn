<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.classificationcategory.details" /></legend>
		<spring:hasBindErrors name="classificationCategory">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<spring:nestedPath path="classificationCategory">
		<table class="form_tbody">
		<!-- form element start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.classificationcategory.name" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${classificationCategory.name.value}" />			
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.classificationcategory.name" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editName" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.classificationcategory.codevalue.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${classificationCategory.codeValue.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.classificationcategory.codevalue.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editCodeValue" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.classificationcategory.description.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${classificationCategory.description.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.classificationcategory.description.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editDescription" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
<!-- CategorizesClassificationCategory list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.classificationcategory.categorizesclassificationcategory.classificationcategory" />:</td>
			<td class="form_tdispcol">
			<c:out value="CategorizesClassificationCategory List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.classificationcategory.categorizesclassificationcategory.classificationcategory" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editCategorizesClassificationCategoryList" value="<fmt:message key="ui.button.edit" />" /></td>
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