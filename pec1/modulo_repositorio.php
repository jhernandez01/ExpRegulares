
<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width-device-width,initial-scale=1.0">
	<title>Validación y lectura de ficheros XML</title>
</head>
<body>
	<?php

		$elemento_anterior = '';
		$titulo ="LECTURA DE DATOS DE FICHERO XML VALIDADO (REPOSITORIO DE SOFTWARE)";
		echo "<h2><b> <font color ='blue'>".$titulo."</font></b></h2>";

		//	echo "<b> <font color ='blue'>".$titulo."</font></b>" ;
		//se crea el parser con el metodo create
		$parser = xml_parser_create();

		// ahora tenemos que indicarle cual es la funcion que salta al inicio de un elemento y otra al final del elemento
		xml_set_element_handler($parser, "inicio","fin");

		// tambien tendra que decirle cual es el manejador de datos de cada elemento
		xml_set_character_data_handler($parser, "manejadorDatos");

		// le indico el fichero que va a tratar
		xml_parse($parser,file_get_contents("modulo_repositorio.xml"));

		// una vez analizado el documento XML libero la memoria del analizador	
		xml_parser_free($parser);

		function inicio($parser,$elemento,$atributos){		
			// atributos es una array asociativo pares atributo-valor 
			global $elemento_anterior;

			switch($elemento)
			{
				case "REPOSITORIO":
					foreach ($atributos as $atributo){
						//echo "<b> <font color ='blue'>".$titulo."</font></b>" ;
						echo "<b> <font color ='blue'>".""."</font></b>" ;
					}
					break;

				case "MODULOS":
					echo "</p>";
					break;
				case "MODULO":
					echo "<hr/>";
					break;
				case "NOMBRE_MODULO":
					echo "<b><u> <font color ='green'> Nombre Módulo: ";
					break;
				case "IDENTIFICADOR_MODULO":
					echo "Identificador: ";
					break;
				case "LENGUAJE":
					echo "Lenguaje: ";
					break;
				case "VERSION":
					echo "Version: ";
					break;
				case "IDENTIFICADOR_AUTOR":
					echo "Identificador Autor: ";
					break;
				case "FECHA":
					echo "Fecha: ";
					break;			
				case "DEPENDENCIA_MODULOS":		
					echo "<u>Dependencia Modulos:</u> ";  
					echo "</br>";		
				case "DEPENDENCIA":
					foreach ($atributos as $atributo){
						echo '&nbsp;&nbsp;&nbsp;&nbsp;'.$atributo.'&nbsp;&nbsp;&nbsp;&nbsp;';
					} 
					break;	
				case "TIPO_LICENCIA":
					echo "Tipo Licencia: ";
					break;
			
				//Datos Autor
				case "AUTOR":
					echo "</p>";
					echo "<hr/>";
					break;
				case "NOMBRE_AUTOR":
					echo "Nombre autor: ";
					break;
				case "IDENTIFICADOR":
					echo "<b><u>Identificador: ";
					break;
				case "CORREO":
					echo "Correo: ";
					break;
				case "URL_CONTACTO":
					echo "Url Contacto: ";
					break;
			}
			$elemento_anterior = $elemento;
		}
		function fin($parser,$elemento){
			echo "</br>";
			
			switch($elemento)
			{
				case "MODULO":
					break;
				case "NOMBRE_MODULO":
					echo "</u></b>";
					break;
				case "IDENTIFICADOR_MODULO":
					echo "</font></u></b>";
					break;
				case "IDENTIFICADOR":
					echo '</font></u></b>';
					break;		
			}
				
		}
		function manejadorDatos($parser, $datos){
			echo $datos;
		}	
	?>
</body>	