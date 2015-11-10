/**
 */
package conference;

import conference.makingOf.Story;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Talk</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conference.Talk#getSpeakers <em>Speakers</em>}</li>
 *   <li>{@link conference.Talk#getName <em>Name</em>}</li>
 *   <li>{@link conference.Talk#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link conference.Talk#getDuration <em>Duration</em>}</li>
 *   <li>{@link conference.Talk#getSubjects <em>Subjects</em>}</li>
 *   <li>{@link conference.Talk#getMakingOfStories <em>Making Of Stories</em>}</li>
 *   <li>{@link conference.Talk#getDay <em>Day</em>}</li>
 *   <li>{@link conference.Talk#getLocation <em>Location</em>}</li>
 *   <li>{@link conference.Talk#getTime <em>Time</em>}</li>
 * </ul>
 *
 * @see conference.ConferencePackage#getTalk()
 * @model
 * @generated
 */
public interface Talk extends EObject {
	/**
	 * Returns the value of the '<em><b>Speakers</b></em>' reference list.
	 * The list contents are of type {@link conference.Person}.
	 * It is bidirectional and its opposite is '{@link conference.Person#getTalks <em>Talks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Speakers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Speakers</em>' reference list.
	 * @see conference.ConferencePackage#getTalk_Speakers()
	 * @see conference.Person#getTalks
	 * @model opposite="talks"
	 * @generated
	 */
	EList<Person> getSpeakers();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see conference.ConferencePackage#getTalk_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link conference.Talk#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' attribute.
	 * @see #setAbstract(String)
	 * @see conference.ConferencePackage#getTalk_Abstract()
	 * @model
	 * @generated
	 */
	String getAbstract();

	/**
	 * Sets the value of the '{@link conference.Talk#getAbstract <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' attribute.
	 * @see #getAbstract()
	 * @generated
	 */
	void setAbstract(String value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(int)
	 * @see conference.ConferencePackage#getTalk_Duration()
	 * @model
	 * @generated
	 */
	int getDuration();

	/**
	 * Sets the value of the '{@link conference.Talk#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(int value);

	/**
	 * Returns the value of the '<em><b>Subjects</b></em>' containment reference list.
	 * The list contents are of type {@link conference.Subject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subjects</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subjects</em>' containment reference list.
	 * @see conference.ConferencePackage#getTalk_Subjects()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Subject> getSubjects();

	/**
	 * Returns the value of the '<em><b>Making Of Stories</b></em>' containment reference list.
	 * The list contents are of type {@link conference.makingOf.Story}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Making Of Stories</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Making Of Stories</em>' containment reference list.
	 * @see conference.ConferencePackage#getTalk_MakingOfStories()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Story> getMakingOfStories();

	/**
	 * Returns the value of the '<em><b>Day</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conference.Day#getTalks <em>Talks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Day</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Day</em>' reference.
	 * @see #setDay(Day)
	 * @see conference.ConferencePackage#getTalk_Day()
	 * @see conference.Day#getTalks
	 * @model opposite="talks"
	 * @generated
	 */
	Day getDay();

	/**
	 * Sets the value of the '{@link conference.Talk#getDay <em>Day</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Day</em>' reference.
	 * @see #getDay()
	 * @generated
	 */
	void setDay(Day value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link conference.Location#getTalks <em>Talks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' reference.
	 * @see #setLocation(Location)
	 * @see conference.ConferencePackage#getTalk_Location()
	 * @see conference.Location#getTalks
	 * @model opposite="talks"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link conference.Talk#getLocation <em>Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(String)
	 * @see conference.ConferencePackage#getTalk_Time()
	 * @model
	 * @generated
	 */
	String getTime();

	/**
	 * Sets the value of the '{@link conference.Talk#getTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(String value);

} // Talk
