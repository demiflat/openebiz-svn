<%@ include file="/WEB-INF/jsp/views/viewHeader.jsp" %>
<form action="openebiz" method="post">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.hazardousitem.details" /></legend>
			<table class="form_tbody">
			<!-- element view start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.hazardousitem.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${hazardousItem.ID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.hazardousitem.identifier" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.hazardousitem.placardnotation.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${hazardousItem.placardNotation.languageID}" />:
			<c:out value="${hazardousItem.placardNotation.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.hazardousitem.placardnotation.text" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.hazardousitem.placardendorsement.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${hazardousItem.placardEndorsement.languageID}" />:
			<c:out value="${hazardousItem.placardEndorsement.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.hazardousitem.placardendorsement.text" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.hazardousitem.additionalinformation.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${hazardousItem.additionalInformation.languageID}" />:
			<c:out value="${hazardousItem.additionalInformation.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.hazardousitem.additionalinformation.text" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.hazardousitem.undgcode.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${hazardousItem.UNDGCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.hazardousitem.undgcode.code" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.hazardousitem.emergencyprocedures.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${hazardousItem.emergencyProceduresCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.hazardousitem.emergencyprocedures.code" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.hazardousitem.medicalfirstaidguide.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${hazardousItem.medicalFirstAidGuideCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.hazardousitem.medicalfirstaidguide.code" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.hazardousitem.technicalname.name" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${hazardousItem.technicalName.languageID}" />:
			<c:out value="${hazardousItem.technicalName.value}" />			
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.hazardousitem.technicalname.name" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.hazardousitem.categoryname.name" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${hazardousItem.categoryName.languageID}" />:
			<c:out value="${hazardousItem.categoryName.value}" />			
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.hazardousitem.categoryname.name" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.hazardousitem.categorycode.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${hazardousItem.categoryCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.hazardousitem.categorycode.code" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.hazardousitem.upperorangehazardplacardidentifier.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${hazardousItem.upperOrangeHazardPlacardID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.hazardousitem.upperorangehazardplacardidentifier.identifier" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.hazardousitem.lowerorangehazardplacardidentifier.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${hazardousItem.lowerOrangeHazardPlacardID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.hazardousitem.lowerorangehazardplacardidentifier.identifier" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.hazardousitem.marking.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${hazardousItem.markingID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.hazardousitem.marking.identifier" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.hazardousitem.hazardclassidentifier.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${hazardousItem.hazardClassID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.hazardousitem.hazardclassidentifier.identifier" />" /></td>
		</tr>							
	
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.hazardousitem.contactparty.party" />:</td>
			<td class="form_tdispcol">
			<c:out value="${hazardousItem.contactParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.hazardousitem.contactparty.party" />" /></td>
		</tr>
<!-- cac item end -->
<!-- SecondaryHazard list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.hazardousitem.secondaryhazard" />:</td>
			<td class="form_tdispcol">
			<c:out value="SecondaryHazard List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.hazardousitem.secondaryhazard" />" /></td>
		</tr>
<!-- HazardousGoodsTransit list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.hazardousitem.hazardousgoodstransit" />:</td>
			<td class="form_tdispcol">
			<c:out value="HazardousGoodsTransit List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.hazardousitem.hazardousgoodstransit" />" /></td>
		</tr>
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.hazardousitem.emergencytemperature.temperature" />:</td>
			<td class="form_tdispcol">
			<c:out value="${hazardousItem.emergencyTemperature.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.hazardousitem.emergencytemperature.temperature" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.hazardousitem.flashpointtemperature.temperature" />:</td>
			<td class="form_tdispcol">
			<c:out value="${hazardousItem.flashpointTemperature.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.hazardousitem.flashpointtemperature.temperature" />" /></td>
		</tr>
<!-- cac item end -->
<!-- AdditionalTemperature list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.hazardousitem.additionaltemperature.temperature" />:</td>
			<td class="form_tdispcol">
			<c:out value="AdditionalTemperature List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.hazardousitem.additionaltemperature.temperature" />" /></td>
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