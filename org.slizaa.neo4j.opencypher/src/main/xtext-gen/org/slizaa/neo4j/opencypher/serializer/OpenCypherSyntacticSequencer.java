/*
 * generated by Xtext 2.13.0
 */
package org.slizaa.neo4j.opencypher.serializer;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;
import org.slizaa.neo4j.opencypher.services.OpenCypherGrammarAccess;

@SuppressWarnings("all")
public class OpenCypherSyntacticSequencer extends AbstractSyntacticSequencer {

	protected OpenCypherGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Cypher_SemicolonKeyword_3_q;
	protected AbstractElementAlias match_NodeLookup_RelationshipLookup_NODEKeyword_0_or_RELATIONSHIPKeyword_0_0_or_RELKeyword_0_1;
	protected AbstractElementAlias match_PatternElement_LeftParenthesisKeyword_1_0_a;
	protected AbstractElementAlias match_RangeLiteral_FullStopFullStopKeyword_2_1_0_q;
	protected AbstractElementAlias match_RelationshipLookup_RELATIONSHIPKeyword_0_0_or_RELKeyword_0_1;
	protected AbstractElementAlias match_RelationshipTypes_ColonKeyword_2_1_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (OpenCypherGrammarAccess) access;
		match_Cypher_SemicolonKeyword_3_q = new TokenAlias(false, true, grammarAccess.getCypherAccess().getSemicolonKeyword_3());
		match_NodeLookup_RelationshipLookup_NODEKeyword_0_or_RELATIONSHIPKeyword_0_0_or_RELKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getNodeLookupAccess().getNODEKeyword_0()), new TokenAlias(false, false, grammarAccess.getRelationshipLookupAccess().getRELATIONSHIPKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getRelationshipLookupAccess().getRELKeyword_0_1()));
		match_PatternElement_LeftParenthesisKeyword_1_0_a = new TokenAlias(true, true, grammarAccess.getPatternElementAccess().getLeftParenthesisKeyword_1_0());
		match_RangeLiteral_FullStopFullStopKeyword_2_1_0_q = new TokenAlias(false, true, grammarAccess.getRangeLiteralAccess().getFullStopFullStopKeyword_2_1_0());
		match_RelationshipLookup_RELATIONSHIPKeyword_0_0_or_RELKeyword_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getRelationshipLookupAccess().getRELATIONSHIPKeyword_0_0()), new TokenAlias(false, false, grammarAccess.getRelationshipLookupAccess().getRELKeyword_0_1()));
		match_RelationshipTypes_ColonKeyword_2_1_q = new TokenAlias(false, true, grammarAccess.getRelationshipTypesAccess().getColonKeyword_2_1());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getDashRule())
			return getDashToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getLeftArrowHeadRule())
			return getLeftArrowHeadToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getLoadCSVWithHeadersRule())
			return getLoadCSVWithHeadersToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getRightArrowHeadRule())
			return getRightArrowHeadToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getWSRule())
			return getWSToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * Dash:
	 * 
	 * 	'-';
	 */
	protected String getDashToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "-";
	}
	
	/**
	 * LeftArrowHead:
	 * 
	 * 	'<';
	 */
	protected String getLeftArrowHeadToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "<";
	}
	
	/**
	 * LoadCSVWithHeaders:
	 * 	'WITH' 'HEADERS';
	 */
	protected String getLoadCSVWithHeadersToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "WITHHEADERS";
	}
	
	/**
	 * RightArrowHead:
	 * 
	 * 	'>';
	 */
	protected String getRightArrowHeadToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return ">";
	}
	
	/**
	 * terminal WS:
	 * 	(' ' | '\t' | '\r' | '\n')+;
	 */
	protected String getWSToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return " ";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Cypher_SemicolonKeyword_3_q.equals(syntax))
				emit_Cypher_SemicolonKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_NodeLookup_RelationshipLookup_NODEKeyword_0_or_RELATIONSHIPKeyword_0_0_or_RELKeyword_0_1.equals(syntax))
				emit_NodeLookup_RelationshipLookup_NODEKeyword_0_or_RELATIONSHIPKeyword_0_0_or_RELKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_PatternElement_LeftParenthesisKeyword_1_0_a.equals(syntax))
				emit_PatternElement_LeftParenthesisKeyword_1_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RangeLiteral_FullStopFullStopKeyword_2_1_0_q.equals(syntax))
				emit_RangeLiteral_FullStopFullStopKeyword_2_1_0_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RelationshipLookup_RELATIONSHIPKeyword_0_0_or_RELKeyword_0_1.equals(syntax))
				emit_RelationshipLookup_RELATIONSHIPKeyword_0_0_or_RELKeyword_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_RelationshipTypes_ColonKeyword_2_1_q.equals(syntax))
				emit_RelationshipTypes_ColonKeyword_2_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     statement=Statement (ambiguity) (rule end)
	 */
	protected void emit_Cypher_SemicolonKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
<<<<<<< HEAD
	 *     'RELATIONSHIP' | 'NODE' | 'REL'
=======
	 *     'RELATIONSHIP' | 'REL' | 'NODE'
>>>>>>> 5042096b4f924932adfacd2b70ca4b062cbad740
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '(' ids=LiteralIds
	 *     (rule start) (ambiguity) '(' legacyParameter=Parameter
	 *     (rule start) (ambiguity) '(' wildcard='*'
	 *     (rule start) (ambiguity) ':' indexName=SYMBOLIC_NAME_X
	 */
	protected void emit_NodeLookup_RelationshipLookup_NODEKeyword_0_or_RELATIONSHIPKeyword_0_0_or_RELKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) nodepattern=NodePattern
	 */
	protected void emit_PatternElement_LeftParenthesisKeyword_1_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '..'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '*' (ambiguity) (rule start)
	 *     lower=Number (ambiguity) (rule end)
	 */
	protected void emit_RangeLiteral_FullStopFullStopKeyword_2_1_0_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     'RELATIONSHIP' | 'REL'
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) '(' ids=LiteralIds
	 *     (rule start) (ambiguity) '(' legacyParameter=Parameter
	 *     (rule start) (ambiguity) '(' wildcard='*'
	 *     (rule start) (ambiguity) ':' indexName=SYMBOLIC_NAME_X
	 */
	protected void emit_RelationshipLookup_RELATIONSHIPKeyword_0_0_or_RELKeyword_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ':'?
	 *
	 * This ambiguous syntax occurs at:
	 *     relTypeName+=RelTypeName '|' (ambiguity) relTypeName+=RelTypeName
	 */
	protected void emit_RelationshipTypes_ColonKeyword_2_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
