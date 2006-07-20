package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cbc.InstructionIDType;
import org.openebiz.core.common.cbc.IDType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.PaymentType;

public interface PaymentTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		InstructionIDType instructionID;

		IDType ID;

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

		public InstructionIDType getInstructionID() {
			return this.instructionID;
		}

		public void setInstructionID(InstructionIDType value) {
			this.instructionID = value;
		}

		public IDType getID() {
			return this.ID;
		}

		public void setID(IDType value) {
			this.ID = value;
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

	public PaymentType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(PaymentType value);

	public void update(PaymentType value);

	public PaymentType merge(PaymentType value);

	public void delete(PaymentType value);

	public void delete(Long id);
}
