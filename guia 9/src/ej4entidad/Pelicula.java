/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4entidad;

import java.util.Comparator;

/**
 *
 * @author Ester
 */
public class Pelicula {
 public String director;
 public String titulo;
 public Double duracion;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

  
     @Override
    public String toString() {
        return "Pelicula{" + "director=" + director + ", titulo=" + titulo + ", duracion=" + duracion + '}';
    }

 public static Comparator<Pelicula> compararduracion=(t, t1) -> {
     return t1.getDuracion().compareTo(t.getDuracion()); //To change body of generated lambdas, choose Tools | Templates.
 };
 public static Comparator<Pelicula> comparardirector=(t, t1) -> {
     return t1.getDirector().compareTo(t.getDirector()); //To change body of generated lambdas, choose Tools | Templates.
 };
 public static Comparator<Pelicula> comparartitulo=(t, t1) -> {
     return t1.getTitulo().compareTo(t.getTitulo()); //To change body of generated lambdas, choose Tools | Templates.
 };
  

  
    
}
