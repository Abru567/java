/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author Ester
 */
public class ejext2guia2 {
//Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una. A continuación, realizar las instrucciones necesarias
//para que: B tome el valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores iniciales y los valores finales 
    //de cada variable. Utilizar sólo una variable auxiliar
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       int A=(int)(Math.random()*100);
       int B=(int)(Math.random()*100);
       int C=(int)(Math.random()*100);
       int D=(int)(Math.random()*100);
        System.out.println("los valores de A es: "+A);
        System.out.println("los valores de B es: "+B);
        System.out.println("los valores de C es: "+C);
        System.out.println("los valores de D es: "+D);
        int c=C;
        System.out.println("C es: "+(C=A));
        
        System.out.println("A es: "+(A=D));
        System.out.println("D es: "+(D=B));
        
       System.out.println("B es: "+(B=c));



    }
    
}
