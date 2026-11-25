package org.example.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SqlCommandParserTest {

    //_______________________________SELECT_TESTS_______________________________//
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
        String validSqlSelectStmt = "SELECT id, name, surname FROM user";
        SqlCommandParser parser = new SqlCommandParser();
        SqlCommand outcome = parser.parseSqlCommand(validSqlSelectStmt);

        assertEquals(SqlCommand.CommandType.SELECT, outcome.getCommandType());
        assertEquals("id", outcome.getCommandTargetOperands().getFirst());
        assertEquals("name", outcome.getCommandTargetOperands().get(1));
        assertEquals("surname", outcome.getCommandTargetOperands().getLast());
        assertEquals("user", outcome.getTableName());
    }

    @Test
    void givenInvalidSelectStmt_whenParse_thenThrowException() {
        String invalidSelectStmt = "SELECT FROM user";

        SqlCommandParser parser = new SqlCommandParser();

        assertThrows(RuntimeException.class, () -> parser.parseSqlCommand(invalidSelectStmt));
    }

    //_______________________________INSERT_TESTS_______________________________//

    @Test
    void givenValidInsertStmt_whenParse_thenCorrect() {
        String validSqlInsertStmt = "INSERT INTO table (column) VALUES (value)";
        SqlCommandParser parser = new SqlCommandParser();
        SqlCommand outcome = parser.parseSqlCommand(validSqlInsertStmt);

        assertEquals(SqlCommand.CommandType.INSERT_INTO, outcome.getCommandType());
        assertEquals("column", outcome.getCommandTargetOperands().getFirst());
        assertEquals("value", outcome.getCommandValueOperands().getFirst());
        assertEquals("table", outcome.getTableName());
    }

    @Test
    void givenInvalidInsertStmt_whenParse_thenThrowException() {
        String validSqlInsertStmt = "INSERT VALUES (value)";
        SqlCommandParser parser = new SqlCommandParser();

        assertThrows(RuntimeException.class, () -> parser.parseSqlCommand(validSqlInsertStmt));
    }
}