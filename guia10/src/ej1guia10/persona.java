/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1guia10;
/*Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
persona.
Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
personas con sus respectivos perros.*/
/**
 *
 * @author Ester
 */
public class persona {
    public String nombre;
    public String apellido;
    public Integer edad;
    public String fechadenacimiento;
    public perro perro;

    public perro getPerro() {
        return perro;
    }

    public void setPerro(perro perro) {
        this.perro = perro;
    }

    public persona() {
    }

    public persona(String nombre, String apellido, Integer edad, String fechadenacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.fechadenacimiento = fechadenacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getFechadenacimiento() {
        return fechadenacimiento;
    }

    public void setFechadenacimiento(String fechadenacimiento) {
        this.fechadenacimiento = fechadenacimiento;
    }

    @Override
    public String toString() {
        return "\n persona:" +"\n nombre=" + nombre + ",\n apellido=" + apellido + ",\n edad=" + edad + ",\n fechadenacimiento=" + fechadenacimiento +",\n perro="+perro ;
    }
    
}
