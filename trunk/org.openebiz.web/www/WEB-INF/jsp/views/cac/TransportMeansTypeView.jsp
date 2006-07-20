<%@ include file="/WEB-INF/jsp/views/viewHeader.jsp" %>
<form action="openebiz" method="post">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.transportmeans.details" /></legend>
			<table class="form_tbody">
			<!-- element view start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transportmeans.journeyidentifier.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${transportMeans.journeyID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transportmeans.journeyidentifier.identifier" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transportmeans.registrationnationalityidentifier.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${transportMeans.registrationNationalityID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transportmeans.registrationnationalityidentifier.identifier" />" /></td>
		</tr>							
	
<!-- RegistrationNationality list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transportmeans.registrationnationality.text" />:</td>
			<td class="form_tdispcol">
			<c:out value="RegistrationNationality List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transportmeans.registrationnationality.text" />" /></td>
		</tr>
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transportmeans.direction.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${transportMeans.directionCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transportmeans.direction.code" />" /></td>
		</tr>			
	
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transportmeans.stowage" />:</td>
			<td class="form_tdispcol">
			<c:out value="${transportMeans.stowage.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transportmeans.stowage" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transportmeans.airtransport" />:</td>
			<td class="form_tdispcol">
			<c:out value="${transportMeans.airTransport.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transportmeans.airtransport" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transportmeans.roadtransport" />:</td>
			<td class="form_tdispcol">
			<c:out value="${transportMeans.roadTransport.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transportmeans.roadtransport" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transportmeans.railtransport" />:</td>
			<td class="form_tdispcol">
			<c:out value="${transportMeans.railTransport.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transportmeans.railtransport" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transportmeans.maritimetransport" />:</td>
			<td class="form_tdispcol">
			<c:out value="${transportMeans.maritimeTransport.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transportmeans.maritimetransport" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.transportmeans.ownerparty.party" />:</td>
			<td class="form_tdispcol">
			<c:out value="${transportMeans.ownerParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.transportmeans.ownerparty.party" />" /></td>
		</tr>
<!-- cac item end -->
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