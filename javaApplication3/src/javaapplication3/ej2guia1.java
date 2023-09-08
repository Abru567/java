/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

;

import java.util.Scanner;

/**
 *
 * @author Ester
 */
public class ej2guia1 {
//Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese su nombre");
        String nombre = leer.next();
        System.out.println(nombre);
    }
    
}
