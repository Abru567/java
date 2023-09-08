/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1guia11;

import java.util.ArrayList;
import java.util.Scanner;

/*Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un
mensaje por pantalla informando de que se alimenta. Generar una clase Main que
*/
/**
 *
 * @author Ester
 */
public class ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        ArrayList<animal>animales=new ArrayList();
        String eleccion="";
        System.out.println("------------------------------perros------------------------------------");
        do{
            System.out.println("ingrese nombre, alimento, edad y raza del perro");
        animal perro =new perro(leer.next(),leer.next(),leer.nextInt(),leer.next());
        animales.add(perro);
            System.out.println("¿desea seguiur agregando perros?");
            eleccion=leer.next();
        }while(eleccion.equals("si"));  
        System.out.println("------------------------------gatos------------------------------------");
        do{
            System.out.println("ingrese nombre, alimento, edad y raza del gato");
        animal gato =new gato(leer.next(),leer.next(),leer.nextInt(),leer.next());
        animales.add(gato);
            System.out.println("¿desea seguiur agregando gatos?");
            eleccion=leer.next();
        }while(eleccion.equals("si"));
        System.out.println("------------------------------caballos------------------------------------");
         do{
            System.out.println("ingrese nombre, alimento, edad y raza del caballo ");
        animal caballo =new caballo(leer.next(),leer.next(),leer.nextInt(),leer.next());
        animales.add(caballo);
            System.out.println("¿desea seguiur agregando caballos?");
            eleccion =leer.next();
        }while(eleccion.equals("si"));
         System.out.println("-------------------------------------------------------------------------");
    for(animal animal:animales){
        animal.alimentarse();
    }
    }
}
