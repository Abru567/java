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
public class ejpract3guia2 {
//Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a otra moneda, estas pueden ser a dólares,
 //yenes o libras. La función tendrá como parámetros, la cantidad de euros y la moneda a convertir que será una cadena, este no devolverá ningún valor
 //y mostrará un mensaje indicando el cambio (void).
//El cambio de divisas es:
//* 0.86 libras es un 1 €
//* 1.28611 $ es un 1 €
//* 129.852 yenes es un 1 €

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese la cantidad de euros y elija que tipo de cambio quiere");
        int euros=leer.nextInt();
        System.out.println("monedas:");
        System.out.println("1.libras");
        System.out.println("2.dolares");
        System.out.println("3.yenes");
        int cambio =leer.nextInt();
        switch(cambio){
            case 1:
                libras(euros);
                break;
            case 2:
                dolares(euros);
                break;
            case 3:
                yenes(euros);
                break;
           
        }
    }
    public static void libras(int euros){
        double libras=euros*0.86;
        System.out.println("el cambio a libras es: "+libras);
    }
     public static void dolares(int euros){
        double dolares=euros*1.28611;
        System.out.println("el cambio a dolares es: "+dolares);
    }
     public static void yenes(int euros){
        double yenes=euros*129.852;
        System.out.println("el cambio a yenes es: "+yenes);
    }
    
}
