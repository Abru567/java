/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1extguia11;

import java.util.Date;

/*guarda: el
nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del
amarre y el barco que lo ocupará.*/
/**
 *
 * @author Ester
 */
public class Alquiler {
    String nombre;
    int documento;
    Date FechaAlquiler;
    Date FechaDevolucion;
    int posicion;
    int barco;

    public Alquiler() {
    }

    public Alquiler(String nombre, int documento, Date FechaAlquiler, Date FechaDevolucion, int posicion, int barco) {
        this.nombre = nombre;
        this.documento = documento;
        this.FechaAlquiler = FechaAlquiler;
        this.FechaDevolucion = FechaDevolucion;
        this.posicion = posicion;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public Date getFechaAlquiler() {
        return FechaAlquiler;
    }

    public void setFechaAlquiler(Date FechaAlquiler) {
        this.FechaAlquiler = FechaAlquiler;
    }

    public Date getFechaDevolucion() {
        return FechaDevolucion;
    }

    public void setFechaDevolucion(Date FechaDevolucion) {
        this.FechaDevolucion = FechaDevolucion;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public int getBarco() {
        return barco;
    }

    public void setBarco(int barco) {
        this.barco = barco;
    }
    
}
