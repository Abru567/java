/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;
/**
 *
 * @author Ester
 */
public class ej5guia1 {
//Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y la raíz cuadrada de ese número. 
//Nota: investigar la función Math.sqrt().
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       System.out.println("ingrese un numero entero");
       int num =leer.nextInt();
       int num1 = num*2;
       int num2= num*3;
       double num3 = Math.sqrt(num);
       System.out.println("el doble de "+ num +" es: " +num1 );
       System.out.println("el triple de "+num+" es: " +num2);
       System.out.println("la raiz cuadrada de "+num+" es: "+num3);
    }
    
}
