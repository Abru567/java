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
  //Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
public class ServicioCirculo implements CalculosFormas{
circulo circulo=new circulo(20,5); 
    @Override
    public double CalcularArea() {
        double Areacirculo=Math.PI*(circulo.radio^2);
        return Areacirculo;
    }

    @Override
    public double CalcularPerimetro() {
      double Perimetrocirculo=Math.PI*circulo.diametro;
      return Perimetrocirculo;
    }
}
