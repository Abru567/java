/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2guia10;

/*Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)*/
/**
 *
 * @author Ester
 */
public class revolverdeagua {

    public int posicionactual;
    public int posicionagua;

    public void llenarrevolver() {
        posicionactual = (int) (Math.random() * 10);
        posicionagua = (int) (Math.random() * 10);

    }

    public boolean mojar() {
        return posicionactual == posicionagua;
    }

    public void siguientechorro() {
        
        posicionactual = posicionactual + 1;
    }

    @Override
    public String toString() {
        return "revolverdeagua{" + "posicionactual=" + posicionactual + ", posicionagua=" + posicionagua + '}';
    }

}
