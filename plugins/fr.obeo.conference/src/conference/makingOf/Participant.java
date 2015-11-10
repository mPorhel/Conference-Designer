/**
 */
package conference.makingOf;

import conference.Person;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conference.makingOf.Participant#getAge <em>Age</em>}</li>
 *   <li>{@link conference.makingOf.Participant#getPerson <em>Person</em>}</li>
 *   <li>{@link conference.makingOf.Participant#getAttitude <em>Attitude</em>}</li>
 * </ul>
 *
 * @see conference.makingOf.MakingOfPackage#getParticipant()
 * @model
 * @generated
 */
public interface Participant extends EObject {
	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Age</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' attribute.
	 * @see #setAge(int)
	 * @see conference.makingOf.MakingOfPackage#getParticipant_Age()
	 * @model
	 * @generated
	 */
	int getAge();

	/**
	 * Sets the value of the '{@link conference.makingOf.Participant#getAge <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' attribute.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(int value);

	/**
	 * Returns the value of the '<em><b>Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person</em>' reference.
	 * @see #setPerson(Person)
	 * @see conference.makingOf.MakingOfPackage#getParticipant_Person()
	 * @model
	 * @generated
	 */
	Person getPerson();

	/**
	 * Sets the value of the '{@link conference.makingOf.Participant#getPerson <em>Person</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Person</em>' reference.
	 * @see #getPerson()
	 * @generated
	 */
	void setPerson(Person value);

	/**
	 * Returns the value of the '<em><b>Attitude</b></em>' attribute.
	 * The literals are from the enumeration {@link conference.makingOf.Attitude}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attitude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attitude</em>' attribute.
	 * @see conference.makingOf.Attitude
	 * @see #setAttitude(Attitude)
	 * @see conference.makingOf.MakingOfPackage#getParticipant_Attitude()
	 * @model
	 * @generated
	 */
	Attitude getAttitude();

	/**
	 * Sets the value of the '{@link conference.makingOf.Participant#getAttitude <em>Attitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attitude</em>' attribute.
	 * @see conference.makingOf.Attitude
	 * @see #getAttitude()
	 * @generated
	 */
	void setAttitude(Attitude value);

} // Participant
