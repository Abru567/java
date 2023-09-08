/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia4;

import java.util.Scanner;

/**
 *
 * @author Ester
 */
public class ej1guia4 {
//Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y define su tipo de dato de tal manera que te permita alojar 
        //sus nombres más adelante.
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       String[] equipo=new String[9];
       int i=0;
       for(i=0;i<9;i++){
           equipo[i]=leer.next();
       }
       for(i=0;i<9;i++){
           System.out.println(equipo[i]);
       }
    }
    
}
