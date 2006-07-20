<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>

<!--  start form -->
<form action="enterprise.bossart" method="post" enctype="multipart/form-data">
	<fieldset>
		<legend><fmt:message key="form.upload.title" /></legend>
		
		<spring:hasBindErrors name="uploadHolder">
			<div class="error"><fmt:message key="error.form.generic.message" /></div>
		</spring:hasBindErrors>		
		
		<spring:nestedPath path="uploadHolder">
		
			<spring:bind path="value">
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
			
		</spring:nestedPath>
		
		<div class="submitButtons">
		<input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}" />
		<input type="submit" class="button" name="_eventId_submit" value="<fmt:message key="upload.form.button" />" />
		</div>
		
	</fieldset>
</form>
<!--  end form -->

<%@ include file="/WEB-INF/jsp/forms/formFooter.jsp" %>