/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2extguia11;

import java.util.Scanner;

/*Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.*/
/**
 *
 * @author Ester
 */
public class EdificioDeOficinas extends Edificio {

    int numerodeof;
    int cantidadpersonas;
    int numerodepisos;
    int personasxpiso;
    int personaxedificio;
    Scanner leer = new Scanner(System.in);

    public void crearedificio() {
        System.out.println("ingrese el ancho de la oficina");
        ancho = leer.nextDouble();
        System.out.println("ingrese el largo de la oficina");
        largo = leer.nextDouble();
        System.out.println("ingrese el alto de la oficina");
        alto = leer.nextDouble();
        System.out.println("ingrese numero de oficinas por piso");
        numerodeof = leer.nextInt();
        System.out.println("ingrese la cantidad de personas que entran en una oficina");
        cantidadpersonas = leer.nextInt();
        System.out.println("ingrese la cantidad de pisos que hay en el edificio");
        numerodepisos = leer.nextInt();
        super.calcularsuperficie();
        super.calcularvolumen();
    }

    public void cantpersonas() {
        personasxpiso = numerodeof * cantidadpersonas;
        System.out.println("la cantidad de personas que entran en un piso es de " + personasxpiso);
        personaxedificio = personasxpiso * numerodepisos;
        System.out.println("la cantidad de personas que entran en este edificio es de " + personaxedificio);
    }

    public EdificioDeOficinas(int numerodeof, int cantidadpersonas, int numerodepisos, double ancho, double largo, double alto, double superficie, double volumen) {
        super(ancho, largo, alto, superficie, volumen);
        this.numerodeof = numerodeof;
        this.cantidadpersonas = cantidadpersonas;
        this.numerodepisos = numerodepisos;
    }

    public EdificioDeOficinas() {
    }

  

}
