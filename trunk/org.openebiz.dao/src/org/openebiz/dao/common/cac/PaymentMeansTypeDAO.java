package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cbc.PaymentMeansCodeType;
import org.openebiz.core.common.cbc.PaymentChannelCodeType;
import org.openebiz.core.common.cac.CardAccountType;
import org.openebiz.core.common.cac.FinancialAccountType;
import org.openebiz.core.common.cac.CreditAccountType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.PaymentMeansType;

public interface PaymentMeansTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		PaymentMeansCodeType paymentMeansCode;

		PaymentChannelCodeType paymentChannelCode;

		CardAccountType cardAccount;

		FinancialAccountType payerFinancialAccount;

		FinancialAccountType payeeFinancialAccount;

		CreditAccountType creditAccount;

		int startFrom;

		int maxResults;

		Set<String> ascending;

		Set<String> descending;

		public Long getInternalId() {
			return this.internalId;
		}

		public void setInternalId(Long value) {
			this.internalId = value;
		}

		public Integer getVersion() {
			return this.version;
		}

		public void setVersion(Integer value) {
			this.version = value;
		}

		public PaymentMeansCodeType getPaymentMeansCode() {
			return this.paymentMeansCode;
		}

		public void setPaymentMeansCode(PaymentMeansCodeType value) {
			this.paymentMeansCode = value;
		}

		public PaymentChannelCodeType getPaymentChannelCode() {
			return this.paymentChannelCode;
		}

		public void setPaymentChannelCode(PaymentChannelCodeType value) {
			this.paymentChannelCode = value;
		}

		public CardAccountType getCardAccount() {
			return this.cardAccount;
		}

		public void setCardAccount(CardAccountType value) {
			this.cardAccount = value;
		}

		public FinancialAccountType getPayerFinancialAccount() {
			return this.payerFinancialAccount;
		}

		public void setPayerFinancialAccount(FinancialAccountType value) {
			this.payerFinancialAccount = value;
		}

		public FinancialAccountType getPayeeFinancialAccount() {
			return this.payeeFinancialAccount;
		}

		public void setPayeeFinancialAccount(FinancialAccountType value) {
			this.payeeFinancialAccount = value;
		}

		public CreditAccountType getCreditAccount() {
			return this.creditAccount;
		}

		public void setCreditAccount(CreditAccountType value) {
			this.creditAccount = value;
		}

		public void addAscendingOrder(String propertyName) {
			if (ascending == null)
				ascending = new HashSet<String>();
			ascending.add(propertyName);
			if ((descending != null) && (descending.contains(propertyName)))
				descending.remove(propertyName);
		}

		public void addDescendingOrder(String propertyName) {
			if (descending == null)
				descending = new HashSet<String>();
			descending.add(propertyName);
			if ((ascending != null) && (ascending.contains(propertyName)))
				ascending.remove(propertyName);
		}
	}

	public List getAll();

	public Iterator iterateAll();

	public PaymentMeansType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(PaymentMeansType value);

	public void update(PaymentMeansType value);

	public PaymentMeansType merge(PaymentMeansType value);

	public void delete(PaymentMeansType value);

	public void delete(Long id);
}
