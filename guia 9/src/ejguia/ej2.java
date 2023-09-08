/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejguia;

import java.util.HashMap;

/**
 *
 * @author Ester
 */
public class ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap <Integer,String> personas = new HashMap();
        String n1 = "Albus";
        String n2 = "Severus";
        int n=20;
        personas.put(n,n1);
        System.out.println(personas);
        personas.put(n,n2);
        System.out.println(personas);
    }
    
}
