import java.io.BufferedReader;
import java.io.FileReader;
 
public class AplicacionAnalizadorLexico {
 
	public static void main(String[] args) {
		try{
			// Asignaci�n del nombre de archivo por defecto que usar� la aplicaci�n
			String archivo = "prueba_analizador_lexico.txt";
		 
			// Se trata de leer el archivo y analizarlo en la clase que se ha creado con JFlex
			BufferedReader buffer = new BufferedReader(new FileReader(archivo));
			DatosAnalizadorLexico datosAnalizadorLexicoJFlex = new DatosAnalizadorLexico(buffer);
		 
			while(true){
				// Obtener el token analizado y mostrar su informaci�n
				ControlTokenPersonalizado token = datosAnalizadorLexicoJFlex.yylex();
		 
				if (!datosAnalizadorLexicoJFlex.existenTokens()){
					break;
				}
		   
				System.out.println(token.toString());
			}
		}
		catch (Exception e){
			System.out.println(e.toString());
		}
	}
}