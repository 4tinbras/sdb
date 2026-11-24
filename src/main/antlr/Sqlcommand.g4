grammar Sqlcommand;

@header {
package org.example.antlr;
}

selector
    : ID (LIST_SEP ' ' ID)*
    | SELECT_ALL
    ;

selectstmt
    : 'SELECT ' selector ' FROM ' ID
    ;

insertstmt
    : 'INSERT INTO ' ID (' (' ID (LIST_SEP ' ' ID)* ')')? ' VALUES ' '(' ID (LIST_SEP ' ' ID)* ')'
    ;

sqlstmt
    : selectstmt
    | insertstmt
    ;

LIST_SEP: [,];
SELECT_ALL: [*];

ID
    : [a-z]+
    ;

ALPHANUMERIC
    : [a-z0-9]+
    ;

WS
    : [ \t\r\n]+ -> skip
    ;
