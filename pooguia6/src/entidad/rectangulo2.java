/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;
//Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un método "calcular_area" que calcule y devuelva el área del rectángulo.
//Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados de 4 y 6 y imprime el área del rectángulo.
/**
 *
 * @author Ester
 */
public class rectangulo2 {
      public float lado1,lado2;

    public rectangulo2() {
    }
  public float calcular_area(float lado,float ladoa){
      lado1=lado;
      lado2=ladoa;
      float area=lado1*lado2;
      return area;
  }
}
