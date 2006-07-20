/*******************************************************************************
 * Open E-Biz - Darrell Kundel
 *
 * Contributors:
 *   Darrell Kundel - initial API and implementation
 *******************************************************************************/
package org.openebiz.core.common.ccts;

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Context Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openebiz.core.common.ccts.ContextType#getIndustryClassification <em>Industry Classification</em>}</li>
 *   <li>{@link org.openebiz.core.common.ccts.ContextType#getGeopolitical <em>Geopolitical</em>}</li>
 *   <li>{@link org.openebiz.core.common.ccts.ContextType#getBusinessProcess <em>Business Process</em>}</li>
 *   <li>{@link org.openebiz.core.common.ccts.ContextType#getOfficialConstraint <em>Official Constraint</em>}</li>
 *   <li>{@link org.openebiz.core.common.ccts.ContextType#getProductClassification <em>Product Classification</em>}</li>
 *   <li>{@link org.openebiz.core.common.ccts.ContextType#getBusinessProcessRole <em>Business Process Role</em>}</li>
 *   <li>{@link org.openebiz.core.common.ccts.ContextType#getSupportingRole <em>Supporting Role</em>}</li>
 *   <li>{@link org.openebiz.core.common.ccts.ContextType#getSystemCapability <em>System Capability</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextType implements Serializable {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Open E-Biz - Darrell Kundel"; //$NON-NLS-1$

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * The cached value of the '{@link #getIndustryClassification() <em>Industry Classification</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndustryClassification()
	 * @generated
	 * @ordered
	 */
	protected List  industryClassification = null;

	/**
	 * The cached value of the '{@link #getGeopolitical() <em>Geopolitical</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeopolitical()
	 * @generated
	 * @ordered
	 */
	protected List  geopolitical = null;

	/**
	 * The cached value of the '{@link #getBusinessProcess() <em>Business Process</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessProcess()
	 * @generated
	 * @ordered
	 */
	protected List  businessProcess = null;

	/**
	 * The cached value of the '{@link #getOfficialConstraint() <em>Official Constraint</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfficialConstraint()
	 * @generated
	 * @ordered
	 */
	protected List  officialConstraint = null;

	/**
	 * The cached value of the '{@link #getProductClassification() <em>Product Classification</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductClassification()
	 * @generated
	 * @ordered
	 */
	protected List  productClassification = null;

	/**
	 * The cached value of the '{@link #getBusinessProcessRole() <em>Business Process Role</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBusinessProcessRole()
	 * @generated
	 * @ordered
	 */
	protected List  businessProcessRole = null;

	/**
	 * The cached value of the '{@link #getSupportingRole() <em>Supporting Role</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingRole()
	 * @generated
	 * @ordered
	 */
	protected List  supportingRole = null;

	/**
	 * The cached value of the '{@link #getSystemCapability() <em>System Capability</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemCapability()
	 * @generated
	 * @ordered
	 */
	protected List  systemCapability = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContextType() {
		super();
	}

	/**
	 * Returns the value of the '<em><b>Industry Classification</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Returning the '<em>Industry Classification</em>' attribute list
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Industry Classification</em>' attribute list.
	 * @generated
	 */
	public List getIndustryClassification() {
		if (industryClassification == null) {
			industryClassification = new ArrayList<String>();
		}
		return industryClassification;
	}

	/**
	 * Returns the value of the '<em><b>Geopolitical</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Returning the '<em>Geopolitical</em>' attribute list
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geopolitical</em>' attribute list.
	 * @generated
	 */
	public List getGeopolitical() {
		if (geopolitical == null) {
			geopolitical = new ArrayList<String>();
		}
		return geopolitical;
	}

	/**
	 * Returns the value of the '<em><b>Business Process</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Returning the '<em>Business Process</em>' attribute list
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Process</em>' attribute list.
	 * @generated
	 */
	public List getBusinessProcess() {
		if (businessProcess == null) {
			businessProcess = new ArrayList<String>();
		}
		return businessProcess;
	}

	/**
	 * Returns the value of the '<em><b>Official Constraint</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Returning the '<em>Official Constraint</em>' attribute list
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Official Constraint</em>' attribute list.
	 * @generated
	 */
	public List getOfficialConstraint() {
		if (officialConstraint == null) {
			officialConstraint = new ArrayList<String>();
		}
		return officialConstraint;
	}

	/**
	 * Returns the value of the '<em><b>Product Classification</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Returning the '<em>Product Classification</em>' attribute list
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Product Classification</em>' attribute list.
	 * @generated
	 */
	public List getProductClassification() {
		if (productClassification == null) {
			productClassification = new ArrayList<String>();
		}
		return productClassification;
	}

	/**
	 * Returns the value of the '<em><b>Business Process Role</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Returning the '<em>Business Process Role</em>' attribute list
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Business Process Role</em>' attribute list.
	 * @generated
	 */
	public List getBusinessProcessRole() {
		if (businessProcessRole == null) {
			businessProcessRole = new ArrayList<String>();
		}
		return businessProcessRole;
	}

	/**
	 * Returns the value of the '<em><b>Supporting Role</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Returning the '<em>Supporting Role</em>' attribute list
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supporting Role</em>' attribute list.
	 * @generated
	 */
	public List getSupportingRole() {
		if (supportingRole == null) {
			supportingRole = new ArrayList<String>();
		}
		return supportingRole;
	}

	/**
	 * Returns the value of the '<em><b>System Capability</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * Returning the '<em>System Capability</em>' attribute list
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Capability</em>' attribute list.
	 * @generated
	 */
	public List getSystemCapability() {
		if (systemCapability == null) {
			systemCapability = new ArrayList<String>();
		}
		return systemCapability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (industryClassification: "); //$NON-NLS-1$
		result.append(industryClassification);
		result.append(", geopolitical: "); //$NON-NLS-1$
		result.append(geopolitical);
		result.append(", businessProcess: "); //$NON-NLS-1$
		result.append(businessProcess);
		result.append(", officialConstraint: "); //$NON-NLS-1$
		result.append(officialConstraint);
		result.append(", productClassification: "); //$NON-NLS-1$
		result.append(productClassification);
		result.append(", businessProcessRole: "); //$NON-NLS-1$
		result.append(businessProcessRole);
		result.append(", supportingRole: "); //$NON-NLS-1$
		result.append(supportingRole);
		result.append(", systemCapability: "); //$NON-NLS-1$
		result.append(systemCapability);
		result.append(')');
		return result.toString();
	}

} // ContextType