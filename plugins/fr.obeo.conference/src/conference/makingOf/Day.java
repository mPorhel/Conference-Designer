/**
 */
package conference.makingOf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Day</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link conference.makingOf.Day#getName <em>Name</em>}</li>
 *   <li>{@link conference.makingOf.Day#getTasks <em>Tasks</em>}</li>
 *   <li>{@link conference.makingOf.Day#getIdeas <em>Ideas</em>}</li>
 *   <li>{@link conference.makingOf.Day#getParticipants <em>Participants</em>}</li>
 * </ul>
 *
 * @see conference.makingOf.MakingOfPackage#getDay()
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
	 * @see conference.makingOf.MakingOfPackage#getDay_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link conference.makingOf.Day#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link conference.makingOf.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see conference.makingOf.MakingOfPackage#getDay_Tasks()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Task> getTasks();

	/**
	 * Returns the value of the '<em><b>Ideas</b></em>' containment reference list.
	 * The list contents are of type {@link conference.makingOf.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ideas</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ideas</em>' containment reference list.
	 * @see conference.makingOf.MakingOfPackage#getDay_Ideas()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Task> getIdeas();

	/**
	 * Returns the value of the '<em><b>Participants</b></em>' containment reference list.
	 * The list contents are of type {@link conference.makingOf.Participant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participants</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participants</em>' containment reference list.
	 * @see conference.makingOf.MakingOfPackage#getDay_Participants()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Participant> getParticipants();

} // Day
