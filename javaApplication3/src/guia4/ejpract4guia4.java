/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author Ester
 */
public class ejpract4guia4 {
//Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz
        //A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int[][] matriza= new int[4][4];
        int[][] matrizb=new int [4][4];
        int i=0;
        int j=0;
       
        for(i=0;i<4;i++){
        for(j=0;j<4;j++){
                matriza[i][j]=(int)(Math.random()*9);
                System.out.print(matriza[i][j]+" ");
        }
            System.out.println(" ");
        }
        System.out.println(" ");
        i=0; 
        j=0;
      for(i=0;i<4;i++){
          for(j=0;j<4;j++){
            matrizb[i][j]=matriza[j][i];  
          }
      }
      
         i=0;
         j=0;
        for(i=0;i<4;i++){
            for(j=0;j<4;j++){
                System.out.print(matrizb[i][j]+" ");
            }
            System.out.println(" ");
        }
}
}
    

