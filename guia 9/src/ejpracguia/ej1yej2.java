/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejpracguia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Ester
 */
public class ej1yej2 {
/*Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.*/
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        ArrayList<String> RazasDePerros=new ArrayList();
        String respuesta= "";
        do{
            System.out.println("ingrese la raza de perro");
            RazasDePerros.add(leer.next());
            System.out.println("¿desea guardar otra raza o quiere salir?");
            respuesta=leer.next();
            if(respuesta.equals("salir")){
                System.out.println(RazasDePerros);
            }
        }while(respuesta.equals("guardar"));
        /*Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.*/
        System.out.println("ingrese una de las razas ingresadas anteriormente para eliminarlo");
       String raza=leer.next();
        Iterator buscar=RazasDePerros.iterator();
        while(buscar.hasNext()){
            if(buscar.next().equals(raza)){
                buscar.remove();
                
            }
            
        }
        Collections.sort(RazasDePerros);
        System.out.println(RazasDePerros);
    }
    
}
