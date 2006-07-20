<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.locationcoordinate.details" /></legend>
		<spring:hasBindErrors name="locationCoordinate">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<spring:nestedPath path="locationCoordinate">
		<table class="form_tbody">
		<!-- form element start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.locationcoordinate.coordinatesystem.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${locationCoordinate.coordinateSystemCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.locationcoordinate.coordinatesystem.code" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editCoordinateSystemCode" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.locationcoordinate.latitudedegrees.measure" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${locationCoordinate.latitudeDegreesMeasure.value}" />|
			<c:out value="${locationCoordinate.latitudeDegreesMeasure.unitCode.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.locationcoordinate.latitudedegrees.measure" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editLatitudeDegreesMeasure" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.locationcoordinate.latitudeminutes.measure" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${locationCoordinate.latitudeMinutesMeasure.value}" />|
			<c:out value="${locationCoordinate.latitudeMinutesMeasure.unitCode.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.locationcoordinate.latitudeminutes.measure" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editLatitudeMinutesMeasure" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.locationcoordinate.latitudedirection.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${locationCoordinate.latitudeDirectionCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.locationcoordinate.latitudedirection.code" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editLatitudeDirectionCode" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.locationcoordinate.longitudedegrees.measure" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${locationCoordinate.longitudeDegreesMeasure.value}" />|
			<c:out value="${locationCoordinate.longitudeDegreesMeasure.unitCode.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.locationcoordinate.longitudedegrees.measure" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editLongitudeDegreesMeasure" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.locationcoordinate.longitudeminutes.measure" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${locationCoordinate.longitudeMinutesMeasure.value}" />|
			<c:out value="${locationCoordinate.longitudeMinutesMeasure.unitCode.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.locationcoordinate.longitudeminutes.measure" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editLongitudeMinutesMeasure" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.locationcoordinate.longitudedirection.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${locationCoordinate.longitudeDirectionCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.locationcoordinate.longitudedirection.code" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editLongitudeDirectionCode" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
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