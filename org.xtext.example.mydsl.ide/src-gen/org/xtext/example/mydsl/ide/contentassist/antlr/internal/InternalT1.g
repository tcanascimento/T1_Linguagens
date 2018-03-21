/*
 * generated by Xtext 2.12.0
 */
grammar InternalT1;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.T1GrammarAccess;

}
@parser::members {
	private T1GrammarAccess grammarAccess;

	public void setGrammarAccess(T1GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}

	@Override
	protected Grammar getGrammar() {
		return grammarAccess.getGrammar();
	}

	@Override
	protected String getValueForTokenName(String tokenName) {
		return tokenName;
	}
}

// Entry rule entryRuleModel
entryRuleModel
:
{ before(grammarAccess.getModelRule()); }
	 ruleModel
{ after(grammarAccess.getModelRule()); } 
	 EOF 
;

// Rule Model
ruleModel 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getModelAccess().getVarsAssignment()); }
		(rule__Model__VarsAssignment)*
		{ after(grammarAccess.getModelAccess().getVarsAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleName
entryRuleName
:
{ before(grammarAccess.getNameRule()); }
	 ruleName
{ after(grammarAccess.getNameRule()); } 
	 EOF 
;

// Rule Name
ruleName 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getNameAccess().getIDTerminalRuleCall()); }
		RULE_ID
		{ after(grammarAccess.getNameAccess().getIDTerminalRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleValue
entryRuleValue
:
{ before(grammarAccess.getValueRule()); }
	 ruleValue
{ after(grammarAccess.getValueRule()); } 
	 EOF 
;

// Rule Value
ruleValue 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getValueAccess().getAlternatives()); }
		(rule__Value__Alternatives)
		{ after(grammarAccess.getValueAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAttribution
entryRuleAttribution
:
{ before(grammarAccess.getAttributionRule()); }
	 ruleAttribution
{ after(grammarAccess.getAttributionRule()); } 
	 EOF 
;

// Rule Attribution
ruleAttribution 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAttributionAccess().getGroup()); }
		(rule__Attribution__Group__0)*
		{ after(grammarAccess.getAttributionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleDeclaration
entryRuleDeclaration
:
{ before(grammarAccess.getDeclarationRule()); }
	 ruleDeclaration
{ after(grammarAccess.getDeclarationRule()); } 
	 EOF 
;

// Rule Declaration
ruleDeclaration 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getDeclarationAccess().getGroup()); }
		(rule__Declaration__Group__0)
		{ after(grammarAccess.getDeclarationAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVar
entryRuleVar
:
{ before(grammarAccess.getVarRule()); }
	 ruleVar
{ after(grammarAccess.getVarRule()); } 
	 EOF 
;

// Rule Var
ruleVar 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVarAccess().getGroup()); }
		(rule__Var__Group__0)
		{ after(grammarAccess.getVarAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Value__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getValueAccess().getIDTerminalRuleCall_0()); }
		RULE_ID
		{ after(grammarAccess.getValueAccess().getIDTerminalRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); }
		RULE_STRING
		{ after(grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_1()); }
	)
	|
	(
		{ before(grammarAccess.getValueAccess().getINTTerminalRuleCall_2()); }
		RULE_INT
		{ after(grammarAccess.getValueAccess().getINTTerminalRuleCall_2()); }
	)
	|
	(
		{ before(grammarAccess.getValueAccess().getGroup_3()); }
		(rule__Value__Group_3__0)
		{ after(grammarAccess.getValueAccess().getGroup_3()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Value__Group_3__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Value__Group_3__0__Impl
	rule__Value__Group_3__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Value__Group_3__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getValueAccess().getINTTerminalRuleCall_3_0()); }
	(RULE_INT)?
	{ after(grammarAccess.getValueAccess().getINTTerminalRuleCall_3_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Value__Group_3__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Value__Group_3__1__Impl
	rule__Value__Group_3__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Value__Group_3__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getValueAccess().getFullStopKeyword_3_1()); }
	'.'
	{ after(grammarAccess.getValueAccess().getFullStopKeyword_3_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Value__Group_3__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Value__Group_3__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Value__Group_3__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getValueAccess().getINTTerminalRuleCall_3_2()); }
	(RULE_INT)*
	{ after(grammarAccess.getValueAccess().getINTTerminalRuleCall_3_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Attribution__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribution__Group__0__Impl
	rule__Attribution__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribution__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributionAccess().getEqualsSignKeyword_0()); }
	'='
	{ after(grammarAccess.getAttributionAccess().getEqualsSignKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribution__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Attribution__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Attribution__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAttributionAccess().getValueParserRuleCall_1()); }
	ruleValue
	{ after(grammarAccess.getAttributionAccess().getValueParserRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Declaration__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Declaration__Group__0__Impl
	rule__Declaration__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Declaration__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDeclarationAccess().getNameParserRuleCall_0()); }
	ruleName
	{ after(grammarAccess.getDeclarationAccess().getNameParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Declaration__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Declaration__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Declaration__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getDeclarationAccess().getAttributionParserRuleCall_1()); }
	ruleAttribution
	{ after(grammarAccess.getDeclarationAccess().getAttributionParserRuleCall_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Var__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Var__Group__0__Impl
	rule__Var__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Var__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVarAccess().getVarKeyword_0()); }
	'var'
	{ after(grammarAccess.getVarAccess().getVarKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Var__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Var__Group__1__Impl
	rule__Var__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Var__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVarAccess().getDeclarationsAssignment_1()); }
	(rule__Var__DeclarationsAssignment_1)
	{ after(grammarAccess.getVarAccess().getDeclarationsAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Var__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Var__Group__2__Impl
	rule__Var__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Var__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVarAccess().getGroup_2()); }
	(rule__Var__Group_2__0)*
	{ after(grammarAccess.getVarAccess().getGroup_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Var__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Var__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Var__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVarAccess().getSemicolonKeyword_3()); }
	(';')?
	{ after(grammarAccess.getVarAccess().getSemicolonKeyword_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Var__Group_2__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Var__Group_2__0__Impl
	rule__Var__Group_2__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Var__Group_2__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVarAccess().getCommaKeyword_2_0()); }
	','
	{ after(grammarAccess.getVarAccess().getCommaKeyword_2_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Var__Group_2__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Var__Group_2__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Var__Group_2__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVarAccess().getDeclarationsAssignment_2_1()); }
	(rule__Var__DeclarationsAssignment_2_1)
	{ after(grammarAccess.getVarAccess().getDeclarationsAssignment_2_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Model__VarsAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getModelAccess().getVarsVarParserRuleCall_0()); }
		ruleVar
		{ after(grammarAccess.getModelAccess().getVarsVarParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Var__DeclarationsAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVarAccess().getDeclarationsDeclarationParserRuleCall_1_0()); }
		ruleDeclaration
		{ after(grammarAccess.getVarAccess().getDeclarationsDeclarationParserRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Var__DeclarationsAssignment_2_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVarAccess().getDeclarationsDeclarationParserRuleCall_2_1_0()); }
		ruleDeclaration
		{ after(grammarAccess.getVarAccess().getDeclarationsDeclarationParserRuleCall_2_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
