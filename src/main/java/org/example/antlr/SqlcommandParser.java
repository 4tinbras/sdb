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
            T__0 = 1, T__1 = 2, LIST_SEP = 3, SELECT_ALL = 4, SELECT = 5, FROM = 6, INSERT = 7,
            INTO = 8, VALUES = 9, WORD = 10, NUMBER = 11, TABULATOR = 12, WHITESPACE = 13, Newline = 14;
	public static final int
            RULE_sqlstmt = 0, RULE_selectstmt = 1, RULE_insertstmt = 2, RULE_selector = 3;
	private static String[] makeRuleNames() {
        return new String[]{
                "sqlstmt", "selectstmt", "insertstmt", "selector"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
        return new String[]{
                null, "'('", "')'", null, null, "'SELECT'", "'FROM'", "'INSERT'", "'INTO'",
                "'VALUES'", null, null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
        return new String[]{
                null, null, null, "LIST_SEP", "SELECT_ALL", "SELECT", "FROM", "INSERT",
                "INTO", "VALUES", "WORD", "NUMBER", "TABULATOR", "WHITESPACE", "Newline"
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
        enterRule(_localctx, 0, RULE_sqlstmt);
		try {
            setState(10);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
                case SELECT:
                    enterOuterAlt(_localctx, 1);
				{
                    setState(8);
                    selectstmt();
				}
				break;
                case INSERT:
                    enterOuterAlt(_localctx, 2);
				{
                    setState(9);
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

	@SuppressWarnings("CheckReturnValue")
	public static class SelectstmtContext extends ParserRuleContext {
        public TerminalNode SELECT() {
            return getToken(SqlcommandParser.SELECT, 0);
        }
		public SelectorContext selector() {
            return getRuleContext(SelectorContext.class, 0);
		}

        public TerminalNode FROM() {
            return getToken(SqlcommandParser.FROM, 0);
        }

        public TerminalNode WORD() {
            return getToken(SqlcommandParser.WORD, 0);
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
                setState(12);
                match(SELECT);
                setState(13);
                selector();
                setState(14);
                match(FROM);
                setState(15);
                match(WORD);
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
        public TerminalNode INSERT() {
            return getToken(SqlcommandParser.INSERT, 0);
        }

        public TerminalNode INTO() {
            return getToken(SqlcommandParser.INTO, 0);
        }

        public List<TerminalNode> WORD() {
            return getTokens(SqlcommandParser.WORD);
        }

        public TerminalNode WORD(int i) {
            return getToken(SqlcommandParser.WORD, i);
		}

        public TerminalNode VALUES() {
            return getToken(SqlcommandParser.VALUES, 0);
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
                setState(17);
                match(INSERT);
                setState(18);
                match(INTO);
                setState(19);
                match(WORD);
                setState(30);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__0) {
                    {
                        setState(20);
                        match(T__0);
                        setState(21);
                        match(WORD);
				setState(26);
				_errHandler.sync(this);
				_la = _input.LA(1);
                        while (_la == LIST_SEP) {
					{
                        {
                            setState(22);
                            match(LIST_SEP);
                            setState(23);
                            match(WORD);
                        }
                    }
                            setState(28);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                        setState(29);
                        match(T__1);
                    }
                }

                setState(32);
                match(VALUES);
                setState(33);
                match(T__0);
                setState(34);
                match(WORD);
                setState(39);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == LIST_SEP) {
                    {
                        {
                            setState(35);
                            match(LIST_SEP);
                            setState(36);
                            match(WORD);
                        }
                    }
                    setState(41);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(42);
                match(T__1);
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
    public static class SelectorContext extends ParserRuleContext {
        public List<TerminalNode> WORD() {
            return getTokens(SqlcommandParser.WORD);
        }

        public TerminalNode WORD(int i) {
            return getToken(SqlcommandParser.WORD, i);
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
        enterRule(_localctx, 6, RULE_selector);
        int _la;
		try {
            setState(53);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
                case WORD:
                    enterOuterAlt(_localctx, 1);
				{
                    setState(44);
                    match(WORD);
                    setState(49);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la == LIST_SEP) {
                        {
                            {
                                setState(45);
                                match(LIST_SEP);
                                setState(46);
                                match(WORD);
                            }
                        }
                        setState(51);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
				}
				break;
                case SELECT_ALL:
                    enterOuterAlt(_localctx, 2);
				{
                    setState(52);
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

	public static final String _serializedATN =
            "\u0004\u0001\u000e8\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002" +
                    "\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0003" +
                    "\u0000\u000b\b\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
                    "\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001" +
                    "\u0002\u0001\u0002\u0005\u0002\u0019\b\u0002\n\u0002\f\u0002\u001c\t\u0002" +
                    "\u0001\u0002\u0003\u0002\u001f\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002" +
                    "\u0001\u0002\u0001\u0002\u0005\u0002&\b\u0002\n\u0002\f\u0002)\t\u0002" +
                    "\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003" +
                    "0\b\u0003\n\u0003\f\u00033\t\u0003\u0001\u0003\u0003\u00036\b\u0003\u0001" +
                    "\u0003\u0000\u0000\u0004\u0000\u0002\u0004\u0006\u0000\u00009\u0000\n" +
                    "\u0001\u0000\u0000\u0000\u0002\f\u0001\u0000\u0000\u0000\u0004\u0011\u0001" +
                    "\u0000\u0000\u0000\u00065\u0001\u0000\u0000\u0000\b\u000b\u0003\u0002" +
                    "\u0001\u0000\t\u000b\u0003\u0004\u0002\u0000\n\b\u0001\u0000\u0000\u0000" +
                    "\n\t\u0001\u0000\u0000\u0000\u000b\u0001\u0001\u0000\u0000\u0000\f\r\u0005" +
                    "\u0005\u0000\u0000\r\u000e\u0003\u0006\u0003\u0000\u000e\u000f\u0005\u0006" +
                    "\u0000\u0000\u000f\u0010\u0005\n\u0000\u0000\u0010\u0003\u0001\u0000\u0000" +
                    "\u0000\u0011\u0012\u0005\u0007\u0000\u0000\u0012\u0013\u0005\b\u0000\u0000" +
                    "\u0013\u001e\u0005\n\u0000\u0000\u0014\u0015\u0005\u0001\u0000\u0000\u0015" +
                    "\u001a\u0005\n\u0000\u0000\u0016\u0017\u0005\u0003\u0000\u0000\u0017\u0019" +
                    "\u0005\n\u0000\u0000\u0018\u0016\u0001\u0000\u0000\u0000\u0019\u001c\u0001" +
                    "\u0000\u0000\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001a\u001b\u0001" +
                    "\u0000\u0000\u0000\u001b\u001d\u0001\u0000\u0000\u0000\u001c\u001a\u0001" +
                    "\u0000\u0000\u0000\u001d\u001f\u0005\u0002\u0000\u0000\u001e\u0014\u0001" +
                    "\u0000\u0000\u0000\u001e\u001f\u0001\u0000\u0000\u0000\u001f \u0001\u0000" +
                    "\u0000\u0000 !\u0005\t\u0000\u0000!\"\u0005\u0001\u0000\u0000\"\'\u0005" +
                    "\n\u0000\u0000#$\u0005\u0003\u0000\u0000$&\u0005\n\u0000\u0000%#\u0001" +
                    "\u0000\u0000\u0000&)\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000" +
                    "\'(\u0001\u0000\u0000\u0000(*\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000" +
                    "\u0000*+\u0005\u0002\u0000\u0000+\u0005\u0001\u0000\u0000\u0000,1\u0005" +
                    "\n\u0000\u0000-.\u0005\u0003\u0000\u0000.0\u0005\n\u0000\u0000/-\u0001" +
                    "\u0000\u0000\u000003\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u0000" +
                    "12\u0001\u0000\u0000\u000026\u0001\u0000\u0000\u000031\u0001\u0000\u0000" +
                    "\u000046\u0005\u0004\u0000\u00005,\u0001\u0000\u0000\u000054\u0001\u0000" +
                    "\u0000\u00006\u0007\u0001\u0000\u0000\u0000\u0006\n\u001a\u001e\'15";
	public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}