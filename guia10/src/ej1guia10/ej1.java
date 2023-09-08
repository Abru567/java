/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1guia10;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Ester
 */
public class ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      persona persona=new persona();
      Scanner leer=new Scanner(System.in);
      List<persona> personas=new ArrayList();
      String eleccion=" ";
      do{
          System.out.println("ingrese nombre, apellido, edad y fecha de nacimiento de la persona");
      persona.setNombre(leer.next());
      persona.setApellido(leer.next());
      persona.setEdad(leer.nextInt());
      persona.setFechadenacimiento(leer.next());
          System.out.println("elija al perro");
       persona.setPerro(perro.valueOf(leer.next()));
      personas.add(persona);
          System.out.println("¿quiere seguir ingresando personas?si/no");
          eleccion=leer.next();
      }while(eleccion.equals("si"));
        System.out.println(personas);
    }
    
}
