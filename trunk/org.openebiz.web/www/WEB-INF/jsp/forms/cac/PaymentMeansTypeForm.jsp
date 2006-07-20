<%@ include file="/WEB-INF/jsp/forms/formHeader.jsp" %>
<!--  start form -->
<form action="openebiz" method="post" accept-charset="UTF-8">
	<div class="form_wrapper">
	<fieldset>
		<legend><fmt:message key="ubl.key.paymentmeans.details" /></legend>
		<spring:hasBindErrors name="paymentMeans">
			<div class="error"><fmt:message key="error.form.header" /></div>
		</spring:hasBindErrors>
		<spring:nestedPath path="paymentMeans">
		<table class="form_tbody">
		<!-- form element start -->
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
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editPaymentDueDate" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>				
	
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.paymentmeans.paymentchannel.code" />:</td>
			<td class="form_tdispcol">	
			<!-- type specific start -->
			<c:out value="${paymentMeans.paymentChannelCode.value}" />
			<!-- type specific end -->
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.paymentmeans.paymentchannel.code" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editPaymentChannelCode" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>			
	
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.paymentmeans.cardaccount" />:</td>
			<td class="form_tdispcol">
			<c:out value="${paymentMeans.cardAccount.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.paymentmeans.cardaccount" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editCardAccount" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.paymentmeans.payerfinancialaccount.financialaccount" />:</td>
			<td class="form_tdispcol">
			<c:out value="${paymentMeans.payerFinancialAccount.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.paymentmeans.payerfinancialaccount.financialaccount" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editPayerFinancialAccount" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.paymentmeans.payeefinancialaccount.financialaccount" />:</td>
			<td class="form_tdispcol">
			<c:out value="${paymentMeans.payeeFinancialAccount.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.paymentmeans.payeefinancialaccount.financialaccount" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editPayeeFinancialAccount" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- cac item start -->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.paymentmeans.creditaccount" />:</td>
			<td class="form_tdispcol">
			<c:out value="${paymentMeans.creditAccount.shortDisplay}" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.paymentmeans.creditaccount" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editCreditAccount" value="<fmt:message key="ui.button.edit" />" /></td>
		</tr>
<!-- cac item end -->
<!-- Payment list element start-->
		<tr>
			<td class="form_tlabelcol"><fmt:message key="ubl.key.paymentmeans.payment" />:</td>
			<td class="form_tdispcol">
			<c:out value="Payment List" />
			</td>
			<td class="form_tinfocol"><img src="<c:url value="/icons/info.gif"/>" alt="<fmt:message key="ubl.desc.paymentmeans.payment" />" /></td>
			<td class="form_teditcol"><input type="submit" class="button" name="_eventId_editPaymentList" value="<fmt:message key="ui.button.edit" />" /></td>
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