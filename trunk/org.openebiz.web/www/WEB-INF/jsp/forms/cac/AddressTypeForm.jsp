<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.address.details" /></legend>
		<spring:hasBindErrors name="address">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<spring:nestedPath path="address">
		<table class="form_tbody">
		<!-- form element start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.address.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${address.ID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.address.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editID" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.address.postbox.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${address.postbox.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.address.postbox.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editPostbox" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.address.floor.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${address.floor.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.address.floor.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editFloor" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.address.room.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${address.room.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.address.room.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editRoom" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.address.streetname.name" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${address.streetName.value}" />			
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.address.streetname.name" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editStreetName" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.address.additionalstreetname.name" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${address.additionalStreetName.value}" />			
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.address.additionalstreetname.name" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editAdditionalStreetName" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.address.buildingname.name" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${address.buildingName.value}" />			
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.address.buildingname.name" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editBuildingName" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.address.buildingnumber.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${address.buildingNumber.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.address.buildingnumber.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editBuildingNumber" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.address.inhousemail.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${address.inhouseMail.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.address.inhousemail.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editInhouseMail" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.address.department.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${address.department.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.address.department.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editDepartment" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.address.cityname.name" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${address.cityName.value}" />			
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.address.cityname.name" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editCityName" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.address.postalzone.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${address.postalZone.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.address.postalzone.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editPostalZone" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.address.countrysubentity.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${address.countrySubentity.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.address.countrysubentity.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editCountrySubentity" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.address.countrysubentitycode.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${address.countrySubentityCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.address.countrysubentitycode.code" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editCountrySubentityCode" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.address.region.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${address.region.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.address.region.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editRegion" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.address.district.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${address.district.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.address.district.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editDistrict" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.address.timezoneoffset.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${address.timezoneOffset.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.address.timezoneoffset.text" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editTimezoneOffset" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
<!-- AddressLine list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.address.addressline" />:</td>
			<td class="form_tdispcol">
			<c:out value="AddressLine List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.address.addressline" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editAddressLineList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.address.country" />:</td>
			<td class="form_tdispcol">
			<c:out value="${address.country.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.address.country" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editCountry" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.address.locationcoordinate" />:</td>
			<td class="form_tdispcol">
			<c:out value="${address.locationCoordinate.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.address.locationcoordinate" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editLocationCoordinate" value="<fmt:message key="ui.button.edit" />" /></td>
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