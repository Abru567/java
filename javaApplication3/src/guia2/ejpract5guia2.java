/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2;
//Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite números al usuario hasta que la suma de los números
//introducidos supere el límite inicial.

import java.util.Scanner;

/**
 *
 * @author Ester
 */
public class ejpract5guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer= new Scanner(System.in);
      System.out.println("Ingrese un valor limite positivo");
      int numlim=leer.nextInt();
      System.out.println("ingrese los numeros hasta que su suma supere el limite");
      int i=0;
      int suma=0;
      do{
      int num=leer.nextInt();
       suma = suma + num;
      }while(suma<=numlim);
      System.out.println("la suma de los numeros que superaron el limite es "+suma);
          
      
    }
    
}
