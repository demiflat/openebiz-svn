package org.openebiz.dao.businessdocs;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import java.util.List;
import org.hibernate.Criteria;
import org.openebiz.core.businessdocs.CertificateOfOriginType;
import java.util.Iterator;
import org.hibernate.criterion.Restrictions;
import org.hibernate.criterion.Order;
import org.hibernate.LockMode;

public class CertificateOfOriginTypeDAOImpl extends HibernateDaoSupport implements
		CertificateOfOriginTypeDAO {


	static private final Log log = LogFactory
			.getLog(CertificateOfOriginTypeDAOImpl.class);

	public List getAll() {
		List values = null;
		Session session = getSession();
		Criteria allValues = session
				.createCriteria(CertificateOfOriginType.class);
		values = allValues.list();
		return values;
	}

	public Iterator iterateAll() {
		return getAll().iterator();
	}

	public CertificateOfOriginType getById(Long id) {
		CertificateOfOriginType value = null;
		Session session = getSession();
		value = (CertificateOfOriginType) session.load(
				CertificateOfOriginType.class, id);
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
				.createCriteria(CertificateOfOriginType.class);
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
		if (criteria.getCertificateOfOriginApplication() != null) {
			newCriteria.add(Restrictions.eq("certificateOfOriginApplication",
					criteria.getCertificateOfOriginApplication()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending
						.contains("certificateOfOriginApplication")))
			newCriteria.addOrder(Order.asc("certificateOfOriginApplication"));
		else if ((criteria.descending != null)
				&& (criteria.descending
						.contains("certificateOfOriginApplication")))
			newCriteria.addOrder(Order.desc("certificateOfOriginApplication"));
		if (criteria.getIssuerEndorsement() != null) {
			newCriteria.add(Restrictions.eq("issuerEndorsement", criteria
					.getIssuerEndorsement()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("issuerEndorsement")))
			newCriteria.addOrder(Order.asc("issuerEndorsement"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("issuerEndorsement")))
			newCriteria.addOrder(Order.desc("issuerEndorsement"));
		if (criteria.getEmbassyEndorsement() != null) {
			newCriteria.add(Restrictions.eq("embassyEndorsement", criteria
					.getEmbassyEndorsement()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("embassyEndorsement")))
			newCriteria.addOrder(Order.asc("embassyEndorsement"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("embassyEndorsement")))
			newCriteria.addOrder(Order.desc("embassyEndorsement"));
		if (criteria.getInsuranceEndorsement() != null) {
			newCriteria.add(Restrictions.eq("insuranceEndorsement", criteria
					.getInsuranceEndorsement()));
		}
		if ((criteria.ascending != null)
				&& (criteria.ascending.contains("insuranceEndorsement")))
			newCriteria.addOrder(Order.asc("insuranceEndorsement"));
		else if ((criteria.descending != null)
				&& (criteria.descending.contains("insuranceEndorsement")))
			newCriteria.addOrder(Order.desc("insuranceEndorsement"));
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

	public void insert(CertificateOfOriginType value) {
		Session session = getSession();
		session.save(value);
		if (log.isDebugEnabled())
			log.debug("inserting document: " + value);
	}

	public void update(CertificateOfOriginType value) {
		Session session = getSession();
		session.update(value);
		if (log.isDebugEnabled())
			log.debug("updating document: " + value);
	}

	public CertificateOfOriginType merge(CertificateOfOriginType value) {
		CertificateOfOriginType newValue = null;
		Session session = getSession();
		newValue = (CertificateOfOriginType) session.merge(value);
		if (log.isDebugEnabled())
			log.debug("merging document: " + value);
		return newValue;
	}

	public void delete(CertificateOfOriginType value) {
		Session session = getSession();
		session.refresh(value, LockMode.UPGRADE);
		session.delete(value);
		if (log.isDebugEnabled())
			log.debug("deleting document: " + value);
	}

	public void delete(Long id) {
		CertificateOfOriginType value = getById(id);
		Session session = getSession();
		if (value != null) {
			session.refresh(value, LockMode.UPGRADE);
			session.delete(value);
			if (log.isDebugEnabled())
				log.debug("deleting document: " + value + " by ID:" + id);
		}
	}
}
