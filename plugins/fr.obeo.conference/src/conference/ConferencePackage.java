/**
 */
package conference;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see conference.ConferenceFactory
 * @model kind="package"
 * @generated
 */
public interface ConferencePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "conference";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/conference";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "conference";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ConferencePackage eINSTANCE = conference.impl.ConferencePackageImpl.init();

	/**
	 * The meta object id for the '{@link conference.impl.ConferenceImpl <em>Conference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conference.impl.ConferenceImpl
	 * @see conference.impl.ConferencePackageImpl#getConference()
	 * @generated
	 */
	int CONFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Tracks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE__TRACKS = 0;

	/**
	 * The feature id for the '<em><b>Speakers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE__SPEAKERS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE__NAME = 2;

	/**
	 * The feature id for the '<em><b>Days</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE__DAYS = 3;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE__LOCATIONS = 4;

	/**
	 * The number of structural features of the '<em>Conference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link conference.impl.TalkImpl <em>Talk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conference.impl.TalkImpl
	 * @see conference.impl.ConferencePackageImpl#getTalk()
	 * @generated
	 */
	int TALK = 1;

	/**
	 * The feature id for the '<em><b>Speakers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALK__SPEAKERS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALK__NAME = 1;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALK__ABSTRACT = 2;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALK__DURATION = 3;

	/**
	 * The feature id for the '<em><b>Subjects</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALK__SUBJECTS = 4;

	/**
	 * The feature id for the '<em><b>Making Of Stories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALK__MAKING_OF_STORIES = 5;

	/**
	 * The feature id for the '<em><b>Day</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALK__DAY = 6;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALK__LOCATION = 7;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALK__TIME = 8;

	/**
	 * The number of structural features of the '<em>Talk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TALK_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link conference.impl.PersonImpl <em>Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conference.impl.PersonImpl
	 * @see conference.impl.ConferencePackageImpl#getPerson()
	 * @generated
	 */
	int PERSON = 2;

	/**
	 * The feature id for the '<em><b>Talks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__TALKS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__NAME = 1;

	/**
	 * The feature id for the '<em><b>Organisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__ORGANISATION = 2;

	/**
	 * The feature id for the '<em><b>Tracks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON__TRACKS = 3;

	/**
	 * The number of structural features of the '<em>Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSON_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link conference.impl.TrackImpl <em>Track</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conference.impl.TrackImpl
	 * @see conference.impl.ConferencePackageImpl#getTrack()
	 * @generated
	 */
	int TRACK = 3;

	/**
	 * The feature id for the '<em><b>Talks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__TALKS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__NAME = 1;

	/**
	 * The feature id for the '<em><b>Animators</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK__ANIMATORS = 2;

	/**
	 * The number of structural features of the '<em>Track</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRACK_FEATURE_COUNT = 3;


	/**
	 * The meta object id for the '{@link conference.impl.SubjectImpl <em>Subject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conference.impl.SubjectImpl
	 * @see conference.impl.ConferencePackageImpl#getSubject()
	 * @generated
	 */
	int SUBJECT = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Is Done</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT__IS_DONE = 1;

	/**
	 * The number of structural features of the '<em>Subject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_FEATURE_COUNT = 2;


	/**
	 * The meta object id for the '{@link conference.impl.DayImpl <em>Day</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conference.impl.DayImpl
	 * @see conference.impl.ConferencePackageImpl#getDay()
	 * @generated
	 */
	int DAY = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Talks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY__TALKS = 1;

	/**
	 * The number of structural features of the '<em>Day</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link conference.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conference.impl.LocationImpl
	 * @see conference.impl.ConferencePackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Talks</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__TALKS = 1;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link conference.Conference <em>Conference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conference</em>'.
	 * @see conference.Conference
	 * @generated
	 */
	EClass getConference();

	/**
	 * Returns the meta object for the containment reference list '{@link conference.Conference#getTracks <em>Tracks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tracks</em>'.
	 * @see conference.Conference#getTracks()
	 * @see #getConference()
	 * @generated
	 */
	EReference getConference_Tracks();

	/**
	 * Returns the meta object for the containment reference list '{@link conference.Conference#getSpeakers <em>Speakers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Speakers</em>'.
	 * @see conference.Conference#getSpeakers()
	 * @see #getConference()
	 * @generated
	 */
	EReference getConference_Speakers();

	/**
	 * Returns the meta object for the attribute '{@link conference.Conference#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see conference.Conference#getName()
	 * @see #getConference()
	 * @generated
	 */
	EAttribute getConference_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link conference.Conference#getDays <em>Days</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Days</em>'.
	 * @see conference.Conference#getDays()
	 * @see #getConference()
	 * @generated
	 */
	EReference getConference_Days();

	/**
	 * Returns the meta object for the containment reference list '{@link conference.Conference#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locations</em>'.
	 * @see conference.Conference#getLocations()
	 * @see #getConference()
	 * @generated
	 */
	EReference getConference_Locations();

	/**
	 * Returns the meta object for class '{@link conference.Talk <em>Talk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Talk</em>'.
	 * @see conference.Talk
	 * @generated
	 */
	EClass getTalk();

	/**
	 * Returns the meta object for the reference list '{@link conference.Talk#getSpeakers <em>Speakers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Speakers</em>'.
	 * @see conference.Talk#getSpeakers()
	 * @see #getTalk()
	 * @generated
	 */
	EReference getTalk_Speakers();

	/**
	 * Returns the meta object for the attribute '{@link conference.Talk#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see conference.Talk#getName()
	 * @see #getTalk()
	 * @generated
	 */
	EAttribute getTalk_Name();

	/**
	 * Returns the meta object for the attribute '{@link conference.Talk#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see conference.Talk#getAbstract()
	 * @see #getTalk()
	 * @generated
	 */
	EAttribute getTalk_Abstract();

	/**
	 * Returns the meta object for the attribute '{@link conference.Talk#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see conference.Talk#getDuration()
	 * @see #getTalk()
	 * @generated
	 */
	EAttribute getTalk_Duration();

	/**
	 * Returns the meta object for the containment reference list '{@link conference.Talk#getSubjects <em>Subjects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subjects</em>'.
	 * @see conference.Talk#getSubjects()
	 * @see #getTalk()
	 * @generated
	 */
	EReference getTalk_Subjects();

	/**
	 * Returns the meta object for the containment reference list '{@link conference.Talk#getMakingOfStories <em>Making Of Stories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Making Of Stories</em>'.
	 * @see conference.Talk#getMakingOfStories()
	 * @see #getTalk()
	 * @generated
	 */
	EReference getTalk_MakingOfStories();

	/**
	 * Returns the meta object for the reference '{@link conference.Talk#getDay <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Day</em>'.
	 * @see conference.Talk#getDay()
	 * @see #getTalk()
	 * @generated
	 */
	EReference getTalk_Day();

	/**
	 * Returns the meta object for the reference '{@link conference.Talk#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see conference.Talk#getLocation()
	 * @see #getTalk()
	 * @generated
	 */
	EReference getTalk_Location();

	/**
	 * Returns the meta object for the attribute '{@link conference.Talk#getTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see conference.Talk#getTime()
	 * @see #getTalk()
	 * @generated
	 */
	EAttribute getTalk_Time();

	/**
	 * Returns the meta object for class '{@link conference.Person <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Person</em>'.
	 * @see conference.Person
	 * @generated
	 */
	EClass getPerson();

	/**
	 * Returns the meta object for the reference list '{@link conference.Person#getTalks <em>Talks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Talks</em>'.
	 * @see conference.Person#getTalks()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Talks();

	/**
	 * Returns the meta object for the attribute '{@link conference.Person#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see conference.Person#getName()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Name();

	/**
	 * Returns the meta object for the attribute '{@link conference.Person#getOrganisation <em>Organisation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Organisation</em>'.
	 * @see conference.Person#getOrganisation()
	 * @see #getPerson()
	 * @generated
	 */
	EAttribute getPerson_Organisation();

	/**
	 * Returns the meta object for the reference list '{@link conference.Person#getTracks <em>Tracks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tracks</em>'.
	 * @see conference.Person#getTracks()
	 * @see #getPerson()
	 * @generated
	 */
	EReference getPerson_Tracks();

	/**
	 * Returns the meta object for class '{@link conference.Track <em>Track</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Track</em>'.
	 * @see conference.Track
	 * @generated
	 */
	EClass getTrack();

	/**
	 * Returns the meta object for the containment reference list '{@link conference.Track#getTalks <em>Talks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Talks</em>'.
	 * @see conference.Track#getTalks()
	 * @see #getTrack()
	 * @generated
	 */
	EReference getTrack_Talks();

	/**
	 * Returns the meta object for the attribute '{@link conference.Track#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see conference.Track#getName()
	 * @see #getTrack()
	 * @generated
	 */
	EAttribute getTrack_Name();

	/**
	 * Returns the meta object for the reference list '{@link conference.Track#getAnimators <em>Animators</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Animators</em>'.
	 * @see conference.Track#getAnimators()
	 * @see #getTrack()
	 * @generated
	 */
	EReference getTrack_Animators();

	/**
	 * Returns the meta object for class '{@link conference.Subject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subject</em>'.
	 * @see conference.Subject
	 * @generated
	 */
	EClass getSubject();

	/**
	 * Returns the meta object for the attribute '{@link conference.Subject#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see conference.Subject#getDescription()
	 * @see #getSubject()
	 * @generated
	 */
	EAttribute getSubject_Description();

	/**
	 * Returns the meta object for the attribute '{@link conference.Subject#isIsDone <em>Is Done</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Done</em>'.
	 * @see conference.Subject#isIsDone()
	 * @see #getSubject()
	 * @generated
	 */
	EAttribute getSubject_IsDone();

	/**
	 * Returns the meta object for class '{@link conference.Day <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Day</em>'.
	 * @see conference.Day
	 * @generated
	 */
	EClass getDay();

	/**
	 * Returns the meta object for the attribute '{@link conference.Day#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see conference.Day#getName()
	 * @see #getDay()
	 * @generated
	 */
	EAttribute getDay_Name();

	/**
	 * Returns the meta object for the reference list '{@link conference.Day#getTalks <em>Talks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Talks</em>'.
	 * @see conference.Day#getTalks()
	 * @see #getDay()
	 * @generated
	 */
	EReference getDay_Talks();

	/**
	 * Returns the meta object for class '{@link conference.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see conference.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link conference.Location#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see conference.Location#getName()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Name();

	/**
	 * Returns the meta object for the reference list '{@link conference.Location#getTalks <em>Talks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Talks</em>'.
	 * @see conference.Location#getTalks()
	 * @see #getLocation()
	 * @generated
	 */
	EReference getLocation_Talks();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ConferenceFactory getConferenceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link conference.impl.ConferenceImpl <em>Conference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conference.impl.ConferenceImpl
		 * @see conference.impl.ConferencePackageImpl#getConference()
		 * @generated
		 */
		EClass CONFERENCE = eINSTANCE.getConference();

		/**
		 * The meta object literal for the '<em><b>Tracks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFERENCE__TRACKS = eINSTANCE.getConference_Tracks();

		/**
		 * The meta object literal for the '<em><b>Speakers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFERENCE__SPEAKERS = eINSTANCE.getConference_Speakers();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFERENCE__NAME = eINSTANCE.getConference_Name();

		/**
		 * The meta object literal for the '<em><b>Days</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFERENCE__DAYS = eINSTANCE.getConference_Days();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFERENCE__LOCATIONS = eINSTANCE.getConference_Locations();

		/**
		 * The meta object literal for the '{@link conference.impl.TalkImpl <em>Talk</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conference.impl.TalkImpl
		 * @see conference.impl.ConferencePackageImpl#getTalk()
		 * @generated
		 */
		EClass TALK = eINSTANCE.getTalk();

		/**
		 * The meta object literal for the '<em><b>Speakers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TALK__SPEAKERS = eINSTANCE.getTalk_Speakers();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TALK__NAME = eINSTANCE.getTalk_Name();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TALK__ABSTRACT = eINSTANCE.getTalk_Abstract();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TALK__DURATION = eINSTANCE.getTalk_Duration();

		/**
		 * The meta object literal for the '<em><b>Subjects</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TALK__SUBJECTS = eINSTANCE.getTalk_Subjects();

		/**
		 * The meta object literal for the '<em><b>Making Of Stories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TALK__MAKING_OF_STORIES = eINSTANCE.getTalk_MakingOfStories();

		/**
		 * The meta object literal for the '<em><b>Day</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TALK__DAY = eINSTANCE.getTalk_Day();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TALK__LOCATION = eINSTANCE.getTalk_Location();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TALK__TIME = eINSTANCE.getTalk_Time();

		/**
		 * The meta object literal for the '{@link conference.impl.PersonImpl <em>Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conference.impl.PersonImpl
		 * @see conference.impl.ConferencePackageImpl#getPerson()
		 * @generated
		 */
		EClass PERSON = eINSTANCE.getPerson();

		/**
		 * The meta object literal for the '<em><b>Talks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__TALKS = eINSTANCE.getPerson_Talks();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__NAME = eINSTANCE.getPerson_Name();

		/**
		 * The meta object literal for the '<em><b>Organisation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSON__ORGANISATION = eINSTANCE.getPerson_Organisation();

		/**
		 * The meta object literal for the '<em><b>Tracks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSON__TRACKS = eINSTANCE.getPerson_Tracks();

		/**
		 * The meta object literal for the '{@link conference.impl.TrackImpl <em>Track</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conference.impl.TrackImpl
		 * @see conference.impl.ConferencePackageImpl#getTrack()
		 * @generated
		 */
		EClass TRACK = eINSTANCE.getTrack();

		/**
		 * The meta object literal for the '<em><b>Talks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACK__TALKS = eINSTANCE.getTrack_Talks();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRACK__NAME = eINSTANCE.getTrack_Name();

		/**
		 * The meta object literal for the '<em><b>Animators</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRACK__ANIMATORS = eINSTANCE.getTrack_Animators();

		/**
		 * The meta object literal for the '{@link conference.impl.SubjectImpl <em>Subject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conference.impl.SubjectImpl
		 * @see conference.impl.ConferencePackageImpl#getSubject()
		 * @generated
		 */
		EClass SUBJECT = eINSTANCE.getSubject();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBJECT__DESCRIPTION = eINSTANCE.getSubject_Description();

		/**
		 * The meta object literal for the '<em><b>Is Done</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBJECT__IS_DONE = eINSTANCE.getSubject_IsDone();

		/**
		 * The meta object literal for the '{@link conference.impl.DayImpl <em>Day</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conference.impl.DayImpl
		 * @see conference.impl.ConferencePackageImpl#getDay()
		 * @generated
		 */
		EClass DAY = eINSTANCE.getDay();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DAY__NAME = eINSTANCE.getDay_Name();

		/**
		 * The meta object literal for the '<em><b>Talks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DAY__TALKS = eINSTANCE.getDay_Talks();

		/**
		 * The meta object literal for the '{@link conference.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conference.impl.LocationImpl
		 * @see conference.impl.ConferencePackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__NAME = eINSTANCE.getLocation_Name();

		/**
		 * The meta object literal for the '<em><b>Talks</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOCATION__TALKS = eINSTANCE.getLocation_Talks();

	}

} //ConferencePackage
