/**
 * generated by Xtext 2.13.0
 */
package org.slizaa.neo4j.opencypher.openCypher;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unwind</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.Unwind#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.Unwind#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see org.slizaa.neo4j.opencypher.openCypher.OpenCypherPackage#getUnwind()
 * @model
 * @generated
 */
public interface Unwind extends Clause
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(Expression)
   * @see org.slizaa.neo4j.opencypher.openCypher.OpenCypherPackage#getUnwind_Expression()
   * @model containment="true"
   * @generated
   */
  Expression getExpression();

  /**
   * Sets the value of the '{@link org.slizaa.neo4j.opencypher.openCypher.Unwind#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(Expression value);

  /**
   * Returns the value of the '<em><b>Variable</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable</em>' containment reference.
   * @see #setVariable(VariableDeclaration)
   * @see org.slizaa.neo4j.opencypher.openCypher.OpenCypherPackage#getUnwind_Variable()
   * @model containment="true"
   * @generated
   */
  VariableDeclaration getVariable();

  /**
   * Sets the value of the '{@link org.slizaa.neo4j.opencypher.openCypher.Unwind#getVariable <em>Variable</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable</em>' containment reference.
   * @see #getVariable()
   * @generated
   */
  void setVariable(VariableDeclaration value);

} // Unwind
