/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;
import personaguia.servicio;
//Crea un método void que reciba un objeto tipo persona como parámetro y utilice el get para mostrar sus atributos. Llama ese método desde el main.

/**
 *
 * @author Ester
 */
public class personaguia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
servicio persona1=new servicio();
Scanner leer=new Scanner(System.in);
persona1.servpersona(leer.next());

    }
    
}
