<%@ include file="/WEB-INF/jsp/views/viewHeader.jsp" %>
<form action="openebiz" method="post">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.locationcoordinate.details" /></legend>
			<table class="form_tbody">
			<!-- element view start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.locationcoordinate.coordinatesystem.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${locationCoordinate.coordinateSystemCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.locationcoordinate.coordinatesystem.code" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.locationcoordinate.latitudedegrees.measure" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${locationCoordinate.latitudeDegreesMeasure.value}" />
			<c:out value="${locationCoordinate.latitudeDegreesMeasure.unitCode.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.locationcoordinate.latitudedegrees.measure" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.locationcoordinate.latitudeminutes.measure" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${locationCoordinate.latitudeMinutesMeasure.value}" />
			<c:out value="${locationCoordinate.latitudeMinutesMeasure.unitCode.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.locationcoordinate.latitudeminutes.measure" />" /></td>
		</tr>				
	
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.locationcoordinate.latitudedirection.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${locationCoordinate.latitudeDirectionCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.locationcoordinate.latitudedirection.code" />" /></td>
		</tr>			
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.locationcoordinate.longitudedegrees.measure" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${locationCoordinate.longitudeDegreesMeasure.value}" />
			<c:out value="${locationCoordinate.longitudeDegreesMeasure.unitCode.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.locationcoordinate.longitudedegrees.measure" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.locationcoordinate.longitudeminutes.measure" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${locationCoordinate.longitudeMinutesMeasure.value}" />
			<c:out value="${locationCoordinate.longitudeMinutesMeasure.unitCode.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.locationcoordinate.longitudeminutes.measure" />" /></td>
		</tr>				
	
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.locationcoordinate.longitudedirection.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${locationCoordinate.longitudeDirectionCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.locationcoordinate.longitudedirection.code" />" /></td>
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