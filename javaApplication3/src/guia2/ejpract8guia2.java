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
public class ejpract8guia2 {
//Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
//lo siguiente:
//* * * *
//*     *
//*     *
//* * * *

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese la cantidad de elementos");
        int elementos=leer.nextInt();
        int i=0;
        int j=0;
        int l=0;
        int n=0;
        for (i=0;i<=elementos-1;i++){
         if(i==0){
       for (i=0;i<=elementos-1;i++){
         System.out.print("*");  
         }System.out.println(" ");
        }
           for (j=0;j<=elementos-3;j++){
System.out.print("*");
           for (l=0;l<=elementos-3;l++){
           System.out.print(" ");
           }System.out.println("*");
           }
        }for (n=0;n<=elementos-1;n++){
         System.out.print("*");  
         }System.out.println(" ");
        }

    }

    
    

