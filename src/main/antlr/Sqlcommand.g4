grammar Sqlcommand;

@header {
package org.example.antlr;
}

selector    : ID|SELECT_ALL ;
selectstmt  : 'SELECT ' selector ' FROM ' ID ;

SELECT_ALL  : [*] ;
ID          : [a-z]+ ;
WS          : [ \t\r\n]+ -> skip ;
