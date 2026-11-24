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

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SqlcommandParser extends Parser {
    static {
        RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            T__0 = 1, T__1 = 2, SELECT_ALL = 3, ID = 4, WS = 5;
    public static final int
            RULE_selector = 0, RULE_selectstmt = 1;

    private static String[] makeRuleNames() {
        return new String[]{
                "selector", "selectstmt"
        };
    }

    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'SELECT '", "' FROM '"
        };
    }

    private static final String[] _LITERAL_NAMES = makeLiteralNames();

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, null, null, "SELECT_ALL", "ID", "WS"
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
        public TerminalNode ID() {
            return getToken(SqlcommandParser.ID, 0);
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
            enterOuterAlt(_localctx, 1);
            {
                setState(4);
                _la = _input.LA(1);
                if (!(_la == SELECT_ALL || _la == ID)) {
                    _errHandler.recoverInline(this);
                } else {
                    if (_input.LA(1) == Token.EOF) matchedEOF = true;
                    _errHandler.reportMatch(this);
                    consume();
                }
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
                setState(6);
                match(T__0);
                setState(7);
                selector();
                setState(8);
                match(T__1);
                setState(9);
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

    public static final String _serializedATN =
            "\u0004\u0001\u0005\f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0001" +
                    "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
                    "\u0001\u0001\u0001\u0000\u0000\u0002\u0000\u0002\u0000\u0001\u0001\u0000" +
                    "\u0003\u0004\t\u0000\u0004\u0001\u0000\u0000\u0000\u0002\u0006\u0001\u0000" +
                    "\u0000\u0000\u0004\u0005\u0007\u0000\u0000\u0000\u0005\u0001\u0001\u0000" +
                    "\u0000\u0000\u0006\u0007\u0005\u0001\u0000\u0000\u0007\b\u0003\u0000\u0000" +
                    "\u0000\b\t\u0005\u0002\u0000\u0000\t\n\u0005\u0004\u0000\u0000\n\u0003" +
                    "\u0001\u0000\u0000\u0000\u0000";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}