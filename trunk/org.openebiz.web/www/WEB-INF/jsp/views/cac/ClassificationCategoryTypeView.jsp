<%@ include file="/WEB-INF/jsp/views/viewHeader.jsp" %>
<form action="openebiz" method="post">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.classificationcategory.details" /></legend>
			<table class="form_tbody">
			<!-- element view start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.classificationcategory.name" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${classificationCategory.name.languageID}" />:
			<c:out value="${classificationCategory.name.value}" />			
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.classificationcategory.name" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.classificationcategory.codevalue.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${classificationCategory.codeValue.languageID}" />:
			<c:out value="${classificationCategory.codeValue.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.classificationcategory.codevalue.text" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.classificationcategory.description.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${classificationCategory.description.languageID}" />:
			<c:out value="${classificationCategory.description.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.classificationcategory.description.text" />" /></td>
		</tr>				
	
<!-- CategorizesClassificationCategory list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.classificationcategory.categorizesclassificationcategory.classificationcategory" />:</td>
			<td class="form_tdispcol">
			<c:out value="CategorizesClassificationCategory List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.classificationcategory.categorizesclassificationcategory.classificationcategory" />" /></td>
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