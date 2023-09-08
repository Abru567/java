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
public class ej2guia3 {
//Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando que el primer número múltiplo del segundo e imprima 
        //si el primer número es múltiplo del segundo, sino informe que no lo son.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
            System.out.println("ingrese 2 numeros para saber si son multiplos");
            int num=leer.nextInt();
            int num2=leer.nextInt();        
            int mult = num % num2;
            if(mult==0){
                multiplo(num,num2);
            }else{
                noesmultiplo(num,num2);
            }
    }
    public static void multiplo(int num,int num2){
        System.out.println("El numero "+num+" y "+num2+" son primos");   
     
    }
    public static void noesmultiplo(int num,int num2){
        System.out.println("El numero "+num+" y "+num2+" no son primos"); 
    }
}
