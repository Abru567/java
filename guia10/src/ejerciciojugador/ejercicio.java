/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciojugador;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

/**
 *
 * @author Ester
 */
public class ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        equipo equipo=new equipo();
      Jugador jug=new Jugador();
      ArrayList<Jugador> j=new ArrayList();
        
      jug.setNombre("trola");
      jug.setApellido("puto");
      jug.setPosicion(3);
      jug.setNumero(5);
        j.add(jug);
      equipo.setJugadores(j);
        System.out.println(equipo);
    }
    
}
