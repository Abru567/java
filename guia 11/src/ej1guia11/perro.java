/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1guia11;

/**
 *
 * @author Ester
 */
public class perro extends animal{

    public perro(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void alimentarse() {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("perro:" );
        super.alimentarse(); 
        
    }
    
}
