<%@ include file="/WEB-INF/jsp/views/viewHeader.jsp" %>
<form action="openebiz" method="post">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.paymentmeans.details" /></legend>
			<table class="form_tbody">
			<!-- element view start -->
<!-- self-referential subflow: editPaymentMeansCode -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.paymentmeans.paymentduedate.date" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:if test="${not empty paymentMeans.paymentDueDate.value}">
			<fmt:formatDate value="${paymentMeans.paymentDueDate.asDateType}" type="date" pattern="yyyy/MM/dd" />
			</c:if>	
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.paymentmeans.paymentduedate.date" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.paymentmeans.paymentchannel.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${paymentMeans.paymentChannelCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.paymentmeans.paymentchannel.code" />" /></td>
		</tr>			
	
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.paymentmeans.cardaccount" />:</td>
			<td class="form_tdispcol">
			<c:out value="${paymentMeans.cardAccount.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.paymentmeans.cardaccount" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.paymentmeans.payerfinancialaccount.financialaccount" />:</td>
			<td class="form_tdispcol">
			<c:out value="${paymentMeans.payerFinancialAccount.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.paymentmeans.payerfinancialaccount.financialaccount" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.paymentmeans.payeefinancialaccount.financialaccount" />:</td>
			<td class="form_tdispcol">
			<c:out value="${paymentMeans.payeeFinancialAccount.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.paymentmeans.payeefinancialaccount.financialaccount" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.paymentmeans.creditaccount" />:</td>
			<td class="form_tdispcol">
			<c:out value="${paymentMeans.creditAccount.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.paymentmeans.creditaccount" />" /></td>
		</tr>
<!-- cac item end -->
<!-- Payment list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.paymentmeans.payment" />:</td>
			<td class="form_tdispcol">
			<c:out value="Payment List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.paymentmeans.payment" />" /></td>
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