/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3guia12;

import static java.lang.Integer.parseInt;



/*Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.*/
/**
 *
 * @author Ester
 */
public class DivisionNumero {
    public void division(String num1,String num2){
        try {
            int a=parseInt(num1);
            int b=parseInt(num2);
         int num=a/b;
            System.out.println("");
        } catch (NumberFormatException e) {
            System.out.println("Error: el dato ingresado no es un numero "+e.getMessage());
        }
    }
}
