// Generated from Sqlcommand.g4 by ANTLR 4.13.2

package org.example.antlr;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SqlcommandLexer extends Lexer {
    static {
        RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            T__0 = 1, T__1 = 2, LIST_SEP = 3, SELECT_ALL = 4, SELECT = 5, FROM = 6, INSERT = 7,
            INTO = 8, VALUES = 9, WORD = 10, NUMBER = 11, TABULATOR = 12, WHITESPACE = 13, Newline = 14;
    public static String[] channelNames = {
            "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };

    public static String[] modeNames = {
            "DEFAULT_MODE"
    };

    private static String[] makeRuleNames() {
        return new String[]{
                "T__0", "T__1", "LIST_SEP", "SELECT_ALL", "SELECT", "FROM", "INSERT",
                "INTO", "VALUES", "WORD", "NUMBER", "TABULATOR", "WHITESPACE", "Newline"
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


    public SqlcommandLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
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
    public String[] getChannelNames() {
        return channelNames;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public static final String _serializedATN =
            "\u0004\u0000\u000eb\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001" +
                    "\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004" +
                    "\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007" +
                    "\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b" +
                    "\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000\u0001" +
                    "\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001" +
                    "\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001" +
                    "\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001" +
                    "\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001" +
                    "\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001" +
                    "\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0004\tF\b" +
                    "\t\u000b\t\f\tG\u0001\n\u0004\nK\b\n\u000b\n\f\nL\u0001\u000b\u0004\u000b" +
                    "P\b\u000b\u000b\u000b\f\u000bQ\u0001\u000b\u0001\u000b\u0001\f\u0001\f" +
                    "\u0001\f\u0001\f\u0001\r\u0001\r\u0003\r\\\b\r\u0001\r\u0003\r_\b\r\u0001" +
                    "\r\u0001\r\u0000\u0000\u000e\u0001\u0001\u0003\u0002\u0005\u0003\u0007" +
                    "\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b" +
                    "\u0017\f\u0019\r\u001b\u000e\u0001\u0000\u0005\u0001\u0000,,\u0001\u0000" +
                    "**\u0001\u0000az\u0003\u00001199\u2013\u2013\u0001\u0000\t\tf\u0000\u0001" +
                    "\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005" +
                    "\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001" +
                    "\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000" +
                    "\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000" +
                    "\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000" +
                    "\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000" +
                    "\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0001\u001d\u0001\u0000" +
                    "\u0000\u0000\u0003\u001f\u0001\u0000\u0000\u0000\u0005!\u0001\u0000\u0000" +
                    "\u0000\u0007#\u0001\u0000\u0000\u0000\t%\u0001\u0000\u0000\u0000\u000b" +
                    ",\u0001\u0000\u0000\u0000\r1\u0001\u0000\u0000\u0000\u000f8\u0001\u0000" +
                    "\u0000\u0000\u0011=\u0001\u0000\u0000\u0000\u0013E\u0001\u0000\u0000\u0000" +
                    "\u0015J\u0001\u0000\u0000\u0000\u0017O\u0001\u0000\u0000\u0000\u0019U" +
                    "\u0001\u0000\u0000\u0000\u001b^\u0001\u0000\u0000\u0000\u001d\u001e\u0005" +
                    "(\u0000\u0000\u001e\u0002\u0001\u0000\u0000\u0000\u001f \u0005)\u0000" +
                    "\u0000 \u0004\u0001\u0000\u0000\u0000!\"\u0007\u0000\u0000\u0000\"\u0006" +
                    "\u0001\u0000\u0000\u0000#$\u0007\u0001\u0000\u0000$\b\u0001\u0000\u0000" +
                    "\u0000%&\u0005S\u0000\u0000&\'\u0005E\u0000\u0000\'(\u0005L\u0000\u0000" +
                    "()\u0005E\u0000\u0000)*\u0005C\u0000\u0000*+\u0005T\u0000\u0000+\n\u0001" +
                    "\u0000\u0000\u0000,-\u0005F\u0000\u0000-.\u0005R\u0000\u0000./\u0005O" +
                    "\u0000\u0000/0\u0005M\u0000\u00000\f\u0001\u0000\u0000\u000012\u0005I" +
                    "\u0000\u000023\u0005N\u0000\u000034\u0005S\u0000\u000045\u0005E\u0000" +
                    "\u000056\u0005R\u0000\u000067\u0005T\u0000\u00007\u000e\u0001\u0000\u0000" +
                    "\u000089\u0005I\u0000\u00009:\u0005N\u0000\u0000:;\u0005T\u0000\u0000" +
                    ";<\u0005O\u0000\u0000<\u0010\u0001\u0000\u0000\u0000=>\u0005V\u0000\u0000" +
                    ">?\u0005A\u0000\u0000?@\u0005L\u0000\u0000@A\u0005U\u0000\u0000AB\u0005" +
                    "E\u0000\u0000BC\u0005S\u0000\u0000C\u0012\u0001\u0000\u0000\u0000DF\u0007" +
                    "\u0002\u0000\u0000ED\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000" +
                    "GE\u0001\u0000\u0000\u0000GH\u0001\u0000\u0000\u0000H\u0014\u0001\u0000" +
                    "\u0000\u0000IK\u0007\u0003\u0000\u0000JI\u0001\u0000\u0000\u0000KL\u0001" +
                    "\u0000\u0000\u0000LJ\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000" +
                    "M\u0016\u0001\u0000\u0000\u0000NP\u0007\u0004\u0000\u0000ON\u0001\u0000" +
                    "\u0000\u0000PQ\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001" +
                    "\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000ST\u0006\u000b\u0000\u0000" +
                    "T\u0018\u0001\u0000\u0000\u0000UV\u0005 \u0000\u0000VW\u0001\u0000\u0000" +
                    "\u0000WX\u0006\f\u0000\u0000X\u001a\u0001\u0000\u0000\u0000Y[\u0005\r" +
                    "\u0000\u0000Z\\\u0005\n\u0000\u0000[Z\u0001\u0000\u0000\u0000[\\\u0001" +
                    "\u0000\u0000\u0000\\_\u0001\u0000\u0000\u0000]_\u0005\n\u0000\u0000^Y" +
                    "\u0001\u0000\u0000\u0000^]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000" +
                    "\u0000`a\u0006\r\u0001\u0000a\u001c\u0001\u0000\u0000\u0000\u0006\u0000" +
                    "GLQ[^\u0002\u0006\u0000\u0000\u0000\u0001\u0000";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}