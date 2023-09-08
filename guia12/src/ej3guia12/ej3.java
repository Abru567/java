/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3guia12;

import java.util.Scanner;

/**
 *
 * @author Ester
 */
public class ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       DivisionNumero num=new DivisionNumero();
       Scanner leer=new Scanner(System.in);
       num.division(leer.next(), leer.next());
    }
    
}
