
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author J
 */
public class guia_1_ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj = new Scanner (System.in);
        int n1;
        int n2;
        int resultado;
        System.out.println("ingrese el primer número");
        n1 = obj.nextInt();
        System.out.println("ingrese el segundo número");
        n2 = obj.nextInt();
        
        resultado = n1 + n2;
        
        System.out.println("el resultado de la suma es " +resultado);
        
    }
    
}
