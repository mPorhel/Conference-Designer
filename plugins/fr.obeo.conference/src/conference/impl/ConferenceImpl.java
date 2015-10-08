/**
 */
package conference.impl;

import conference.Conference;
import conference.ConferencePackage;
import conference.Day;
import conference.Location;
import conference.Person;
import conference.Track;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link conference.impl.ConferenceImpl#getTracks <em>Tracks</em>}</li>
 *   <li>{@link conference.impl.ConferenceImpl#getSpeakers <em>Speakers</em>}</li>
 *   <li>{@link conference.impl.ConferenceImpl#getName <em>Name</em>}</li>
 *   <li>{@link conference.impl.ConferenceImpl#getDays <em>Days</em>}</li>
 *   <li>{@link conference.impl.ConferenceImpl#getLocations <em>Locations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConferenceImpl extends EObjectImpl implements Conference {
	/**
	 * The cached value of the '{@link #getTracks() <em>Tracks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTracks()
	 * @generated
	 * @ordered
	 */
	protected EList<Track> tracks;

	/**
	 * The cached value of the '{@link #getSpeakers() <em>Speakers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeakers()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> speakers;

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
	 * The cached value of the '{@link #getDays() <em>Days</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDays()
	 * @generated
	 * @ordered
	 */
	protected EList<Day> days;

	/**
	 * The cached value of the '{@link #getLocations() <em>Locations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> locations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConferencePackage.Literals.CONFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Track> getTracks() {
		if (tracks == null) {
			tracks = new EObjectContainmentEList<Track>(Track.class, this, ConferencePackage.CONFERENCE__TRACKS);
		}
		return tracks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getSpeakers() {
		if (speakers == null) {
			speakers = new EObjectContainmentEList<Person>(Person.class, this, ConferencePackage.CONFERENCE__SPEAKERS);
		}
		return speakers;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConferencePackage.CONFERENCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Day> getDays() {
		if (days == null) {
			days = new EObjectContainmentEList<Day>(Day.class, this, ConferencePackage.CONFERENCE__DAYS);
		}
		return days;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Location> getLocations() {
		if (locations == null) {
			locations = new EObjectContainmentEList<Location>(Location.class, this, ConferencePackage.CONFERENCE__LOCATIONS);
		}
		return locations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConferencePackage.CONFERENCE__TRACKS:
				return ((InternalEList<?>)getTracks()).basicRemove(otherEnd, msgs);
			case ConferencePackage.CONFERENCE__SPEAKERS:
				return ((InternalEList<?>)getSpeakers()).basicRemove(otherEnd, msgs);
			case ConferencePackage.CONFERENCE__DAYS:
				return ((InternalEList<?>)getDays()).basicRemove(otherEnd, msgs);
			case ConferencePackage.CONFERENCE__LOCATIONS:
				return ((InternalEList<?>)getLocations()).basicRemove(otherEnd, msgs);
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
			case ConferencePackage.CONFERENCE__TRACKS:
				return getTracks();
			case ConferencePackage.CONFERENCE__SPEAKERS:
				return getSpeakers();
			case ConferencePackage.CONFERENCE__NAME:
				return getName();
			case ConferencePackage.CONFERENCE__DAYS:
				return getDays();
			case ConferencePackage.CONFERENCE__LOCATIONS:
				return getLocations();
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
			case ConferencePackage.CONFERENCE__TRACKS:
				getTracks().clear();
				getTracks().addAll((Collection<? extends Track>)newValue);
				return;
			case ConferencePackage.CONFERENCE__SPEAKERS:
				getSpeakers().clear();
				getSpeakers().addAll((Collection<? extends Person>)newValue);
				return;
			case ConferencePackage.CONFERENCE__NAME:
				setName((String)newValue);
				return;
			case ConferencePackage.CONFERENCE__DAYS:
				getDays().clear();
				getDays().addAll((Collection<? extends Day>)newValue);
				return;
			case ConferencePackage.CONFERENCE__LOCATIONS:
				getLocations().clear();
				getLocations().addAll((Collection<? extends Location>)newValue);
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
			case ConferencePackage.CONFERENCE__TRACKS:
				getTracks().clear();
				return;
			case ConferencePackage.CONFERENCE__SPEAKERS:
				getSpeakers().clear();
				return;
			case ConferencePackage.CONFERENCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConferencePackage.CONFERENCE__DAYS:
				getDays().clear();
				return;
			case ConferencePackage.CONFERENCE__LOCATIONS:
				getLocations().clear();
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
			case ConferencePackage.CONFERENCE__TRACKS:
				return tracks != null && !tracks.isEmpty();
			case ConferencePackage.CONFERENCE__SPEAKERS:
				return speakers != null && !speakers.isEmpty();
			case ConferencePackage.CONFERENCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConferencePackage.CONFERENCE__DAYS:
				return days != null && !days.isEmpty();
			case ConferencePackage.CONFERENCE__LOCATIONS:
				return locations != null && !locations.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //ConferenceImpl
