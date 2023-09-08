/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author Ester
 */
public class ej1guia3 {
//Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada en punto, y luego codifique la palabra o frase ingresada 
        //de la siguiente manera: cada vocal se reemplaza por el carácter que se indica en la tabla y el resto de los caracteres 
        //(incluyendo a las vocales acentuadas) se mantienen sin cambios.


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       System.out.println("ingrese una frase");
       String frase=leer.nextLine();
       leer.close();
       String convertida=vocales(frase);
        System.out.println("la frase codificada es: "+convertida);
       
    }
    public static String vocales(String frase) {
       int i=0;
       String convertida=" ";
        for (i=0;i<=frase.length()-1;i++){
       char letra=frase.charAt(i);
          if (vocal(letra)) {
                   convertida += converter(letra);
                }
                else{
                    convertida+=letra;
                }
	}
        return convertida ;
    }
    public static boolean vocal(char letra) {
        
    return letra == 'a' || letra == 'A' ||
               letra == 'e' || letra == 'E' ||
               letra == 'i' || letra == 'I' ||
               letra == 'o' || letra == 'O' ||
               letra == 'u' || letra == 'U';
    }
    public static char converter(char caracter) {
        switch(caracter){
            case 'a':
                case'A':
                    return'@';
            case 'e':
                case'E':
                    return'#';
                    case 'i':
                case'I':
                    return'$';
                case 'o':
                case'O':
                    return'%';
                    case 'u':
                case'U':
                    return'*';
        }
                
        return caracter;
    }
    }

