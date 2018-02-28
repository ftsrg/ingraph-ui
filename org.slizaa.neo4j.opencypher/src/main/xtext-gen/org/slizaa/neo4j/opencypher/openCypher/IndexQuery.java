/**
 * generated by Xtext 2.13.0
 */
package org.slizaa.neo4j.opencypher.openCypher;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Index Query</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.IndexQuery#getIndexName <em>Index Name</em>}</li>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.IndexQuery#getQuery <em>Query</em>}</li>
 *   <li>{@link org.slizaa.neo4j.opencypher.openCypher.IndexQuery#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see org.slizaa.neo4j.opencypher.openCypher.OpenCypherPackage#getIndexQuery()
 * @model
 * @generated
 */
public interface IndexQuery extends NodeLookup, RelationshipLookup
{
  /**
   * Returns the value of the '<em><b>Index Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Index Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Index Name</em>' attribute.
   * @see #setIndexName(String)
   * @see org.slizaa.neo4j.opencypher.openCypher.OpenCypherPackage#getIndexQuery_IndexName()
   * @model
   * @generated
   */
  String getIndexName();

  /**
   * Sets the value of the '{@link org.slizaa.neo4j.opencypher.openCypher.IndexQuery#getIndexName <em>Index Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Index Name</em>' attribute.
   * @see #getIndexName()
   * @generated
   */
  void setIndexName(String value);

  /**
   * Returns the value of the '<em><b>Query</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Query</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Query</em>' attribute.
   * @see #setQuery(String)
   * @see org.slizaa.neo4j.opencypher.openCypher.OpenCypherPackage#getIndexQuery_Query()
   * @model
   * @generated
   */
  String getQuery();

  /**
   * Sets the value of the '{@link org.slizaa.neo4j.opencypher.openCypher.IndexQuery#getQuery <em>Query</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Query</em>' attribute.
   * @see #getQuery()
   * @generated
   */
  void setQuery(String value);

  /**
   * Returns the value of the '<em><b>Parameter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter</em>' containment reference.
   * @see #setParameter(Parameter)
   * @see org.slizaa.neo4j.opencypher.openCypher.OpenCypherPackage#getIndexQuery_Parameter()
   * @model containment="true"
   * @generated
   */
  Parameter getParameter();

  /**
   * Sets the value of the '{@link org.slizaa.neo4j.opencypher.openCypher.IndexQuery#getParameter <em>Parameter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter</em>' containment reference.
   * @see #getParameter()
   * @generated
   */
  void setParameter(Parameter value);

} // IndexQuery
