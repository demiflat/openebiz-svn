<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend>Cancellation Note</legend>
		<spring:hasBindErrors name="cancellationNote">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<table class="form_tbody">
		<!-- form element start -->
		<tr>
			<td class="form_tlabelcol">Cancellation Note:</td>
			<td class="form_tdispcol">	
			<spring:bind path="cancellationNote.value">
				<textarea rows="5" cols="40" name="<c:out value="${status.expression}"/>"><c:if test="${not empty status.value}"><c:out value="${status.value}" /></c:if></textarea>
				<c:if test="${not empty status.errorMessage}">
					<span class="fieldError">
					<img src="<c:url value="/icons/warning.gif"/>" alt="<c:out value="${status.errorMessage}" />"/>					
					</span>
				</c:if>
			</spring:bind>
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.texttype" />" /></td>
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