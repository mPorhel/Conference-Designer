/**
 */
package conference.makingOf.impl;

import conference.Person;

import conference.makingOf.Attitude;
import conference.makingOf.MakingOfPackage;
import conference.makingOf.Participant;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link conference.makingOf.impl.ParticipantImpl#getAge <em>Age</em>}</li>
 *   <li>{@link conference.makingOf.impl.ParticipantImpl#getPerson <em>Person</em>}</li>
 *   <li>{@link conference.makingOf.impl.ParticipantImpl#getAttitude <em>Attitude</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ParticipantImpl extends EObjectImpl implements Participant {
	/**
	 * The default value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected static final int AGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected int age = AGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPerson() <em>Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerson()
	 * @generated
	 * @ordered
	 */
	protected Person person;

	/**
	 * The default value of the '{@link #getAttitude() <em>Attitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttitude()
	 * @generated
	 * @ordered
	 */
	protected static final Attitude ATTITUDE_EDEFAULT = Attitude.SERIOUS;

	/**
	 * The cached value of the '{@link #getAttitude() <em>Attitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttitude()
	 * @generated
	 * @ordered
	 */
	protected Attitude attitude = ATTITUDE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParticipantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MakingOfPackage.Literals.PARTICIPANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAge() {
		return age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAge(int newAge) {
		int oldAge = age;
		age = newAge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MakingOfPackage.PARTICIPANT__AGE, oldAge, age));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person getPerson() {
		if (person != null && person.eIsProxy()) {
			InternalEObject oldPerson = (InternalEObject)person;
			person = (Person)eResolveProxy(oldPerson);
			if (person != oldPerson) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MakingOfPackage.PARTICIPANT__PERSON, oldPerson, person));
			}
		}
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Person basicGetPerson() {
		return person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPerson(Person newPerson) {
		Person oldPerson = person;
		person = newPerson;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MakingOfPackage.PARTICIPANT__PERSON, oldPerson, person));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Attitude getAttitude() {
		return attitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttitude(Attitude newAttitude) {
		Attitude oldAttitude = attitude;
		attitude = newAttitude == null ? ATTITUDE_EDEFAULT : newAttitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MakingOfPackage.PARTICIPANT__ATTITUDE, oldAttitude, attitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MakingOfPackage.PARTICIPANT__AGE:
				return getAge();
			case MakingOfPackage.PARTICIPANT__PERSON:
				if (resolve) return getPerson();
				return basicGetPerson();
			case MakingOfPackage.PARTICIPANT__ATTITUDE:
				return getAttitude();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MakingOfPackage.PARTICIPANT__AGE:
				setAge((Integer)newValue);
				return;
			case MakingOfPackage.PARTICIPANT__PERSON:
				setPerson((Person)newValue);
				return;
			case MakingOfPackage.PARTICIPANT__ATTITUDE:
				setAttitude((Attitude)newValue);
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
			case MakingOfPackage.PARTICIPANT__AGE:
				setAge(AGE_EDEFAULT);
				return;
			case MakingOfPackage.PARTICIPANT__PERSON:
				setPerson((Person)null);
				return;
			case MakingOfPackage.PARTICIPANT__ATTITUDE:
				setAttitude(ATTITUDE_EDEFAULT);
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
			case MakingOfPackage.PARTICIPANT__AGE:
				return age != AGE_EDEFAULT;
			case MakingOfPackage.PARTICIPANT__PERSON:
				return person != null;
			case MakingOfPackage.PARTICIPANT__ATTITUDE:
				return attitude != ATTITUDE_EDEFAULT;
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
		result.append(" (age: ");
		result.append(age);
		result.append(", attitude: ");
		result.append(attitude);
		result.append(')');
		return result.toString();
	}

} //ParticipantImpl
