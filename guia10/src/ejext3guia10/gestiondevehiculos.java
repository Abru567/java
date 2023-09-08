/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejext3guia10;

/*Gestión de vehículos. Se registra la información de cada vehículo asegurado. Marca,
modelo, año, número de motor, chasis, color, tipo (camioneta, sedán, etc.).*/
/**
 *
 * @author Ester
 */
public class gestiondevehiculos {

    public String marca;
    public String modelo;
    public int año;
    public int numerodemotor;
    public String chasis;
    public String color;
    public String tipo;

    public gestiondevehiculos() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getNumerodemotor() {
        return numerodemotor;
    }

    public void setNumerodemotor(int numerodemotor) {
        this.numerodemotor = numerodemotor;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "gestiondevehiculos{" + "marca=" + marca + ", modelo=" + modelo + ", a\u00f1o=" + año + ", numerodemotor=" + numerodemotor + ", chasis=" + chasis + ", color=" + color + ", tipo=" + tipo + '}';
    }

}
