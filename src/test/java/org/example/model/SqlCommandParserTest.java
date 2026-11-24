package org.example.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SqlCommandParserTest {

    @Test
    void givenValidSelectStmt_whenParse_thenCorrect() {
        String validSqlSelectStmt = "SELECT id FROM user";
        SqlCommandParser parser = new SqlCommandParser();
        SqlCommand outcome = parser.parseSqlCommand(validSqlSelectStmt);

        assertEquals(SqlCommand.CommandType.SELECT, outcome.getCommandType());
        assertEquals("id", outcome.getCommandTargetOperands().getFirst());
        assertEquals("user", outcome.getTableName());
    }

    @Test
    void givenMultipleColsInSelectStmt_whenParse_thenCorrect() {
        String validSqlSelectStmt = "SELECT id, name FROM user";
        SqlCommandParser parser = new SqlCommandParser();
        SqlCommand outcome = parser.parseSqlCommand(validSqlSelectStmt);

        assertEquals(SqlCommand.CommandType.SELECT, outcome.getCommandType());
        assertEquals("id", outcome.getCommandTargetOperands().getFirst());
        assertEquals("name", outcome.getCommandTargetOperands().getLast());
        assertEquals("user", outcome.getTableName());
    }

    @Test
    void givenInvalidSelectStmt_whenParse_thenThrowException() {
        String invalidSelectStmt = "SELECT FROM user";

        SqlCommandParser parser = new SqlCommandParser();

        assertThrows(RuntimeException.class, () -> parser.parseSqlCommand(invalidSelectStmt));
    }
}