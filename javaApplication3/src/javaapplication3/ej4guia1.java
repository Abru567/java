/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author Ester
 */
public class ej4guia1 {
//Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner grados = new Scanner(System.in);
        System.out.println("ingrese los grados centigrados");
        float c = grados.nextInt();
        float F = 32 + (9 * c / 5);
        System.out.println(F);
    }
    
}
