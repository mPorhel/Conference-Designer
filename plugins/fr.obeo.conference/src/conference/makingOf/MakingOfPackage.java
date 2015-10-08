/**
 */
package conference.makingOf;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see conference.makingOf.MakingOfFactory
 * @model kind="package"
 * @generated
 */
public interface MakingOfPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "makingOf";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/conference/makingOf";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "makingOf";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MakingOfPackage eINSTANCE = conference.makingOf.impl.MakingOfPackageImpl.init();

	/**
	 * The meta object id for the '{@link conference.makingOf.impl.DayImpl <em>Day</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conference.makingOf.impl.DayImpl
	 * @see conference.makingOf.impl.MakingOfPackageImpl#getDay()
	 * @generated
	 */
	int DAY = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Tasks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY__TASKS = 1;

	/**
	 * The feature id for the '<em><b>Ideas</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY__IDEAS = 2;

	/**
	 * The feature id for the '<em><b>Participants</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY__PARTICIPANTS = 3;

	/**
	 * The number of structural features of the '<em>Day</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DAY_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link conference.makingOf.impl.StoryImpl <em>Story</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conference.makingOf.impl.StoryImpl
	 * @see conference.makingOf.impl.MakingOfPackageImpl#getStory()
	 * @generated
	 */
	int STORY = 1;

	/**
	 * The feature id for the '<em><b>Days</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY__DAYS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY__NAME = 1;

	/**
	 * The number of structural features of the '<em>Story</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STORY_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link conference.makingOf.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conference.makingOf.impl.TaskImpl
	 * @see conference.makingOf.impl.MakingOfPackageImpl#getTask()
	 * @generated
	 */
	int TASK = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__NAME = 0;

	/**
	 * The feature id for the '<em><b>Is Involved</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK__IS_INVOLVED = 1;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link conference.makingOf.impl.ParticipantImpl <em>Participant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conference.makingOf.impl.ParticipantImpl
	 * @see conference.makingOf.impl.MakingOfPackageImpl#getParticipant()
	 * @generated
	 */
	int PARTICIPANT = 3;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__AGE = 0;

	/**
	 * The feature id for the '<em><b>Person</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__PERSON = 1;

	/**
	 * The feature id for the '<em><b>Attitude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT__ATTITUDE = 2;

	/**
	 * The number of structural features of the '<em>Participant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTICIPANT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link conference.makingOf.Attitude <em>Attitude</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see conference.makingOf.Attitude
	 * @see conference.makingOf.impl.MakingOfPackageImpl#getAttitude()
	 * @generated
	 */
	int ATTITUDE = 4;


	/**
	 * Returns the meta object for class '{@link conference.makingOf.Day <em>Day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Day</em>'.
	 * @see conference.makingOf.Day
	 * @generated
	 */
	EClass getDay();

	/**
	 * Returns the meta object for the attribute '{@link conference.makingOf.Day#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see conference.makingOf.Day#getName()
	 * @see #getDay()
	 * @generated
	 */
	EAttribute getDay_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link conference.makingOf.Day#getTasks <em>Tasks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tasks</em>'.
	 * @see conference.makingOf.Day#getTasks()
	 * @see #getDay()
	 * @generated
	 */
	EReference getDay_Tasks();

	/**
	 * Returns the meta object for the containment reference list '{@link conference.makingOf.Day#getIdeas <em>Ideas</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ideas</em>'.
	 * @see conference.makingOf.Day#getIdeas()
	 * @see #getDay()
	 * @generated
	 */
	EReference getDay_Ideas();

	/**
	 * Returns the meta object for the containment reference list '{@link conference.makingOf.Day#getParticipants <em>Participants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Participants</em>'.
	 * @see conference.makingOf.Day#getParticipants()
	 * @see #getDay()
	 * @generated
	 */
	EReference getDay_Participants();

	/**
	 * Returns the meta object for class '{@link conference.makingOf.Story <em>Story</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Story</em>'.
	 * @see conference.makingOf.Story
	 * @generated
	 */
	EClass getStory();

	/**
	 * Returns the meta object for the containment reference list '{@link conference.makingOf.Story#getDays <em>Days</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Days</em>'.
	 * @see conference.makingOf.Story#getDays()
	 * @see #getStory()
	 * @generated
	 */
	EReference getStory_Days();

	/**
	 * Returns the meta object for the attribute '{@link conference.makingOf.Story#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see conference.makingOf.Story#getName()
	 * @see #getStory()
	 * @generated
	 */
	EAttribute getStory_Name();

	/**
	 * Returns the meta object for class '{@link conference.makingOf.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see conference.makingOf.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for the attribute '{@link conference.makingOf.Task#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see conference.makingOf.Task#getName()
	 * @see #getTask()
	 * @generated
	 */
	EAttribute getTask_Name();

	/**
	 * Returns the meta object for the reference list '{@link conference.makingOf.Task#getIsInvolved <em>Is Involved</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Involved</em>'.
	 * @see conference.makingOf.Task#getIsInvolved()
	 * @see #getTask()
	 * @generated
	 */
	EReference getTask_IsInvolved();

	/**
	 * Returns the meta object for class '{@link conference.makingOf.Participant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Participant</em>'.
	 * @see conference.makingOf.Participant
	 * @generated
	 */
	EClass getParticipant();

	/**
	 * Returns the meta object for the attribute '{@link conference.makingOf.Participant#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see conference.makingOf.Participant#getAge()
	 * @see #getParticipant()
	 * @generated
	 */
	EAttribute getParticipant_Age();

	/**
	 * Returns the meta object for the reference '{@link conference.makingOf.Participant#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Person</em>'.
	 * @see conference.makingOf.Participant#getPerson()
	 * @see #getParticipant()
	 * @generated
	 */
	EReference getParticipant_Person();

	/**
	 * Returns the meta object for the attribute '{@link conference.makingOf.Participant#getAttitude <em>Attitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attitude</em>'.
	 * @see conference.makingOf.Participant#getAttitude()
	 * @see #getParticipant()
	 * @generated
	 */
	EAttribute getParticipant_Attitude();

	/**
	 * Returns the meta object for enum '{@link conference.makingOf.Attitude <em>Attitude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Attitude</em>'.
	 * @see conference.makingOf.Attitude
	 * @generated
	 */
	EEnum getAttitude();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MakingOfFactory getMakingOfFactory();

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
		 * The meta object literal for the '{@link conference.makingOf.impl.DayImpl <em>Day</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conference.makingOf.impl.DayImpl
		 * @see conference.makingOf.impl.MakingOfPackageImpl#getDay()
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
		 * The meta object literal for the '<em><b>Tasks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DAY__TASKS = eINSTANCE.getDay_Tasks();

		/**
		 * The meta object literal for the '<em><b>Ideas</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DAY__IDEAS = eINSTANCE.getDay_Ideas();

		/**
		 * The meta object literal for the '<em><b>Participants</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DAY__PARTICIPANTS = eINSTANCE.getDay_Participants();

		/**
		 * The meta object literal for the '{@link conference.makingOf.impl.StoryImpl <em>Story</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conference.makingOf.impl.StoryImpl
		 * @see conference.makingOf.impl.MakingOfPackageImpl#getStory()
		 * @generated
		 */
		EClass STORY = eINSTANCE.getStory();

		/**
		 * The meta object literal for the '<em><b>Days</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STORY__DAYS = eINSTANCE.getStory_Days();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STORY__NAME = eINSTANCE.getStory_Name();

		/**
		 * The meta object literal for the '{@link conference.makingOf.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conference.makingOf.impl.TaskImpl
		 * @see conference.makingOf.impl.MakingOfPackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TASK__NAME = eINSTANCE.getTask_Name();

		/**
		 * The meta object literal for the '<em><b>Is Involved</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TASK__IS_INVOLVED = eINSTANCE.getTask_IsInvolved();

		/**
		 * The meta object literal for the '{@link conference.makingOf.impl.ParticipantImpl <em>Participant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conference.makingOf.impl.ParticipantImpl
		 * @see conference.makingOf.impl.MakingOfPackageImpl#getParticipant()
		 * @generated
		 */
		EClass PARTICIPANT = eINSTANCE.getParticipant();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTICIPANT__AGE = eINSTANCE.getParticipant_Age();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTICIPANT__PERSON = eINSTANCE.getParticipant_Person();

		/**
		 * The meta object literal for the '<em><b>Attitude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTICIPANT__ATTITUDE = eINSTANCE.getParticipant_Attitude();

		/**
		 * The meta object literal for the '{@link conference.makingOf.Attitude <em>Attitude</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see conference.makingOf.Attitude
		 * @see conference.makingOf.impl.MakingOfPackageImpl#getAttitude()
		 * @generated
		 */
		EEnum ATTITUDE = eINSTANCE.getAttitude();

	}

} //MakingOfPackage
