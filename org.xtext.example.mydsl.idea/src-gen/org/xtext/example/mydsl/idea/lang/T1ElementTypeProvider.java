/*
 * generated by Xtext 2.12.0
 */
package org.xtext.example.mydsl.idea.lang;

import com.intellij.psi.tree.IFileElementType;
import java.util.HashMap;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.idea.lang.IElementTypeProvider;
import org.eclipse.xtext.psi.stubs.XtextFileElementType;
import org.eclipse.xtext.psi.stubs.XtextFileStub;
import org.eclipse.xtext.psi.tree.IGrammarAwareElementType;
import org.xtext.example.mydsl.idea.lang.psi.impl.T1FileImpl;
import org.xtext.example.mydsl.services.T1GrammarAccess;

public class T1ElementTypeProvider implements IElementTypeProvider {

	public static final IFileElementType FILE_TYPE = new XtextFileElementType<XtextFileStub<T1FileImpl>>(T1Language.INSTANCE);

	private static final Map<EObject, IGrammarAwareElementType> GRAMMAR_ELEMENT_TYPE = new HashMap<EObject, IGrammarAwareElementType>();

	private static IGrammarAwareElementType associate(IGrammarAwareElementType grammarAwareElementType) {
		GRAMMAR_ELEMENT_TYPE.put(grammarAwareElementType.getGrammarElement(), grammarAwareElementType);
		return grammarAwareElementType;
	}

	private static final T1GrammarAccess GRAMMAR_ACCESS = T1Language.INSTANCE.getInstance(T1GrammarAccess.class);

	private static class ModelFactory {
		public static IGrammarAwareElementType createModelElementType() {
			return new IGrammarAwareElementType("Model_ELEMENT_TYPE", T1Language.INSTANCE, GRAMMAR_ACCESS.getModelRule());
		}
		public static IGrammarAwareElementType createModel_VarsAssignmentElementType() {
			return new IGrammarAwareElementType("Model_VarsAssignment_ELEMENT_TYPE", T1Language.INSTANCE, GRAMMAR_ACCESS.getModelAccess().getVarsAssignment());
		}
		public static IGrammarAwareElementType createModel_VarsVarParserRuleCall_0ElementType() {
			return new IGrammarAwareElementType("Model_VarsVarParserRuleCall_0_ELEMENT_TYPE", T1Language.INSTANCE, GRAMMAR_ACCESS.getModelAccess().getVarsVarParserRuleCall_0());
		}
	}

	public static final IGrammarAwareElementType Model_ELEMENT_TYPE = associate(ModelFactory.createModelElementType());

	public static final IGrammarAwareElementType Model_VarsAssignment_ELEMENT_TYPE = associate(ModelFactory.createModel_VarsAssignmentElementType());

	public static final IGrammarAwareElementType Model_VarsVarParserRuleCall_0_ELEMENT_TYPE = associate(ModelFactory.createModel_VarsVarParserRuleCall_0ElementType());

	private static class NameFactory {
		public static IGrammarAwareElementType createNameElementType() {
			return new IGrammarAwareElementType("Name_ELEMENT_TYPE", T1Language.INSTANCE, GRAMMAR_ACCESS.getNameRule());
		}
		public static IGrammarAwareElementType createName_IDTerminalRuleCallElementType() {
			return new IGrammarAwareElementType("Name_IDTerminalRuleCall_ELEMENT_TYPE", T1Language.INSTANCE, GRAMMAR_ACCESS.getNameAccess().getIDTerminalRuleCall());
		}
	}

	public static final IGrammarAwareElementType Name_ELEMENT_TYPE = associate(NameFactory.createNameElementType());

	public static final IGrammarAwareElementType Name_IDTerminalRuleCall_ELEMENT_TYPE = associate(NameFactory.createName_IDTerminalRuleCallElementType());

