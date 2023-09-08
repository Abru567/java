/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;
/**
 */
public class ej1guia1 {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       System.out.println("ingrese el valor de dos numeros");
       int num1 = leer.nextInt();
       int num2 = leer.nextInt();
       int suma = num1 + num2 ;
       System.out.println("el resultado es :" + suma);
    
    }
}
