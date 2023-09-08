
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
public class guia_2_ej_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un número");
        int num = leer.nextInt();
        int doble = num*2;
        int triple = num*3;
        double raizCuadrada = Math.sqrt(num);
        System.out.println("el doble es: " + doble);
        System.out.println("el triple es: " + triple);
        System.out.println("la raiz cuadrada es: " + raizCuadrada);
  
                             
                       
    }
    
}
