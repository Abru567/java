/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;

/*
Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario". Luego, crea un método "calcular_aumento" que calcule el aumento salarial
de un empleado en función de su edad y salario actual. El aumento salarial debe ser del 10% si el empleado tiene más de 30 años o del 5% si tiene menos 
de 30 años.
*/
/**
 *
 * @author Ester
 */
public class empleado {

    public empleado() {
    }
 
    public String nombre;
public int edad;
public float salario;
public float aumento;
public void calcular_aumento(){
    System.out.println("ingrese el nombre, edad y salario del empleado para calcular el aumento");
    Scanner leer=new Scanner(System.in);
    nombre=leer.next();
    edad=leer.nextInt();
    salario=leer.nextFloat();
    if(edad>30){
       aumento=salario*0.10f;
        System.out.println("el salario de "+nombre+" aumento 10% el cual es: "+(aumento+salario));
    }else{
        aumento=salario*0.05f;
        System.out.println("el salario de "+nombre+" aumento 5% el cual es: "+(aumento+salario));
    }
}
}
