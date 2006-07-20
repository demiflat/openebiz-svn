package org.openebiz.dao.common.cac;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.common.cac.ClassificationSchemeType;
import java.util.Iterator;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.LockMode;

public class ClassificationSchemeTypeDAOImpl extends HibernateDaoSupport implements
		ClassificationSchemeTypeDAO {

	
	static private final Log log = LogFactory
			.getLog(ClassificationSchemeTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session
				.createCriteria(ClassificationSchemeType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public ClassificationSchemeType getById(Long id) {
		ClassificationSchemeType value = null;
		Session session = getSession();
		value = (ClassificationSchemeType) session.load(
				ClassificationSchemeType.class, id);
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
		Criteria newCriteria = session
				.createCriteria(ClassificationSchemeType.class);
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
		if (criteria.getStatusCode() != null) {
			newCriteria.add(Restrictions.eq("statusCode", criteria
					.getStatusCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("statusCode")))
			newCriteria.addOrder(Order.asc("statusCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("statusCode")))
			newCriteria.addOrder(Order.desc("statusCode"));
		if (criteria.getNote() != null) {
			newCriteria.add(Restrictions.eq("note", criteria.getNote()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("note")))
			newCriteria.addOrder(Order.asc("note"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("note")))
			newCriteria.addOrder(Order.desc("note"));
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
		if (criteria.getAgencyID() != null) {
			newCriteria
					.add(Restrictions.eq("agencyID", criteria.getAgencyID()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("agencyID")))
			newCriteria.addOrder(Order.asc("agencyID"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("agencyID")))
			newCriteria.addOrder(Order.desc("agencyID"));
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
		if (criteria.getLanguageID() != null) {
			newCriteria.add(Restrictions.eq("languageID", criteria
					.getLanguageID()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("languageID")))
			newCriteria.addOrder(Order.asc("languageID"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("languageID")))
			newCriteria.addOrder(Order.desc("languageID"));
		if (criteria.getURI() != null) {
			newCriteria.add(Restrictions.eq("URI", criteria.getURI()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("URI")))
			newCriteria.addOrder(Order.asc("URI"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("URI")))
			newCriteria.addOrder(Order.desc("URI"));
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

	public void insert(ClassificationSchemeType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(ClassificationSchemeType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public ClassificationSchemeType merge(ClassificationSchemeType value) {
		ClassificationSchemeType newValue = null;
		Session session = getSession();
		newValue = (ClassificationSchemeType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(ClassificationSchemeType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		ClassificationSchemeType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
