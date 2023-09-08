/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4servicio;

import ej4entidad.Pelicula;
import java.util.ArrayList;
import java.util.Comparator;

import java.util.Scanner;

/*En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.*/
/**
 *
 * @author Ester
 */
public class PeliculaServicio {

    private Pelicula peli = new Pelicula();
    ArrayList<Pelicula> peliculas = new ArrayList();
    private Scanner leer = new Scanner(System.in);

    public void crearpeli() {
        String respuesta;
        do {
            System.out.println("ingrese el titulo de la pelicula");
            peli.titulo = leer.next();
            System.out.println("ingrese el nombre del director de la pelicula");
            peli.director = leer.next();
            System.out.println("ingrese la duracion(horas y minutos) de la pelicula");
            peli.duracion = leer.nextDouble();

            peliculas.add(peli);
            System.out.println("¿quiere crear otra pelicula?");
            respuesta = leer.next();
        } while (respuesta.equals("si"));

    }
    //Mostrar en pantalla todas las películas.

    public void mostrarpeliculas() {
        System.out.println("las peliculas creadas son:");
        int i = 0;
        for (Pelicula mostrar : peliculas) {
            i++;
            System.out.println(i + ": " + mostrar.toString());
        }
    }
    // Mostrar en pantalla todas las películas con una duración mayor a 1 hora.

    public void mostrarpelis1hora() {
        System.out.println("las peliculas que duran mas de una hora son:");
        int i = 0;
        for (Pelicula mostrar : peliculas) {
            i++;
            if (mostrar.duracion > 1.00) {
                System.out.println(i + ": " + mostrar.toString());
            }
        }
    }

    /*Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.*/
    public void ordenarpeliculasporduracion() {
        peliculas.sort(peli.compararduracion);
        System.out.println(peliculas);
    }
    // • Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.

    public void ordenarpelisportitulo() {
        peliculas.sort(peli.comparartitulo);
        System.out.println(peliculas);
    }

    public void ordenarpordirector() {
        peliculas.sort(peli.comparardirector);
        System.out.println(peliculas);
    }

}
