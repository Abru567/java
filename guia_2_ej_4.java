
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
public class guia_2_ej_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
             
        System.out.println("ingrese la temperatura actual en grados centigrados");
        int temp = leer.nextInt();
        int tempF= 32 + (9 * temp/5);
        System.out.println("la temperatura ingresada transformada a farenheit es: " +tempF);
      
    }
    
}
