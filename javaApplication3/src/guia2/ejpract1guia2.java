package guia2;


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
public class ejpract1guia2 {

//Crear un programa que dado un número determine si es par o impar.

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num=leer.nextInt();
        if(num%2==0){
            System.out.println(num+" es un numero par");
        }else{
            System.out.println(num+" no es un numero par");
        }
    }
    
}
