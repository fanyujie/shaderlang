// Generated from ../shaderlang.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link shaderlangParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface shaderlangVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code struct}
	 * labeled alternative in {@link shaderlangParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct(shaderlangParser.StructContext ctx);
	/**
	 * Visit a parse tree produced by the {@code propertiesexp}
	 * labeled alternative in {@link shaderlangParser#properties}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertiesexp(shaderlangParser.PropertiesexpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code propertyexp}
	 * labeled alternative in {@link shaderlangParser#property}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropertyexp(shaderlangParser.PropertyexpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code initvaluexp}
	 * labeled alternative in {@link shaderlangParser#initvalue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInitvaluexp(shaderlangParser.InitvaluexpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subshaderexp}
	 * labeled alternative in {@link shaderlangParser#subshader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubshaderexp(shaderlangParser.SubshaderexpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code passexp}
	 * labeled alternative in {@link shaderlangParser#pass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPassexp(shaderlangParser.PassexpContext ctx);
	/**
	 * Visit a parse tree produced by {@link shaderlangParser#config}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConfig(shaderlangParser.ConfigContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stageexp}
	 * labeled alternative in {@link shaderlangParser#stage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStageexp(shaderlangParser.StageexpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code gpulangexp}
	 * labeled alternative in {@link shaderlangParser#gpulang}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGpulangexp(shaderlangParser.GpulangexpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code refuniformexp}
	 * labeled alternative in {@link shaderlangParser#refuniform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefuniformexp(shaderlangParser.RefuniformexpContext ctx);
}