/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpracguia;

import ej4servicio.PeliculaServicio;
import java.util.Scanner;

/**
 *
 * @author Ester
 */
public class ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PeliculaServicio peli = new PeliculaServicio();
        Scanner leer = new Scanner(System.in);
        peli.crearpeli();
        System.out.println("seleccione una opcion");
        System.out.println("1: Mostrar en pantalla todas las películas");
        System.out.println("2: Mostrar en pantalla todas las películas con una duración mayor a 1 hora.");
        System.out.println("3: Ordenar las películas de acuerdo a su duración ");
        System.out.println("4: Ordenar las películas de acuerdo a su duración (de menor a mayor) .");
        System.out.println("5: Ordenar las películas por título alfabéticamente ");
        System.out.println("6: Ordenar las películas por director alfabéticamente y mostrarlo en pantalla");
        int eleccion = leer.nextInt();
        switch (eleccion) {
            case 1:
                peli.mostrarpeliculas();
                break;
            case 2:
                peli.mostrarpelis1hora();
                break;
            case 3:
                peli.ordenarpeliculasporduracion();
                break;
            case 4:
                peli.ordenarpelisportitulo();
                break;
            case 5:
                peli.ordenarpelisportitulo();
                break;
            case 6:
                peli.ordenarpordirector();
        
       }
    }

}
