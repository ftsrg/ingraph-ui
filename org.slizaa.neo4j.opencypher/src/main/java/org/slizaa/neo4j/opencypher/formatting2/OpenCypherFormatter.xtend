/*
 * generated by Xtext 2.10.0
 */
package org.slizaa.neo4j.opencypher.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.slizaa.neo4j.opencypher.openCypher.AllOptions
import org.slizaa.neo4j.opencypher.openCypher.Cypher
import org.slizaa.neo4j.opencypher.openCypher.CypherOption
import org.slizaa.neo4j.opencypher.services.OpenCypherGrammarAccess

class OpenCypherFormatter extends AbstractFormatter2 {
	
	@Inject extension OpenCypherGrammarAccess

	def dispatch void format(Cypher cypher, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		cypher.getQueryOptions.format;
		cypher.getStatement.format;
	}

	def dispatch void format(AllOptions allOptions, extension IFormattableDocument document) {
		// TODO: format HiddenRegions around keywords, attributes, cross references, etc. 
		for (CypherOption cypherOption : allOptions.getCypherOption()) {
			cypherOption.format;
		}
	}
	
	// TODO: implement for CypherOption, CombinedQuery, BulkImportQuery, SingleQuery, PeriodicCommitHint, LoadCSVQuery, Union, CreateIndex, DropUniqueConstraint, DropNodePropertyExistenceConstraint, DropRelationshipPropertyExistenceConstraint, DropIndex, Index, UniqueConstraint, NodePropertyExistenceConstraint, RelationshipPropertyExistenceConstraint, RelationshipPatternSyntax, LoadCSV, Match, Unwind, Merge, MergeAction, Create, Set, SetItem, Delete, Remove, RemoveItemLabel, RemoveItemProperty, Foreach, InQueryCall, StandaloneCall, YieldItems, YieldItem, With, Return, ReturnBody, ReturnItems, ReturnItem, Order, Skip, Limit, SortItem, IndexHint, JoinHint, ScanHint, Start, StartPoint, IdentifiedIndexLookup, IndexQuery, IdLookup, LiteralIds, Where, Pattern, PatternPart, ShortestPath, AllShortestPaths, PatternElement, NodePattern, PatternElementChain, RelationshipPattern, RelationshipDetail, NodeLabels, ExpressionOr, ExpressionXor, ExpressionAnd, ExpressionNot, ExpressionComparison, ExpressionPlusMinus, ExpressionMulDiv, ExpressionPower, ExpressionUnaryPlusMinus, IndexExpression, RegExpMatchingExpression, InCollectionExpression, StartsWithExpression, EndsWithExpression, ContainsExpression, ExpressionPropertyLookup, ExpressionNodeLabels, ExpressionList, Extract, Filter, All, Any, None, Single, Reduce, ParenthesizedExpression, RelationshipsPattern, FilterExpression, IdInColl, FunctionInvocation, ExplicitProcedureInvocation, ListComprehension, PatternComprehension, CaseExpression, CaseAlternatives, MapLiteral, MapLiteralEntry, PropertyExpression, IsNullExpression, IsNotNullExpression
}
