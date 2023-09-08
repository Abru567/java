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
public class ej5guia2 {
//Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
//5 *****
//3 ***
//11 ***********
//2 **

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer=new Scanner(System.in);
    int i=0;
    System.out.println("ingrese 4 numeros");
    for(i=0;i<=4;i++){
    int num = leer.nextInt();
    //System.out.println(num);
        for(i=0;i<=num-1;i++){
            System.out.print("*");
        }
        System.out.println(" ");
    }
    }
    
}
