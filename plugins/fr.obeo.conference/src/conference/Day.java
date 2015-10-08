/**
 */
package conference;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Day</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link conference.Day#getName <em>Name</em>}</li>
 *   <li>{@link conference.Day#getTalks <em>Talks</em>}</li>
 * </ul>
 * </p>
 *
 * @see conference.ConferencePackage#getDay()
 * @model
 * @generated
 */
public interface Day extends EObject {
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
	 * @see conference.ConferencePackage#getDay_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link conference.Day#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Talks</b></em>' reference list.
	 * The list contents are of type {@link conference.Talk}.
	 * It is bidirectional and its opposite is '{@link conference.Talk#getDay <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Talks</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Talks</em>' reference list.
	 * @see conference.ConferencePackage#getDay_Talks()
	 * @see conference.Talk#getDay
	 * @model opposite="day"
	 * @generated
	 */
	EList<Talk> getTalks();

} // Day
