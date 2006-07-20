package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cbc.PrimaryAccountNumberIDType;
import org.openebiz.core.common.cbc.NetworkIDType;
import org.openebiz.core.common.cbc.CardTypeCodeType;
import org.openebiz.core.common.cbc.IssuerIDType;
import org.openebiz.core.common.cbc.IssueNumberIDType;
import org.openebiz.core.common.cbc.ChipCodeType;
import org.openebiz.core.common.cbc.ChipApplicationIDType;
import org.openebiz.core.common.cbc.CV2IDType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.CardAccountType;

public interface CardAccountTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		PrimaryAccountNumberIDType primaryAccountNumberID;

		NetworkIDType networkID;

		CardTypeCodeType cardTypeCode;

		IssuerIDType issuerID;

		IssueNumberIDType issueNumberID;

		ChipCodeType chipCode;

		ChipApplicationIDType chipApplicationID;

		CV2IDType CV2ID;

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

		public PrimaryAccountNumberIDType getPrimaryAccountNumberID() {
			return this.primaryAccountNumberID;
		}

		public void setPrimaryAccountNumberID(PrimaryAccountNumberIDType value) {
			this.primaryAccountNumberID = value;
		}

		public NetworkIDType getNetworkID() {
			return this.networkID;
		}

		public void setNetworkID(NetworkIDType value) {
			this.networkID = value;
		}

		public CardTypeCodeType getCardTypeCode() {
			return this.cardTypeCode;
		}

		public void setCardTypeCode(CardTypeCodeType value) {
			this.cardTypeCode = value;
		}

		public IssuerIDType getIssuerID() {
			return this.issuerID;
		}

		public void setIssuerID(IssuerIDType value) {
			this.issuerID = value;
		}

		public IssueNumberIDType getIssueNumberID() {
			return this.issueNumberID;
		}

		public void setIssueNumberID(IssueNumberIDType value) {
			this.issueNumberID = value;
		}

		public ChipCodeType getChipCode() {
			return this.chipCode;
		}

		public void setChipCode(ChipCodeType value) {
			this.chipCode = value;
		}

		public ChipApplicationIDType getChipApplicationID() {
			return this.chipApplicationID;
		}

		public void setChipApplicationID(ChipApplicationIDType value) {
			this.chipApplicationID = value;
		}

		public CV2IDType getCV2ID() {
			return this.CV2ID;
		}

		public void setCV2ID(CV2IDType value) {
			this.CV2ID = value;
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

	public CardAccountType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(CardAccountType value);

	public void update(CardAccountType value);

	public CardAccountType merge(CardAccountType value);

	public void delete(CardAccountType value);

	public void delete(Long id);
}
