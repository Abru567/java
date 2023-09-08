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
public class ej1guia2 {
//Implementar un programa que le pida dos números enteros al usuario y determine si ambos o alguno de ellos es mayor a 25.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     System.out.println("ingrese dos numeros");
     int num1=leer.nextInt();
     int num2=leer.nextInt();
     if (num1>25){
     System.out.println(num1+" es mayor que 25");
     }else{
      System.out.println(num1+" es menor a 25");
     }
     if(num2>25){
      System.out.println(num2+" es mayor a 25");
     }else{
      System.out.println(+num2+" es menor a 25");
     }
    }
}

