/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2guia12;

import java.util.ArrayList;
import java.util.Scanner;

/*Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).*/
/**
 *
 * @author Ester
 */
public class ExepcionArray {
    Scanner leer=new Scanner(System.in);
    int a;
    public void Array1()throws ArrayIndexOutOfBoundsException{
        
        try {
            ArrayList<Integer> Array=new ArrayList(); 
            Array.add(2, 0);
        } catch (Exception e) {
            System.out.println("Error: El numero ingresado es extremadamente largo "+e.getMessage());
        } 
    }


    
}