	private static class ValueFactory {
		public static IGrammarAwareElementType createValueElementType() {
			return new IGrammarAwareElementType("Value_ELEMENT_TYPE", T1Language.INSTANCE, GRAMMAR_ACCESS.getValueRule());
		}
		public static IGrammarAwareElementType createValue_AlternativesElementType() {
			return new IGrammarAwareElementType("Value_Alternatives_ELEMENT_TYPE", T1Language.INSTANCE, GRAMMAR_ACCESS.getValueAccess().getAlternatives());
		}
		public static IGrammarAwareElementType createValue_IDTerminalRuleCall_0ElementType() {
			return new IGrammarAwareElementType("Value_IDTerminalRuleCall_0_ELEMENT_TYPE", T1Language.INSTANCE, GRAMMAR_ACCESS.getValueAccess().getIDTerminalRuleCall_0());
		}
		public static IGrammarAwareElementType createValue_STRINGTerminalRuleCall_1ElementType() {
			return new IGrammarAwareElementType("Value_STRINGTerminalRuleCall_1_ELEMENT_TYPE", T1Language.INSTANCE, GRAMMAR_ACCESS.getValueAccess().getSTRINGTerminalRuleCall_1());
		}
		public static IGrammarAwareElementType createValue_INTTerminalRuleCall_2ElementType() {
			return new IGrammarAwareElementType("Value_INTTerminalRuleCall_2_ELEMENT_TYPE", T1Language.INSTANCE, GRAMMAR_ACCESS.getValueAccess().getINTTerminalRuleCall_2());
		}
		public static IGrammarAwareElementType createValue_Group_3ElementType() {
			return new IGrammarAwareElementType("Value_Group_3_ELEMENT_TYPE", T1Language.INSTANCE, GRAMMAR_ACCESS.getValueAccess().getGroup_3());
		}
		public static IGrammarAwareElementType createValue_INTTerminalRuleCall_3_0ElementType() {
			return new IGrammarAwareElementType("Value_INTTerminalRuleCall_3_0_ELEMENT_TYPE", T1Language.INSTANCE, GRAMMAR_ACCESS.getValueAccess().getINTTerminalRuleCall_3_0());
		}
		public static IGrammarAwareElementType createValue_FullStopKeyword_3_1ElementType() {
			return new IGrammarAwareElementType("Value_FullStopKeyword_3_1_ELEMENT_TYPE", T1Language.INSTANCE, GRAMMAR_ACCESS.getValueAccess().getFullStopKeyword_3_1());
		}
		public static IGrammarAwareElementType createValue_INTTerminalRuleCall_3_2ElementType() {
			return new IGrammarAwareElementType("Value_INTTerminalRuleCall_3_2_ELEMENT_TYPE", T1Language.INSTANCE, GRAMMAR_ACCESS.getValueAccess().getINTTerminalRuleCall_3_2());
		}
	}

	public static final IGrammarAwareElementType Value_ELEMENT_TYPE = associate(ValueFactory.createValueElementType());

	public static final IGrammarAwareElementType Value_Alternatives_ELEMENT_TYPE = associate(ValueFactory.createValue_AlternativesElementType());

	public static final IGrammarAwareElementType Value_IDTerminalRuleCall_0_ELEMENT_TYPE = associate(ValueFactory.createValue_IDTerminalRuleCall_0ElementType());

	public static final IGrammarAwareElementType Value_STRINGTerminalRuleCall_1_ELEMENT_TYPE = associate(ValueFactory.createValue_STRINGTerminalRuleCall_1ElementType());

	public static final IGrammarAwareElementType Value_INTTerminalRuleCall_2_ELEMENT_TYPE = associate(ValueFactory.createValue_INTTerminalRuleCall_2ElementType());

	public static final IGrammarAwareElementType Value_Group_3_ELEMENT_TYPE = associate(ValueFactory.createValue_Group_3ElementType());

	public static final IGrammarAwareElementType Value_INTTerminalRuleCall_3_0_ELEMENT_TYPE = associate(ValueFactory.createValue_INTTerminalRuleCall_3_0ElementType());

	public static final IGrammarAwareElementType Value_FullStopKeyword_3_1_ELEMENT_TYPE = associate(ValueFactory.createValue_FullStopKeyword_3_1ElementType());

