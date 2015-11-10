/**
 */
package conference.impl;

import conference.ConferencePackage;
import conference.Person;
import conference.Talk;
import conference.Track;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conference.impl.PersonImpl#getTalks <em>Talks</em>}</li>
 *   <li>{@link conference.impl.PersonImpl#getName <em>Name</em>}</li>
 *   <li>{@link conference.impl.PersonImpl#getOrganisation <em>Organisation</em>}</li>
 *   <li>{@link conference.impl.PersonImpl#getTracks <em>Tracks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PersonImpl extends EObjectImpl implements Person {
	/**
	 * The cached value of the '{@link #getTalks() <em>Talks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTalks()
	 * @generated
	 * @ordered
	 */
	protected EList<Talk> talks;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrganisation() <em>Organisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganisation()
	 * @generated
	 * @ordered
	 */
	protected static final String ORGANISATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrganisation() <em>Organisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrganisation()
	 * @generated
	 * @ordered
	 */
	protected String organisation = ORGANISATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTracks() <em>Tracks</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTracks()
	 * @generated
	 * @ordered
	 */
	protected EList<Track> tracks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConferencePackage.Literals.PERSON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Talk> getTalks() {
		if (talks == null) {
			talks = new EObjectWithInverseResolvingEList.ManyInverse<Talk>(Talk.class, this, ConferencePackage.PERSON__TALKS, ConferencePackage.TALK__SPEAKERS);
		}
		return talks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConferencePackage.PERSON__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrganisation() {
		return organisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrganisation(String newOrganisation) {
		String oldOrganisation = organisation;
		organisation = newOrganisation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConferencePackage.PERSON__ORGANISATION, oldOrganisation, organisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Track> getTracks() {
		if (tracks == null) {
			tracks = new EObjectWithInverseResolvingEList.ManyInverse<Track>(Track.class, this, ConferencePackage.PERSON__TRACKS, ConferencePackage.TRACK__ANIMATORS);
		}
		return tracks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConferencePackage.PERSON__TALKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTalks()).basicAdd(otherEnd, msgs);
			case ConferencePackage.PERSON__TRACKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTracks()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConferencePackage.PERSON__TALKS:
				return ((InternalEList<?>)getTalks()).basicRemove(otherEnd, msgs);
			case ConferencePackage.PERSON__TRACKS:
				return ((InternalEList<?>)getTracks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConferencePackage.PERSON__TALKS:
				return getTalks();
			case ConferencePackage.PERSON__NAME:
				return getName();
			case ConferencePackage.PERSON__ORGANISATION:
				return getOrganisation();
			case ConferencePackage.PERSON__TRACKS:
				return getTracks();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConferencePackage.PERSON__TALKS:
				getTalks().clear();
				getTalks().addAll((Collection<? extends Talk>)newValue);
				return;
			case ConferencePackage.PERSON__NAME:
				setName((String)newValue);
				return;
			case ConferencePackage.PERSON__ORGANISATION:
				setOrganisation((String)newValue);
				return;
			case ConferencePackage.PERSON__TRACKS:
				getTracks().clear();
				getTracks().addAll((Collection<? extends Track>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ConferencePackage.PERSON__TALKS:
				getTalks().clear();
				return;
			case ConferencePackage.PERSON__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConferencePackage.PERSON__ORGANISATION:
				setOrganisation(ORGANISATION_EDEFAULT);
				return;
			case ConferencePackage.PERSON__TRACKS:
				getTracks().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ConferencePackage.PERSON__TALKS:
				return talks != null && !talks.isEmpty();
			case ConferencePackage.PERSON__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConferencePackage.PERSON__ORGANISATION:
				return ORGANISATION_EDEFAULT == null ? organisation != null : !ORGANISATION_EDEFAULT.equals(organisation);
			case ConferencePackage.PERSON__TRACKS:
				return tracks != null && !tracks.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", organisation: ");
		result.append(organisation);
		result.append(')');
		return result.toString();
	}

} //PersonImpl
