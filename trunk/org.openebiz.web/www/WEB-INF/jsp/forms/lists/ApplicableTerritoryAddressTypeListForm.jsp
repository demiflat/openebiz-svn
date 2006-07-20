<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend>Applicable Territory Address List</legend>
		<spring:hasBindErrors name="applicableTerritoryAddressList">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<table class="form_tbody">
		<!-- form element start -->
		<tr class="form_thead">
		<th>ID</th>
		<th>Postbox</th>
		<th>Floor</th>
		<th>Room</th>
		<th>Street Name</th>
		<th>Additional Street Name</th>
		<th>Building Name</th>
		<th>Building Number</th>
		<th>Inhouse Mail</th>
		<th>Department</th>
		<th>City Name</th>
		<th>Postal Zone</th>
		<th>Country Subentity</th>
		<th>Country Subentity Code</th>
		<th>Region</th>
		<th>District</th>
		<th>Timezone Offset</th>
		<th>Country</th>
		<th>Location Coordinate</th>
		</tr>
		<c:if test="${not empty applicableTerritoryAddressList}">
			<c:forEach items="${applicableTerritoryAddressList}" var="item" varStatus="status">
			<tr>
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.ID.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.postbox.languageID}" />:
				<c:out value="${item.postbox.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.floor.languageID}" />:
				<c:out value="${item.floor.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.room.languageID}" />:
				<c:out value="${item.room.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.streetName.languageID}" />:
				<c:out value="${item.streetName.value}" />			
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.additionalStreetName.languageID}" />:
				<c:out value="${item.additionalStreetName.value}" />			
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.buildingName.languageID}" />:
				<c:out value="${item.buildingName.value}" />			
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.buildingNumber.languageID}" />:
				<c:out value="${item.buildingNumber.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.inhouseMail.languageID}" />:
				<c:out value="${item.inhouseMail.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.department.languageID}" />:
				<c:out value="${item.department.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.cityName.languageID}" />:
				<c:out value="${item.cityName.value}" />			
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.postalZone.languageID}" />:
				<c:out value="${item.postalZone.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.countrySubentity.languageID}" />:
				<c:out value="${item.countrySubentity.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.countrySubentityCode.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.region.languageID}" />:
				<c:out value="${item.region.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.district.languageID}" />:
				<c:out value="${item.district.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem">
				<c:out value="${item.timezoneOffset.languageID}" />:
				<c:out value="${item.timezoneOffset.value}" />
				</td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem"><c:out value="${item.country.shortDisplay}" /></td>
				<!-- type specific end -->
				<!-- type specific start -->
				<td class="form_titem"><c:out value="${item.locationCoordinate.shortDisplay}" /></td>
				<!-- type specific end -->
			</tr>
			</c:forEach>
		</c:if>	
		<!-- form element end -->
		</table>
		<div class="submitButtons">
			<input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}" />
			<input type="submit" class="button" name="_eventId_addApplicableTerritoryAddress" value="<fmt:message key="ui.button.add" />" />
			<input type="submit" class="button" name="_eventId_clearApplicableTerritoryAddress" value="<fmt:message key="ui.button.clear" />" />
			<input type="submit" class="button" name="_eventId_submit" value="<fmt:message key="ui.button.submit" />" />
		</div>
	</fieldset>
	</div>
</form>
<!--  end form -->
<%@ include file="/WEB-INF/jsp/forms/formFooter.jsp" %>