	public static final IGrammarAwareElementType Value_INTTerminalRuleCall_3_2_ELEMENT_TYPE = associate(ValueFactory.createValue_INTTerminalRuleCall_3_2ElementType());

	private static class AttributionFactory {
		public static IGrammarAwareElementType createAttributionElementType() {
			return new IGrammarAwareElementType("Attribution_ELEMENT_TYPE", T1Language.INSTANCE, GRAMMAR_ACCESS.getAttributionRule());
		}
		public static IGrammarAwareElementType createAttribution_GroupElementType() {
			return new IGrammarAwareElementType("Attribution_Group_ELEMENT_TYPE", T1Language.INSTANCE, GRAMMAR_ACCESS.getAttributionAccess().getGroup());
		}
		public static IGrammarAwareElementType createAttribution_EqualsSignKeyword_0ElementType() {
			return new IGrammarAwareElementType("Attribution_EqualsSignKeyword_0_ELEMENT_TYPE", T1Language.INSTANCE, GRAMMAR_ACCESS.getAttributionAccess().getEqualsSignKeyword_0());
		}
		public static IGrammarAwareElementType createAttribution_ValueParserRuleCall_1ElementType() {
			return new IGrammarAwareElementType("Attribution_ValueParserRuleCall_1_ELEMENT_TYPE", T1Language.INSTANCE, GRAMMAR_ACCESS.getAttributionAccess().getValueParserRuleCall_1());
		}
	}

	public static final IGrammarAwareElementType Attribution_ELEMENT_TYPE = associate(AttributionFactory.createAttributionElementType());

	public static final IGrammarAwareElementType Attribution_Group_ELEMENT_TYPE = associate(AttributionFactory.createAttribution_GroupElementType());

	public static final IGrammarAwareElementType Attribution_EqualsSignKeyword_0_ELEMENT_TYPE = associate(AttributionFactory.createAttribution_EqualsSignKeyword_0ElementType());

	public static final IGrammarAwareElementType Attribution_ValueParserRuleCall_1_ELEMENT_TYPE = associate(AttributionFactory.createAttribution_ValueParserRuleCall_1ElementType());

	private static class DeclarationFactory {
		public static IGrammarAwareElementType createDeclarationElementType() {
			return new IGrammarAwareElementType("Declaration_ELEMENT_TYPE", T1Language.INSTANCE, GRAMMAR_ACCESS.getDeclarationRule());
		}
		public static IGrammarAwareElementType createDeclaration_GroupElementType() {
			return new IGrammarAwareElementType("Declaration_Group_ELEMENT_TYPE", T1Language.INSTANCE, GRAMMAR_ACCESS.getDeclarationAccess().getGroup());
		}
		public static IGrammarAwareElementType createDeclaration_NameParserRuleCall_0ElementType() {
			return new IGrammarAwareElementType("Declaration_NameParserRuleCall_0_ELEMENT_TYPE", T1Language.INSTANCE, GRAMMAR_ACCESS.getDeclarationAccess().getNameParserRuleCall_0());
		}
		public static IGrammarAwareElementType createDeclaration_AttributionParserRuleCall_1ElementType() {
			return new IGrammarAwareElementType("Declaration_AttributionParserRuleCall_1_ELEMENT_TYPE", T1Language.INSTANCE, GRAMMAR_ACCESS.getDeclarationAccess().getAttributionParserRuleCall_1());
		}
	}

	public static final IGrammarAwareElementType Declaration_ELEMENT_TYPE = associate(DeclarationFactory.createDeclarationElementType());

	public static final IGrammarAwareElementType Declaration_Group_ELEMENT_TYPE = associate(DeclarationFactory.createDeclaration_GroupElementType());

	public static final IGrammarAwareElementType Declaration_NameParserRuleCall_0_ELEMENT_TYPE = associate(DeclarationFactory.createDeclaration_NameParserRuleCall_0ElementType());

	public static final IGrammarAwareElementType Declaration_AttributionParserRuleCall_1_ELEMENT_TYPE = associate(DeclarationFactory.createDeclaration_AttributionParserRuleCall_1ElementType());

