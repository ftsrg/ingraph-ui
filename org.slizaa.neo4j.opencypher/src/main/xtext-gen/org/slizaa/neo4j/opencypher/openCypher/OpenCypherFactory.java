/**
 * generated by Xtext 2.13.0
 */
package org.slizaa.neo4j.opencypher.openCypher;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.slizaa.neo4j.opencypher.openCypher.OpenCypherPackage
 * @generated
 */
public interface OpenCypherFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  OpenCypherFactory eINSTANCE = org.slizaa.neo4j.opencypher.openCypher.impl.OpenCypherFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Cypher</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cypher</em>'.
   * @generated
   */
  Cypher createCypher();

  /**
   * Returns a new object of class '<em>Query Options</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Query Options</em>'.
   * @generated
   */
  QueryOptions createQueryOptions();

  /**
   * Returns a new object of class '<em>Cypher Option</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cypher Option</em>'.
   * @generated
   */
  CypherOption createCypherOption();

  /**
   * Returns a new object of class '<em>Version Number</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Version Number</em>'.
   * @generated
   */
  VersionNumber createVersionNumber();

  /**
   * Returns a new object of class '<em>Configuration Option</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Configuration Option</em>'.
   * @generated
   */
  ConfigurationOption createConfigurationOption();

  /**
   * Returns a new object of class '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement</em>'.
   * @generated
   */
  Statement createStatement();

  /**
   * Returns a new object of class '<em>Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Query</em>'.
   * @generated
   */
  Query createQuery();

  /**
   * Returns a new object of class '<em>Regular Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Regular Query</em>'.
   * @generated
   */
  RegularQuery createRegularQuery();

  /**
   * Returns a new object of class '<em>Bulk Import Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bulk Import Query</em>'.
   * @generated
   */
  BulkImportQuery createBulkImportQuery();

  /**
   * Returns a new object of class '<em>Single Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Single Query</em>'.
   * @generated
   */
  SingleQuery createSingleQuery();

  /**
   * Returns a new object of class '<em>Periodic Commit Hint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Periodic Commit Hint</em>'.
   * @generated
   */
  PeriodicCommitHint createPeriodicCommitHint();

  /**
   * Returns a new object of class '<em>Load CSV Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Load CSV Query</em>'.
   * @generated
   */
  LoadCSVQuery createLoadCSVQuery();

  /**
   * Returns a new object of class '<em>Union</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Union</em>'.
   * @generated
   */
  Union createUnion();

  /**
   * Returns a new object of class '<em>Clause</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Clause</em>'.
   * @generated
   */
  Clause createClause();

  /**
   * Returns a new object of class '<em>Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Command</em>'.
   * @generated
   */
  Command createCommand();

  /**
   * Returns a new object of class '<em>Create Unique Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Create Unique Constraint</em>'.
   * @generated
   */
  CreateUniqueConstraint createCreateUniqueConstraint();

  /**
   * Returns a new object of class '<em>Create Node Property Existence Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Create Node Property Existence Constraint</em>'.
   * @generated
   */
  CreateNodePropertyExistenceConstraint createCreateNodePropertyExistenceConstraint();

  /**
   * Returns a new object of class '<em>Create Relationship Property Existence Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Create Relationship Property Existence Constraint</em>'.
   * @generated
   */
  CreateRelationshipPropertyExistenceConstraint createCreateRelationshipPropertyExistenceConstraint();

  /**
   * Returns a new object of class '<em>Create Index</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Create Index</em>'.
   * @generated
   */
  CreateIndex createCreateIndex();

  /**
   * Returns a new object of class '<em>Drop Unique Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Drop Unique Constraint</em>'.
   * @generated
   */
  DropUniqueConstraint createDropUniqueConstraint();

  /**
   * Returns a new object of class '<em>Drop Node Property Existence Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Drop Node Property Existence Constraint</em>'.
   * @generated
   */
  DropNodePropertyExistenceConstraint createDropNodePropertyExistenceConstraint();

  /**
   * Returns a new object of class '<em>Drop Relationship Property Existence Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Drop Relationship Property Existence Constraint</em>'.
   * @generated
   */
  DropRelationshipPropertyExistenceConstraint createDropRelationshipPropertyExistenceConstraint();

  /**
   * Returns a new object of class '<em>Drop Index</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Drop Index</em>'.
   * @generated
   */
  DropIndex createDropIndex();

  /**
   * Returns a new object of class '<em>Index</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Index</em>'.
   * @generated
   */
  Index createIndex();

  /**
   * Returns a new object of class '<em>Unique Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unique Constraint</em>'.
   * @generated
   */
  UniqueConstraint createUniqueConstraint();

  /**
   * Returns a new object of class '<em>Node Property Existence Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node Property Existence Constraint</em>'.
   * @generated
   */
  NodePropertyExistenceConstraint createNodePropertyExistenceConstraint();

  /**
   * Returns a new object of class '<em>Relationship Property Existence Constraint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relationship Property Existence Constraint</em>'.
   * @generated
   */
  RelationshipPropertyExistenceConstraint createRelationshipPropertyExistenceConstraint();

  /**
   * Returns a new object of class '<em>Relationship Pattern Syntax</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relationship Pattern Syntax</em>'.
   * @generated
   */
  RelationshipPatternSyntax createRelationshipPatternSyntax();

  /**
   * Returns a new object of class '<em>Load CSV</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Load CSV</em>'.
   * @generated
   */
  LoadCSV createLoadCSV();

  /**
   * Returns a new object of class '<em>Match</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Match</em>'.
   * @generated
   */
  Match createMatch();

  /**
   * Returns a new object of class '<em>Unwind</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Unwind</em>'.
   * @generated
   */
  Unwind createUnwind();

  /**
   * Returns a new object of class '<em>Merge</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Merge</em>'.
   * @generated
   */
  Merge createMerge();

  /**
   * Returns a new object of class '<em>Merge Action</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Merge Action</em>'.
   * @generated
   */
  MergeAction createMergeAction();

  /**
   * Returns a new object of class '<em>Create</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Create</em>'.
   * @generated
   */
  Create createCreate();

  /**
   * Returns a new object of class '<em>Set</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set</em>'.
   * @generated
   */
  Set createSet();

  /**
   * Returns a new object of class '<em>Set Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Set Item</em>'.
   * @generated
   */
  SetItem createSetItem();

  /**
   * Returns a new object of class '<em>Delete</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Delete</em>'.
   * @generated
   */
  Delete createDelete();

  /**
   * Returns a new object of class '<em>Remove</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Remove</em>'.
   * @generated
   */
  Remove createRemove();

  /**
   * Returns a new object of class '<em>Remove Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Remove Item</em>'.
   * @generated
   */
  RemoveItem createRemoveItem();

  /**
   * Returns a new object of class '<em>Foreach</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Foreach</em>'.
   * @generated
   */
  Foreach createForeach();

  /**
   * Returns a new object of class '<em>In Query Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>In Query Call</em>'.
   * @generated
   */
  InQueryCall createInQueryCall();

  /**
   * Returns a new object of class '<em>Standalone Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Standalone Call</em>'.
   * @generated
   */
  StandaloneCall createStandaloneCall();

  /**
   * Returns a new object of class '<em>Yield Items</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Yield Items</em>'.
   * @generated
   */
  YieldItems createYieldItems();

  /**
   * Returns a new object of class '<em>Yield Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Yield Item</em>'.
   * @generated
   */
  YieldItem createYieldItem();

  /**
   * Returns a new object of class '<em>With</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>With</em>'.
   * @generated
   */
  With createWith();

  /**
   * Returns a new object of class '<em>Return</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Return</em>'.
   * @generated
   */
  Return createReturn();

  /**
   * Returns a new object of class '<em>Return Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Return Body</em>'.
   * @generated
   */
  ReturnBody createReturnBody();

  /**
   * Returns a new object of class '<em>Return Items</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Return Items</em>'.
   * @generated
   */
  ReturnItems createReturnItems();

  /**
   * Returns a new object of class '<em>Return Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Return Item</em>'.
   * @generated
   */
  ReturnItem createReturnItem();

  /**
   * Returns a new object of class '<em>Order</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Order</em>'.
   * @generated
   */
  Order createOrder();

  /**
   * Returns a new object of class '<em>Skip</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Skip</em>'.
   * @generated
   */
  Skip createSkip();

  /**
   * Returns a new object of class '<em>Limit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Limit</em>'.
   * @generated
   */
  Limit createLimit();

  /**
   * Returns a new object of class '<em>Sort Item</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sort Item</em>'.
   * @generated
   */
  SortItem createSortItem();

  /**
   * Returns a new object of class '<em>Hint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Hint</em>'.
   * @generated
   */
  Hint createHint();

  /**
   * Returns a new object of class '<em>Start</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Start</em>'.
   * @generated
   */
  Start createStart();

  /**
   * Returns a new object of class '<em>Start Point</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Start Point</em>'.
   * @generated
   */
  StartPoint createStartPoint();

  /**
   * Returns a new object of class '<em>Lookup</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Lookup</em>'.
   * @generated
   */
  Lookup createLookup();

  /**
   * Returns a new object of class '<em>Node Lookup</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node Lookup</em>'.
   * @generated
   */
  NodeLookup createNodeLookup();

  /**
   * Returns a new object of class '<em>Relationship Lookup</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relationship Lookup</em>'.
   * @generated
   */
  RelationshipLookup createRelationshipLookup();

  /**
   * Returns a new object of class '<em>Identified Index Lookup</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Identified Index Lookup</em>'.
   * @generated
   */
  IdentifiedIndexLookup createIdentifiedIndexLookup();

  /**
   * Returns a new object of class '<em>Index Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Index Query</em>'.
   * @generated
   */
  IndexQuery createIndexQuery();

  /**
   * Returns a new object of class '<em>Id Lookup</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Id Lookup</em>'.
   * @generated
   */
  IdLookup createIdLookup();

  /**
   * Returns a new object of class '<em>Literal Ids</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal Ids</em>'.
   * @generated
   */
  LiteralIds createLiteralIds();

  /**
   * Returns a new object of class '<em>Where</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Where</em>'.
   * @generated
   */
  Where createWhere();

  /**
   * Returns a new object of class '<em>Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pattern</em>'.
   * @generated
   */
  Pattern createPattern();

  /**
   * Returns a new object of class '<em>Pattern Part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pattern Part</em>'.
   * @generated
   */
  PatternPart createPatternPart();

  /**
   * Returns a new object of class '<em>Anonymous Pattern Part</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Anonymous Pattern Part</em>'.
   * @generated
   */
  AnonymousPatternPart createAnonymousPatternPart();

  /**
   * Returns a new object of class '<em>Shortest Path Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Shortest Path Pattern</em>'.
   * @generated
   */
  ShortestPathPattern createShortestPathPattern();

  /**
   * Returns a new object of class '<em>Pattern Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pattern Element</em>'.
   * @generated
   */
  PatternElement createPatternElement();

  /**
   * Returns a new object of class '<em>Node Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node Pattern</em>'.
   * @generated
   */
  NodePattern createNodePattern();

  /**
   * Returns a new object of class '<em>Pattern Element Chain</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pattern Element Chain</em>'.
   * @generated
   */
  PatternElementChain createPatternElementChain();

  /**
   * Returns a new object of class '<em>Relationship Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relationship Pattern</em>'.
   * @generated
   */
  RelationshipPattern createRelationshipPattern();

  /**
   * Returns a new object of class '<em>Relationship Detail</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relationship Detail</em>'.
   * @generated
   */
  RelationshipDetail createRelationshipDetail();

  /**
   * Returns a new object of class '<em>Properties</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Properties</em>'.
   * @generated
   */
  Properties createProperties();

  /**
   * Returns a new object of class '<em>Relationship Types</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relationship Types</em>'.
   * @generated
   */
  RelationshipTypes createRelationshipTypes();

  /**
   * Returns a new object of class '<em>Node Labels</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node Labels</em>'.
   * @generated
   */
  NodeLabels createNodeLabels();

  /**
   * Returns a new object of class '<em>Node Label</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node Label</em>'.
   * @generated
   */
  NodeLabel createNodeLabel();

  /**
   * Returns a new object of class '<em>Range Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Range Literal</em>'.
   * @generated
   */
  RangeLiteral createRangeLiteral();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Reduce</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reduce</em>'.
   * @generated
   */
  Reduce createReduce();

  /**
   * Returns a new object of class '<em>Parenthesized Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parenthesized Expression</em>'.
   * @generated
   */
  ParenthesizedExpression createParenthesizedExpression();

  /**
   * Returns a new object of class '<em>Relationships Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Relationships Pattern</em>'.
   * @generated
   */
  RelationshipsPattern createRelationshipsPattern();

  /**
   * Returns a new object of class '<em>Filter Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Filter Expression</em>'.
   * @generated
   */
  FilterExpression createFilterExpression();

  /**
   * Returns a new object of class '<em>Id In Coll</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Id In Coll</em>'.
   * @generated
   */
  IdInColl createIdInColl();

  /**
   * Returns a new object of class '<em>Function Invocation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function Invocation</em>'.
   * @generated
   */
  FunctionInvocation createFunctionInvocation();

  /**
   * Returns a new object of class '<em>Explicit Procedure Invocation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Explicit Procedure Invocation</em>'.
   * @generated
   */
  ExplicitProcedureInvocation createExplicitProcedureInvocation();

  /**
   * Returns a new object of class '<em>Implicit Procedure Invocation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Implicit Procedure Invocation</em>'.
   * @generated
   */
  ImplicitProcedureInvocation createImplicitProcedureInvocation();

  /**
   * Returns a new object of class '<em>Procedure Name</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Procedure Name</em>'.
   * @generated
   */
  ProcedureName createProcedureName();

  /**
   * Returns a new object of class '<em>List Comprehension</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>List Comprehension</em>'.
   * @generated
   */
  ListComprehension createListComprehension();

  /**
   * Returns a new object of class '<em>Pattern Comprehension</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Pattern Comprehension</em>'.
   * @generated
   */
  PatternComprehension createPatternComprehension();

  /**
   * Returns a new object of class '<em>Property Lookup</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property Lookup</em>'.
   * @generated
   */
  PropertyLookup createPropertyLookup();

  /**
   * Returns a new object of class '<em>Case Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Case Expression</em>'.
   * @generated
   */
  CaseExpression createCaseExpression();

  /**
   * Returns a new object of class '<em>Case Alternatives</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Case Alternatives</em>'.
   * @generated
   */
  CaseAlternatives createCaseAlternatives();

  /**
   * Returns a new object of class '<em>Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Declaration</em>'.
   * @generated
   */
  VariableDeclaration createVariableDeclaration();

  /**
   * Returns a new object of class '<em>Map Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Map Literal</em>'.
   * @generated
   */
  MapLiteral createMapLiteral();

  /**
   * Returns a new object of class '<em>Map Literal Entry</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Map Literal Entry</em>'.
   * @generated
   */
  MapLiteralEntry createMapLiteralEntry();

  /**
   * Returns a new object of class '<em>Legacy Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Legacy Parameter</em>'.
   * @generated
   */
  LegacyParameter createLegacyParameter();

  /**
   * Returns a new object of class '<em>Parameter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter</em>'.
   * @generated
   */
  Parameter createParameter();

  /**
   * Returns a new object of class '<em>Property Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property Expression</em>'.
   * @generated
   */
  PropertyExpression createPropertyExpression();

  /**
   * Returns a new object of class '<em>Decimal Integer</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Decimal Integer</em>'.
   * @generated
   */
  DecimalInteger createDecimalInteger();

  /**
   * Returns a new object of class '<em>All Options</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>All Options</em>'.
   * @generated
   */
  AllOptions createAllOptions();

  /**
   * Returns a new object of class '<em>Combined Query</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Combined Query</em>'.
   * @generated
   */
  CombinedQuery createCombinedQuery();

  /**
   * Returns a new object of class '<em>Remove Item Label</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Remove Item Label</em>'.
   * @generated
   */
  RemoveItemLabel createRemoveItemLabel();

  /**
   * Returns a new object of class '<em>Remove Item Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Remove Item Property</em>'.
   * @generated
   */
  RemoveItemProperty createRemoveItemProperty();

  /**
   * Returns a new object of class '<em>Index Hint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Index Hint</em>'.
   * @generated
   */
  IndexHint createIndexHint();

  /**
   * Returns a new object of class '<em>Join Hint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Join Hint</em>'.
   * @generated
   */
  JoinHint createJoinHint();

  /**
   * Returns a new object of class '<em>Scan Hint</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Scan Hint</em>'.
   * @generated
   */
  ScanHint createScanHint();

  /**
   * Returns a new object of class '<em>Shortest Path</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Shortest Path</em>'.
   * @generated
   */
  ShortestPath createShortestPath();

  /**
   * Returns a new object of class '<em>All Shortest Paths</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>All Shortest Paths</em>'.
   * @generated
   */
  AllShortestPaths createAllShortestPaths();

  /**
   * Returns a new object of class '<em>Expression Or</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Or</em>'.
   * @generated
   */
  ExpressionOr createExpressionOr();

  /**
   * Returns a new object of class '<em>Expression Xor</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Xor</em>'.
   * @generated
   */
  ExpressionXor createExpressionXor();

  /**
   * Returns a new object of class '<em>Expression And</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression And</em>'.
   * @generated
   */
  ExpressionAnd createExpressionAnd();

  /**
   * Returns a new object of class '<em>Expression Not</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Not</em>'.
   * @generated
   */
  ExpressionNot createExpressionNot();

  /**
   * Returns a new object of class '<em>Expression Comparison</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Comparison</em>'.
   * @generated
   */
  ExpressionComparison createExpressionComparison();

  /**
   * Returns a new object of class '<em>Expression Plus Minus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Plus Minus</em>'.
   * @generated
   */
  ExpressionPlusMinus createExpressionPlusMinus();

  /**
   * Returns a new object of class '<em>Expression Mul Div</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Mul Div</em>'.
   * @generated
   */
  ExpressionMulDiv createExpressionMulDiv();

  /**
   * Returns a new object of class '<em>Expression Power</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Power</em>'.
   * @generated
   */
  ExpressionPower createExpressionPower();

  /**
   * Returns a new object of class '<em>Expression Unary Plus Minus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Unary Plus Minus</em>'.
   * @generated
   */
  ExpressionUnaryPlusMinus createExpressionUnaryPlusMinus();

  /**
   * Returns a new object of class '<em>Index Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Index Expression</em>'.
   * @generated
   */
  IndexExpression createIndexExpression();

  /**
   * Returns a new object of class '<em>Reg Exp Matching Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Reg Exp Matching Expression</em>'.
   * @generated
   */
  RegExpMatchingExpression createRegExpMatchingExpression();

  /**
   * Returns a new object of class '<em>In Collection Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>In Collection Expression</em>'.
   * @generated
   */
  InCollectionExpression createInCollectionExpression();

  /**
   * Returns a new object of class '<em>Starts With Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Starts With Expression</em>'.
   * @generated
   */
  StartsWithExpression createStartsWithExpression();

  /**
   * Returns a new object of class '<em>Ends With Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Ends With Expression</em>'.
   * @generated
   */
  EndsWithExpression createEndsWithExpression();

  /**
   * Returns a new object of class '<em>Contains Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Contains Expression</em>'.
   * @generated
   */
  ContainsExpression createContainsExpression();

  /**
   * Returns a new object of class '<em>Is Null Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Is Null Expression</em>'.
   * @generated
   */
  IsNullExpression createIsNullExpression();

  /**
   * Returns a new object of class '<em>Is Not Null Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Is Not Null Expression</em>'.
   * @generated
   */
  IsNotNullExpression createIsNotNullExpression();

  /**
   * Returns a new object of class '<em>Expression Property Lookup</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Property Lookup</em>'.
   * @generated
   */
  ExpressionPropertyLookup createExpressionPropertyLookup();

  /**
   * Returns a new object of class '<em>Expression Node Labels</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression Node Labels</em>'.
   * @generated
   */
  ExpressionNodeLabels createExpressionNodeLabels();

  /**
   * Returns a new object of class '<em>Number Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Number Constant</em>'.
   * @generated
   */
  NumberConstant createNumberConstant();

  /**
   * Returns a new object of class '<em>String Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Constant</em>'.
   * @generated
   */
  StringConstant createStringConstant();

  /**
   * Returns a new object of class '<em>Bool Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bool Constant</em>'.
   * @generated
   */
  BoolConstant createBoolConstant();

  /**
   * Returns a new object of class '<em>Null Constant</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Null Constant</em>'.
   * @generated
   */
  NullConstant createNullConstant();

  /**
   * Returns a new object of class '<em>Count</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Count</em>'.
   * @generated
   */
  Count createCount();

  /**
   * Returns a new object of class '<em>Expression List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression List</em>'.
   * @generated
   */
  ExpressionList createExpressionList();

  /**
   * Returns a new object of class '<em>Extract</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Extract</em>'.
   * @generated
   */
  Extract createExtract();

  /**
   * Returns a new object of class '<em>Filter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Filter</em>'.
   * @generated
   */
  Filter createFilter();

  /**
   * Returns a new object of class '<em>All</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>All</em>'.
   * @generated
   */
  All createAll();

  /**
   * Returns a new object of class '<em>Any</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Any</em>'.
   * @generated
   */
  Any createAny();

  /**
   * Returns a new object of class '<em>None</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>None</em>'.
   * @generated
   */
  None createNone();

  /**
   * Returns a new object of class '<em>Single</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Single</em>'.
   * @generated
   */
  Single createSingle();

  /**
   * Returns a new object of class '<em>Variable Ref</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Variable Ref</em>'.
   * @generated
   */
  VariableRef createVariableRef();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  OpenCypherPackage getOpenCypherPackage();

} //OpenCypherFactory
