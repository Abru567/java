/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2extguia11;
/*Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase
edificio tendrá como métodos:
• Método calcularSuperficie(): calcula la superficie del edificio.
• Método calcularVolumen(): calcula el volumen del edifico.*/
/**
 *
 * @author Ester
 */
abstract class Edificio {
    double ancho;
    double largo;
    double alto;
    double superficie;
    double volumen;
    public void calcularsuperficie(){
       superficie= ancho*largo;
    };
    public void calcularvolumen(){
        volumen=superficie*alto;
    }

    public Edificio() {
    }

    public Edificio(double ancho, double largo, double alto, double superficie, double volumen) {
        this.ancho = ancho;
        this.largo = largo;
        this.alto = alto;
        this.superficie = superficie;
        this.volumen = volumen;
    }
    
}
