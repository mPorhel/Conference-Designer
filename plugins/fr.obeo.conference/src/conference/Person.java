/**
 */
package conference;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link conference.Person#getTalks <em>Talks</em>}</li>
 *   <li>{@link conference.Person#getName <em>Name</em>}</li>
 *   <li>{@link conference.Person#getOrganisation <em>Organisation</em>}</li>
 *   <li>{@link conference.Person#getTracks <em>Tracks</em>}</li>
 * </ul>
 * </p>
 *
 * @see conference.ConferencePackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>Talks</b></em>' reference list.
	 * The list contents are of type {@link conference.Talk}.
	 * It is bidirectional and its opposite is '{@link conference.Talk#getSpeakers <em>Speakers</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Talks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Talks</em>' reference list.
	 * @see conference.ConferencePackage#getPerson_Talks()
	 * @see conference.Talk#getSpeakers
	 * @model opposite="speakers"
	 * @generated
	 */
	EList<Talk> getTalks();

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
	 * @see conference.ConferencePackage#getPerson_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link conference.Person#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Organisation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organisation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organisation</em>' attribute.
	 * @see #setOrganisation(String)
	 * @see conference.ConferencePackage#getPerson_Organisation()
	 * @model
	 * @generated
	 */
	String getOrganisation();

	/**
	 * Sets the value of the '{@link conference.Person#getOrganisation <em>Organisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organisation</em>' attribute.
	 * @see #getOrganisation()
	 * @generated
	 */
	void setOrganisation(String value);

	/**
	 * Returns the value of the '<em><b>Tracks</b></em>' reference list.
	 * The list contents are of type {@link conference.Track}.
	 * It is bidirectional and its opposite is '{@link conference.Track#getAnimators <em>Animators</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tracks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tracks</em>' reference list.
	 * @see conference.ConferencePackage#getPerson_Tracks()
	 * @see conference.Track#getAnimators
	 * @model opposite="animators"
	 * @generated
	 */
	EList<Track> getTracks();

} // Person
