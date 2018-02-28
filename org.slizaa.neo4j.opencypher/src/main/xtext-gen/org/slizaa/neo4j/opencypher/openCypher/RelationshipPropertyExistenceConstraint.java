/**
 * generated by Xtext 2.13.0
 */
package org.slizaa.neo4j.opencypher.openCypher;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship Property Existence Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.RelationshipPropertyExistenceConstraint#getRelationshipPattern <em>Relationship Pattern</em>}</li>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.RelationshipPropertyExistenceConstraint#getPropertyExpression <em>Property Expression</em>}</li>
 * </ul>
 *
 * @see org.slizaa.neo4j.opencypher.openCypher.OpenCypherPackage#getRelationshipPropertyExistenceConstraint()
 * @model
 * @generated
 */
public interface RelationshipPropertyExistenceConstraint extends CreateRelationshipPropertyExistenceConstraint
{
  /**
   * Returns the value of the '<em><b>Relationship Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relationship Pattern</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relationship Pattern</em>' containment reference.
   * @see #setRelationshipPattern(RelationshipPatternSyntax)
   * @see org.slizaa.neo4j.opencypher.openCypher.OpenCypherPackage#getRelationshipPropertyExistenceConstraint_RelationshipPattern()
   * @model containment="true"
   * @generated
   */
  RelationshipPatternSyntax getRelationshipPattern();

  /**
   * Sets the value of the '{@link org.slizaa.neo4j.opencypher.openCypher.RelationshipPropertyExistenceConstraint#getRelationshipPattern <em>Relationship Pattern</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Relationship Pattern</em>' containment reference.
   * @see #getRelationshipPattern()
   * @generated
   */
  void setRelationshipPattern(RelationshipPatternSyntax value);

  /**
   * Returns the value of the '<em><b>Property Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Property Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Property Expression</em>' containment reference.
   * @see #setPropertyExpression(PropertyExpression)
   * @see org.slizaa.neo4j.opencypher.openCypher.OpenCypherPackage#getRelationshipPropertyExistenceConstraint_PropertyExpression()
   * @model containment="true"
   * @generated
   */
  PropertyExpression getPropertyExpression();

  /**
   * Sets the value of the '{@link org.slizaa.neo4j.opencypher.openCypher.RelationshipPropertyExistenceConstraint#getPropertyExpression <em>Property Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Property Expression</em>' containment reference.
   * @see #getPropertyExpression()
   * @generated
   */
  void setPropertyExpression(PropertyExpression value);

} // RelationshipPropertyExistenceConstraint
