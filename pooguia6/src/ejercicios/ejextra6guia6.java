/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author Ester
 */
import entidad.rectangulo2;
public class ejextra6guia6 {
//Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un método "calcular_area" que calcule y devuelva el área del rectángulo. 
//Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados de 4 y 6 y imprime el área del rectángulo.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        rectangulo2 rectangulo1=new rectangulo2();
        System.out.println(rectangulo1.calcular_area(4, 6));
        
    }
    
}
