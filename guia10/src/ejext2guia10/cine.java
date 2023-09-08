/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejext2guia10;


/*De Cine nos interesa conocer la película que se está reproduciendo, la
sala con los espectadores y el precio de la entrada.*/
/**
 *
 * @author Ester
 */
public class cine {
 public String pelicula;
 public int sala;
 public double precioentrada;

    public cine() {
    }

   
    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public double getPrecioentrada() {
        return precioentrada;
    }

    public void setPrecioentrada(double precioentrada) {
        this.precioentrada = precioentrada;
    }
 
}
