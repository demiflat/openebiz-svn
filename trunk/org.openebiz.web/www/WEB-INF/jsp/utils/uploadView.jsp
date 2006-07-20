<%@ include file="/WEB-INF/jsp/views/viewHeader.jsp" %>

<form action="enterprise.bossart" method="post">

	<fieldset>
		<legend>Upload View</legend>

			<p>Filename: ${uploadHolder.value.filename }</p>
			<p>ToString(): ${uploadHolder.value }</p>

			<input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}">
			<input type="submit" class="button" name="_eventId_end" value="New Upload">

	</fieldset>
</form>

<%@ include file="/WEB-INF/jsp/views/viewFooter.jsp" %>