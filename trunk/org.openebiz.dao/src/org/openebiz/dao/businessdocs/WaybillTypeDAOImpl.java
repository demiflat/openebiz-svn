package org.openebiz.dao.businessdocs;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.businessdocs.WaybillType;
import java.util.Iterator;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.LockMode;

public class WaybillTypeDAOImpl extends HibernateDaoSupport implements WaybillTypeDAO {


	static private final Log log = LogFactory.getLog(WaybillTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session.createCriteria(WaybillType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public WaybillType getById(Long id) {
		WaybillType value = null;
		Session session = getSession();
		value = (WaybillType) session.load(WaybillType.class, id);
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
		Criteria newCriteria = session.createCriteria(WaybillType.class);
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
		if (criteria.getCarrierAssignedID() != null) {
			newCriteria.add(Restrictions.eq("carrierAssignedID", criteria
					.getCarrierAssignedID()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("carrierAssignedID")))
			newCriteria.addOrder(Order.asc("carrierAssignedID"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("carrierAssignedID")))
			newCriteria.addOrder(Order.desc("carrierAssignedID"));
		if (criteria.getShippingOrderID() != null) {
			newCriteria.add(Restrictions.eq("shippingOrderID", criteria
					.getShippingOrderID()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("shippingOrderID")))
			newCriteria.addOrder(Order.asc("shippingOrderID"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("shippingOrderID")))
			newCriteria.addOrder(Order.desc("shippingOrderID"));
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
		if (criteria.getShipment() != null) {
			newCriteria
					.add(Restrictions.eq("shipment", criteria.getShipment()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("shipment")))
			newCriteria.addOrder(Order.asc("shipment"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("shipment")))
			newCriteria.addOrder(Order.desc("shipment"));
		if (criteria.getGUID() != null) {
			newCriteria.add(Restrictions.eq("GUID", criteria.getGUID()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("GUID")))
			newCriteria.addOrder(Order.asc("GUID"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("GUID")))
			newCriteria.addOrder(Order.desc("GUID"));
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

	public void insert(WaybillType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(WaybillType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public WaybillType merge(WaybillType value) {
		WaybillType newValue = null;
		Session session = getSession();
		newValue = (WaybillType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(WaybillType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		WaybillType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
