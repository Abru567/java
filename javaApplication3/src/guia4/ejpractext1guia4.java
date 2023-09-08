package guia4;

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
public class ejpractext1guia4 {
//Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N, con los valores ingresados por el usuario.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer=new Scanner(System.in);
        System.out.println("ingrese el tamaño del vector");
        int tamaño=leer.nextInt();
        System.out.println("ingrese los valores a sumar");
        int[][] vector=new int[tamaño][tamaño];
        int suma=0;
        for(int i=0;i<tamaño;i++){
        for(int j=0;j<tamaño;j++){
        vector[i][j]=leer.nextInt();
        suma=suma+vector[i][j];
    }
}        
        System.out.println("la suma de los valores ingresados al vector es: "+suma);
    }
    
}
