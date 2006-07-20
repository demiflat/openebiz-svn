package org.openebiz.dao.common.udt;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.common.udt.IdentifierType;
import java.util.Iterator;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.LockMode;

public class IdentifierTypeDAOImpl extends HibernateDaoSupport implements IdentifierTypeDAO {

	
	static private final Log log = LogFactory
			.getLog(IdentifierTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session.createCriteria(IdentifierType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public IdentifierType getById(Long id) {
		IdentifierType value = null;
		Session session = getSession();
		value = (IdentifierType) session.load(IdentifierType.class, id);
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
		Criteria newCriteria = session.createCriteria(IdentifierType.class);
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
		if (criteria.getValue() != null) {
			newCriteria.add(Restrictions.eq("value", criteria.getValue()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("value")))
			newCriteria.addOrder(Order.asc("value"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("value")))
			newCriteria.addOrder(Order.desc("value"));
		if (criteria.getSchemeAgencyID() != null) {
			newCriteria.add(Restrictions.eq("schemeAgencyID", criteria
					.getSchemeAgencyID()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("schemeAgencyID")))
			newCriteria.addOrder(Order.asc("schemeAgencyID"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("schemeAgencyID")))
			newCriteria.addOrder(Order.desc("schemeAgencyID"));
		if (criteria.getSchemeAgencyName() != null) {
			newCriteria.add(Restrictions.eq("schemeAgencyName", criteria
					.getSchemeAgencyName()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("schemeAgencyName")))
			newCriteria.addOrder(Order.asc("schemeAgencyName"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("schemeAgencyName")))
			newCriteria.addOrder(Order.desc("schemeAgencyName"));
		if (criteria.getSchemeDataURI() != null) {
			newCriteria.add(Restrictions.eq("schemeDataURI", criteria
					.getSchemeDataURI()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("schemeDataURI")))
			newCriteria.addOrder(Order.asc("schemeDataURI"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("schemeDataURI")))
			newCriteria.addOrder(Order.desc("schemeDataURI"));
		if (criteria.getSchemeID() != null) {
			newCriteria
					.add(Restrictions.eq("schemeID", criteria.getSchemeID()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("schemeID")))
			newCriteria.addOrder(Order.asc("schemeID"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("schemeID")))
			newCriteria.addOrder(Order.desc("schemeID"));
		if (criteria.getSchemeName() != null) {
			newCriteria.add(Restrictions.eq("schemeName", criteria
					.getSchemeName()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("schemeName")))
			newCriteria.addOrder(Order.asc("schemeName"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("schemeName")))
			newCriteria.addOrder(Order.desc("schemeName"));
		if (criteria.getSchemeURI() != null) {
			newCriteria.add(Restrictions.eq("schemeURI", criteria
					.getSchemeURI()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("schemeURI")))
			newCriteria.addOrder(Order.asc("schemeURI"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("schemeURI")))
			newCriteria.addOrder(Order.desc("schemeURI"));
		if (criteria.getSchemeVersionID() != null) {
			newCriteria.add(Restrictions.eq("schemeVersionID", criteria
					.getSchemeVersionID()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("schemeVersionID")))
			newCriteria.addOrder(Order.asc("schemeVersionID"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("schemeVersionID")))
			newCriteria.addOrder(Order.desc("schemeVersionID"));
		return newCriteria;
	}

	public void insert(IdentifierType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(IdentifierType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public IdentifierType merge(IdentifierType value) {
		IdentifierType newValue = null;
		Session session = getSession();
		newValue = (IdentifierType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(IdentifierType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		IdentifierType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
