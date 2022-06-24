// Generated from ../shaderlang.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link shaderlangParser}.
 */
public interface shaderlangListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code struct}
	 * labeled alternative in {@link shaderlangParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterStruct(shaderlangParser.StructContext ctx);
	/**
	 * Exit a parse tree produced by the {@code struct}
	 * labeled alternative in {@link shaderlangParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitStruct(shaderlangParser.StructContext ctx);
	/**
	 * Enter a parse tree produced by the {@code propertiesexp}
	 * labeled alternative in {@link shaderlangParser#properties}.
	 * @param ctx the parse tree
	 */
	void enterPropertiesexp(shaderlangParser.PropertiesexpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code propertiesexp}
	 * labeled alternative in {@link shaderlangParser#properties}.
	 * @param ctx the parse tree
	 */
	void exitPropertiesexp(shaderlangParser.PropertiesexpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code propertyexp}
	 * labeled alternative in {@link shaderlangParser#property}.
	 * @param ctx the parse tree
	 */
	void enterPropertyexp(shaderlangParser.PropertyexpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code propertyexp}
	 * labeled alternative in {@link shaderlangParser#property}.
	 * @param ctx the parse tree
	 */
	void exitPropertyexp(shaderlangParser.PropertyexpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code initvaluexp}
	 * labeled alternative in {@link shaderlangParser#initvalue}.
	 * @param ctx the parse tree
	 */
	void enterInitvaluexp(shaderlangParser.InitvaluexpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initvaluexp}
	 * labeled alternative in {@link shaderlangParser#initvalue}.
	 * @param ctx the parse tree
	 */
	void exitInitvaluexp(shaderlangParser.InitvaluexpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subshaderexp}
	 * labeled alternative in {@link shaderlangParser#subshader}.
	 * @param ctx the parse tree
	 */
	void enterSubshaderexp(shaderlangParser.SubshaderexpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subshaderexp}
	 * labeled alternative in {@link shaderlangParser#subshader}.
	 * @param ctx the parse tree
	 */
	void exitSubshaderexp(shaderlangParser.SubshaderexpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code passexp}
	 * labeled alternative in {@link shaderlangParser#pass}.
	 * @param ctx the parse tree
	 */
	void enterPassexp(shaderlangParser.PassexpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code passexp}
	 * labeled alternative in {@link shaderlangParser#pass}.
	 * @param ctx the parse tree
	 */
	void exitPassexp(shaderlangParser.PassexpContext ctx);
	/**
	 * Enter a parse tree produced by {@link shaderlangParser#config}.
	 * @param ctx the parse tree
	 */
	void enterConfig(shaderlangParser.ConfigContext ctx);
	/**
	 * Exit a parse tree produced by {@link shaderlangParser#config}.
	 * @param ctx the parse tree
	 */
	void exitConfig(shaderlangParser.ConfigContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stageexp}
	 * labeled alternative in {@link shaderlangParser#stage}.
	 * @param ctx the parse tree
	 */
	void enterStageexp(shaderlangParser.StageexpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stageexp}
	 * labeled alternative in {@link shaderlangParser#stage}.
	 * @param ctx the parse tree
	 */
	void exitStageexp(shaderlangParser.StageexpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gpulangexp}
	 * labeled alternative in {@link shaderlangParser#gpulang}.
	 * @param ctx the parse tree
	 */
	void enterGpulangexp(shaderlangParser.GpulangexpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gpulangexp}
	 * labeled alternative in {@link shaderlangParser#gpulang}.
	 * @param ctx the parse tree
	 */
	void exitGpulangexp(shaderlangParser.GpulangexpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code refuniformexp}
	 * labeled alternative in {@link shaderlangParser#refuniform}.
	 * @param ctx the parse tree
	 */
	void enterRefuniformexp(shaderlangParser.RefuniformexpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code refuniformexp}
	 * labeled alternative in {@link shaderlangParser#refuniform}.
	 * @param ctx the parse tree
	 */
	void exitRefuniformexp(shaderlangParser.RefuniformexpContext ctx);
}