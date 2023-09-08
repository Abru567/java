
package service;

import entidad.Carta;
import entidad.Mazo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class MazoServicio {
    
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    Mazo Baraja;
    ArrayList<Carta> mazoCarta;
    List<Carta> mazoFantasma = new ArrayList<>();//se guardan las cartas que ya salieron
    List<Carta> cartasMonton;
    Carta Carta;
    
    /**/
    
    public void crearBaraja() {
        Baraja = new Mazo();
        String[] palos = {"Espada", "Basto", "Copas", "Oro"};
        String palos2;
        mazoCarta = new ArrayList();
        for (int i = 1; i < 8; i++) {
            for (int j = 0; j < palos.length; j++) {
                Carta = new Carta();
                Carta.setNumero(i);
                Carta.setPalo(palos[j]);
                mazoCarta.add(Carta);
            }
        }
        //cont + e borra la linea
        //cont + <- borra espacio
        for (int i = 10; i < 13; i++) {
            for (int j = 0; j < palos.length; j++) {
                Carta = new Carta();
                Carta.setNumero(i);

                Carta.setPalo(palos[j]);
                mazoCarta.add(Carta);
            }
        }
        /*for (Carta aux : MazoCarta) {
            System.out.println(aux);
        }*/
        Baraja.setBaraja(mazoCarta);
        
        
    }

    //•6 mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
//luego se llama al método, este no mostrara esa primera carta.
    public void mostrarBaraja() {
        for (Carta carta : mazoCarta) {
            System.out.println(carta);
        }
     
    }
//•1 barajar(): cambia de posición todas las cartas aleatoriamente.
    public void barajar() {
        Collections.shuffle(mazoCarta);
        System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n ");
        System.out.println("------------------------");
        System.out.println("Barajando Cartas...");
        System.out.println("\n");
        for (Carta carta : mazoCarta) {
            System.out.println(carta);
        }
      
    }

    //•2 siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
//se haya llegado al final, se indica al usuario que no hay más cartas.
    public Carta siguienteCarta() {

        Carta car = mazoCarta.get(mazoCarta.size() - 1);
        mazoFantasma.add(car);
        mazoCarta.remove(mazoCarta.size() - 1);
        System.out.println(car);
        return car;
    }

    //•3 cartasDisponibles(): indica el número de cartas que aún se puede repartir.
    public Integer cartasDisponibles() {
        return mazoCarta.size() - 1;
    }

 //•4 darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
//cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
//debemos indicárselo al usuario.
  
    public void darCartas() {
        System.out.println("¿Cantidad de cartas que desea?");
        int num = sc.nextInt();
        List<Carta> cartasRepartidas = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            cartasRepartidas.add(siguienteCarta());

        }
        System.out.println("");
        System.out.println("Cartas repartidas: ");
        for (Carta carta : cartasRepartidas) {
            System.out.println(carta);
        }
     
    }
//•5 cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
//indicárselo al usuario
    public void cartasMonton() {
        System.out.println("Cartas que han salido: ");
        System.out.println("Cartas disponibles:");
        for (Carta carta : mazoFantasma) {
            System.out.println(carta);
        }
        System.out.println("Cartas disponibles:");
        System.out.println(cartasDisponibles());
      
    }
}

