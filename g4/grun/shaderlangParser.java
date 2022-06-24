// Generated from ../shaderlang.g4 by ANTLR 4.10.1
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
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, PROGSTR=13, STAGENAME=14, TYPE=15, VARNAME=16, 
		NUMBER=17, INITVALUE=18, WS=19;
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
			null, "PROGSTR", "STAGENAME", "TYPE", "VARNAME", "NUMBER", "INITVALUE", 
			"WS"
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
		public TerminalNode VARNAME() { return getToken(shaderlangParser.VARNAME, 0); }
		public PropertiesContext properties() {
			return getRuleContext(PropertiesContext.class,0);
		}
		public SubshaderContext subshader() {
			return getRuleContext(SubshaderContext.class,0);
		}
		public StructContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof shaderlangListener ) ((shaderlangListener)listener).enterStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof shaderlangListener ) ((shaderlangListener)listener).exitStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shaderlangVisitor ) return ((shaderlangVisitor<? extends T>)visitor).visitStruct(this);
			else return visitor.visitChildren(this);
		}
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
			match(VARNAME);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof shaderlangListener ) ((shaderlangListener)listener).enterPropertiesexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof shaderlangListener ) ((shaderlangListener)listener).exitPropertiesexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shaderlangVisitor ) return ((shaderlangVisitor<? extends T>)visitor).visitPropertiesexp(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof shaderlangListener ) ((shaderlangListener)listener).enterPropertyexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof shaderlangListener ) ((shaderlangListener)listener).exitPropertyexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shaderlangVisitor ) return ((shaderlangVisitor<? extends T>)visitor).visitPropertyexp(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof shaderlangListener ) ((shaderlangListener)listener).enterInitvaluexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof shaderlangListener ) ((shaderlangListener)listener).exitInitvaluexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shaderlangVisitor ) return ((shaderlangVisitor<? extends T>)visitor).visitInitvaluexp(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof shaderlangListener ) ((shaderlangListener)listener).enterSubshaderexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof shaderlangListener ) ((shaderlangListener)listener).exitSubshaderexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shaderlangVisitor ) return ((shaderlangVisitor<? extends T>)visitor).visitSubshaderexp(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof shaderlangListener ) ((shaderlangListener)listener).enterPassexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof shaderlangListener ) ((shaderlangListener)listener).exitPassexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shaderlangVisitor ) return ((shaderlangVisitor<? extends T>)visitor).visitPassexp(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof shaderlangListener ) ((shaderlangListener)listener).enterConfig(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof shaderlangListener ) ((shaderlangListener)listener).exitConfig(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shaderlangVisitor ) return ((shaderlangVisitor<? extends T>)visitor).visitConfig(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof shaderlangListener ) ((shaderlangListener)listener).enterStageexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof shaderlangListener ) ((shaderlangListener)listener).exitStageexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shaderlangVisitor ) return ((shaderlangVisitor<? extends T>)visitor).visitStageexp(this);
			else return visitor.visitChildren(this);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof shaderlangListener ) ((shaderlangListener)listener).enterGpulangexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof shaderlangListener ) ((shaderlangListener)listener).exitGpulangexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shaderlangVisitor ) return ((shaderlangVisitor<? extends T>)visitor).visitGpulangexp(this);
			else return visitor.visitChildren(this);
		}
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
			while (_la==TYPE) {
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
		public TerminalNode TYPE() { return getToken(shaderlangParser.TYPE, 0); }
		public TerminalNode VARNAME() { return getToken(shaderlangParser.VARNAME, 0); }
		public RefuniformexpContext(RefuniformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof shaderlangListener ) ((shaderlangListener)listener).enterRefuniformexp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof shaderlangListener ) ((shaderlangListener)listener).exitRefuniformexp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof shaderlangVisitor ) return ((shaderlangVisitor<? extends T>)visitor).visitRefuniformexp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RefuniformContext refuniform() throws RecognitionException {
		RefuniformContext _localctx = new RefuniformContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_refuniform);
		try {
			_localctx = new RefuniformexpContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(TYPE);
			setState(97);
			match(VARNAME);
			setState(98);
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
		"\u0004\u0001\u0013e\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0005\u0001!\b\u0001\n\u0001\f\u0001$\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0005\u00039\b\u0003\n\u0003\f\u0003<\t\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0004\u0004C\b\u0004"+
		"\u000b\u0004\f\u0004D\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0004\u0005L\b\u0005\u000b\u0005\f\u0005M\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\b\u0005\bZ\b\b\n\b\f\b]\t\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0000\u0000\n\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0000\u0000_\u0000\u0014\u0001\u0000\u0000\u0000"+
		"\u0002\u001d\u0001\u0000\u0000\u0000\u0004\'\u0001\u0000\u0000\u0000\u0006"+
		"3\u0001\u0000\u0000\u0000\b?\u0001\u0000\u0000\u0000\nH\u0001\u0000\u0000"+
		"\u0000\fQ\u0001\u0000\u0000\u0000\u000eS\u0001\u0000\u0000\u0000\u0010"+
		"[\u0001\u0000\u0000\u0000\u0012`\u0001\u0000\u0000\u0000\u0014\u0015\u0005"+
		"\u0001\u0000\u0000\u0015\u0016\u0005\u0002\u0000\u0000\u0016\u0017\u0005"+
		"\u0010\u0000\u0000\u0017\u0018\u0005\u0002\u0000\u0000\u0018\u0019\u0005"+
		"\u0003\u0000\u0000\u0019\u001a\u0003\u0002\u0001\u0000\u001a\u001b\u0003"+
		"\b\u0004\u0000\u001b\u001c\u0005\u0004\u0000\u0000\u001c\u0001\u0001\u0000"+
		"\u0000\u0000\u001d\u001e\u0005\u0005\u0000\u0000\u001e\"\u0005\u0003\u0000"+
		"\u0000\u001f!\u0003\u0004\u0002\u0000 \u001f\u0001\u0000\u0000\u0000!"+
		"$\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000"+
		"\u0000#%\u0001\u0000\u0000\u0000$\"\u0001\u0000\u0000\u0000%&\u0005\u0004"+
		"\u0000\u0000&\u0003\u0001\u0000\u0000\u0000\'(\u0005\u0010\u0000\u0000"+
		"()\u0005\u0006\u0000\u0000)*\u0005\u0002\u0000\u0000*+\u0005\u0010\u0000"+
		"\u0000+,\u0005\u0002\u0000\u0000,-\u0005\u0007\u0000\u0000-.\u0005\u000f"+
		"\u0000\u0000./\u0005\b\u0000\u0000/0\u0005\t\u0000\u000001\u0003\u0006"+
		"\u0003\u000012\u0005\n\u0000\u00002\u0005\u0001\u0000\u0000\u000034\u0005"+
		"\u000f\u0000\u000045\u0005\u0006\u0000\u00005:\u0005\u0011\u0000\u0000"+
		"67\u0005\u0007\u0000\u000079\u0005\u0011\u0000\u000086\u0001\u0000\u0000"+
		"\u00009<\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000:;\u0001\u0000"+
		"\u0000\u0000;=\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000=>\u0005"+
		"\b\u0000\u0000>\u0007\u0001\u0000\u0000\u0000?@\u0005\u000b\u0000\u0000"+
		"@B\u0005\u0003\u0000\u0000AC\u0003\n\u0005\u0000BA\u0001\u0000\u0000\u0000"+
		"CD\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000"+
		"\u0000EF\u0001\u0000\u0000\u0000FG\u0005\u0004\u0000\u0000G\t\u0001\u0000"+
		"\u0000\u0000HI\u0005\f\u0000\u0000IK\u0005\u0003\u0000\u0000JL\u0003\u000e"+
		"\u0007\u0000KJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MK\u0001"+
		"\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000"+
		"OP\u0005\u0004\u0000\u0000P\u000b\u0001\u0000\u0000\u0000QR\u0005\u0013"+
		"\u0000\u0000R\r\u0001\u0000\u0000\u0000ST\u0005\u000e\u0000\u0000TU\u0005"+
		"\u0003\u0000\u0000UV\u0003\u0010\b\u0000VW\u0005\u0004\u0000\u0000W\u000f"+
		"\u0001\u0000\u0000\u0000XZ\u0003\u0012\t\u0000YX\u0001\u0000\u0000\u0000"+
		"Z]\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000[\\\u0001\u0000\u0000"+
		"\u0000\\^\u0001\u0000\u0000\u0000][\u0001\u0000\u0000\u0000^_\u0005\r"+
		"\u0000\u0000_\u0011\u0001\u0000\u0000\u0000`a\u0005\u000f\u0000\u0000"+
		"ab\u0005\u0010\u0000\u0000bc\u0005\n\u0000\u0000c\u0013\u0001\u0000\u0000"+
		"\u0000\u0005\":DM[";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}