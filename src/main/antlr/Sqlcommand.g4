grammar Sqlcommand;

@header {
package org.example.antlr;
}

sqlstmt
    : selectstmt
    | insertstmt
    ;

selectstmt
    : SELECT selector FROM WORD
    ;

insertstmt
    : INSERT INTO WORD ('(' WORD (LIST_SEP WORD)* ')')? VALUES '(' WORD (LIST_SEP WORD)* ')'
    ;

selector
    : WORD (LIST_SEP WORD)*
    | SELECT_ALL
    ;

LIST_SEP: [,];
SELECT_ALL: [*];
SELECT: 'SELECT';
FROM: 'FROM';
INSERT: 'INSERT';
INTO: 'INTO';
VALUES: 'VALUES';

WORD
    : [a-z]+
    ;

NUMBER
    : [1–9]+
    ;

TABULATOR
    : [\t]+ -> skip
    ;

WHITESPACE: ' ' -> skip; // No idea why but space in normal regex is not matched
Newline
    : ('\r' '\n'? | '\n') -> channel (HIDDEN)
    ;
