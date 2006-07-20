<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.transportmeans.details" /></legend>
		<spring:hasBindErrors name="transportMeans">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<spring:nestedPath path="transportMeans">
		<table class="form_tbody">
		<!-- form element start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transportmeans.journeyidentifier.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${transportMeans.journeyID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transportmeans.journeyidentifier.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editJourneyID" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transportmeans.registrationnationalityidentifier.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${transportMeans.registrationNationalityID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transportmeans.registrationnationalityidentifier.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editRegistrationNationalityID" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>							
	
<!-- RegistrationNationality list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transportmeans.registrationnationality.text" />:</td>
			<td class="form_tdispcol">
			<c:out value="RegistrationNationality List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transportmeans.registrationnationality.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editRegistrationNationalityList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transportmeans.direction.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${transportMeans.directionCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transportmeans.direction.code" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editDirectionCode" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transportmeans.stowage" />:</td>
			<td class="form_tdispcol">
			<c:out value="${transportMeans.stowage.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transportmeans.stowage" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editStowage" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transportmeans.airtransport" />:</td>
			<td class="form_tdispcol">
			<c:out value="${transportMeans.airTransport.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transportmeans.airtransport" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editAirTransport" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transportmeans.roadtransport" />:</td>
			<td class="form_tdispcol">
			<c:out value="${transportMeans.roadTransport.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transportmeans.roadtransport" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editRoadTransport" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transportmeans.railtransport" />:</td>
			<td class="form_tdispcol">
			<c:out value="${transportMeans.railTransport.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transportmeans.railtransport" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editRailTransport" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transportmeans.maritimetransport" />:</td>
			<td class="form_tdispcol">
			<c:out value="${transportMeans.maritimeTransport.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transportmeans.maritimetransport" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editMaritimeTransport" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transportmeans.ownerparty.party" />:</td>
			<td class="form_tdispcol">
			<c:out value="${transportMeans.ownerParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transportmeans.ownerparty.party" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editOwnerParty" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
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