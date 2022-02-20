/*
 * generated by Xtext 2.25.0
 */
package org.xtext.example.mydsl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.xtext.example.mydsl.ide.contentassist.antlr.internal.InternalMyDslParser;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;

public class MyDslParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MyDslGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MyDslGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getLoadscopeAccess().getAlternatives(), "rule__Loadscope__Alternatives");
			builder.put(grammarAccess.getInstructionAccess().getAlternatives_0(), "rule__Instruction__Alternatives_0");
			builder.put(grammarAccess.getExpressionAccess().getAlternatives(), "rule__Expression__Alternatives");
			builder.put(grammarAccess.getMathExpressionAccess().getAlternatives(), "rule__MathExpression__Alternatives");
			builder.put(grammarAccess.getMathPrimaryExpressionAccess().getAlternatives(), "rule__MathPrimaryExpression__Alternatives");
			builder.put(grammarAccess.getOpAccess().getAlternatives(), "rule__Op__Alternatives");
			builder.put(grammarAccess.getLoadAccess().getGroup(), "rule__Load__Group__0");
			builder.put(grammarAccess.getCreateAccess().getGroup(), "rule__Create__Group__0");
			builder.put(grammarAccess.getInstructionAccess().getGroup(), "rule__Instruction__Group__0");
			builder.put(grammarAccess.getInsertColAccess().getGroup(), "rule__InsertCol__Group__0");
			builder.put(grammarAccess.getRemoveColAccess().getGroup(), "rule__RemoveCol__Group__0");
			builder.put(grammarAccess.getInsertLineAccess().getGroup(), "rule__InsertLine__Group__0");
			builder.put(grammarAccess.getRemoveLineAccess().getGroup(), "rule__RemoveLine__Group__0");
			builder.put(grammarAccess.getInsertAccess().getGroup(), "rule__Insert__Group__0");
			builder.put(grammarAccess.getPrintAccess().getGroup(), "rule__Print__Group__0");
			builder.put(grammarAccess.getExportCSVAccess().getGroup(), "rule__ExportCSV__Group__0");
			builder.put(grammarAccess.getExportJSONAccess().getGroup(), "rule__ExportJSON__Group__0");
			builder.put(grammarAccess.getBinaryExpressionAccess().getGroup(), "rule__BinaryExpression__Group__0");
			builder.put(grammarAccess.getSelectcellAccess().getGroup(), "rule__Selectcell__Group__0");
			builder.put(grammarAccess.getLinesumAccess().getGroup(), "rule__Linesum__Group__0");
			builder.put(grammarAccess.getColsumAccess().getGroup(), "rule__Colsum__Group__0");
			builder.put(grammarAccess.getLineprodAccess().getGroup(), "rule__Lineprod__Group__0");
			builder.put(grammarAccess.getColprodAccess().getGroup(), "rule__Colprod__Group__0");
			builder.put(grammarAccess.getProgrammeAccess().getLoadscopesAssignment(), "rule__Programme__LoadscopesAssignment");
			builder.put(grammarAccess.getLoadAccess().getPathAssignment_1(), "rule__Load__PathAssignment_1");
			builder.put(grammarAccess.getLoadAccess().getInstructionsAssignment_4(), "rule__Load__InstructionsAssignment_4");
			builder.put(grammarAccess.getCreateAccess().getInstructionsAssignment_2(), "rule__Create__InstructionsAssignment_2");
			builder.put(grammarAccess.getInsertColAccess().getColIndexAssignment_1(), "rule__InsertCol__ColIndexAssignment_1");
			builder.put(grammarAccess.getInsertColAccess().getColNameAssignment_3(), "rule__InsertCol__ColNameAssignment_3");
			builder.put(grammarAccess.getRemoveColAccess().getColNameAssignment_1(), "rule__RemoveCol__ColNameAssignment_1");
			builder.put(grammarAccess.getInsertLineAccess().getLineIndexAssignment_1(), "rule__InsertLine__LineIndexAssignment_1");
			builder.put(grammarAccess.getRemoveLineAccess().getLineIndexAssignment_1(), "rule__RemoveLine__LineIndexAssignment_1");
			builder.put(grammarAccess.getInsertAccess().getLineIndexAssignment_1(), "rule__Insert__LineIndexAssignment_1");
			builder.put(grammarAccess.getInsertAccess().getColNameAssignment_3(), "rule__Insert__ColNameAssignment_3");
			builder.put(grammarAccess.getInsertAccess().getValueAssignment_5(), "rule__Insert__ValueAssignment_5");
			builder.put(grammarAccess.getPrintAccess().getValueAssignment_1(), "rule__Print__ValueAssignment_1");
			builder.put(grammarAccess.getExportCSVAccess().getPathAssignment_1(), "rule__ExportCSV__PathAssignment_1");
			builder.put(grammarAccess.getExportJSONAccess().getPathAssignment_1(), "rule__ExportJSON__PathAssignment_1");
			builder.put(grammarAccess.getBinaryExpressionAccess().getLeftAssignment_1(), "rule__BinaryExpression__LeftAssignment_1");
			builder.put(grammarAccess.getBinaryExpressionAccess().getOpAssignment_2(), "rule__BinaryExpression__OpAssignment_2");
			builder.put(grammarAccess.getBinaryExpressionAccess().getRightAssignment_3(), "rule__BinaryExpression__RightAssignment_3");
			builder.put(grammarAccess.getSelectcellAccess().getLineIndexAssignment_1(), "rule__Selectcell__LineIndexAssignment_1");
			builder.put(grammarAccess.getSelectcellAccess().getColNameAssignment_3(), "rule__Selectcell__ColNameAssignment_3");
			builder.put(grammarAccess.getLinesumAccess().getLineIndexAssignment_1(), "rule__Linesum__LineIndexAssignment_1");
			builder.put(grammarAccess.getColsumAccess().getColNameAssignment_1(), "rule__Colsum__ColNameAssignment_1");
			builder.put(grammarAccess.getLineprodAccess().getLineIndexAssignment_1(), "rule__Lineprod__LineIndexAssignment_1");
			builder.put(grammarAccess.getColprodAccess().getColNameAssignment_1(), "rule__Colprod__ColNameAssignment_1");
			builder.put(grammarAccess.getNoneValueAccess().getValueAssignment(), "rule__NoneValue__ValueAssignment");
			builder.put(grammarAccess.getIntValueAccess().getValueAssignment(), "rule__IntValue__ValueAssignment");
			builder.put(grammarAccess.getStringValueAccess().getValueAssignment(), "rule__StringValue__ValueAssignment");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MyDslGrammarAccess grammarAccess;

	@Override
	protected InternalMyDslParser createParser() {
		InternalMyDslParser result = new InternalMyDslParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MyDslGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
