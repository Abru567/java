/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author Ester
 */
public class ejpract1guia3 {
//Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener una función
        //para cada operación matemática y deben devolver sus resultados para imprimirlos en el main. 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in); 
       System.out.println("ingrese dos numeros y elija entre:");
       int num= leer.nextInt();
       int num1=leer.nextInt();
       System.out.println("1.sumar");
       System.out.println("2.restar");
       System.out.println("3.multiplicar");
       System.out.println("4.dividir");
       int eleccion=leer.nextInt();
       switch(eleccion){
           case 1:
               suma(num,num1);
               break;
           case 2:
               resta(num,num1);
               break;
           case 3:
               multiplicacion(num,num1);
               break;
           case 4:
               division(num,num1);
               break;
       }
      
    }
     public static void suma(int num,int num1){
         System.out.println("el resultado de la suma de "+num+" y " +num1+" es: "+(num1+num));   
       }
      public static void resta(int num,int num1){
         System.out.println("el resultado de la resta de "+num+" y " +num1+" es: "+(num1-num));   
       }
       public static void multiplicacion(int num,int num1){
         System.out.println("el resultado de la multiplicacion de "+num+" y " +num1+" es: "+(num1*num));   
       }
        public static void division(int num,int num1){
         System.out.println("el resultado de la division de "+num+" y " +num1+" es: "+(num1/num));   
       }
}
