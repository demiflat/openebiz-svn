package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cbc.DescriptionType;
import org.openebiz.core.common.cac.ItemIdentificationType;
import org.openebiz.core.common.cac.DocumentReferenceType;
import org.openebiz.core.common.cac.LotIdentificationType;
import org.openebiz.core.common.cac.CountryType;
import org.openebiz.core.common.cac.CommodityClassificationType;
import org.openebiz.core.common.cac.PartyType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.ItemType;

public interface ItemTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		DescriptionType description;

		ItemIdentificationType buyersItemIdentification;

		ItemIdentificationType sellersItemIdentification;

		ItemIdentificationType manufacturersItemIdentification;

		ItemIdentificationType standardItemIdentification;

		ItemIdentificationType catalogueItemIdentification;

		DocumentReferenceType catalogueDocumentReference;

		LotIdentificationType lotIdentification;

		CountryType originCountry;

		CommodityClassificationType commodityClassification;

		PartyType informationContentProviderParty;

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

		public DescriptionType getDescription() {
			return this.description;
		}

		public void setDescription(DescriptionType value) {
			this.description = value;
		}

		public ItemIdentificationType getBuyersItemIdentification() {
			return this.buyersItemIdentification;
		}

		public void setBuyersItemIdentification(ItemIdentificationType value) {
			this.buyersItemIdentification = value;
		}

		public ItemIdentificationType getSellersItemIdentification() {
			return this.sellersItemIdentification;
		}

		public void setSellersItemIdentification(ItemIdentificationType value) {
			this.sellersItemIdentification = value;
		}

		public ItemIdentificationType getManufacturersItemIdentification() {
			return this.manufacturersItemIdentification;
		}

		public void setManufacturersItemIdentification(
				ItemIdentificationType value) {
			this.manufacturersItemIdentification = value;
		}

		public ItemIdentificationType getStandardItemIdentification() {
			return this.standardItemIdentification;
		}

		public void setStandardItemIdentification(ItemIdentificationType value) {
			this.standardItemIdentification = value;
		}

		public ItemIdentificationType getCatalogueItemIdentification() {
			return this.catalogueItemIdentification;
		}

		public void setCatalogueItemIdentification(ItemIdentificationType value) {
			this.catalogueItemIdentification = value;
		}

		public DocumentReferenceType getCatalogueDocumentReference() {
			return this.catalogueDocumentReference;
		}

		public void setCatalogueDocumentReference(DocumentReferenceType value) {
			this.catalogueDocumentReference = value;
		}

		public LotIdentificationType getLotIdentification() {
			return this.lotIdentification;
		}

		public void setLotIdentification(LotIdentificationType value) {
			this.lotIdentification = value;
		}

		public CountryType getOriginCountry() {
			return this.originCountry;
		}

		public void setOriginCountry(CountryType value) {
			this.originCountry = value;
		}

		public CommodityClassificationType getCommodityClassification() {
			return this.commodityClassification;
		}

		public void setCommodityClassification(CommodityClassificationType value) {
			this.commodityClassification = value;
		}

		public PartyType getInformationContentProviderParty() {
			return this.informationContentProviderParty;
		}

		public void setInformationContentProviderParty(PartyType value) {
			this.informationContentProviderParty = value;
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

	public ItemType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(ItemType value);

	public void update(ItemType value);

	public ItemType merge(ItemType value);

	public void delete(ItemType value);

	public void delete(Long id);
}
