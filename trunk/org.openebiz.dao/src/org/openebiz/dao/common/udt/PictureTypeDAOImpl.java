package org.openebiz.dao.common.udt;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.common.udt.PictureType;
import java.util.Iterator;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.LockMode;

public class PictureTypeDAOImpl extends HibernateDaoSupport implements PictureTypeDAO {

	
	static private final Log log = LogFactory.getLog(PictureTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session.createCriteria(PictureType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public PictureType getById(Long id) {
		PictureType value = null;
		Session session = getSession();
		value = (PictureType) session.load(PictureType.class, id);
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
		Criteria newCriteria = session.createCriteria(PictureType.class);
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
		if (criteria.getEncodingCode() != null) {
			newCriteria.add(Restrictions.eq("encodingCode", criteria
					.getEncodingCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("encodingCode")))
			newCriteria.addOrder(Order.asc("encodingCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("encodingCode")))
			newCriteria.addOrder(Order.desc("encodingCode"));
		if (criteria.getFilename() != null) {
			newCriteria
					.add(Restrictions.eq("filename", criteria.getFilename()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("filename")))
			newCriteria.addOrder(Order.asc("filename"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("filename")))
			newCriteria.addOrder(Order.desc("filename"));
		if (criteria.getFormat() != null) {
			newCriteria.add(Restrictions.eq("format", criteria.getFormat()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("format")))
			newCriteria.addOrder(Order.asc("format"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("format")))
			newCriteria.addOrder(Order.desc("format"));
		if (criteria.getUri() != null) {
			newCriteria.add(Restrictions.eq("uri", criteria.getUri()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("uri")))
			newCriteria.addOrder(Order.asc("uri"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("uri")))
			newCriteria.addOrder(Order.desc("uri"));
		if (criteria.getMimeCode() != null) {
			newCriteria
					.add(Restrictions.eq("mimeCode", criteria.getMimeCode()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("mimeCode")))
			newCriteria.addOrder(Order.asc("mimeCode"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("mimeCode")))
			newCriteria.addOrder(Order.desc("mimeCode"));
		return newCriteria;
	}

	public void insert(PictureType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(PictureType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public PictureType merge(PictureType value) {
		PictureType newValue = null;
		Session session = getSession();
		newValue = (PictureType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(PictureType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		PictureType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
