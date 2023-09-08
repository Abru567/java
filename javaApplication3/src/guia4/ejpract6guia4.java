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
public class ejpract6guia4 {
//Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas, sus columnas y sus diagonales son idénticas. 
//Crear un programa que permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no. El programa deberá comprobar que los números
//introducidos son correctos, es decir, están entre el 1 y el 9.

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        System.out.println("ingrese 9 numeros entre el 0 y 9 para rellenar la matriz ");
        int i;
        int j;
        int a = 0;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                matriz[i][j] = leer.nextInt();
            }
        }
        int num=0;
         for (int i = 0; i <3; i++) {
            for (int j = 0; j <3; j++) {
                num = leer.nextInt();
                while ((num > 9)||(num < 1)){
                    System.out.print("Número no valido. Ingrese otro: ");
                    num = leer.nextInt();
                }
                matriz[i][j] = num;
            }
        }
        int suma= 0;
        int suma1= 0;
        int suma2=0;
       
        
        for (i = 0; i < 3; i++) {
            for (j = 0; j <3; j++) {
                
                        suma1 = suma1 + matriz[j][0];
                        suma = suma + matriz[1][j];
                }
            }
        
    
    
        int suma3 = matriz[0][0] + matriz[1][1] + matriz[2][2];

        if (suma1 ==suma&suma == suma2&suma2 == suma3 ) {
            System.out.println("el cuadrado es magico");
        } else if (suma1 > 0) {
            System.out.println("el cuadrado no es magico");
        }
*/
        Scanner leer = new Scanner(System.in);
int[][] matriz = new int[3][3];

System.out.println("Ingrese 9 numeros entre el 0 y 9 para rellenar la matriz: ");


         for ( int i = 0; i<3; i++) {
            for (int  j=0;j<3; j++) {
                int num = leer.nextInt();
                while ((num > 9)||(num < 1)){
                    System.out.print("Número no valido. Ingrese otro: ");
                    num = leer.nextInt();
                }
                matriz[i][j] = num;
            }
        }
    
int suma = 0;
int suma1 = 0;
int suma2 = 0;
int suma3 = 0;

for (int i = 0; i < 3; i++) {
    suma += matriz[0][i]; // sumar elementos de la primera fila
    suma1 += matriz[1][i]; // sumar elementos de la segunda fila
    suma2 += matriz[2][i]; // sumar elementos de la tercera fila
    suma3 += matriz[i][i]; // sumar elementos de la diagonal principal
}
int suma4 = matriz[0][2] + matriz[1][1] + matriz[2][0]; // sumar elementos de la diagonal secundaria

if (suma == suma1 && suma1 == suma2 && suma2 == suma3 && suma3 == suma4) {
    System.out.println("La matriz es un cuadrado magico");
} else {
    System.out.println("La matriz no es un cuadrado magico");
}
    }
    }

