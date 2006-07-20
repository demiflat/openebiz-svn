<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.shipmentstage.details" /></legend>
		<spring:hasBindErrors name="shipmentStage">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<spring:nestedPath path="shipmentStage">
		<table class="form_tbody">
		<!-- form element start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.shipmentstage.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${shipmentStage.ID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.shipmentstage.identifier" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editID" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.shipmentstage.transportmode.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${shipmentStage.transportModeCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.shipmentstage.transportmode.code" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editTransportModeCode" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.shipmentstage.transportmeanstype.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${shipmentStage.transportMeansTypeCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.shipmentstage.transportmeanstype.code" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editTransportMeansTypeCode" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.shipmentstage.transitdirection.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${shipmentStage.transitDirectionCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.shipmentstage.transitdirection.code" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editTransitDirectionCode" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.shipmentstage.precarriageindicator.indicator" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${shipmentStage.preCarriageIndicator.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.shipmentstage.precarriageindicator.indicator" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editPreCarriageIndicator" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.shipmentstage.oncarriageindicator.indicator" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${shipmentStage.onCarriageIndicator.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.shipmentstage.oncarriageindicator.indicator" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editOnCarriageIndicator" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.shipmentstage.transitperiod.period" />:</td>
			<td class="form_tdispcol">
			<c:out value="${shipmentStage.transitPeriod.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.shipmentstage.transitperiod.period" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editTransitPeriod" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- CarrierParty list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.shipmentstage.carrierparty.party" />:</td>
			<td class="form_tdispcol">
			<c:out value="CarrierParty List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.shipmentstage.carrierparty.party" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editCarrierPartyList" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>	
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.shipmentstage.transportmeans" />:</td>
			<td class="form_tdispcol">
			<c:out value="${shipmentStage.transportMeans.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.shipmentstage.transportmeans" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editTransportMeans" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.shipmentstage.loadingport.port" />:</td>
			<td class="form_tdispcol">
			<c:out value="${shipmentStage.loadingPort.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.shipmentstage.loadingport.port" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editLoadingPort" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.shipmentstage.unloadingport.port" />:</td>
			<td class="form_tdispcol">
			<c:out value="${shipmentStage.unloadingPort.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.shipmentstage.unloadingport.port" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editUnloadingPort" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.shipmentstage.transshipport.port" />:</td>
			<td class="form_tdispcol">
			<c:out value="${shipmentStage.transshipPort.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.shipmentstage.transshipport.port" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editTransshipPort" value="<fmt:message key="ui.button.edit" />" /></td>
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