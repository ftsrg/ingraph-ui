/*
 * generated by Xtext 2.13.0
 */
lexer grammar InternalOpenCypherLexer;

@header {
package org.slizaa.neo4j.opencypher.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

ALLSHORTESTPATHS : ('A'|'a')('L'|'l')('L'|'l')('S'|'s')('H'|'h')('O'|'o')('R'|'r')('T'|'t')('E'|'e')('S'|'s')('T'|'t')('P'|'p')('A'|'a')('T'|'t')('H'|'h')('S'|'s');

FIELDTERMINATOR : ('F'|'f')('I'|'i')('E'|'e')('L'|'l')('D'|'d')('T'|'t')('E'|'e')('R'|'r')('M'|'m')('I'|'i')('N'|'n')('A'|'a')('T'|'t')('O'|'o')('R'|'r');

RELATIONSHIP : ('R'|'r')('E'|'e')('L'|'l')('A'|'a')('T'|'t')('I'|'i')('O'|'o')('N'|'n')('S'|'s')('H'|'h')('I'|'i')('P'|'p');

SHORTESTPATH : ('S'|'s')('H'|'h')('O'|'o')('R'|'r')('T'|'t')('E'|'e')('S'|'s')('T'|'t')('P'|'p')('A'|'a')('T'|'t')('H'|'h');

CONSTRAINT : ('C'|'c')('O'|'o')('N'|'n')('S'|'s')('T'|'t')('R'|'r')('A'|'a')('I'|'i')('N'|'n')('T'|'t');

DESCENDING : ('D'|'d')('E'|'e')('S'|'s')('C'|'c')('E'|'e')('N'|'n')('D'|'d')('I'|'i')('N'|'n')('G'|'g');

ASCENDING : ('A'|'a')('S'|'s')('C'|'c')('E'|'e')('N'|'n')('D'|'d')('I'|'i')('N'|'n')('G'|'g');

CONTAINS : ('C'|'c')('O'|'o')('N'|'n')('T'|'t')('A'|'a')('I'|'i')('N'|'n')('S'|'s');

DISTINCT : ('D'|'d')('I'|'i')('S'|'s')('T'|'t')('I'|'i')('N'|'n')('C'|'c')('T'|'t');

OPTIONAL : ('O'|'o')('P'|'p')('T'|'t')('I'|'i')('O'|'o')('N'|'n')('A'|'a')('L'|'l');

PERIODIC : ('P'|'p')('E'|'e')('R'|'r')('I'|'i')('O'|'o')('D'|'d')('I'|'i')('C'|'c');

EXPLAIN : ('E'|'e')('X'|'x')('P'|'p')('L'|'l')('A'|'a')('I'|'i')('N'|'n');

EXTRACT : ('E'|'e')('X'|'x')('T'|'t')('R'|'r')('A'|'a')('C'|'c')('T'|'t');

FOREACH : ('F'|'f')('O'|'o')('R'|'r')('E'|'e')('A'|'a')('C'|'c')('H'|'h');

HEADERS : ('H'|'h')('E'|'e')('A'|'a')('D'|'d')('E'|'e')('R'|'r')('S'|'s');

PROFILE : ('P'|'p')('R'|'r')('O'|'o')('F'|'f')('I'|'i')('L'|'l')('E'|'e');

ASSERT : ('A'|'a')('S'|'s')('S'|'s')('E'|'e')('R'|'r')('T'|'t');

COMMIT : ('C'|'c')('O'|'o')('M'|'m')('M'|'m')('I'|'i')('T'|'t');

CREATE : ('C'|'c')('R'|'r')('E'|'e')('A'|'a')('T'|'t')('E'|'e');

CYPHER : ('C'|'c')('Y'|'y')('P'|'p')('H'|'h')('E'|'e')('R'|'r');

DELETE : ('D'|'d')('E'|'e')('L'|'l')('E'|'e')('T'|'t')('E'|'e');

DETACH : ('D'|'d')('E'|'e')('T'|'t')('A'|'a')('C'|'c')('H'|'h');

EXISTS : ('E'|'e')('X'|'x')('I'|'i')('S'|'s')('T'|'t')('S'|'s');

FILTER : ('F'|'f')('I'|'i')('L'|'l')('T'|'t')('E'|'e')('R'|'r');

REDUCE : ('R'|'r')('E'|'e')('D'|'d')('U'|'u')('C'|'c')('E'|'e');

REMOVE : ('R'|'r')('E'|'e')('M'|'m')('O'|'o')('V'|'v')('E'|'e');

RETURN : ('R'|'r')('E'|'e')('T'|'t')('U'|'u')('R'|'r')('N'|'n');

SINGLE : ('S'|'s')('I'|'i')('N'|'n')('G'|'g')('L'|'l')('E'|'e');

STARTS : ('S'|'s')('T'|'t')('A'|'a')('R'|'r')('T'|'t')('S'|'s');

UNIQUE : ('U'|'u')('N'|'n')('I'|'i')('Q'|'q')('U'|'u')('E'|'e');

UNWIND : ('U'|'u')('N'|'n')('W'|'w')('I'|'i')('N'|'n')('D'|'d');

COUNT : ('C'|'c')('O'|'o')('U'|'u')('N'|'n')('T'|'t');

FALSE : ('F'|'f')('A'|'a')('L'|'l')('S'|'s')('E'|'e');

INDEX : ('I'|'i')('N'|'n')('D'|'d')('E'|'e')('X'|'x');

LIMIT : ('L'|'l')('I'|'i')('M'|'m')('I'|'i')('T'|'t');

MATCH : ('M'|'m')('A'|'a')('T'|'t')('C'|'c')('H'|'h');

MERGE : ('M'|'m')('E'|'e')('R'|'r')('G'|'g')('E'|'e');

ORDER : ('O'|'o')('R'|'r')('D'|'d')('E'|'e')('R'|'r');

START : ('S'|'s')('T'|'t')('A'|'a')('R'|'r')('T'|'t');

UNION : ('U'|'u')('N'|'n')('I'|'i')('O'|'o')('N'|'n');

USING : ('U'|'u')('S'|'s')('I'|'i')('N'|'n')('G'|'g');

WHERE : ('W'|'w')('H'|'h')('E'|'e')('R'|'r')('E'|'e');

YIELD : ('Y'|'y')('I'|'i')('E'|'e')('L'|'l')('D'|'d');

CALL : ('C'|'c')('A'|'a')('L'|'l')('L'|'l');

CASE : ('C'|'c')('A'|'a')('S'|'s')('E'|'e');

DESC : ('D'|'d')('E'|'e')('S'|'s')('C'|'c');

DROP : ('D'|'d')('R'|'r')('O'|'o')('P'|'p');

ELSE : ('E'|'e')('L'|'l')('S'|'s')('E'|'e');

ENDS : ('E'|'e')('N'|'n')('D'|'d')('S'|'s');

FROM : ('F'|'f')('R'|'r')('O'|'o')('M'|'m');

JOIN : ('J'|'j')('O'|'o')('I'|'i')('N'|'n');

LOAD : ('L'|'l')('O'|'o')('A'|'a')('D'|'d');

NODE : ('N'|'n')('O'|'o')('D'|'d')('E'|'e');

NONE : ('N'|'n')('O'|'o')('N'|'n')('E'|'e');

NULL : ('N'|'n')('U'|'u')('L'|'l')('L'|'l');

SCAN : ('S'|'s')('C'|'c')('A'|'a')('N'|'n');

SKIP : ('S'|'s')('K'|'k')('I'|'i')('P'|'p');

THEN : ('T'|'t')('H'|'h')('E'|'e')('N'|'n');

TRUE : ('T'|'t')('R'|'r')('U'|'u')('E'|'e');

WHEN : ('W'|'w')('H'|'h')('E'|'e')('N'|'n');

WITH : ('W'|'w')('I'|'i')('T'|'t')('H'|'h');

ALL : ('A'|'a')('L'|'l')('L'|'l');

AND : ('A'|'a')('N'|'n')('D'|'d');

ANY : ('A'|'a')('N'|'n')('Y'|'y');

ASC : ('A'|'a')('S'|'s')('C'|'c');

CSV : ('C'|'c')('S'|'s')('V'|'v');

END : ('E'|'e')('N'|'n')('D'|'d');

NOT : ('N'|'n')('O'|'o')('T'|'t');

REL : ('R'|'r')('E'|'e')('L'|'l');

SET : ('S'|'s')('E'|'e')('T'|'t');

XOR : ('X'|'x')('O'|'o')('R'|'r');

PlusSignEqualsSign : '+''=';

FullStopFullStop : '.''.';

LessThanSignEqualsSign : '<''=';

LessThanSignGreaterThanSign : '<''>';

EqualsSignTilde : '=''~';

GreaterThanSignEqualsSign : '>''=';

AS : ('A'|'a')('S'|'s');

BY : ('B'|'b')('Y'|'y');

IN : ('I'|'i')('N'|'n');

IS : ('I'|'i')('S'|'s');

ON : ('O'|'o')('N'|'n');

OR : ('O'|'o')('R'|'r');

ExclamationMark : '!';

DollarSign : '$';

PercentSign : '%';

LeftParenthesis : '(';

RightParenthesis : ')';

Asterisk : '*';

PlusSign : '+';

Comma : ',';

HyphenMinus : '-';

FullStop : '.';

Solidus : '/';

Colon : ':';

Semicolon : ';';

LessThanSign : '<';

EqualsSign : '=';

GreaterThanSign : '>';

QuestionMark : '?';

LeftSquareBracket : '[';

RightSquareBracket : ']';

CircumflexAccent : '^';

LeftCurlyBracket : '{';

VerticalLine : '|';

RightCurlyBracket : '}';

RULE_ID : (('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*|'`' ( options {greedy=false;} : . )*'`');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_STRING_LITERAL : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_HEX : ('0x'|'0X') ('0'..'9'|'A'..'F')+;

RULE_INT : '0'..'9' ('0'..'9')*;

RULE_DECIMAL : RULE_INT ('e' ('+'|'-')? RULE_INT)?;