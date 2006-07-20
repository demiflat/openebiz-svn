package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cbc.EmergencyProceduresCodeType;
import org.openebiz.core.common.cbc.MedicalFirstAidGuideCodeType;
import org.openebiz.core.common.cbc.CategoryCodeType;
import org.openebiz.core.common.cbc.UpperOrangeHazardPlacardIDType;
import org.openebiz.core.common.cbc.LowerOrangeHazardPlacardIDType;
import org.openebiz.core.common.cbc.MarkingIDType;
import org.openebiz.core.common.cbc.HazardClassIDType;
import org.openebiz.core.common.cac.PartyType;
import org.openebiz.core.common.cac.TemperatureType;
import org.openebiz.core.common.cbc.UNDGCodeType;
import org.openebiz.core.common.cbc.IDType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.HazardousItemType;

public interface HazardousItemTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		EmergencyProceduresCodeType emergencyProceduresCode;

		MedicalFirstAidGuideCodeType medicalFirstAidGuideCode;

		CategoryCodeType categoryCode;

		UpperOrangeHazardPlacardIDType upperOrangeHazardPlacardID;

		LowerOrangeHazardPlacardIDType lowerOrangeHazardPlacardID;

		MarkingIDType markingID;

		HazardClassIDType hazardClassID;

		PartyType contactParty;

		TemperatureType emergencyTemperature;

		TemperatureType flashpointTemperature;

		UNDGCodeType UNDGCode;

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

		public EmergencyProceduresCodeType getEmergencyProceduresCode() {
			return this.emergencyProceduresCode;
		}

		public void setEmergencyProceduresCode(EmergencyProceduresCodeType value) {
			this.emergencyProceduresCode = value;
		}

		public MedicalFirstAidGuideCodeType getMedicalFirstAidGuideCode() {
			return this.medicalFirstAidGuideCode;
		}

		public void setMedicalFirstAidGuideCode(
				MedicalFirstAidGuideCodeType value) {
			this.medicalFirstAidGuideCode = value;
		}

		public CategoryCodeType getCategoryCode() {
			return this.categoryCode;
		}

		public void setCategoryCode(CategoryCodeType value) {
			this.categoryCode = value;
		}

		public UpperOrangeHazardPlacardIDType getUpperOrangeHazardPlacardID() {
			return this.upperOrangeHazardPlacardID;
		}

		public void setUpperOrangeHazardPlacardID(
				UpperOrangeHazardPlacardIDType value) {
			this.upperOrangeHazardPlacardID = value;
		}

		public LowerOrangeHazardPlacardIDType getLowerOrangeHazardPlacardID() {
			return this.lowerOrangeHazardPlacardID;
		}

		public void setLowerOrangeHazardPlacardID(
				LowerOrangeHazardPlacardIDType value) {
			this.lowerOrangeHazardPlacardID = value;
		}

		public MarkingIDType getMarkingID() {
			return this.markingID;
		}

		public void setMarkingID(MarkingIDType value) {
			this.markingID = value;
		}

		public HazardClassIDType getHazardClassID() {
			return this.hazardClassID;
		}

		public void setHazardClassID(HazardClassIDType value) {
			this.hazardClassID = value;
		}

		public PartyType getContactParty() {
			return this.contactParty;
		}

		public void setContactParty(PartyType value) {
			this.contactParty = value;
		}

		public TemperatureType getEmergencyTemperature() {
			return this.emergencyTemperature;
		}

		public void setEmergencyTemperature(TemperatureType value) {
			this.emergencyTemperature = value;
		}

		public TemperatureType getFlashpointTemperature() {
			return this.flashpointTemperature;
		}

		public void setFlashpointTemperature(TemperatureType value) {
			this.flashpointTemperature = value;
		}

		public UNDGCodeType getUNDGCode() {
			return this.UNDGCode;
		}

		public void setUNDGCode(UNDGCodeType value) {
			this.UNDGCode = value;
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

	public HazardousItemType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(HazardousItemType value);

	public void update(HazardousItemType value);

	public HazardousItemType merge(HazardousItemType value);

	public void delete(HazardousItemType value);

	public void delete(Long id);
}
