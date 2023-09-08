/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.entidades;

/**
 *
 * @author Ester
 */
public class Producto {
    private int codigo;
    private String nombre;
    private double precio;
    private int CodigoFabricante;

    public Producto() {
    }

    public Producto(int codigo, String nombre, double precio, int CodigoFabricante) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.CodigoFabricante = CodigoFabricante;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCodigoFabricante() {
        return CodigoFabricante;
    }

    public void setCodigoFabricante(int CodigoFabricante) {
        this.CodigoFabricante = CodigoFabricante;
    }

    @Override
    public String toString() {
        return "Producto{" + "codigo=" + codigo + ", nombre=" + nombre + ", precio=" + precio + ", CodigoFabricante=" + CodigoFabricante + '}';
    }

}
