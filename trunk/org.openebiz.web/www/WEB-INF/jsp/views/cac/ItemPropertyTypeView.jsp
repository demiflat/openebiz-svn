<%@ include file="/WEB-INF/jsp/views/viewHeader.jsp" %>
<form action="openebiz" method="post">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.itemproperty.details" /></legend>
			<table class="form_tbody">
			<!-- element view start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.itemproperty.name" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${itemProperty.name.languageID}" />:
			<c:out value="${itemProperty.name.value}" />			
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.itemproperty.name" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.itemproperty.value.text" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${itemProperty.value.languageID}" />:
			<c:out value="${itemProperty.value.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.itemproperty.value.text" />" /></td>
		</tr>				
	
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.itemproperty.usabilityperiod.period" />:</td>
			<td class="form_tdispcol">
			<c:out value="${itemProperty.usabilityPeriod.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.itemproperty.usabilityperiod.period" />" /></td>
		</tr>
<!-- cac item end -->
<!-- ItemPropertyGroup list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.itemproperty.itempropertygroup" />:</td>
			<td class="form_tdispcol">
			<c:out value="ItemPropertyGroup List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.itemproperty.itempropertygroup" />" /></td>
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