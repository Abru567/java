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
public class ejpract6guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       System.out.println("ingrese 2 numeros positivos");
       int num1 =leer.nextInt();
       int num2=leer.nextInt();
       int i=0;
       while(i==0){
           System.out.println("Menu");
           System.out.println("1.Suma");
           System.out.println("2.Resta");
           System.out.println("3.Multiplicar");
           System.out.println("4.Dividir");
           System.out.println("5.Salir");
           System.out.println("Elija opcion:");
           int opcion=leer.nextInt();
        switch (opcion) {
            case 1:
               int Suma=num1+num2;
               System.out.println("el resultado de la suma es: "+Suma);
               continue;
            case 2:
                int resta=num1-num2;
                System.out.println("el resultado de la resta es: "+resta);
                continue;
            case 3:
                int multiplicar=num1*num2;
                System.out.println("el resultado de la multiplicacion es: "+multiplicar);
                continue;
            case 4:
                int dividir=num1/num2;
                System.out.println("el resultado de la division es: "+dividir);
                continue;
            case 5:
                System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                String eleccion=leer.next();
                 
                  if(eleccion.equals("S")||eleccion.equals("s")){
                    i=1;
                      break;
                    
                }
                if(eleccion.equals("N")||eleccion.equals("n")){
                   continue;
            }
        }
       }    
    }
}