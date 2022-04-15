/* Sección de declaraciones de JFlex */
%%
%public
%class DatosAnalizadorLexico
%{
 
 //Esta propiedad permite verificar si existen tokens pendientes
 private boolean _existenTokens = false;
 
 public boolean existenTokens(){
 return this._existenTokens;
 }
 
%}
 
 /* Con esta instrucción, se indica a JFlex que devuelva objetos del tipo ControlTokenPersonalizado */
%type ControlTokenPersonalizado
 
%init{
 /* Código que se ejecutará en el constructor de la clase */
%init}
 
%eof{
 
 /* Código a ejecutar al finalizar el análisis, en este caso cambiaremos el valor de una variable bandera */
 this._existenTokens = false;
 
%eof}
 
/* Inicio de Expresiones regulares */

 //variables de delimitadores
 Delimitador = "("|")"|":"|";"|"["|"]"|"´"|"“"|".."
 //variables de palabras reservadas
 PalabraReservada= "booleano"|"cierto"|"comienzo"|"constantes"|"de"|"en"|"devolver"|"entero"|"entonces"|"escribir"|"falso"|"fin"|"funcion"|"no"|"para"|"procedimiento"|"programa"|"comienzo"|"si"|"sino"|"subprogramas"|"tipos"|"var"|"variables"|"vector"|"y"
 //variables de identificadores
 Identificador = "ejemplo"|"a"|","|"-"
 //variables de operadores
 Operador = "="|"*"|"+"|"/"|"=="|"<"|"y"|"no"|"[]"
 //variables
 GuionBajo ="_" //variable para el control del guion bajo
 Cero =0 //sirve para controlar el dato de la entrada
 Digito = [0-9] //permite validar cualquier numero ingresado del 0 al 9 
 Digito1_9 = [1-9] //permite validar cualquier numero ingresado del 0  al 9
 Letra = [A-Za-z] //permite validar cualquier letra ingresada  desde la A hasta la Z (en minuculas y mayusculas)
 Espacio = " "

 SaltoDeLinea = \n|\r|\r\n //pemite controlar una nueva linea o salto de linea
 InicioComentario="#"
 Cadena= \"(.[^\"]*)\"
 BlancoTeclaTab = [\t\f] //permite validar la tecla tab	
 
 CerosALaIzquierda = {Cero}{Cero}+{Digito1_9}{Digito1_9}* | {Cero}{Digito1_9}+ | {Cero}{Digito1_9}+{Cero}+ |{Cero}{Cero}+{Digito1_9}{Digito1_9}*{Cero}+
 //Solo pemite ingresar un 0, pero si mas ceros a la derecha
 Numero = {Digito} {Digito}*   
 
 //expresion que solo permite validar el ingreso de letras de la A-Z
 Palabra = {Letra} {Letra}*
 //esta expresion pemite validar el ingreso de datos letras y cualquier digito numérico
 LentrasYNumeros = {Letra} {Letra}* {Digito} {Digito}* {Letra}* {Digito}* |{Digito} {Digito}* {Letra} {Letra}* {Digito}* {Letra}*
 //esta expresion permite validar el ingreso de datos que empiezan por un guion una letra y numeros
 PalabraConGuionBajo = {GuionBajo} {GuionBajo}*{Letra} {Letra}*{GuionBajo}*{Letra}* | {GuionBajo} {GuionBajo}* {Letra}* {Digito}* {Letra}*
 //valida el ingrso de una fecha dd/mm/aaaa 
 Fecha={Digito}{2}\/{Digito}{2}\/{Digito}{4}
 //expresion que permite validar un comentario que empiece con el simbolo # y tambien fin de linea
 Comentario={InicioComentario}(.[^(\#)|(\n)]*)
 //expresion que permite validar el ingreso de un email 
 Email=[_a-z0-9-]+(\.[_a-z0-9-]+)*@[a-z0-9]+(\.[a-z0-9]+)*(\.[a-z]{2,3})
 
 
/* Finaliza expresiones regulares */
 
%%
/* Finaliza la sección de declaraciones de JFlex */
 
/* Inicia sección de reglas */
 
// Cada regla está formada por una {expresión} espacio {código}

//permite validar una cadena entre comillas 
{Cadena} {
 ControlTokenPersonalizado t = new ControlTokenPersonalizado(yytext(), " CADENA ENTRE COMILLAS ");
 this._existenTokens = true;
 return t;
} 

//permite validar un tipo de email 
{Email} {
 ControlTokenPersonalizado t = new ControlTokenPersonalizado(yytext(), " EMAIL ");
 this._existenTokens = true;
 return t;
}

//permite validar las palabras reservadas especificadas en la lista 
{PalabraReservada} {
 ControlTokenPersonalizado t = new ControlTokenPersonalizado(yytext(), " PALABRA RESERVADA ");
 this._existenTokens = true;
 return t;
} 

//permite validar los guiones bajos 
{PalabraConGuionBajo} {
 ControlTokenPersonalizado t = new ControlTokenPersonalizado(yytext(), " IDENTIFICADOR "); 
 this._existenTokens = true;
 return t;
}

//permite validar los ceros a la izquierda
{CerosALaIzquierda} {
 ControlTokenPersonalizado t = new ControlTokenPersonalizado(yytext(), " IDENTIFICADOR "); 
 this._existenTokens = true;
 return t;
}

//permite validar los numeros de 0-9
{Numero} {
 ControlTokenPersonalizado t = new ControlTokenPersonalizado(yytext(), " CONSTANTE ");
 this._existenTokens = true;
 return t;
}

//permite validar los identificadores especificados en la lista 
{Identificador} {
 ControlTokenPersonalizado t = new ControlTokenPersonalizado(yytext(), " IDENTIFICADOR ");
 this._existenTokens = true;
 return t;
}

//permite validar cualquier palabra que solo contenga letras
{Palabra} {
 ControlTokenPersonalizado t = new ControlTokenPersonalizado(yytext(), " IDENTIFICADOR ");
 this._existenTokens = true;
 return t;
}
 
 //permite validar letras y numeros ingresados
{LentrasYNumeros} {
 ControlTokenPersonalizado t = new ControlTokenPersonalizado(yytext(), " IDENTIFICADOR "); 
 this._existenTokens = true;
 return t;
}
 
 //permite validar un comentario 
{Comentario} {
 ControlTokenPersonalizado t = new ControlTokenPersonalizado(yytext(), " COMENTARIO ");
 this._existenTokens = true;
 return t;
} 
 
//permite validar los operadores especificados en la lista 
{Operador} {
 ControlTokenPersonalizado t = new ControlTokenPersonalizado(yytext(), " OPERADOR ");
 this._existenTokens = true;
 return t;
}

//permite validar los delimitadores especificados en la lista
{Delimitador} {
 ControlTokenPersonalizado t = new ControlTokenPersonalizado(yytext(), " DELIMITADOR ");
 this._existenTokens = true;
 return t;
}

//permite validar la tecla tab	
{BlancoTeclaTab} {
	
} 

//permite validar los espacion en blanco
{Espacio} {
 
} 

//permite validar una fecha
{Fecha} {
 ControlTokenPersonalizado t = new ControlTokenPersonalizado(yytext(), " FECHA DD/MM/AAAA ");
 this._existenTokens = true;
 return t;
}

//pemite controlar los saltos de linea
{SaltoDeLinea} {
}