package org.openebiz.dao.common.cac;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.common.cac.ItemType;
import java.util.Iterator;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.LockMode;

public class ItemTypeDAOImpl extends HibernateDaoSupport implements ItemTypeDAO {

	
	static private final Log log = LogFactory.getLog(ItemTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session.createCriteria(ItemType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public ItemType getById(Long id) {
		ItemType value = null;
		Session session = getSession();
		value = (ItemType) session.load(ItemType.class, id);
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
		Criteria newCriteria = session.createCriteria(ItemType.class);
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
		if (criteria.getDescription() != null) {
			newCriteria.add(Restrictions.eq("description", criteria
					.getDescription()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("description")))
			newCriteria.addOrder(Order.asc("description"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("description")))
			newCriteria.addOrder(Order.desc("description"));
		if (criteria.getBuyersItemIdentification() != null) {
			newCriteria.add(Restrictions.eq("buyersItemIdentification",
					criteria.getBuyersItemIdentification()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("buyersItemIdentification")))
			newCriteria.addOrder(Order.asc("buyersItemIdentification"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("buyersItemIdentification")))
			newCriteria.addOrder(Order.desc("buyersItemIdentification"));
		if (criteria.getSellersItemIdentification() != null) {
			newCriteria.add(Restrictions.eq("sellersItemIdentification",
					criteria.getSellersItemIdentification()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("sellersItemIdentification")))
			newCriteria.addOrder(Order.asc("sellersItemIdentification"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("sellersItemIdentification")))
			newCriteria.addOrder(Order.desc("sellersItemIdentification"));
		if (criteria.getManufacturersItemIdentification() != null) {
			newCriteria.add(Restrictions.eq("manufacturersItemIdentification",
					criteria.getManufacturersItemIdentification()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending
						.contains("manufacturersItemIdentification")))
			newCriteria.addOrder(Order.asc("manufacturersItemIdentification"));
		else if ((criteria.descending != null)
				&& (criteria.descending
						.contains("manufacturersItemIdentification")))
			newCriteria.addOrder(Order.desc("manufacturersItemIdentification"));
		if (criteria.getStandardItemIdentification() != null) {
			newCriteria.add(Restrictions.eq("standardItemIdentification",
					criteria.getStandardItemIdentification()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("standardItemIdentification")))
			newCriteria.addOrder(Order.asc("standardItemIdentification"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("standardItemIdentification")))
			newCriteria.addOrder(Order.desc("standardItemIdentification"));
		if (criteria.getCatalogueItemIdentification() != null) {
			newCriteria.add(Restrictions.eq("catalogueItemIdentification",
					criteria.getCatalogueItemIdentification()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("catalogueItemIdentification")))
			newCriteria.addOrder(Order.asc("catalogueItemIdentification"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("catalogueItemIdentification")))
			newCriteria.addOrder(Order.desc("catalogueItemIdentification"));
		if (criteria.getCatalogueDocumentReference() != null) {
			newCriteria.add(Restrictions.eq("catalogueDocumentReference",
					criteria.getCatalogueDocumentReference()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("catalogueDocumentReference")))
			newCriteria.addOrder(Order.asc("catalogueDocumentReference"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("catalogueDocumentReference")))
			newCriteria.addOrder(Order.desc("catalogueDocumentReference"));
		if (criteria.getLotIdentification() != null) {
			newCriteria.add(Restrictions.eq("lotIdentification", criteria
					.getLotIdentification()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("lotIdentification")))
			newCriteria.addOrder(Order.asc("lotIdentification"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("lotIdentification")))
			newCriteria.addOrder(Order.desc("lotIdentification"));
		if (criteria.getOriginCountry() != null) {
			newCriteria.add(Restrictions.eq("originCountry", criteria
					.getOriginCountry()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("originCountry")))
			newCriteria.addOrder(Order.asc("originCountry"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("originCountry")))
			newCriteria.addOrder(Order.desc("originCountry"));
		if (criteria.getCommodityClassification() != null) {
			newCriteria.add(Restrictions.eq("commodityClassification", criteria
					.getCommodityClassification()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("commodityClassification")))
			newCriteria.addOrder(Order.asc("commodityClassification"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("commodityClassification")))
			newCriteria.addOrder(Order.desc("commodityClassification"));
		if (criteria.getInformationContentProviderParty() != null) {
			newCriteria.add(Restrictions.eq("informationContentProviderParty",
					criteria.getInformationContentProviderParty()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending
						.contains("informationContentProviderParty")))
			newCriteria.addOrder(Order.asc("informationContentProviderParty"));
		else if ((criteria.descending != null)
				&& (criteria.descending
						.contains("informationContentProviderParty")))
			newCriteria.addOrder(Order.desc("informationContentProviderParty"));
		return newCriteria;
	}

	public void insert(ItemType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(ItemType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public ItemType merge(ItemType value) {
		ItemType newValue = null;
		Session session = getSession();
		newValue = (ItemType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(ItemType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		ItemType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
