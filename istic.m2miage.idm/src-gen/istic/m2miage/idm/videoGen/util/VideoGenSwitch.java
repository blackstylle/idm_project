/**
 */
package istic.m2miage.idm.videoGen.util;

import istic.m2miage.idm.videoGen.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see istic.m2miage.idm.videoGen.VideoGenPackage
 * @generated
 */
public class VideoGenSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static VideoGenPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VideoGenSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = VideoGenPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case VideoGenPackage.VIDEO_GEN:
      {
        VideoGen videoGen = (VideoGen)theEObject;
        T result = caseVideoGen(videoGen);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VideoGenPackage.VIDEO_TYPE:
      {
        VideoType videoType = (VideoType)theEObject;
        T result = caseVideoType(videoType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VideoGenPackage.MANDATORY:
      {
        Mandatory mandatory = (Mandatory)theEObject;
        T result = caseMandatory(mandatory);
        if (result == null) result = caseVideoType(mandatory);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VideoGenPackage.OPTIONAL:
      {
        Optional optional = (Optional)theEObject;
        T result = caseOptional(optional);
        if (result == null) result = caseVideoType(optional);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VideoGenPackage.ALTERNATIVES:
      {
        Alternatives alternatives = (Alternatives)theEObject;
        T result = caseAlternatives(alternatives);
        if (result == null) result = caseVideoType(alternatives);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case VideoGenPackage.VIDEO_SEQ:
      {
        VideoSeq videoSeq = (VideoSeq)theEObject;
        T result = caseVideoSeq(videoSeq);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Video Gen</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Video Gen</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVideoGen(VideoGen object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Video Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Video Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVideoType(VideoType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mandatory</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mandatory</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMandatory(Mandatory object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Optional</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Optional</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOptional(Optional object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Alternatives</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Alternatives</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlternatives(Alternatives object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Video Seq</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Video Seq</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVideoSeq(VideoSeq object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //VideoGenSwitch
