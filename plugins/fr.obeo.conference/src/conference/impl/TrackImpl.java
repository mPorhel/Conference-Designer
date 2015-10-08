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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Track</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link conference.impl.TrackImpl#getTalks <em>Talks</em>}</li>
 *   <li>{@link conference.impl.TrackImpl#getName <em>Name</em>}</li>
 *   <li>{@link conference.impl.TrackImpl#getAnimators <em>Animators</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TrackImpl extends EObjectImpl implements Track {
	/**
	 * The cached value of the '{@link #getTalks() <em>Talks</em>}' containment reference list.
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
	 * The cached value of the '{@link #getAnimators() <em>Animators</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnimators()
	 * @generated
	 * @ordered
	 */
	protected EList<Person> animators;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConferencePackage.Literals.TRACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Talk> getTalks() {
		if (talks == null) {
			talks = new EObjectContainmentEList<Talk>(Talk.class, this, ConferencePackage.TRACK__TALKS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConferencePackage.TRACK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getAnimators() {
		if (animators == null) {
			animators = new EObjectWithInverseResolvingEList.ManyInverse<Person>(Person.class, this, ConferencePackage.TRACK__ANIMATORS, ConferencePackage.PERSON__TRACKS);
		}
		return animators;
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
			case ConferencePackage.TRACK__ANIMATORS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAnimators()).basicAdd(otherEnd, msgs);
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
			case ConferencePackage.TRACK__TALKS:
				return ((InternalEList<?>)getTalks()).basicRemove(otherEnd, msgs);
			case ConferencePackage.TRACK__ANIMATORS:
				return ((InternalEList<?>)getAnimators()).basicRemove(otherEnd, msgs);
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
			case ConferencePackage.TRACK__TALKS:
				return getTalks();
			case ConferencePackage.TRACK__NAME:
				return getName();
			case ConferencePackage.TRACK__ANIMATORS:
				return getAnimators();
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
			case ConferencePackage.TRACK__TALKS:
				getTalks().clear();
				getTalks().addAll((Collection<? extends Talk>)newValue);
				return;
			case ConferencePackage.TRACK__NAME:
				setName((String)newValue);
				return;
			case ConferencePackage.TRACK__ANIMATORS:
				getAnimators().clear();
				getAnimators().addAll((Collection<? extends Person>)newValue);
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
			case ConferencePackage.TRACK__TALKS:
				getTalks().clear();
				return;
			case ConferencePackage.TRACK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConferencePackage.TRACK__ANIMATORS:
				getAnimators().clear();
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
			case ConferencePackage.TRACK__TALKS:
				return talks != null && !talks.isEmpty();
			case ConferencePackage.TRACK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConferencePackage.TRACK__ANIMATORS:
				return animators != null && !animators.isEmpty();
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

} //TrackImpl