	private static class VarFactory {
		public static IGrammarAwareElementType createVarElementType() {
			return new IGrammarAwareElementType("Var_ELEMENT_TYPE", T1Language.INSTANCE, GRAMMAR_ACCESS.getVarRule());
		}
		public static IGrammarAwareElementType createVar_GroupElementType() {
			return new IGrammarAwareElementType("Var_Group_ELEMENT_TYPE", T1Language.INSTANCE, GRAMMAR_ACCESS.getVarAccess().getGroup());
		}
		public static IGrammarAwareElementType createVar_VarKeyword_0ElementType() {
			return new IGrammarAwareElementType("Var_VarKeyword_0_ELEMENT_TYPE", T1Language.INSTANCE, GRAMMAR_ACCESS.getVarAccess().getVarKeyword_0());
		}
		public static IGrammarAwareElementType createVar_DeclarationsAssignment_1ElementType() {
			return new IGrammarAwareElementType("Var_DeclarationsAssignment_1_ELEMENT_TYPE", T1Language.INSTANCE, GRAMMAR_ACCESS.getVarAccess().getDeclarationsAssignment_1());
		}
		public static IGrammarAwareElementType createVar_DeclarationsDeclarationParserRuleCall_1_0ElementType() {
			return new IGrammarAwareElementType("Var_DeclarationsDeclarationParserRuleCall_1_0_ELEMENT_TYPE", T1Language.INSTANCE, GRAMMAR_ACCESS.getVarAccess().getDeclarationsDeclarationParserRuleCall_1_0());
		}
		public static IGrammarAwareElementType createVar_Group_2ElementType() {
			return new IGrammarAwareElementType("Var_Group_2_ELEMENT_TYPE", T1Language.INSTANCE, GRAMMAR_ACCESS.getVarAccess().getGroup_2());
		}
		public static IGrammarAwareElementType createVar_CommaKeyword_2_0ElementType() {
			return new IGrammarAwareElementType("Var_CommaKeyword_2_0_ELEMENT_TYPE", T1Language.INSTANCE, GRAMMAR_ACCESS.getVarAccess().getCommaKeyword_2_0());
		}
		public static IGrammarAwareElementType createVar_DeclarationsAssignment_2_1ElementType() {
			return new IGrammarAwareElementType("Var_DeclarationsAssignment_2_1_ELEMENT_TYPE", T1Language.INSTANCE, GRAMMAR_ACCESS.getVarAccess().getDeclarationsAssignment_2_1());
		}
		public static IGrammarAwareElementType createVar_DeclarationsDeclarationParserRuleCall_2_1_0ElementType() {
			return new IGrammarAwareElementType("Var_DeclarationsDeclarationParserRuleCall_2_1_0_ELEMENT_TYPE", T1Language.INSTANCE, GRAMMAR_ACCESS.getVarAccess().getDeclarationsDeclarationParserRuleCall_2_1_0());
		}
		public static IGrammarAwareElementType createVar_SemicolonKeyword_3ElementType() {
			return new IGrammarAwareElementType("Var_SemicolonKeyword_3_ELEMENT_TYPE", T1Language.INSTANCE, GRAMMAR_ACCESS.getVarAccess().getSemicolonKeyword_3());
		}
	}

	public static final IGrammarAwareElementType Var_ELEMENT_TYPE = associate(VarFactory.createVarElementType());

	public static final IGrammarAwareElementType Var_Group_ELEMENT_TYPE = associate(VarFactory.createVar_GroupElementType());

	public static final IGrammarAwareElementType Var_VarKeyword_0_ELEMENT_TYPE = associate(VarFactory.createVar_VarKeyword_0ElementType());

	public static final IGrammarAwareElementType Var_DeclarationsAssignment_1_ELEMENT_TYPE = associate(VarFactory.createVar_DeclarationsAssignment_1ElementType());

	public static final IGrammarAwareElementType Var_DeclarationsDeclarationParserRuleCall_1_0_ELEMENT_TYPE = associate(VarFactory.createVar_DeclarationsDeclarationParserRuleCall_1_0ElementType());

