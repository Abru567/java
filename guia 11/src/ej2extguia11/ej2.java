/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2extguia11;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ester
 */
public class ej2 {
/*Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener
dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los
métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la
superficie y el volumen de cada edificio.*/
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Polideportivo polideportivo=new Polideportivo();
     EdificioDeOficinas edificiodeoficinas=new EdificioDeOficinas();
     ArrayList<Edificio>edificio=new ArrayList();
     Scanner leer=new Scanner(System.in);
     String eleccion="";
     do{
         polideportivo.tipodepoli();
     }while(eleccion.equals("si"));
    }
    
}
