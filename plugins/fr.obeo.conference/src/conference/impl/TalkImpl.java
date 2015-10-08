/**
 */
package conference.impl;

import conference.ConferencePackage;
import conference.Day;
import conference.Location;
import conference.Person;
import conference.Subject;
import conference.Talk;

import conference.makingOf.Story;
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
 * An implementation of the model object '<em><b>Talk</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link conference.impl.TalkImpl#getSpeakers <em>Speakers</em>}</li>
 *   <li>{@link conference.impl.TalkImpl#getName <em>Name</em>}</li>
 *   <li>{@link conference.impl.TalkImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link conference.impl.TalkImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link conference.impl.TalkImpl#getSubjects <em>Subjects</em>}</li>
 *   <li>{@link conference.impl.TalkImpl#getMakingOfStories <em>Making Of Stories</em>}</li>
 *   <li>{@link conference.impl.TalkImpl#getDay <em>Day</em>}</li>
 *   <li>{@link conference.impl.TalkImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link conference.impl.TalkImpl#getTime <em>Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TalkImpl extends EObjectImpl implements Talk {
	/**
	 * The cached value of the '{@link #getSpeakers() <em>Speakers</em>}' reference list.
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
	 * The default value of the '{@link #getAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final String ABSTRACT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected String abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final int DURATION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected int duration = DURATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubjects() <em>Subjects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjects()
	 * @generated
	 * @ordered
	 */
	protected EList<Subject> subjects;

	/**
	 * The cached value of the '{@link #getMakingOfStories() <em>Making Of Stories</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMakingOfStories()
	 * @generated
	 * @ordered
	 */
	protected EList<Story> makingOfStories;

	/**
	 * The cached value of the '{@link #getDay() <em>Day</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDay()
	 * @generated
	 * @ordered
	 */
	protected Day day;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Location location;

	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected String time = TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TalkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConferencePackage.Literals.TALK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Person> getSpeakers() {
		if (speakers == null) {
			speakers = new EObjectWithInverseResolvingEList.ManyInverse<Person>(Person.class, this, ConferencePackage.TALK__SPEAKERS, ConferencePackage.PERSON__TALKS);
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
			eNotify(new ENotificationImpl(this, Notification.SET, ConferencePackage.TALK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(String newAbstract) {
		String oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConferencePackage.TALK__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(int newDuration) {
		int oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConferencePackage.TALK__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subject> getSubjects() {
		if (subjects == null) {
			subjects = new EObjectContainmentEList<Subject>(Subject.class, this, ConferencePackage.TALK__SUBJECTS);
		}
		return subjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Story> getMakingOfStories() {
		if (makingOfStories == null) {
			makingOfStories = new EObjectContainmentEList<Story>(Story.class, this, ConferencePackage.TALK__MAKING_OF_STORIES);
		}
		return makingOfStories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Day getDay() {
		if (day != null && day.eIsProxy()) {
			InternalEObject oldDay = (InternalEObject)day;
			day = (Day)eResolveProxy(oldDay);
			if (day != oldDay) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConferencePackage.TALK__DAY, oldDay, day));
			}
		}
		return day;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Day basicGetDay() {
		return day;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDay(Day newDay, NotificationChain msgs) {
		Day oldDay = day;
		day = newDay;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConferencePackage.TALK__DAY, oldDay, newDay);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDay(Day newDay) {
		if (newDay != day) {
			NotificationChain msgs = null;
			if (day != null)
				msgs = ((InternalEObject)day).eInverseRemove(this, ConferencePackage.DAY__TALKS, Day.class, msgs);
			if (newDay != null)
				msgs = ((InternalEObject)newDay).eInverseAdd(this, ConferencePackage.DAY__TALKS, Day.class, msgs);
			msgs = basicSetDay(newDay, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConferencePackage.TALK__DAY, newDay, newDay));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getLocation() {
		if (location != null && location.eIsProxy()) {
			InternalEObject oldLocation = (InternalEObject)location;
			location = (Location)eResolveProxy(oldLocation);
			if (location != oldLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ConferencePackage.TALK__LOCATION, oldLocation, location));
			}
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Location newLocation, NotificationChain msgs) {
		Location oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConferencePackage.TALK__LOCATION, oldLocation, newLocation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Location newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject)location).eInverseRemove(this, ConferencePackage.LOCATION__TALKS, Location.class, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject)newLocation).eInverseAdd(this, ConferencePackage.LOCATION__TALKS, Location.class, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConferencePackage.TALK__LOCATION, newLocation, newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(String newTime) {
		String oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConferencePackage.TALK__TIME, oldTime, time));
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
			case ConferencePackage.TALK__SPEAKERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpeakers()).basicAdd(otherEnd, msgs);
			case ConferencePackage.TALK__DAY:
				if (day != null)
					msgs = ((InternalEObject)day).eInverseRemove(this, ConferencePackage.DAY__TALKS, Day.class, msgs);
				return basicSetDay((Day)otherEnd, msgs);
			case ConferencePackage.TALK__LOCATION:
				if (location != null)
					msgs = ((InternalEObject)location).eInverseRemove(this, ConferencePackage.LOCATION__TALKS, Location.class, msgs);
				return basicSetLocation((Location)otherEnd, msgs);
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
			case ConferencePackage.TALK__SPEAKERS:
				return ((InternalEList<?>)getSpeakers()).basicRemove(otherEnd, msgs);
			case ConferencePackage.TALK__SUBJECTS:
				return ((InternalEList<?>)getSubjects()).basicRemove(otherEnd, msgs);
			case ConferencePackage.TALK__MAKING_OF_STORIES:
				return ((InternalEList<?>)getMakingOfStories()).basicRemove(otherEnd, msgs);
			case ConferencePackage.TALK__DAY:
				return basicSetDay(null, msgs);
			case ConferencePackage.TALK__LOCATION:
				return basicSetLocation(null, msgs);
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
			case ConferencePackage.TALK__SPEAKERS:
				return getSpeakers();
			case ConferencePackage.TALK__NAME:
				return getName();
			case ConferencePackage.TALK__ABSTRACT:
				return getAbstract();
			case ConferencePackage.TALK__DURATION:
				return getDuration();
			case ConferencePackage.TALK__SUBJECTS:
				return getSubjects();
			case ConferencePackage.TALK__MAKING_OF_STORIES:
				return getMakingOfStories();
			case ConferencePackage.TALK__DAY:
				if (resolve) return getDay();
				return basicGetDay();
			case ConferencePackage.TALK__LOCATION:
				if (resolve) return getLocation();
				return basicGetLocation();
			case ConferencePackage.TALK__TIME:
				return getTime();
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
			case ConferencePackage.TALK__SPEAKERS:
				getSpeakers().clear();
				getSpeakers().addAll((Collection<? extends Person>)newValue);
				return;
			case ConferencePackage.TALK__NAME:
				setName((String)newValue);
				return;
			case ConferencePackage.TALK__ABSTRACT:
				setAbstract((String)newValue);
				return;
			case ConferencePackage.TALK__DURATION:
				setDuration((Integer)newValue);
				return;
			case ConferencePackage.TALK__SUBJECTS:
				getSubjects().clear();
				getSubjects().addAll((Collection<? extends Subject>)newValue);
				return;
			case ConferencePackage.TALK__MAKING_OF_STORIES:
				getMakingOfStories().clear();
				getMakingOfStories().addAll((Collection<? extends Story>)newValue);
				return;
			case ConferencePackage.TALK__DAY:
				setDay((Day)newValue);
				return;
			case ConferencePackage.TALK__LOCATION:
				setLocation((Location)newValue);
				return;
			case ConferencePackage.TALK__TIME:
				setTime((String)newValue);
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
			case ConferencePackage.TALK__SPEAKERS:
				getSpeakers().clear();
				return;
			case ConferencePackage.TALK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ConferencePackage.TALK__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case ConferencePackage.TALK__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case ConferencePackage.TALK__SUBJECTS:
				getSubjects().clear();
				return;
			case ConferencePackage.TALK__MAKING_OF_STORIES:
				getMakingOfStories().clear();
				return;
			case ConferencePackage.TALK__DAY:
				setDay((Day)null);
				return;
			case ConferencePackage.TALK__LOCATION:
				setLocation((Location)null);
				return;
			case ConferencePackage.TALK__TIME:
				setTime(TIME_EDEFAULT);
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
			case ConferencePackage.TALK__SPEAKERS:
				return speakers != null && !speakers.isEmpty();
			case ConferencePackage.TALK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ConferencePackage.TALK__ABSTRACT:
				return ABSTRACT_EDEFAULT == null ? abstract_ != null : !ABSTRACT_EDEFAULT.equals(abstract_);
			case ConferencePackage.TALK__DURATION:
				return duration != DURATION_EDEFAULT;
			case ConferencePackage.TALK__SUBJECTS:
				return subjects != null && !subjects.isEmpty();
			case ConferencePackage.TALK__MAKING_OF_STORIES:
				return makingOfStories != null && !makingOfStories.isEmpty();
			case ConferencePackage.TALK__DAY:
				return day != null;
			case ConferencePackage.TALK__LOCATION:
				return location != null;
			case ConferencePackage.TALK__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
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
		result.append(", abstract: ");
		result.append(abstract_);
		result.append(", duration: ");
		result.append(duration);
		result.append(", time: ");
		result.append(time);
		result.append(')');
		return result.toString();
	}

} //TalkImpl