	public static final IGrammarAwareElementType Var_Group_2_ELEMENT_TYPE = associate(VarFactory.createVar_Group_2ElementType());

	public static final IGrammarAwareElementType Var_CommaKeyword_2_0_ELEMENT_TYPE = associate(VarFactory.createVar_CommaKeyword_2_0ElementType());

	public static final IGrammarAwareElementType Var_DeclarationsAssignment_2_1_ELEMENT_TYPE = associate(VarFactory.createVar_DeclarationsAssignment_2_1ElementType());

	public static final IGrammarAwareElementType Var_DeclarationsDeclarationParserRuleCall_2_1_0_ELEMENT_TYPE = associate(VarFactory.createVar_DeclarationsDeclarationParserRuleCall_2_1_0ElementType());

	public static final IGrammarAwareElementType Var_SemicolonKeyword_3_ELEMENT_TYPE = associate(VarFactory.createVar_SemicolonKeyword_3ElementType());

	@Override
	public IFileElementType getFileType() {
		return FILE_TYPE;
	}

	@Override
	public IGrammarAwareElementType findElementType(EObject grammarElement) {
		return GRAMMAR_ELEMENT_TYPE.get(grammarElement);
	}
	
	public IGrammarAwareElementType getModelElementType() {
		return Model_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getModel_VarsAssignmentElementType() {
		return Model_VarsAssignment_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getModel_VarsVarParserRuleCall_0ElementType() {
		return Model_VarsVarParserRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getNameElementType() {
		return Name_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getName_IDTerminalRuleCallElementType() {
		return Name_IDTerminalRuleCall_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getValueElementType() {
		return Value_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getValue_AlternativesElementType() {
		return Value_Alternatives_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getValue_IDTerminalRuleCall_0ElementType() {
		return Value_IDTerminalRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getValue_STRINGTerminalRuleCall_1ElementType() {
		return Value_STRINGTerminalRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getValue_INTTerminalRuleCall_2ElementType() {
		return Value_INTTerminalRuleCall_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getValue_Group_3ElementType() {
		return Value_Group_3_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getValue_INTTerminalRuleCall_3_0ElementType() {
		return Value_INTTerminalRuleCall_3_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getValue_FullStopKeyword_3_1ElementType() {
		return Value_FullStopKeyword_3_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getValue_INTTerminalRuleCall_3_2ElementType() {
		return Value_INTTerminalRuleCall_3_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAttributionElementType() {
		return Attribution_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAttribution_GroupElementType() {
		return Attribution_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAttribution_EqualsSignKeyword_0ElementType() {
		return Attribution_EqualsSignKeyword_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getAttribution_ValueParserRuleCall_1ElementType() {
		return Attribution_ValueParserRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDeclarationElementType() {
		return Declaration_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDeclaration_GroupElementType() {
		return Declaration_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDeclaration_NameParserRuleCall_0ElementType() {
		return Declaration_NameParserRuleCall_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getDeclaration_AttributionParserRuleCall_1ElementType() {
		return Declaration_AttributionParserRuleCall_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getVarElementType() {
		return Var_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getVar_GroupElementType() {
		return Var_Group_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getVar_VarKeyword_0ElementType() {
		return Var_VarKeyword_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getVar_DeclarationsAssignment_1ElementType() {
		return Var_DeclarationsAssignment_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getVar_DeclarationsDeclarationParserRuleCall_1_0ElementType() {
		return Var_DeclarationsDeclarationParserRuleCall_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getVar_Group_2ElementType() {
		return Var_Group_2_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getVar_CommaKeyword_2_0ElementType() {
		return Var_CommaKeyword_2_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getVar_DeclarationsAssignment_2_1ElementType() {
		return Var_DeclarationsAssignment_2_1_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getVar_DeclarationsDeclarationParserRuleCall_2_1_0ElementType() {
		return Var_DeclarationsDeclarationParserRuleCall_2_1_0_ELEMENT_TYPE;
	}
	
	public IGrammarAwareElementType getVar_SemicolonKeyword_3ElementType() {
		return Var_SemicolonKeyword_3_ELEMENT_TYPE;
	}

}