// Clase que será utilizada para devolver los tokens
public class ControlTokenPersonalizado {
 
  String _token;
  String _lexema;
  
 
  public String getLexema(){
    return this._lexema;
  }
 
  public String getToken(){
    return this._token;
  }
 
  ControlTokenPersonalizado (String lexema, String token){
    this._lexema = lexema;
    this._token = token;
  }
 
  public String toString(){
	if (this._token==" COMENTARIO ")
		{return "Encontrado " + this._token;}
	else if (this._token==" PALABRA ")
		{return "Encontrado  Lexema: " + this._lexema + " Token: " + this._token ;} //Lexema
	else
		{return "Encontrado " + this._token  + "  \""+  this._lexema +"\""; }  
  }
}