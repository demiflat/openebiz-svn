<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" enctype="multipart/form-data">
	<div class="form_wrapper">
	<fieldset>
		<legend>Embedded Document Binary Object</legend>
		<spring:hasBindErrors name="embeddedDocumentBinaryObject">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<table class="form_tbody">
		<!-- form element start -->
		<tr>
			<td class="form_tlabelcol">Embedded Document Binary Object:</td>
			<td class="form_tdispcol">
			<spring:bind path="embeddedDocumentBinaryObject.holder">
				<div class="formElement">
				<label><div class="formLabel"><fmt:message key="upload.form.item" /></div>
				<input type="file" name="${status.expression}" value="${status.value}">
				</label>
				<c:if test="${not empty status.errorMessage}">
					<span class="fieldError">
					<img src="<c:url value="/icons/warning.gif"/>" alt="<c:out value="${status.errorMessage}" />"/>					
					</span>
				</c:if>
				</div>						
			</spring:bind>
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.binaryobjecttype" />" /></td>
		</tr>		
		<!-- form element end -->
		</table>
		<div class="submitButtons">
			<input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}" />
			<input type="submit" class="button" name="_eventId_submit" value="<fmt:message key="ui.button.submit" />" />
		</div>
	</fieldset>
	</div>	
</form>
<!--  end form -->
<%@ include file="/WEB-INF/jsp/forms/formFooter.jsp" %>