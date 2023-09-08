/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1extguia11;

import java.util.Scanner;

/**
 *
 * @author Ester
 */
public class ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      ServicioBarcosEspeciales barcos=new ServicioBarcosEspeciales();
      Scanner leer=new Scanner(System.in);
      
        barcos.barco();
        System.out.println("------------------¿que barco desea alquilar?----------------------");
        System.out.println("1.barco comun");
        System.out.println("2.barco especial");
        int eleccion=leer.nextInt();
        switch(eleccion){
            case 1:
                System.out.println("precio: "+barcos.preciodealquiler());
                break;
            case 2:
                barcos.modulodebarcoespecial();
                System.out.println("precio: "+barcos.preciodealquiler());
                break;
        }
            
    }
    
}
