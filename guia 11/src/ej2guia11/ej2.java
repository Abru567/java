/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2guia11;

import java.util.ArrayList;
import java.util.Scanner;

/*Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
el precio final de los dos electrodomésticos.*/
/**
 *
 * @author Ester
 */
public class ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       lavadora lavadora=new lavadora();
       televisor televisor=new televisor();
        ArrayList<electrodomestico>electrodomesticos=new ArrayList();
        String eleccion="";
        Scanner leer=new Scanner(System.in);
        System.out.println("--------------------------lavadora--------------------------");
        do{
      lavadora.crearlavadora();
      electrodomesticos.add(lavadora);
            System.out.println("¿quiere seguir creando lavadoras?");
            eleccion=leer.next();
        }while(eleccion.equals("si"));
        do{
       televisor.creartelevisor();
       electrodomesticos.add(televisor);
        System.out.println("¿quiere seguir creando televisiones?");
            eleccion=leer.next();
        }while(eleccion.equals("si"));
        double sumaprecios=0;
        double preciofin=0;
        for(electrodomestico electrodomestico:electrodomesticos){
            preciofin=electrodomestico.precioFinal();
            sumaprecios=sumaprecios+preciofin;
            System.out.println("precio: "+preciofin);
            System.out.println(sumaprecios);
             
        }
        System.out.println("suma de todos los precios de los electrodomesticos: "+sumaprecios);
    }
    
}
