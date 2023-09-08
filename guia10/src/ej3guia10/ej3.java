/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3guia10;

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
        cartasServicio cartas=new cartasServicio();
        Scanner leer=new Scanner(System.in);
        cartas.cartas();
        cartas.barajar();
        int eleccion=0;
       do{
        System.out.println("------Menu------");
       System.out.println("Ingrese el numero de opcion:");
        System.out.println("1 - Mostrar Baraja. ");
        System.out.println("2 - Cartas Disponibles y cartas que salieron.");
        System.out.println("3 - Recibir cartas.");
        System.out.println("4 - SALIR.");
         System.out.println("---------------");
           eleccion=leer.nextInt();
        switch (eleccion) {
            case 1:
                cartas.mostrarbaraja();
                break;
            case 2:
               cartas.cartasdisponibles();
               cartas.cartasmonton();
                break;
            case 3:
                cartas.darcartas();
            break;
        }
       }while(eleccion!=4);
    }
    
}
