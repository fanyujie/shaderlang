// Generated from d:\Grocery\hw\homebrew\shaderlang\g4\shaderlang.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class shaderlangLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, PROGSTR=13, STAGENAME=14, TYPE=15, VARNAME=16, 
		NUMBER=17, INITVALUE=18, WS=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "PROGSTR", "STAGENAME", "TYPE", "VARNAME", 
			"NUMBER", "INT", "INITVALUE", "ALLSTR", "ALLSTREXPLINE", "WS"
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


	public shaderlangLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "shaderlang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\25\u00c0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\7\16l\n\16\f\16\16\16o\13\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\5\17\u0085\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\7\21\u008f\n\21\f\21\16\21\u0092\13\21\3\22\5\22\u0095\n\22\3\22"+
		"\3\22\3\22\6\22\u009a\n\22\r\22\16\22\u009b\5\22\u009e\n\22\3\23\3\23"+
		"\3\23\7\23\u00a3\n\23\f\23\16\23\u00a6\13\23\5\23\u00a8\n\23\3\24\3\24"+
		"\3\25\7\25\u00ad\n\25\f\25\16\25\u00b0\13\25\3\26\7\26\u00b3\n\26\f\26"+
		"\16\26\u00b6\13\26\3\26\3\26\3\27\6\27\u00bb\n\27\r\27\16\27\u00bc\3\27"+
		"\3\27\5m\u00ae\u00b4\2\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\2\'\24)\2+\2-\25\3\2\t\4\2\63"+
		"\66~~\6\2C\\aac|~~\7\2\62;C\\aac|~~\3\2\62;\3\2\63;\3\2\f\f\5\2\13\f\17"+
		"\17\"\"\2\u00c8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3"+
		"\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2"+
		"\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3"+
		"\2\2\2\2#\3\2\2\2\2\'\3\2\2\2\2-\3\2\2\2\3/\3\2\2\2\5\66\3\2\2\2\78\3"+
		"\2\2\2\t:\3\2\2\2\13<\3\2\2\2\rG\3\2\2\2\17I\3\2\2\2\21K\3\2\2\2\23M\3"+
		"\2\2\2\25O\3\2\2\2\27Q\3\2\2\2\31[\3\2\2\2\33`\3\2\2\2\35\u0084\3\2\2"+
		"\2\37\u0086\3\2\2\2!\u008c\3\2\2\2#\u0094\3\2\2\2%\u00a7\3\2\2\2\'\u00a9"+
		"\3\2\2\2)\u00ae\3\2\2\2+\u00b4\3\2\2\2-\u00ba\3\2\2\2/\60\7U\2\2\60\61"+
		"\7j\2\2\61\62\7c\2\2\62\63\7f\2\2\63\64\7g\2\2\64\65\7t\2\2\65\4\3\2\2"+
		"\2\66\67\7$\2\2\67\6\3\2\2\289\7}\2\29\b\3\2\2\2:;\7\177\2\2;\n\3\2\2"+
		"\2<=\7R\2\2=>\7t\2\2>?\7q\2\2?@\7r\2\2@A\7g\2\2AB\7t\2\2BC\7v\2\2CD\7"+
		"k\2\2DE\7g\2\2EF\7u\2\2F\f\3\2\2\2GH\7*\2\2H\16\3\2\2\2IJ\7.\2\2J\20\3"+
		"\2\2\2KL\7+\2\2L\22\3\2\2\2MN\7?\2\2N\24\3\2\2\2OP\7=\2\2P\26\3\2\2\2"+
		"QR\7U\2\2RS\7w\2\2ST\7d\2\2TU\7u\2\2UV\7j\2\2VW\7c\2\2WX\7f\2\2XY\7g\2"+
		"\2YZ\7t\2\2Z\30\3\2\2\2[\\\7R\2\2\\]\7c\2\2]^\7u\2\2^_\7u\2\2_\32\3\2"+
		"\2\2`a\7I\2\2ab\7N\2\2bc\7U\2\2cd\7N\2\2de\7D\2\2ef\7G\2\2fg\7I\2\2gh"+
		"\7K\2\2hi\7P\2\2im\3\2\2\2jl\13\2\2\2kj\3\2\2\2lo\3\2\2\2mn\3\2\2\2mk"+
		"\3\2\2\2np\3\2\2\2om\3\2\2\2pq\7I\2\2qr\7N\2\2rs\7U\2\2st\7N\2\2tu\7G"+
		"\2\2uv\7P\2\2vw\7F\2\2w\34\3\2\2\2xy\7X\2\2yz\7g\2\2z{\7t\2\2{\u0085\7"+
		"v\2\2|}\7H\2\2}~\7t\2\2~\177\7c\2\2\177\u0085\7i\2\2\u0080\u0081\7I\2"+
		"\2\u0081\u0082\7g\2\2\u0082\u0083\7q\2\2\u0083\u0085\7o\2\2\u0084x\3\2"+
		"\2\2\u0084|\3\2\2\2\u0084\u0080\3\2\2\2\u0085\36\3\2\2\2\u0086\u0087\7"+
		"x\2\2\u0087\u0088\7g\2\2\u0088\u0089\7e\2\2\u0089\u008a\3\2\2\2\u008a"+
		"\u008b\t\2\2\2\u008b \3\2\2\2\u008c\u0090\t\3\2\2\u008d\u008f\t\4\2\2"+
		"\u008e\u008d\3\2\2\2\u008f\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091"+
		"\3\2\2\2\u0091\"\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0095\7/\2\2\u0094"+
		"\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u009d\5%"+
		"\23\2\u0097\u0099\7\60\2\2\u0098\u009a\t\5\2\2\u0099\u0098\3\2\2\2\u009a"+
		"\u009b\3\2\2\2\u009b\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\u009e\3\2"+
		"\2\2\u009d\u0097\3\2\2\2\u009d\u009e\3\2\2\2\u009e$\3\2\2\2\u009f\u00a8"+
		"\7\62\2\2\u00a0\u00a4\t\6\2\2\u00a1\u00a3\t\5\2\2\u00a2\u00a1\3\2\2\2"+
		"\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a8"+
		"\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u009f\3\2\2\2\u00a7\u00a0\3\2\2\2\u00a8"+
		"&\3\2\2\2\u00a9\u00aa\5)\25\2\u00aa(\3\2\2\2\u00ab\u00ad\13\2\2\2\u00ac"+
		"\u00ab\3\2\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00af\3\2\2\2\u00ae\u00ac\3\2"+
		"\2\2\u00af*\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b1\u00b3\13\2\2\2\u00b2\u00b1"+
		"\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b5"+
		"\u00b7\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\t\7\2\2\u00b8,\3\2\2\2"+
		"\u00b9\u00bb\t\b\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00ba"+
		"\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00bf\b\27\2\2"+
		"\u00bf.\3\2\2\2\16\2m\u0084\u0090\u0094\u009b\u009d\u00a4\u00a7\u00ae"+
		"\u00b4\u00bc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}