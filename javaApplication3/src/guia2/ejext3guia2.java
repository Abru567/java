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
public class ejext3guia2 {
//Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. Caso contrario mostrar un mensaje.
        //Nota: investigar la función equals() de la clase String.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese una letra");
        String vocal=leer.next();
        if(vocal.equals("a")||vocal.equals("e")||vocal.equals("i")||vocal.equals("o")||vocal.equals("u")||vocal.equals("A")||vocal.equals("E")||vocal.equals("I")||vocal.equals("O")||vocal.equals("U")){
           System.out.println("La letra ingresada es una vocal"); 
        }else{
            System.out.println("La letra ingresada no es vocal");
        }
    }
    
}
