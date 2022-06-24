grammar shaderlang;		










prog:	'Shader' '"'VARNAME'"' '{' properties subshader '}' #struct
; 
properties : 'Properties' '{' (property)* '}' # propertiesexp
;
property : VARNAME '(' '"'VARNAME'"' ',' TYPE ')' '=' initvalue ';' # propertyexp
;
initvalue : TYPE '(' NUMBER(','NUMBER)* ')' #initvaluexp
;

subshader : 'Subshader' '{' (pass)+ '}' # subshaderexp
;
pass : 'Pass' '{' (stage)+ '}'#passexp
;
config : WS
;
stage : STAGENAME '{' gpulang '}' # stageexp
;
gpulang : (refuniform)* PROGSTR  # gpulangexp
;
refuniform : TYPE VARNAME ';' # refuniformexp
;
// tokens expressed as regular expressions

PROGSTR : 'GLSLBEGIN' .*? 'GLSLEND';
STAGENAME : 'Vert'|'Frag'|'Geom';
TYPE : 'vec'[1-4|];
VARNAME :  [a-zA-Z|_][a-zA-Z0-9|_]* ;
NUMBER
   : '-'? INT ('.' [0-9] +)?
   ;
fragment INT
   : '0' | [1-9] [0-9]*
   ;


INITVALUE : ALLSTR ;
fragment ALLSTR : .*?;
fragment ALLSTREXPLINE : .*?[\n];
WS  :   [ \r\n\t]+ -> skip ;
// NEWLINE : [\r\n]+ ;



