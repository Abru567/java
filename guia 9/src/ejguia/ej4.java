/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejguia;

import java.util.ArrayList;

/**
 *
 * @author Ester
 */
public class ej4 {
//¡Es tu turno! Crea una lista de Libros y muestra el título de cada uno con un bucle.
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
      ArrayList <Libros> libros=new ArrayList();
      Libros libro=new Libros();
      libros.add(libro);
      
      for(Libros ejemplar:libros){
          System.out.println(ejemplar);
      }
    }

    @Override
    public String toString() {
        titulo="casa";
        return "ej4{" + "titulo=" + titulo + '}';
    }

   
    
public String titulo;
    private static class Libros {

        public Libros() {
        }
    }
    
}
