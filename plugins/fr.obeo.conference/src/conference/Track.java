/**
 */
package conference;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Track</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link conference.Track#getTalks <em>Talks</em>}</li>
 *   <li>{@link conference.Track#getName <em>Name</em>}</li>
 *   <li>{@link conference.Track#getAnimators <em>Animators</em>}</li>
 * </ul>
 * </p>
 *
 * @see conference.ConferencePackage#getTrack()
 * @model
 * @generated
 */
public interface Track extends EObject {
	/**
	 * Returns the value of the '<em><b>Talks</b></em>' containment reference list.
	 * The list contents are of type {@link conference.Talk}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Talks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Talks</em>' containment reference list.
	 * @see conference.ConferencePackage#getTrack_Talks()
	 * @model containment="true"
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
	 * @see conference.ConferencePackage#getTrack_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link conference.Track#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Animators</b></em>' reference list.
	 * The list contents are of type {@link conference.Person}.
	 * It is bidirectional and its opposite is '{@link conference.Person#getTracks <em>Tracks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Animators</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Animators</em>' reference list.
	 * @see conference.ConferencePackage#getTrack_Animators()
	 * @see conference.Person#getTracks
	 * @model opposite="tracks"
	 * @generated
	 */
	EList<Person> getAnimators();

} // Track
