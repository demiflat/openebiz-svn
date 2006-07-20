<%@ include file="/WEB-INF/jsp/views/viewHeader.jsp" %>
<form action="openebiz" method="post">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.forwardinginstruction.details" /></legend>
			<table class="form_tbody">
			<!-- element view start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.forwardinginstruction.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${forwardingInstruction.ID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.forwardinginstruction.identifier" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.forwardinginstruction.carrierassignedidentifier.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${forwardingInstruction.carrierAssignedID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.forwardinginstruction.carrierassignedidentifier.identifier" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.forwardinginstruction.globallyuniqueidentifier.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${forwardingInstruction.GUID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.forwardinginstruction.globallyuniqueidentifier.identifier" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.forwardinginstruction.issuedate.date" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:if test="${not empty forwardingInstruction.issueDate.value}">
			<fmt:formatDate value="${forwardingInstruction.issueDate.asDateType}" type="date" pattern="yyyy/MM/dd" />
			</c:if>			
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.forwardinginstruction.issuedate.date" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.forwardinginstruction.issuetime.time" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:if test="${not empty forwardingInstruction.issueTime.value}">
			<fmt:formatDate value="${forwardingInstruction.issueTime.asDateType}" type="time" timeStyle="short" />
			</c:if>
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.forwardinginstruction.issuetime.time" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.forwardinginstruction.name" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${forwardingInstruction.name.value}" />			
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.forwardinginstruction.name" />" /></td>
		</tr>				
	
<!-- Description list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.forwardinginstruction.description.text" />:</td>
			<td class="form_tdispcol">
			<c:out value="Description List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.forwardinginstruction.description.text" />" /></td>
		</tr>		
<!-- Note list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.forwardinginstruction.note.text" />:</td>
			<td class="form_tdispcol">
			<c:out value="Note List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.forwardinginstruction.note.text" />" /></td>
		</tr>		
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.forwardinginstruction.status.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${forwardingInstruction.statusCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.forwardinginstruction.status.code" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.forwardinginstruction.shippingorderidentifier.identifier" />:</td>
			<td class="form_tdispcol">		
			<!-- type specific start -->
			<c:out value="${forwardingInstruction.shippingOrderID.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.forwardinginstruction.shippingorderidentifier.identifier" />" /></td>
		</tr>							
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.forwardinginstruction.toorderindicator.indicator" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${forwardingInstruction.toOrderIndicator.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.forwardinginstruction.toorderindicator.indicator" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.forwardinginstruction.advaloremindicator.indicator" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${forwardingInstruction.adValoremIndicator.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.forwardinginstruction.advaloremindicator.indicator" />" /></td>
		</tr>			
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.forwardinginstruction.declaredcarriagevalue.amount" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<fmt:formatNumber minFractionDigits="2"  value="${forwardingInstruction.declaredCarriageValueAmount.value}" />
			<c:out value="${forwardingInstruction.declaredCarriageValueAmount.currencyID.literal}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.forwardinginstruction.declaredcarriagevalue.amount" />" /></td>
		</tr>		
	
<!-- OtherInstruction list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.forwardinginstruction.otherinstruction.text" />:</td>
			<td class="form_tdispcol">
			<c:out value="OtherInstruction List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.forwardinginstruction.otherinstruction.text" />" /></td>
		</tr>		
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.forwardinginstruction.consignorparty.party" />:</td>
			<td class="form_tdispcol">
			<c:out value="${forwardingInstruction.consignorParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.forwardinginstruction.consignorparty.party" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.forwardinginstruction.carrierparty.party" />:</td>
			<td class="form_tdispcol">
			<c:out value="${forwardingInstruction.carrierParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.forwardinginstruction.carrierparty.party" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.forwardinginstruction.freightforwarderparty.party" />:</td>
			<td class="form_tdispcol">
			<c:out value="${forwardingInstruction.freightForwarderParty.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.forwardinginstruction.freightforwarderparty.party" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.forwardinginstruction.shipment" />:</td>
			<td class="form_tdispcol">
			<c:out value="${forwardingInstruction.shipment.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.forwardinginstruction.shipment" />" /></td>
		</tr>
<!-- cac item end -->
<!-- DocumentReference list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.forwardinginstruction.documentreference" />:</td>
			<td class="form_tdispcol">
			<c:out value="DocumentReference List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.forwardinginstruction.documentreference" />" /></td>
		</tr>		
<!-- ExchangeRate list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.forwardinginstruction.exchangerate" />:</td>
			<td class="form_tdispcol">
			<c:out value="ExchangeRate List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.forwardinginstruction.exchangerate" />" /></td>
		</tr>		
<!-- Signature list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.forwardinginstruction.signature" />:</td>
			<td class="form_tdispcol">
			<c:out value="Signature List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.forwardinginstruction.signature" />" /></td>
		</tr>		
		<!-- element view end -->
		</table>
		<div class="submitButtons">
			<input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}">
			<input type="submit" class="button" name="_eventId_edit" value="Re-Edit">
			<input type="submit" class="button" name="_eventId_save" value="Save">
		</div>
	</fieldset>
	</div>
</form>
<%@ include file="/WEB-INF/jsp/views/viewFooter.jsp" %>