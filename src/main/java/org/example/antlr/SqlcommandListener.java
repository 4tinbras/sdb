// Generated from Sqlcommand.g4 by ANTLR 4.13.2

package org.example.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SqlcommandParser}.
 */
public interface SqlcommandListener extends ParseTreeListener {
    /**
     * Enter a parse tree produced by {@link SqlcommandParser#selector}.
     *
     * @param ctx the parse tree
     */
    void enterSelector(SqlcommandParser.SelectorContext ctx);

    /**
     * Exit a parse tree produced by {@link SqlcommandParser#selector}.
     *
     * @param ctx the parse tree
     */
    void exitSelector(SqlcommandParser.SelectorContext ctx);

    /**
     * Enter a parse tree produced by {@link SqlcommandParser#selectstmt}.
     *
     * @param ctx the parse tree
     */
    void enterSelectstmt(SqlcommandParser.SelectstmtContext ctx);

    /**
     * Exit a parse tree produced by {@link SqlcommandParser#selectstmt}.
     *
     * @param ctx the parse tree
     */
    void exitSelectstmt(SqlcommandParser.SelectstmtContext ctx);
}