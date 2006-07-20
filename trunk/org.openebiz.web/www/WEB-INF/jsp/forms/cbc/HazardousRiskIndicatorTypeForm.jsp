<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend>Hazardous Risk Indicator</legend>
		<spring:hasBindErrors name="hazardousRiskIndicator">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<table class="form_tbody">
		<!-- form element start -->
		<tr>
			<td class="form_tlabelcol">Hazardous Risk Indicator:</td>
			<td class="form_tdispcol">	
			<spring:bind path="hazardousRiskIndicator.value">
				<input type="hidden" name="_${status.expression}">
				<input class="checkbox" type="checkbox" name="${status.expression}"
					id="${status.expression}"
					<c:if test="${status.value}">checked</c:if>></input>
				</input>
				<c:if test="${not empty status.errorMessage}">
					<span class="fieldError">
					<img src="<c:url value="/icons/warning.gif"/>" alt="<c:out value="${status.errorMessage}" />"/>					
					</span>
				</c:if>
			</spring:bind>
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.indicatortype" />" /></td>
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