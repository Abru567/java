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
public class ejext1guia2 {
//Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
//equivalente: 1 día, 2 horas.
    /**
     * @param args the command line argumentsfor (n=0;n<=elementos-1;n++){
         System.out.print("*");  
         }System.out.println(" ");
        
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese una cantidad de minutos");
        int minutos=leer.nextInt();
        int horas=minutos/60;
        int dias=horas/24;
                System.out.println("La cantidad de horas segun los minutos ingresado son: "+horas);
                System.out.println("La cantidad de dias segun los minutos ingresado son: "+dias);
    }
    
}
