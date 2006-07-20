package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cbc.ProviderTypeCodeType;
import org.openebiz.core.common.cbc.OwnerTypeCodeType;
import org.openebiz.core.common.cbc.SizeTypeCodeType;
import org.openebiz.core.common.cbc.DispositionCodeType;
import org.openebiz.core.common.cbc.FullnessIndicationCodeType;
import org.openebiz.core.common.cbc.InformationType;
import org.openebiz.core.common.cac.TemperatureType;
import org.openebiz.core.common.cac.PartyType;
import org.openebiz.core.common.cac.LocationType;
import org.openebiz.core.common.cbc.IDType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.TransportEquipmentType;

public interface TransportEquipmentTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		ProviderTypeCodeType providerTypeCode;

		OwnerTypeCodeType ownerTypeCode;

		SizeTypeCodeType sizeTypeCode;

		DispositionCodeType dispositionCode;

		FullnessIndicationCodeType fullnessIndicationCode;

		InformationType information;

		TemperatureType minimumTemperature;

		TemperatureType maximumTemperature;

		PartyType providerParty;

		PartyType loadingProofParty;

		LocationType loadingLocation;

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

		public ProviderTypeCodeType getProviderTypeCode() {
			return this.providerTypeCode;
		}

		public void setProviderTypeCode(ProviderTypeCodeType value) {
			this.providerTypeCode = value;
		}

		public OwnerTypeCodeType getOwnerTypeCode() {
			return this.ownerTypeCode;
		}

		public void setOwnerTypeCode(OwnerTypeCodeType value) {
			this.ownerTypeCode = value;
		}

		public SizeTypeCodeType getSizeTypeCode() {
			return this.sizeTypeCode;
		}

		public void setSizeTypeCode(SizeTypeCodeType value) {
			this.sizeTypeCode = value;
		}

		public DispositionCodeType getDispositionCode() {
			return this.dispositionCode;
		}

		public void setDispositionCode(DispositionCodeType value) {
			this.dispositionCode = value;
		}

		public FullnessIndicationCodeType getFullnessIndicationCode() {
			return this.fullnessIndicationCode;
		}

		public void setFullnessIndicationCode(FullnessIndicationCodeType value) {
			this.fullnessIndicationCode = value;
		}

		public InformationType getInformation() {
			return this.information;
		}

		public void setInformation(InformationType value) {
			this.information = value;
		}

		public TemperatureType getMinimumTemperature() {
			return this.minimumTemperature;
		}

		public void setMinimumTemperature(TemperatureType value) {
			this.minimumTemperature = value;
		}

		public TemperatureType getMaximumTemperature() {
			return this.maximumTemperature;
		}

		public void setMaximumTemperature(TemperatureType value) {
			this.maximumTemperature = value;
		}

		public PartyType getProviderParty() {
			return this.providerParty;
		}

		public void setProviderParty(PartyType value) {
			this.providerParty = value;
		}

		public PartyType getLoadingProofParty() {
			return this.loadingProofParty;
		}

		public void setLoadingProofParty(PartyType value) {
			this.loadingProofParty = value;
		}

		public LocationType getLoadingLocation() {
			return this.loadingLocation;
		}

		public void setLoadingLocation(LocationType value) {
			this.loadingLocation = value;
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

	public TransportEquipmentType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(TransportEquipmentType value);

	public void update(TransportEquipmentType value);

	public TransportEquipmentType merge(TransportEquipmentType value);

	public void delete(TransportEquipmentType value);

	public void delete(Long id);
}
