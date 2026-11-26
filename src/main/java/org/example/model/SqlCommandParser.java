package org.example.model;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ErrorNodeImpl;
import org.antlr.v4.runtime.tree.ParseTree;
import org.example.antlr.SqlcommandBaseListener;
import org.example.antlr.SqlcommandLexer;
import org.example.antlr.SqlcommandParser;

import java.util.List;

public class SqlCommandParser extends SqlcommandBaseListener {

    public SqlCommandParser() {
    }

    public SqlCommand parseSqlCommand(String input) throws RuntimeException {
        try {
            //TODO: sanitize values
            IO.println("SqlCommandParser: Parsing the sql command string.");

            SqlcommandLexer lexer = new SqlcommandLexer(CharStreams.fromString(input));
            SqlcommandParser parser = new SqlcommandParser(new CommonTokenStream(lexer));
            SqlcommandParser.SqlstmtContext sqlstmtContext = parser.sqlstmt();

            if (parser.getContext() != null) {
                throw new RuntimeException("Invalid sql command string.");
            }

            if (sqlstmtContext.children.getFirst() instanceof SqlcommandParser.SelectstmtContext) {
                SqlcommandParser.SelectstmtContext selectstmtCtx =
                        (SqlcommandParser.SelectstmtContext) sqlstmtContext.children.getFirst();

                if (selectstmtCtx.children.stream().anyMatch(child -> child instanceof ErrorNodeImpl)) {
                    throw new RuntimeException("Invalid sql command string.");
                }

                return parseSelectStatement(selectstmtCtx);
            } else if (sqlstmtContext.children.getFirst() instanceof SqlcommandParser.InsertstmtContext) {
                SqlcommandParser.InsertstmtContext insertstmtCtx =
                        (SqlcommandParser.InsertstmtContext) sqlstmtContext.children.getFirst();

                if (insertstmtCtx.children.stream().anyMatch(child -> child instanceof ErrorNodeImpl)) {
                    throw new RuntimeException("Invalid sql command string.");
                }

                return parseInsertStatement(insertstmtCtx);
            }

            throw new RuntimeException("Invalid sql command string.");
        } catch (Exception ex) {
            throw new RuntimeException("Error parsing SQL command", ex);
        }
    }

    private SqlCommand parseSelectStatement(SqlcommandParser.SelectstmtContext ctx) {
        List<String> columnSelectors = ctx.selector().children.stream()
                .filter(item -> !item.getText().equals(","))
                .map(ParseTree::getText)
                .toList();

        SqlCommand newCommand = new SqlCommand(
                SqlCommand.CommandType.SELECT, ctx.getStop().getText(),
                columnSelectors, null, null);

        return newCommand;
    }

    private SqlCommand parseInsertStatement(SqlcommandParser.InsertstmtContext ctx) {
        List<String> columnSelectors = ctx.children.stream()
                .filter(item -> !item.getText().equals("(") && !item.getText().equals(")"))
                .map(ParseTree::getText)
                .toList();

        List<String> columns = columnSelectors.subList(3, columnSelectors.indexOf("VALUES"));
        List<String> values = columnSelectors.subList(columnSelectors.indexOf("VALUES") + 1, columnSelectors.size());

        SqlCommand newCommand = new SqlCommand(
                SqlCommand.CommandType.INSERT_INTO, ctx.getChild(2).getText(),
                columns, values, null);

        return newCommand;
    }
}
