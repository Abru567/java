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
public class ej3guia2 {
//Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
       System.out.println("ingrese la nota");
       int nota=leer.nextInt();
       while(nota<0 || nota>10){
           System.out.println("la nota no es valida, ingrese la nota nuevamente");
           nota=leer.nextInt();
       if (nota>0 || nota <10)
               System.out.println("la nota "+nota+ " esta entre el 0 y 10");
       
       }
    }  
        
        //while (nota < 0 || nota >10){
            //System.out.println("ingrese un numero");
            //nota = leer.nextInt();
           // if (nota < 0 || nota >10){
               // System.out.println("la nota no es valida, ingrese de nuevo");
            }


