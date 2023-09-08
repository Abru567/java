/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej6Servicio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/*Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.*/
/**
 *
 * @author Ester
 */
public class AplicacionServicio {

    public Scanner leer = new Scanner(System.in);
    HashMap<String, Double> app = new HashMap();

    public void introducirelemento() {
        String eleccion = "";
        do {
            System.out.println("Ingrese nombre y precio del producto");
            app.put(leer.next(), leer.nextDouble());
            System.out.println("¿quiere ingresar otro producto?");
            eleccion = leer.next();
        } while (eleccion.equals("si"));
    }

    public void modificarprecio() {
        System.out.println("ingrese producto a modificar");
        String producto = leer.next();
        for (Map.Entry<String, Double> p : app.entrySet()) {
            String key = p.getKey();

            Double value = p.getValue();
            if (key.equals(producto)) {
                System.out.println("ingrese el nuevo precio");
                app.replace(key, value, leer.nextDouble());
            }
        }
    }

    public void mostrarproducto() {
        System.out.println("---------------");
        for (Map.Entry<String, Double> p : app.entrySet()) {
            String key = p.getKey();
            Double value = p.getValue();
            System.out.println("producto: " + key + " precio: " + value);
            System.out.println("---------------");
        }
    }

}
