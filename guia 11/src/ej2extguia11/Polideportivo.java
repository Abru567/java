/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2extguia11;

import java.util.Scanner;

/*Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o
Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.*/
/**
 *
 * @author Ester
 */
public class Polideportivo extends Edificio{
   String nombre;
    String poli;
   int techado;
   int abierto;
   Scanner leer=new Scanner(System.in);
public void tipodepoli(){
    System.out.println("ingrese el ancho del polideportivo");
    ancho=leer.nextDouble();
    System.out.println("ingrese el largo del polideportivo");
    largo=leer.nextDouble();
    System.out.println("ingrese el alto del polideportivo");
    alto=leer.nextDouble();
    System.out.println("ingrese nombre del poli");
    nombre=leer.next();
    System.out.println("ingrese tipo de poli(techado o abierto)");
    poli=leer.next();
    if(poli.equals("techado")){
        System.out.println("ingrese cantidad de polideportivos techados");
        techado=leer.nextInt();
    }else if(poli.equals("abierto")){
        abierto=leer.nextInt();
    }
    super.calcularsuperficie();
    super.calcularvolumen();
}
    public Polideportivo() {
    }
    
    public Polideportivo(String poli, int techado, int abierto, double ancho, double largo, double alto, double superficie, double volumen) {
        super(ancho, largo, alto, superficie, volumen);
        this.poli = poli;
        this.techado = techado;
        this.abierto = abierto;
    }

    

}
