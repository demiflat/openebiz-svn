package org.openebiz.dao.common.cac;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.common.cac.ConsignmentType;
import java.util.Iterator;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.LockMode;

public class ConsignmentTypeDAOImpl extends HibernateDaoSupport implements ConsignmentTypeDAO {

	
	static private final Log log = LogFactory
			.getLog(ConsignmentTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session.createCriteria(ConsignmentType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public ConsignmentType getById(Long id) {
		ConsignmentType value = null;
		Session session = getSession();
		value = (ConsignmentType) session.load(ConsignmentType.class, id);
		return value;
	}

	public List findByCriteria(SearchCriteria criteria) {
		List values = null;
		Session session = getSession();
		Criteria crit = getHBCriteria(session, criteria);
		if (criteria.startFrom < criteria.maxResults && criteria.startFrom > -1) {
			crit.setFirstResult(criteria.startFrom);
			crit.setMaxResults(criteria.maxResults - criteria.startFrom);
		}
		values = crit.list();
		return values;
	}

	private Criteria getHBCriteria(Session session, SearchCriteria criteria) {
		Criteria newCriteria = session.createCriteria(ConsignmentType.class);
		if (criteria.getInternalId() != null) {
			newCriteria.add(Restrictions.eq("internalId", criteria
					.getInternalId()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("internalId")))
			newCriteria.addOrder(Order.asc("internalId"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("internalId")))
			newCriteria.addOrder(Order.desc("internalId"));
		if (criteria.getVersion() != null) {
			newCriteria.add(Restrictions.eq("version", criteria.getVersion()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("version")))
			newCriteria.addOrder(Order.asc("version"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("version")))
			newCriteria.addOrder(Order.desc("version"));
		if (criteria.getTariffCode() != null) {
			newCriteria.add(Restrictions.eq("tariffCode", criteria
					.getTariffCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("tariffCode")))
			newCriteria.addOrder(Order.asc("tariffCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("tariffCode")))
			newCriteria.addOrder(Order.desc("tariffCode"));
		if (criteria.getConsigneeParty() != null) {
			newCriteria.add(Restrictions.eq("consigneeParty", criteria
					.getConsigneeParty()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("consigneeParty")))
			newCriteria.addOrder(Order.asc("consigneeParty"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("consigneeParty")))
			newCriteria.addOrder(Order.desc("consigneeParty"));
		if (criteria.getExporterParty() != null) {
			newCriteria.add(Restrictions.eq("exporterParty", criteria
					.getExporterParty()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("exporterParty")))
			newCriteria.addOrder(Order.asc("exporterParty"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("exporterParty")))
			newCriteria.addOrder(Order.desc("exporterParty"));
		if (criteria.getConsignorParty() != null) {
			newCriteria.add(Restrictions.eq("consignorParty", criteria
					.getConsignorParty()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("consignorParty")))
			newCriteria.addOrder(Order.asc("consignorParty"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("consignorParty")))
			newCriteria.addOrder(Order.desc("consignorParty"));
		if (criteria.getImporterParty() != null) {
			newCriteria.add(Restrictions.eq("importerParty", criteria
					.getImporterParty()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("importerParty")))
			newCriteria.addOrder(Order.asc("importerParty"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("importerParty")))
			newCriteria.addOrder(Order.desc("importerParty"));
		if (criteria.getCarrierParty() != null) {
			newCriteria.add(Restrictions.eq("carrierParty", criteria
					.getCarrierParty()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("carrierParty")))
			newCriteria.addOrder(Order.asc("carrierParty"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("carrierParty")))
			newCriteria.addOrder(Order.desc("carrierParty"));
		if (criteria.getFreightForwarderParty() != null) {
			newCriteria.add(Restrictions.eq("freightForwarderParty", criteria
					.getFreightForwarderParty()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("freightForwarderParty")))
			newCriteria.addOrder(Order.asc("freightForwarderParty"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("freightForwarderParty")))
			newCriteria.addOrder(Order.desc("freightForwarderParty"));
		if (criteria.getNotifyParty() != null) {
			newCriteria.add(Restrictions.eq("notifyParty", criteria
					.getNotifyParty()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("notifyParty")))
			newCriteria.addOrder(Order.asc("notifyParty"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("notifyParty")))
			newCriteria.addOrder(Order.desc("notifyParty"));
		if (criteria.getOriginalDespatchParty() != null) {
			newCriteria.add(Restrictions.eq("originalDespatchParty", criteria
					.getOriginalDespatchParty()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("originalDespatchParty")))
			newCriteria.addOrder(Order.asc("originalDespatchParty"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("originalDespatchParty")))
			newCriteria.addOrder(Order.desc("originalDespatchParty"));
		if (criteria.getFinalDeliveryParty() != null) {
			newCriteria.add(Restrictions.eq("finalDeliveryParty", criteria
					.getFinalDeliveryParty()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("finalDeliveryParty")))
			newCriteria.addOrder(Order.asc("finalDeliveryParty"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("finalDeliveryParty")))
			newCriteria.addOrder(Order.desc("finalDeliveryParty"));
		if (criteria.getOriginalDepartureCountry() != null) {
			newCriteria.add(Restrictions.eq("originalDepartureCountry",
					criteria.getOriginalDepartureCountry()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("originalDepartureCountry")))
			newCriteria.addOrder(Order.asc("originalDepartureCountry"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("originalDepartureCountry")))
			newCriteria.addOrder(Order.desc("originalDepartureCountry"));
		if (criteria.getFinalDestinationCountry() != null) {
			newCriteria.add(Restrictions.eq("finalDestinationCountry", criteria
					.getFinalDestinationCountry()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("finalDestinationCountry")))
			newCriteria.addOrder(Order.asc("finalDestinationCountry"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("finalDestinationCountry")))
			newCriteria.addOrder(Order.desc("finalDestinationCountry"));
		if (criteria.getOriginalDespatchTransportationService() != null) {
			newCriteria.add(Restrictions.eq(
					"originalDespatchTransportationService", criteria
							.getOriginalDespatchTransportationService()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending
						.contains("originalDespatchTransportationService")))
			newCriteria.addOrder(Order
					.asc("originalDespatchTransportationService"));
		else if ((criteria.descending != null)
				&& (criteria.descending
						.contains("originalDespatchTransportationService")))
			newCriteria.addOrder(Order
					.desc("originalDespatchTransportationService"));
		if (criteria.getFinalDeliveryTransportationService() != null) {
			newCriteria.add(Restrictions.eq(
					"finalDeliveryTransportationService", criteria
							.getFinalDeliveryTransportationService()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending
						.contains("finalDeliveryTransportationService")))
			newCriteria.addOrder(Order
					.asc("finalDeliveryTransportationService"));
		else if ((criteria.descending != null)
				&& (criteria.descending
						.contains("finalDeliveryTransportationService")))
			newCriteria.addOrder(Order
					.desc("finalDeliveryTransportationService"));
		if (criteria.getDeliveryTerms() != null) {
			newCriteria.add(Restrictions.eq("deliveryTerms", criteria
					.getDeliveryTerms()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("deliveryTerms")))
			newCriteria.addOrder(Order.asc("deliveryTerms"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("deliveryTerms")))
			newCriteria.addOrder(Order.desc("deliveryTerms"));
		if (criteria.getPaymentTerms() != null) {
			newCriteria.add(Restrictions.eq("paymentTerms", criteria
					.getPaymentTerms()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("paymentTerms")))
			newCriteria.addOrder(Order.asc("paymentTerms"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("paymentTerms")))
			newCriteria.addOrder(Order.desc("paymentTerms"));
		if (criteria.getID() != null) {
			newCriteria.add(Restrictions.eq("ID", criteria.getID()));
		}
		if ((criteria.ascending != null) && (criteria.ascending.contains("ID")))
			newCriteria.addOrder(Order.asc("ID"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("ID")))
			newCriteria.addOrder(Order.desc("ID"));
		return newCriteria;
	}

	public void insert(ConsignmentType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(ConsignmentType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public ConsignmentType merge(ConsignmentType value) {
		ConsignmentType newValue = null;
		Session session = getSession();
		newValue = (ConsignmentType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(ConsignmentType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		ConsignmentType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
