/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author Ester
 */
public class ejpract7guia2 {
//Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas 
//deben llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser X y el último tiene que ser una O.
//Las secuencias leídas que respeten el formato se consideran correctas, la secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE),
//y toda secuencia distinta de FDE, que no respete el formato se considera incorrecta.
//Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e incorrectas recibidas. 
//Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones de Java Substring(), Length(), equals().<
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer= new Scanner(System.in);
       System.out.println("ingrese una cadena que no supere los 5 caracteres y el primer caracter yiene que ser una x y el ultimo una o");
       int incorrect=0;
       int correct=0;
       int i=0;
       for(i=0;i<=10;i++){
           String cadena=leer.next(); 
           if((cadena.length())==5){
           if(cadena.substring(0,1).equals("x") & cadena.substring(4,5).equals("o")) {
                 correct=correct+1;
                 System.out.println("&&&&&");
           }else {
               
                 incorrect=incorrect+1;
                 System.out.println("&&&&&");
               }
           }else {
               
                 incorrect=incorrect+1;
                 System.out.println("&&&&&");
               }
    }
       System.out.println("la cantidad de lecturas correctas son: "+correct);
       System.out.println("la cantidad de lecturas incorrectas son: "+incorrect);
    
    }
    
}
