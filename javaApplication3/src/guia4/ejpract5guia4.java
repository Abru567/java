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
public class ejpract5guia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int[][] matriza= new int[3][3];
        int[][] matrizb=new int [3][3];
        int i=0;
        int j=0;
      
        for(i=0;i<3;i++){
        for(j=0;j<3;j++){
               matriza[i][j]=(int)(Math.random()*3);
                System.out.print(matriza[i][j]+" ");
        }
            System.out.println(" ");
        }
        System.out.println(" ");
        i=0; 
        j=0;
      for(i=0;i<3;i++){
          for(j=0;j<3;j++){
            matrizb[i][j]=matriza[j][i]*-1;  
          }
      }
      
         i=0;
         j=0;
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print(matrizb[i][j]+" ");
            }
            System.out.println(" ");
        }
         i=0;
         j=0;
         int a=0;
         int b=0;
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
         if(matriza[i][j]==matrizb[i][j]*-1) {
             a++;
         }else{
             b++;
         }      
            }
        }
        if(a==9){
            System.out.println("la matriz es antisimetrica");
        }else{
            System.out.println("la matriz no es antisimetrica");
        }
    }
    
}
