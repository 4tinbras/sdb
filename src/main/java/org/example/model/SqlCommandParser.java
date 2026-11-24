package org.example.model;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.example.antlr.SqlcommandBaseListener;
import org.example.antlr.SqlcommandLexer;
import org.example.antlr.SqlcommandParser;

public class SqlCommandParser extends SqlcommandBaseListener {

    public SqlCommandParser() {
    }

    public SqlCommand parseSqlCommand(String input) throws RuntimeException {
        try {
            //TODO: sanitize values
            IO.println("SqlCommandParser: Parsing the sql command string.");

            SqlcommandLexer lexer = new SqlcommandLexer(CharStreams.fromString(input));
            SqlcommandParser parser = new SqlcommandParser(new CommonTokenStream(lexer));
            SqlcommandParser.SelectstmtContext ctx = parser.selectstmt();

            if (ctx.getChildCount() != 4) {
                throw new RuntimeException("Invalid sql command string.");
            }

            SqlCommand newCommand = new SqlCommand(
                    SqlCommand.CommandType.SELECT, ctx.getStop().getText(),
                    new String[]{ctx.selector().getStart().getText()}, null, null);

            return newCommand;
        } catch (Exception ex) {
            throw new RuntimeException("Error parsing SQL command", ex);
        }
    }
}
