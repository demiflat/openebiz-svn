<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend>Validity Start Date</legend>
		<spring:hasBindErrors name="validityStartDate">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<table class="form_tbody">
		<!-- form element start -->
		<tr>
			<td class="form_tlabelcol">Validity Start Date:</td>
			<td class="form_tdispcol">	
			<spring:bind path="validityStartDate.value">
				<input id="validityStartDate" name="<c:out value="${status.expression}"/>" type="text" class="text" value="<c:if test="${not empty status.value}"><c:out value="${status.value}" /></c:if>"  readonly="true"  />
				<img id="validityStartDate_cal" src="<c:url value="/icons/cal.gif" />" />
				<c:if test="${not empty status.errorMessage}">
					<span class="fieldError">
					<img src="<c:url value="/icons/warning.gif"/>" alt="<c:out value="${status.errorMessage}" />" alt="<fmt:message key="ui.calendar.alt" />" />				
					</span>
				</c:if>
				<script type="text/javascript">
				    Calendar.setup({
						inputField		:	"validityStartDate",			// id of the input field
						ifFormat		:	"%Y/%m/%d",				// format of the input field
						button			:	"validityStartDate_cal",	// trigger for the calendar (button ID)
						align				:	"Br",									// alignment (defaults to "Bl")
						singleClick	:	true
				    });
				</script>		
			</spring:bind>
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.datetype" />" /></td>
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