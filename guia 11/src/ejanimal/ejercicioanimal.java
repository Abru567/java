/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejanimal;

import java.util.ArrayList;

/*Luego, en el main vamos a crear
un ArrayList de animales y los siguientes animales
Animal a = new Animal();
Animal b = new Perro();
Animal c = new Gato();
Agregaremos a la lista a cada uno y luego, con un for each, recorreremos la lista llamando al
método hacerRuido() de cada ítem.*/
/**
 *
 * @author Ester
 */
public class ejercicioanimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<animal> animales=new ArrayList();
        animal a = new animal();
animal b = new perro();
animal c = new gato();
animales.add(b);
animales.add(a);
animales.add(c);
animales.add(a);
for(animal animal: animales){
    animal.hacerruido();
}
    }
    
}
