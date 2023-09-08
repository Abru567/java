/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;
//Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real. A continuación, se deben crear los siguientes métodos:
//Método constructor que inicialice el radio pasado como parámetro.
//Métodos get y set para el atributo radio de la clase Circunferencia.
//Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
//Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
//Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio)

/**
 *
 * @author Ester
 */
public class circunferencia {
        public circunferencia(){
                    }
private int radio;
   public int parametro(){
       return radio;
   }
    public int getradio(int a){
        return radio;
    }

    public void setRadio() {
        this.radio = radio;
    }
   
public  void circunferencia(){
this.radio=radio;
}
    

public int area(){
  int Area;
  
    Area=2 *(int)(Math.PI) * radio;
  return Area;
}
public int perimetro(){
    int Perimetro=2*(int)(Math.PI)*radio;

    return Perimetro;
}

}



    