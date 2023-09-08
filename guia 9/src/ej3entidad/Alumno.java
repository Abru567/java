/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3entidad;

import java.util.ArrayList;
import java.util.Scanner;

/*Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.*/
/**
 *
 * @author Ester
 */
public class Alumno {
    public String nombre;
    public ArrayList<Integer> notas;
private Scanner leer=new Scanner(System.in);
    public Alumno(String nombre) {
        this.nombre = nombre;
        this.notas=new ArrayList(3);
        for(int i=0;i<3;i++){
        this.notas.add(leer.nextInt());
        }
    }

    public Alumno() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

   
    
}
