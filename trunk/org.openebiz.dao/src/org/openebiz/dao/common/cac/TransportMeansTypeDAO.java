package org.openebiz.dao.common.cac;

import org.openebiz.core.common.cbc.JourneyIDType;
import org.openebiz.core.common.cbc.RegistrationNationalityIDType;
import org.openebiz.core.common.cbc.DirectionCodeType;
import org.openebiz.core.common.cac.StowageType;
import org.openebiz.core.common.cac.AirTransportType;
import org.openebiz.core.common.cac.RoadTransportType;
import org.openebiz.core.common.cac.RailTransportType;
import org.openebiz.core.common.cac.MaritimeTransportType;
import org.openebiz.core.common.cac.PartyType;
import java.util.Set;
import java.util.HashSet;
import java.util.List;
import java.util.Iterator;
import org.openebiz.core.common.cac.TransportMeansType;

public interface TransportMeansTypeDAO {

	public static class SearchCriteria {

		Long internalId;
		
		Integer version;

		JourneyIDType journeyID;

		RegistrationNationalityIDType registrationNationalityID;

		DirectionCodeType directionCode;

		StowageType stowage;

		AirTransportType airTransport;

		RoadTransportType roadTransport;

		RailTransportType railTransport;

		MaritimeTransportType maritimeTransport;

		PartyType ownerParty;

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

		public JourneyIDType getJourneyID() {
			return this.journeyID;
		}

		public void setJourneyID(JourneyIDType value) {
			this.journeyID = value;
		}

		public RegistrationNationalityIDType getRegistrationNationalityID() {
			return this.registrationNationalityID;
		}

		public void setRegistrationNationalityID(
				RegistrationNationalityIDType value) {
			this.registrationNationalityID = value;
		}

		public DirectionCodeType getDirectionCode() {
			return this.directionCode;
		}

		public void setDirectionCode(DirectionCodeType value) {
			this.directionCode = value;
		}

		public StowageType getStowage() {
			return this.stowage;
		}

		public void setStowage(StowageType value) {
			this.stowage = value;
		}

		public AirTransportType getAirTransport() {
			return this.airTransport;
		}

		public void setAirTransport(AirTransportType value) {
			this.airTransport = value;
		}

		public RoadTransportType getRoadTransport() {
			return this.roadTransport;
		}

		public void setRoadTransport(RoadTransportType value) {
			this.roadTransport = value;
		}

		public RailTransportType getRailTransport() {
			return this.railTransport;
		}

		public void setRailTransport(RailTransportType value) {
			this.railTransport = value;
		}

		public MaritimeTransportType getMaritimeTransport() {
			return this.maritimeTransport;
		}

		public void setMaritimeTransport(MaritimeTransportType value) {
			this.maritimeTransport = value;
		}

		public PartyType getOwnerParty() {
			return this.ownerParty;
		}

		public void setOwnerParty(PartyType value) {
			this.ownerParty = value;
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

	public TransportMeansType getById(Long id);

	public List findByCriteria(SearchCriteria criteria);

	public void insert(TransportMeansType value);

	public void update(TransportMeansType value);

	public TransportMeansType merge(TransportMeansType value);

	public void delete(TransportMeansType value);

	public void delete(Long id);
}
