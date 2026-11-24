// Generated from Sqlcommand.g4 by ANTLR 4.13.2

package org.example.antlr;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SqlcommandParser extends Parser {
	static {
		RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION);
	}

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
			new PredictionContextCache();
	public static final int
			T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, LIST_SEP = 9,
			SELECT_ALL = 10, ID = 11, ALPHANUMERIC = 12, WS = 13;
	public static final int
			RULE_selector = 0, RULE_selectstmt = 1, RULE_insertstmt = 2, RULE_sqlstmt = 3;
	private static String[] makeRuleNames() {
		return new String[]{
				"selector", "selectstmt", "insertstmt", "sqlstmt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[]{
				null, "' '", "'SELECT '", "' FROM '", "'INSERT INTO '", "' ('", "')'",
				"' VALUES '", "'('"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[]{
				null, null, null, null, null, null, null, null, null, "LIST_SEP", "SELECT_ALL",
				"ID", "ALPHANUMERIC", "WS"
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
	public String getGrammarFileName() {
		return "Sqlcommand.g4";
	}

	@Override
	public String[] getRuleNames() {
		return ruleNames;
	}

	@Override
	public String getSerializedATN() {
		return _serializedATN;
	}

	@Override
	public ATN getATN() {
		return _ATN;
	}

	public SqlcommandParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectorContext extends ParserRuleContext {
		public List<TerminalNode> ID() {
			return getTokens(SqlcommandParser.ID);
		}
		public TerminalNode ID(int i) {
			return getToken(SqlcommandParser.ID, i);
		}

		public List<TerminalNode> LIST_SEP() {
			return getTokens(SqlcommandParser.LIST_SEP);
		}
		public TerminalNode LIST_SEP(int i) {
			return getToken(SqlcommandParser.LIST_SEP, i);
		}

		public TerminalNode SELECT_ALL() {
			return getToken(SqlcommandParser.SELECT_ALL, 0);
		}
		public SelectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_selector;
		}
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SqlcommandListener) ((SqlcommandListener) listener).enterSelector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SqlcommandListener) ((SqlcommandListener) listener).exitSelector(this);
		}
	}

	public final SelectorContext selector() throws RecognitionException {
		SelectorContext _localctx = new SelectorContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_selector);
		int _la;
		try {
			setState(18);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case ID:
					enterOuterAlt(_localctx, 1);
				{
					setState(8);
					match(ID);
					setState(14);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la == LIST_SEP) {
						{
							{
								setState(9);
								match(LIST_SEP);
								setState(10);
								match(T__0);
								setState(11);
								match(ID);
							}
						}
						setState(16);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
				}
				break;
				case SELECT_ALL:
					enterOuterAlt(_localctx, 2);
				{
					setState(17);
					match(SELECT_ALL);
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectstmtContext extends ParserRuleContext {
		public SelectorContext selector() {
			return getRuleContext(SelectorContext.class, 0);
		}

		public TerminalNode ID() {
			return getToken(SqlcommandParser.ID, 0);
		}
		public SelectstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_selectstmt;
		}
		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SqlcommandListener) ((SqlcommandListener) listener).enterSelectstmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SqlcommandListener) ((SqlcommandListener) listener).exitSelectstmt(this);
		}
	}

	public final SelectstmtContext selectstmt() throws RecognitionException {
		SelectstmtContext _localctx = new SelectstmtContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_selectstmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(20);
				match(T__1);
				setState(21);
				selector();
				setState(22);
				match(T__2);
				setState(23);
				match(ID);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InsertstmtContext extends ParserRuleContext {
		public List<TerminalNode> ID() {
			return getTokens(SqlcommandParser.ID);
		}

		public TerminalNode ID(int i) {
			return getToken(SqlcommandParser.ID, i);
		}

		public List<TerminalNode> LIST_SEP() {
			return getTokens(SqlcommandParser.LIST_SEP);
		}

		public TerminalNode LIST_SEP(int i) {
			return getToken(SqlcommandParser.LIST_SEP, i);
		}

		public InsertstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_insertstmt;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SqlcommandListener) ((SqlcommandListener) listener).enterInsertstmt(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SqlcommandListener) ((SqlcommandListener) listener).exitInsertstmt(this);
		}
	}

	public final InsertstmtContext insertstmt() throws RecognitionException {
		InsertstmtContext _localctx = new InsertstmtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_insertstmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
				setState(25);
				match(T__3);
				setState(26);
				match(ID);
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la == T__4) {
					{
						setState(27);
						match(T__4);
						setState(28);
						match(ID);
						setState(34);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la == LIST_SEP) {
							{
								{
									setState(29);
									match(LIST_SEP);
									setState(30);
									match(T__0);
									setState(31);
									match(ID);
								}
							}
							setState(36);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(37);
						match(T__5);
					}
				}

				setState(40);
				match(T__6);
				setState(41);
				match(T__7);
				setState(42);
				match(ID);
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la == LIST_SEP) {
					{
						{
							setState(43);
							match(LIST_SEP);
							setState(44);
							match(T__0);
							setState(45);
							match(ID);
						}
					}
					setState(50);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(51);
				match(T__5);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SqlstmtContext extends ParserRuleContext {
		public SelectstmtContext selectstmt() {
			return getRuleContext(SelectstmtContext.class, 0);
		}

		public InsertstmtContext insertstmt() {
			return getRuleContext(InsertstmtContext.class, 0);
		}

		public SqlstmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}

		@Override
		public int getRuleIndex() {
			return RULE_sqlstmt;
		}

		@Override
		public void enterRule(ParseTreeListener listener) {
			if (listener instanceof SqlcommandListener) ((SqlcommandListener) listener).enterSqlstmt(this);
		}

		@Override
		public void exitRule(ParseTreeListener listener) {
			if (listener instanceof SqlcommandListener) ((SqlcommandListener) listener).exitSqlstmt(this);
		}
	}

	public final SqlstmtContext sqlstmt() throws RecognitionException {
		SqlstmtContext _localctx = new SqlstmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sqlstmt);
		try {
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
				case T__1:
					enterOuterAlt(_localctx, 1);
				{
					setState(53);
					selectstmt();
				}
				break;
				case T__3:
					enterOuterAlt(_localctx, 2);
				{
					setState(54);
					insertstmt();
				}
				break;
				default:
					throw new NoViableAltException(this);
			}
		} catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		} finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
			"\u0004\u0001\r:\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002" +
					"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0001" +
					"\u0000\u0001\u0000\u0005\u0000\r\b\u0000\n\u0000\f\u0000\u0010\t\u0000" +
					"\u0001\u0000\u0003\u0000\u0013\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001" +
					"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002" +
					"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002!\b\u0002\n\u0002\f\u0002" +
					"$\t\u0002\u0001\u0002\u0003\u0002\'\b\u0002\u0001\u0002\u0001\u0002\u0001" +
					"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002/\b\u0002\n\u0002" +
					"\f\u00022\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0003" +
					"\u00038\b\u0003\u0001\u0003\u0000\u0000\u0004\u0000\u0002\u0004\u0006" +
					"\u0000\u0000;\u0000\u0012\u0001\u0000\u0000\u0000\u0002\u0014\u0001\u0000" +
					"\u0000\u0000\u0004\u0019\u0001\u0000\u0000\u0000\u00067\u0001\u0000\u0000" +
					"\u0000\b\u000e\u0005\u000b\u0000\u0000\t\n\u0005\t\u0000\u0000\n\u000b" +
					"\u0005\u0001\u0000\u0000\u000b\r\u0005\u000b\u0000\u0000\f\t\u0001\u0000" +
					"\u0000\u0000\r\u0010\u0001\u0000\u0000\u0000\u000e\f\u0001\u0000\u0000" +
					"\u0000\u000e\u000f\u0001\u0000\u0000\u0000\u000f\u0013\u0001\u0000\u0000" +
					"\u0000\u0010\u000e\u0001\u0000\u0000\u0000\u0011\u0013\u0005\n\u0000\u0000" +
					"\u0012\b\u0001\u0000\u0000\u0000\u0012\u0011\u0001\u0000\u0000\u0000\u0013" +
					"\u0001\u0001\u0000\u0000\u0000\u0014\u0015\u0005\u0002\u0000\u0000\u0015" +
					"\u0016\u0003\u0000\u0000\u0000\u0016\u0017\u0005\u0003\u0000\u0000\u0017" +
					"\u0018\u0005\u000b\u0000\u0000\u0018\u0003\u0001\u0000\u0000\u0000\u0019" +
					"\u001a\u0005\u0004\u0000\u0000\u001a&\u0005\u000b\u0000\u0000\u001b\u001c" +
					"\u0005\u0005\u0000\u0000\u001c\"\u0005\u000b\u0000\u0000\u001d\u001e\u0005" +
					"\t\u0000\u0000\u001e\u001f\u0005\u0001\u0000\u0000\u001f!\u0005\u000b" +
					"\u0000\u0000 \u001d\u0001\u0000\u0000\u0000!$\u0001\u0000\u0000\u0000" +
					"\" \u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000#%\u0001\u0000\u0000" +
					"\u0000$\"\u0001\u0000\u0000\u0000%\'\u0005\u0006\u0000\u0000&\u001b\u0001" +
					"\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000\u0000" +
					"()\u0005\u0007\u0000\u0000)*\u0005\b\u0000\u0000*0\u0005\u000b\u0000\u0000" +
					"+,\u0005\t\u0000\u0000,-\u0005\u0001\u0000\u0000-/\u0005\u000b\u0000\u0000" +
					".+\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000\u00000.\u0001\u0000\u0000" +
					"\u000001\u0001\u0000\u0000\u000013\u0001\u0000\u0000\u000020\u0001\u0000" +
					"\u0000\u000034\u0005\u0006\u0000\u00004\u0005\u0001\u0000\u0000\u0000" +
					"58\u0003\u0002\u0001\u000068\u0003\u0004\u0002\u000075\u0001\u0000\u0000" +
					"\u000076\u0001\u0000\u0000\u00008\u0007\u0001\u0000\u0000\u0000\u0006" +
					"\u000e\u0012\"&07";
	public static final ATN _ATN =
			new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}