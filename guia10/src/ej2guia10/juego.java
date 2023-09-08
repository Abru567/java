/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2guia10;

import java.util.ArrayList;
import java.util.Scanner;

/*Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.*/
/**
 *
 * @author Ester
 */
public class juego {

    private Scanner leer = new Scanner(System.in);
    ArrayList<jugador> jugadores=new ArrayList();
    revolverdeagua revolver = new revolverdeagua();

    public void llenarjuego() {
        jugador juga = new jugador();
        System.out.println("ingrese cantidad de jugadores");
        int cantjug = leer.nextInt();
        juga.id=0;
        if (cantjug <= 6) {
            for (int i = 0; i < cantjug; i++) {
             juga.nombre="jugador";
                juga.id = juga.id+ 1;
               jugadores.add(juga);
            }
        } else {
            for (int i = 0; i < 6; i++) {
                juga.nombre="jugador";
                juga.id = i + 1;
                jugadores.add(juga);
            }
        }
        revolver.llenarrevolver();
    }

    /* • ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.*/
    public void ronda() {

        for(jugador jug: jugadores){
for(int i=0;i<10;i++){
            System.out.println(revolver);
   if (jug.disparo(revolver)==false){
       System.out.println(jug+" se mojo");
       System.out.println("fin del juego");
       break;
   }else{
       System.out.println(jug +" no se mojo");
   }
}
}
    }
}
