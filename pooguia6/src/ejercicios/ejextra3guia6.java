/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import entidad.juego;
import java.util.Scanner;

/**
 *
 * @author Ester
 */
public class ejextra3guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        juego num = new juego();
        Scanner leer = new Scanner(System.in);
        String respuesta;
        do {
            num.iniciar_juego();
            num.adivinar();
            System.out.println("quiere seguir jugando?");
respuesta=leer.next();
        } while (respuesta !="no");
    }

}
