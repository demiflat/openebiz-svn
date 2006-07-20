package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cbc.LogoReferenceIDType;
import org.openebiz.core.common.cac.LanguageType;
import org.openebiz.core.common.cac.AddressType;
import org.openebiz.core.common.cac.ContactType;
import org.openebiz.core.common.cac.PersonType;
import org.openebiz.core.common.cac.PartyType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;

public interface PartyTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		LogoReferenceIDType logoReferenceID;

		LanguageType language;

		AddressType address;

		ContactType contact;

		PersonType person;

		PartyType agentParty;

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

		public LogoReferenceIDType getLogoReferenceID() {
			return this.logoReferenceID;
		}

		public void setLogoReferenceID(LogoReferenceIDType value) {
			this.logoReferenceID = value;
		}

		public LanguageType getLanguage() {
			return this.language;
		}

		public void setLanguage(LanguageType value) {
			this.language = value;
		}

		public AddressType getAddress() {
			return this.address;
		}

		public void setAddress(AddressType value) {
			this.address = value;
		}

		public ContactType getContact() {
			return this.contact;
		}

		public void setContact(ContactType value) {
			this.contact = value;
		}

		public PersonType getPerson() {
			return this.person;
		}

		public void setPerson(PersonType value) {
			this.person = value;
		}

		public PartyType getAgentParty() {
			return this.agentParty;
		}

		public void setAgentParty(PartyType value) {
			this.agentParty = value;
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

	public PartyType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(PartyType value);

	public void update(PartyType value);

	public PartyType merge(PartyType value);

	public void delete(PartyType value);

	public void delete(Long id);
}
