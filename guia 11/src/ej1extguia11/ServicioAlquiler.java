/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1extguia11;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/*Un alquiler se calcula multiplicando el número de días de ocupación (calculado con la fecha de
alquiler y devolución), por un valor módulo de cada barco (obtenido simplemente
multiplicando por 10 los metros de eslora).*/
/**
 *
 * @author Ester
 */
public class ServicioAlquiler extends Alquiler {

    Barco barco1 = new Barco();
    Scanner leer = new Scanner(System.in);

    public double diasdeocupacion() {
        return FechaAlquiler.getDay() - FechaDevolucion.getDay();
    }

    public double modulodebarco() {
        return barco1.eslora * 10;
    }

    public void barco() {
        System.out.println("------------------crecacion del barco----------------------");
        System.out.println("ingrese el dia, mes y año de fabricacion");
        barco1.añofabricacion = new Date(leer.nextInt(), leer.nextInt(), leer.nextInt() - 1900);
        System.out.println("ingrese la eslora");
        barco1.eslora = leer.nextInt();
        System.out.println("ingrese matricula");
        barco1.matricula = leer.nextInt();
    }

    public double preciodealquiler() {
        System.out.println("----------------ingrese informacion personal------------------");
        System.out.print("nombre: ");
        nombre = leer.next();
        System.out.print("documento: ");
        documento = leer.nextInt();
         System.out.println("------------------ingrese informacion de alquiler----------------------");
        System.out.print("barco: ");
        barco = leer.nextInt();
        System.out.print("posicion: ");
        posicion = leer.nextInt();
        System.out.print("fecha de alquiler(dia y mes): ");
        FechaAlquiler = new Date(leer.nextInt(), leer.nextInt(), 2023 - 1900);
        System.out.print("fecha de devolucion(dia y mes): ");
        FechaDevolucion = new Date(leer.nextInt(), leer.nextInt(), 2023 - 1900);
        System.out.println("-----------------------------------------------------------------");
        return diasdeocupacion() * modulodebarco();
    }
}
