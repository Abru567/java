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
public class ej4guia2 {
//Escriba un programa que lea 20 números. Si el número leído es igual a cero  debe salir del bucle y mostrar el mensaje "Se capturó el numero cero".
    //El programa deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
    //Nota: recordar el uso de la sentencia break.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        System.out.println("ingrese 20 numeros");
        int cont = 0;
        int suma=0;
           do{
               
            int num= leer.nextInt();
             cont=cont+1;
           if (num>0) {
           suma=suma+num;
           }
           if(num==0){
               System.out.println("se capturo el numero cero");
              break;
           }
           } while(cont<20);
System.out.println("la suma de los numeros es "+suma);
    }
   
}
