package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cbc.RoleCodeType;
import org.openebiz.core.common.cac.PartyType;
import org.openebiz.core.common.cac.ContactType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.EndorserPartyType;

public interface EndorserPartyTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		RoleCodeType roleCode;

		PartyType party;

		ContactType signatoryContact;

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

		public RoleCodeType getRoleCode() {
			return this.roleCode;
		}

		public void setRoleCode(RoleCodeType value) {
			this.roleCode = value;
		}

		public PartyType getParty() {
			return this.party;
		}

		public void setParty(PartyType value) {
			this.party = value;
		}

		public ContactType getSignatoryContact() {
			return this.signatoryContact;
		}

		public void setSignatoryContact(ContactType value) {
			this.signatoryContact = value;
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

	public EndorserPartyType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(EndorserPartyType value);

	public void update(EndorserPartyType value);

	public EndorserPartyType merge(EndorserPartyType value);

	public void delete(EndorserPartyType value);

	public void delete(Long id);
}
