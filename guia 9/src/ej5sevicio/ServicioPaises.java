/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej5sevicio;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/*Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará*/
/**
 *
 * @author Ester
 */

public class ServicioPaises {

 HashSet<String> paises=new HashSet();
private Scanner leer=new Scanner(System.in);  

public void ingresarpaises(){
    String respuesta="";
    do{
        System.out.println("ingrese el pais");
        paises.add(leer.next());
        System.out.println("¿quiere agregar otro pais?");
        respuesta=leer.next();
    }while(respuesta.equals("si"));
    Iterator iterator=paises.iterator();
  while(iterator.hasNext()){
      System.out.println("-------------------------");
      System.out.println(iterator.next());
  }
    System.out.println("--------------------------");
}
//Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
//cómo se ordena un conjunto.
ArrayList<String> ordenado=new ArrayList(paises);
public void mostrarconjuntoord(){
    
    Collections.sort(ordenado);
    System.out.println(paises);
    System.out.println("--------------------------");
}
 /*al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará*/
public void eliminarpais(){
    System.out.println("escriba un pais que desee eliminar");
   String eliminar=leer.next();
    Iterator iterator=paises.iterator();
   while(iterator.hasNext()){
       if(iterator.next().equals(eliminar)){
       
           iterator.remove();
           break;
        }
     
   }
    while (iterator.hasNext()){
        System.out.println(iterator.next());
    }
}    
}
