<%@ include file="/WEB-INF/jsp/views/viewHeader.jsp" %>
<form action="openebiz" method="post">
	<fieldset>
		<legend>Holder Name</legend>
		<div class="form_wrapper">
		<div class="form_content">
			<table class="form_tbody">
			<!-- element view start -->
		<tr>
			<td class="form_tlabelcol">Holder Name:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${holderName.value}" />			
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="NameType" /></td>
		</tr>				
		<!-- element view end -->
		</table>	
		</div>
		<div class="submitButtons">
			<input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}">
			<input type="submit" class="button" name="_eventId_end" value="Return">
		</div>
	</div>
	</fieldset>
</form>
<%@ include file="/WEB-INF/jsp/views/viewFooter.jsp" %>