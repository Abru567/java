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
//Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2
public class ServicioRectangulo implements CalculosFormas{
rectangulo rectangulo=new rectangulo(0.5,20);
    @Override
    public double CalcularArea() {
        double AreaRectangulo= rectangulo.base*rectangulo.altura;
        return AreaRectangulo;
    }

    @Override
    public double CalcularPerimetro() {
        double Perímetrorectangulo= (rectangulo.base + rectangulo.altura) * 2;
        return Perímetrorectangulo;
    }
    
}
