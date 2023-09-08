/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpracguia;

import ej6Servicio.AplicacionServicio;
import java.util.Scanner;

/**
 *
 * @author Ester
 */
public class ej6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AplicacionServicio app = new AplicacionServicio();
             app.introducirelemento();
                app.mostrarproducto();
                
        System.out.println("elija una opcion ");
        System.out.println("1. mostrar producto");
        System.out.println("2. modificar ");
        Scanner leer = new Scanner(System.in);
        switch (leer.nextInt()) {
            case 1:
                app.mostrarproducto();
                break;
            case 2:
                app.modificarprecio();
                app.mostrarproducto();
                break;
        }
    }

}
