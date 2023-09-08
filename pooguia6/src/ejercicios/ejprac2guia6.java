/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import entidad.circunferencia;
import java.util.Scanner;



/**
 *
 * @author Ester
 */
public class ejprac2guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        circunferencia num=new circunferencia();
     num.getradio(leer.nextInt());
        System.out.println(num.perimetro());
    }
   
    
    
}
