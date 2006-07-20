package org.openebiz.dao.businessdocs;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.businessdocs.CatalogueType;
import java.util.Iterator;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.LockMode;

public class CatalogueTypeDAOImpl extends HibernateDaoSupport implements CatalogueTypeDAO {


	static private final Log log = LogFactory
			.getLog(CatalogueTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session.createCriteria(CatalogueType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public CatalogueType getById(Long id) {
		CatalogueType value = null;
		Session session = getSession();
		value = (CatalogueType) session.load(CatalogueType.class, id);
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
		Criteria newCriteria = session.createCriteria(CatalogueType.class);
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
		if (criteria.getVersionID() != null) {
			newCriteria.add(Restrictions.eq("versionID", criteria
					.getVersionID()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("versionID")))
			newCriteria.addOrder(Order.asc("versionID"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("versionID")))
			newCriteria.addOrder(Order.desc("versionID"));
		if (criteria.getPreviousVersionID() != null) {
			newCriteria.add(Restrictions.eq("previousVersionID", criteria
					.getPreviousVersionID()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("previousVersionID")))
			newCriteria.addOrder(Order.asc("previousVersionID"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("previousVersionID")))
			newCriteria.addOrder(Order.desc("previousVersionID"));
		if (criteria.getSellerSupplierParty() != null) {
			newCriteria.add(Restrictions.eq("sellerSupplierParty", criteria
					.getSellerSupplierParty()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("sellerSupplierParty")))
			newCriteria.addOrder(Order.asc("sellerSupplierParty"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("sellerSupplierParty")))
			newCriteria.addOrder(Order.desc("sellerSupplierParty"));
		if (criteria.getCatalogueManagingParty() != null) {
			newCriteria.add(Restrictions.eq("catalogueManagingParty", criteria
					.getCatalogueManagingParty()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("catalogueManagingParty")))
			newCriteria.addOrder(Order.asc("catalogueManagingParty"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("catalogueManagingParty")))
			newCriteria.addOrder(Order.desc("catalogueManagingParty"));
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

	public void insert(CatalogueType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(CatalogueType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public CatalogueType merge(CatalogueType value) {
		CatalogueType newValue = null;
		Session session = getSession();
		newValue = (CatalogueType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(CatalogueType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		CatalogueType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
