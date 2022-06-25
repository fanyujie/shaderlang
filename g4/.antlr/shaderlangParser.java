// Generated from d:\Grocery\hw\homebrew\shaderlang\g4\shaderlang.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class shaderlangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, DIRECTION=13, PROGSTR=14, STAGENAME=15, TYPE=16, 
		SHADERNAME=17, VARNAME=18, NUMBER=19, INITVALUE=20, WS=21;
	public static final int
		RULE_prog = 0, RULE_properties = 1, RULE_property = 2, RULE_initvalue = 3, 
		RULE_subshader = 4, RULE_pass = 5, RULE_config = 6, RULE_stage = 7, RULE_gpulang = 8, 
		RULE_refuniform = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "properties", "property", "initvalue", "subshader", "pass", "config", 
			"stage", "gpulang", "refuniform"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Shader'", "'\"'", "'{'", "'}'", "'Properties'", "'('", "','", 
			"')'", "'='", "';'", "'Subshader'", "'Pass'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "DIRECTION", "PROGSTR", "STAGENAME", "TYPE", "SHADERNAME", "VARNAME", 
			"NUMBER", "INITVALUE", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "shaderlang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public shaderlangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgContext extends ParserRuleContext {
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	 
		public ProgContext() { }
		public void copyFrom(ProgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StructContext extends ProgContext {
		public TerminalNode SHADERNAME() { return getToken(shaderlangParser.SHADERNAME, 0); }
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public SubshaderContext subshader() {
			return getRuleContext(SubshaderContext.class,0);
		}
		public StructContext(ProgContext ctx) { copyFrom(ctx); }
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			_localctx = new StructContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			match(T__0);
			setState(21);
			match(T__1);
			setState(22);
			match(SHADERNAME);
			setState(23);
			match(T__1);
			setState(24);
			match(T__2);
			setState(25);
			properties();
			setState(26);
			subshader();
			setState(27);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertiesContext extends ParserRuleContext {
		public PropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_properties; }
	 
		public PropertiesContext() { }
		public void copyFrom(PropertiesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PropertiesexpContext extends PropertiesContext {
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public PropertiesexpContext(PropertiesContext ctx) { copyFrom(ctx); }
	}

	public final PropertiesContext properties() throws RecognitionException {
		PropertiesContext _localctx = new PropertiesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_properties);
		int _la;
		try {
			_localctx = new PropertiesexpContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			match(T__4);
			setState(30);
			match(T__2);
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VARNAME) {
				{
				{
				setState(31);
				property();
				}
				}
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(37);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyContext extends ParserRuleContext {
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
	 
		public PropertyContext() { }
		public void copyFrom(PropertyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PropertyexpContext extends PropertyContext {
		public List<TerminalNode> VARNAME() { return getTokens(shaderlangParser.VARNAME); }
		public TerminalNode VARNAME(int i) {
			return getToken(shaderlangParser.VARNAME, i);
		}
		public TerminalNode TYPE() { return getToken(shaderlangParser.TYPE, 0); }
		public InitvalueContext initvalue() {
			return getRuleContext(InitvalueContext.class,0);
		}
		public PropertyexpContext(PropertyContext ctx) { copyFrom(ctx); }
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_property);
		try {
			_localctx = new PropertyexpContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(VARNAME);
			setState(40);
			match(T__5);
			setState(41);
			match(T__1);
			setState(42);
			match(VARNAME);
			setState(43);
			match(T__1);
			setState(44);
			match(T__6);
			setState(45);
			match(TYPE);
			setState(46);
			match(T__7);
			setState(47);
			match(T__8);
			setState(48);
			initvalue();
			setState(49);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitvalueContext extends ParserRuleContext {
		public InitvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initvalue; }
	 
		public InitvalueContext() { }
		public void copyFrom(InitvalueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InitvaluexpContext extends InitvalueContext {
		public TerminalNode TYPE() { return getToken(shaderlangParser.TYPE, 0); }
		public List<TerminalNode> NUMBER() { return getTokens(shaderlangParser.NUMBER); }
		public TerminalNode NUMBER(int i) {
			return getToken(shaderlangParser.NUMBER, i);
		}
		public InitvaluexpContext(InitvalueContext ctx) { copyFrom(ctx); }
	}

	public final InitvalueContext initvalue() throws RecognitionException {
		InitvalueContext _localctx = new InitvalueContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_initvalue);
		int _la;
		try {
			_localctx = new InitvaluexpContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(TYPE);
			setState(52);
			match(T__5);
			setState(53);
			match(NUMBER);
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(54);
				match(T__6);
				setState(55);
				match(NUMBER);
				}
				}
				setState(60);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(61);
			match(T__7);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubshaderContext extends ParserRuleContext {
		public SubshaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subshader; }
	 
		public SubshaderContext() { }
		public void copyFrom(SubshaderContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubshaderexpContext extends SubshaderContext {
		public List<PassContext> pass() {
			return getRuleContexts(PassContext.class);
		}
		public PassContext pass(int i) {
			return getRuleContext(PassContext.class,i);
		}
		public SubshaderexpContext(SubshaderContext ctx) { copyFrom(ctx); }
	}

	public final SubshaderContext subshader() throws RecognitionException {
		SubshaderContext _localctx = new SubshaderContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_subshader);
		int _la;
		try {
			_localctx = new SubshaderexpContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(T__10);
			setState(64);
			match(T__2);
			setState(66); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(65);
				pass();
				}
				}
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__11 );
			setState(70);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PassContext extends ParserRuleContext {
		public PassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pass; }
	 
		public PassContext() { }
		public void copyFrom(PassContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PassexpContext extends PassContext {
		public List<StageContext> stage() {
			return getRuleContexts(StageContext.class);
		}
		public StageContext stage(int i) {
			return getRuleContext(StageContext.class,i);
		}
		public PassexpContext(PassContext ctx) { copyFrom(ctx); }
	}

	public final PassContext pass() throws RecognitionException {
		PassContext _localctx = new PassContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_pass);
		int _la;
		try {
			_localctx = new PassexpContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(T__11);
			setState(73);
			match(T__2);
			setState(75); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(74);
				stage();
				}
				}
				setState(77); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STAGENAME );
			setState(79);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConfigContext extends ParserRuleContext {
		public TerminalNode WS() { return getToken(shaderlangParser.WS, 0); }
		public ConfigContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_config; }
	}

	public final ConfigContext config() throws RecognitionException {
		ConfigContext _localctx = new ConfigContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_config);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(WS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StageContext extends ParserRuleContext {
		public StageContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stage; }
	 
		public StageContext() { }
		public void copyFrom(StageContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StageexpContext extends StageContext {
		public TerminalNode STAGENAME() { return getToken(shaderlangParser.STAGENAME, 0); }
		public GpulangContext gpulang() {
			return getRuleContext(GpulangContext.class,0);
		}
		public StageexpContext(StageContext ctx) { copyFrom(ctx); }
	}

	public final StageContext stage() throws RecognitionException {
		StageContext _localctx = new StageContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_stage);
		try {
			_localctx = new StageexpContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(STAGENAME);
			setState(84);
			match(T__2);
			setState(85);
			gpulang();
			setState(86);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GpulangContext extends ParserRuleContext {
		public GpulangContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gpulang; }
	 
		public GpulangContext() { }
		public void copyFrom(GpulangContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GpulangexpContext extends GpulangContext {
		public TerminalNode PROGSTR() { return getToken(shaderlangParser.PROGSTR, 0); }
		public List<RefuniformContext> refuniform() {
			return getRuleContexts(RefuniformContext.class);
		}
		public RefuniformContext refuniform(int i) {
			return getRuleContext(RefuniformContext.class,i);
		}
		public GpulangexpContext(GpulangContext ctx) { copyFrom(ctx); }
	}

	public final GpulangContext gpulang() throws RecognitionException {
		GpulangContext _localctx = new GpulangContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_gpulang);
		int _la;
		try {
			_localctx = new GpulangexpContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DIRECTION) {
				{
				{
				setState(88);
				refuniform();
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(94);
			match(PROGSTR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RefuniformContext extends ParserRuleContext {
		public RefuniformContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_refuniform; }
	 
		public RefuniformContext() { }
		public void copyFrom(RefuniformContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RefuniformexpContext extends RefuniformContext {
		public TerminalNode DIRECTION() { return getToken(shaderlangParser.DIRECTION, 0); }
		public TerminalNode TYPE() { return getToken(shaderlangParser.TYPE, 0); }
		public TerminalNode VARNAME() { return getToken(shaderlangParser.VARNAME, 0); }
		public RefuniformexpContext(RefuniformContext ctx) { copyFrom(ctx); }
	}

	public final RefuniformContext refuniform() throws RecognitionException {
		RefuniformContext _localctx = new RefuniformContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_refuniform);
		try {
			_localctx = new RefuniformexpContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(DIRECTION);
			setState(97);
			match(TYPE);
			setState(98);
			match(VARNAME);
			setState(99);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\27h\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\7\3#\n\3\f\3\16\3&\13\3"+
		"\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\7\5;\n\5\f\5\16\5>\13\5\3\5\3\5\3\6\3\6\3\6\6\6E\n\6\r\6\16\6F"+
		"\3\6\3\6\3\7\3\7\3\7\6\7N\n\7\r\7\16\7O\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\7\n\\\n\n\f\n\16\n_\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\2\2\f\2\4\6\b\n\f\16\20\22\24\2\2\2b\2\26\3\2\2\2\4\37\3\2\2\2\6)"+
		"\3\2\2\2\b\65\3\2\2\2\nA\3\2\2\2\fJ\3\2\2\2\16S\3\2\2\2\20U\3\2\2\2\22"+
		"]\3\2\2\2\24b\3\2\2\2\26\27\7\3\2\2\27\30\7\4\2\2\30\31\7\23\2\2\31\32"+
		"\7\4\2\2\32\33\7\5\2\2\33\34\5\4\3\2\34\35\5\n\6\2\35\36\7\6\2\2\36\3"+
		"\3\2\2\2\37 \7\7\2\2 $\7\5\2\2!#\5\6\4\2\"!\3\2\2\2#&\3\2\2\2$\"\3\2\2"+
		"\2$%\3\2\2\2%\'\3\2\2\2&$\3\2\2\2\'(\7\6\2\2(\5\3\2\2\2)*\7\24\2\2*+\7"+
		"\b\2\2+,\7\4\2\2,-\7\24\2\2-.\7\4\2\2./\7\t\2\2/\60\7\22\2\2\60\61\7\n"+
		"\2\2\61\62\7\13\2\2\62\63\5\b\5\2\63\64\7\f\2\2\64\7\3\2\2\2\65\66\7\22"+
		"\2\2\66\67\7\b\2\2\67<\7\25\2\289\7\t\2\29;\7\25\2\2:8\3\2\2\2;>\3\2\2"+
		"\2<:\3\2\2\2<=\3\2\2\2=?\3\2\2\2><\3\2\2\2?@\7\n\2\2@\t\3\2\2\2AB\7\r"+
		"\2\2BD\7\5\2\2CE\5\f\7\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2FG\3\2\2\2GH\3\2"+
		"\2\2HI\7\6\2\2I\13\3\2\2\2JK\7\16\2\2KM\7\5\2\2LN\5\20\t\2ML\3\2\2\2N"+
		"O\3\2\2\2OM\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QR\7\6\2\2R\r\3\2\2\2ST\7\27\2"+
		"\2T\17\3\2\2\2UV\7\21\2\2VW\7\5\2\2WX\5\22\n\2XY\7\6\2\2Y\21\3\2\2\2Z"+
		"\\\5\24\13\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]^\3\2\2\2^`\3\2\2\2_]\3\2"+
		"\2\2`a\7\20\2\2a\23\3\2\2\2bc\7\17\2\2cd\7\22\2\2de\7\24\2\2ef\7\f\2\2"+
		"f\25\3\2\2\2\7$<FO]";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}