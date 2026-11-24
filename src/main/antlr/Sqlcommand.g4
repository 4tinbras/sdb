grammar Sqlcommand;

@header {
package org.example.antlr;
}

selector    : ID (LIST_SEP ' ' ID)* | SELECT_ALL ;
selectstmt  : 'SELECT ' selector ' FROM ' ID ;

LIST_SEP    : [,] ;
SELECT_ALL  : [*] ;
ID          : [a-z]+ ;
WS          : [ \t\r\n]+ -> skip ;
