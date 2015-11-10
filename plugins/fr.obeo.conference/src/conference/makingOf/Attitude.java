/**
 */
package conference.makingOf;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Attitude</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see conference.makingOf.MakingOfPackage#getAttitude()
 * @model
 * @generated
 */
public enum Attitude implements Enumerator {
	/**
	 * The '<em><b>Serious</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SERIOUS_VALUE
	 * @generated
	 * @ordered
	 */
	SERIOUS(0, "serious", "serious"),

	/**
	 * The '<em><b>Cool</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COOL_VALUE
	 * @generated
	 * @ordered
	 */
	COOL(1, "cool", "cool"),

	/**
	 * The '<em><b>Disgraceful</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISGRACEFUL_VALUE
	 * @generated
	 * @ordered
	 */
	DISGRACEFUL(2, "disgraceful", "disgraceful");

	/**
	 * The '<em><b>Serious</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Serious</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SERIOUS
	 * @model name="serious"
	 * @generated
	 * @ordered
	 */
	public static final int SERIOUS_VALUE = 0;

	/**
	 * The '<em><b>Cool</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Cool</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COOL
	 * @model name="cool"
	 * @generated
	 * @ordered
	 */
	public static final int COOL_VALUE = 1;

	/**
	 * The '<em><b>Disgraceful</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Disgraceful</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISGRACEFUL
	 * @model name="disgraceful"
	 * @generated
	 * @ordered
	 */
	public static final int DISGRACEFUL_VALUE = 2;

	/**
	 * An array of all the '<em><b>Attitude</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Attitude[] VALUES_ARRAY =
		new Attitude[] {
			SERIOUS,
			COOL,
			DISGRACEFUL,
		};

	/**
	 * A public read-only list of all the '<em><b>Attitude</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Attitude> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Attitude</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Attitude get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Attitude result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Attitude</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Attitude getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Attitude result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Attitude</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Attitude get(int value) {
		switch (value) {
			case SERIOUS_VALUE: return SERIOUS;
			case COOL_VALUE: return COOL;
			case DISGRACEFUL_VALUE: return DISGRACEFUL;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private Attitude(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //Attitude
