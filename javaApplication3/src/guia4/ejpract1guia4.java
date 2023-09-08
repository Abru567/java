package guia4;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ester
 */
public class ejpract1guia4 {
//Realizar un algoritmo que llene un vector con los 100 primeros números enteros y los muestre por pantalla en orden descendente.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int i=0;
        int c=0;
        int[] vector=new int[100];
        for(i=0;i<100;i++){
            c =c+1;
           vector[i]=c;
        }
           for(i=0;i<=99;i++){
           int a=99-i;
            System.out.println(vector[a]);
        
        }
    }
    
}
