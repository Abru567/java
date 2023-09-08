/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej4guia11;

/**
 *
 * @author Ester
 */
public class ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioCirculo circulo = new ServicioCirculo();
        System.out.println("-------------------------circulo------------------------------------");
        System.out.println("el area del circulo es: " + circulo.CalcularArea());
        System.out.println("el Perimetro del circulo es: " + circulo.CalcularPerimetro());
        ServicioRectangulo rectangulo = new ServicioRectangulo();
        System.out.println("-------------------------rectangulo---------------------------------");
        System.out.println("el Area del rectangulo es: " + rectangulo.CalcularArea());
        System.out.println("el Perimetro del rectangulo es: " + rectangulo.CalcularPerimetro());
    }

}
