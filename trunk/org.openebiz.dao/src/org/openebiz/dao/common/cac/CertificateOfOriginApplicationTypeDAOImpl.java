package org.openebiz.dao.common.cac;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.common.cac.CertificateOfOriginApplicationType;
import java.util.Iterator;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.LockMode;

public class CertificateOfOriginApplicationTypeDAOImpl extends HibernateDaoSupport implements
		CertificateOfOriginApplicationTypeDAO {

	
	static private final Log log = LogFactory
			.getLog(CertificateOfOriginApplicationTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session
				.createCriteria(CertificateOfOriginApplicationType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public CertificateOfOriginApplicationType getById(Long id) {
		CertificateOfOriginApplicationType value = null;
		Session session = getSession();
		value = (CertificateOfOriginApplicationType) session.load(
				CertificateOfOriginApplicationType.class, id);
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
				.createCriteria(CertificateOfOriginApplicationType.class);
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
		if (criteria.getReferenceID() != null) {
			newCriteria.add(Restrictions.eq("referenceID", criteria
					.getReferenceID()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("referenceID")))
			newCriteria.addOrder(Order.asc("referenceID"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("referenceID")))
			newCriteria.addOrder(Order.desc("referenceID"));
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
		if (criteria.getOriginalJobID() != null) {
			newCriteria.add(Restrictions.eq("originalJobID", criteria
					.getOriginalJobID()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("originalJobID")))
			newCriteria.addOrder(Order.asc("originalJobID"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("originalJobID")))
			newCriteria.addOrder(Order.desc("originalJobID"));
		if (criteria.getPreviousJobID() != null) {
			newCriteria.add(Restrictions.eq("previousJobID", criteria
					.getPreviousJobID()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("previousJobID")))
			newCriteria.addOrder(Order.asc("previousJobID"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("previousJobID")))
			newCriteria.addOrder(Order.desc("previousJobID"));
		if (criteria.getRemarks() != null) {
			newCriteria.add(Restrictions.eq("remarks", criteria.getRemarks()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("remarks")))
			newCriteria.addOrder(Order.asc("remarks"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("remarks")))
			newCriteria.addOrder(Order.desc("remarks"));
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
		if (criteria.getPreparationParty() != null) {
			newCriteria.add(Restrictions.eq("preparationParty", criteria
					.getPreparationParty()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("preparationParty")))
			newCriteria.addOrder(Order.asc("preparationParty"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("preparationParty")))
			newCriteria.addOrder(Order.desc("preparationParty"));
		if (criteria.getIssuerParty() != null) {
			newCriteria.add(Restrictions.eq("issuerParty", criteria
					.getIssuerParty()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("issuerParty")))
			newCriteria.addOrder(Order.asc("issuerParty"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("issuerParty")))
			newCriteria.addOrder(Order.desc("issuerParty"));
		if (criteria.getIssuingCountry() != null) {
			newCriteria.add(Restrictions.eq("issuingCountry", criteria
					.getIssuingCountry()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("issuingCountry")))
			newCriteria.addOrder(Order.asc("issuingCountry"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("issuingCountry")))
			newCriteria.addOrder(Order.desc("issuingCountry"));
		return newCriteria;
	}

	public void insert(CertificateOfOriginApplicationType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(CertificateOfOriginApplicationType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public CertificateOfOriginApplicationType merge(
			CertificateOfOriginApplicationType value) {
		CertificateOfOriginApplicationType newValue = null;
		Session session = getSession();
		newValue = (CertificateOfOriginApplicationType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(CertificateOfOriginApplicationType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		CertificateOfOriginApplicationType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
