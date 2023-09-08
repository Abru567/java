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
public class circulo {
 int radio;
 double diametro;

    public circulo(int radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public circulo() {
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

   
}
