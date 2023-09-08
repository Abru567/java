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
public class ejpractext2guia4 {
//Escriba un programa que averigüe si dos vectores de N enteros son iguales (la comparación deberá detenerse en cuanto se detecte alguna diferencia entre
        //los elementos).
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer=new Scanner(System.in);
        System.out.println("ingrese el tamaño del vector y los valores a comprar");
      int tamaño=leer.nextInt();
      int[] vector1=new int[tamaño];
      int[] vector2=new int[tamaño];
      int num=0;
      int num2=0;
      for(int i=0;i<tamaño;i++){
          for(int j=0;j<tamaño;j++){
        num2++;
        if(num2<=tamaño){
              vector1[i]=leer.nextInt();
          }
          }
          for(int j=0;j<tamaño;j++){
              num++;
              if(num<=tamaño)
              vector2[i]=leer.nextInt();
          }
      
            if(vector1[i]!=vector2[i])  {
               
            System.out.print(vector1[i]+" ");
        
            System.out.println(" ");
                      for(int j=0;j<tamaño;j++){
              num++;
              if(num<=tamaño)

            System.out.print(vector2[i]+" ");
                      }        
        System.out.println(" ");
               
           }       
               }
    }
     
}
    

    

