package org.example.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.function.Predicate;

@RequiredArgsConstructor
@Getter
@EqualsAndHashCode
public class SqlCommand {
    private CommandType commandType;
    private String tableName;
    private List<String> commandTargetOperands;
    private List<String> commandValueOperands;
    private Predicate<String> selectionPredicate;

    public SqlCommand(CommandType commandType, String tableName,
                      List<String> commandTargetOperands, List<String> commandValueOperands,
                      Predicate<String> selectionPredicate) {
        this.commandType = commandType;
        this.tableName = tableName;
        this.selectionPredicate = selectionPredicate;
        this.commandTargetOperands = commandTargetOperands;
        this.commandValueOperands = commandValueOperands;
    }

    public enum CommandType {
        SELECT,
        INSERT_INTO,
        DELETE,
        UPDATE,

    }
}
