/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import entidad.puntos;

/**
 *
 * @author Ester
 */
public class ejextra2guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       puntos pun=new puntos();
       pun.crearpuntos();
        System.out.println("la distancia entre los puntos es: "+pun.distancia());
    }
    
}
