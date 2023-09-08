package guia3;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ester
 */
public class ejprac2guia3 {
//Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas ingresadas por teclado e indique si son mayores
       //o menores de edad. Después de cada persona, el programa debe preguntarle al usuario si quiere seguir mostrando personas y frenar cuando el usuario
               //ingrese la palabra “No”
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
       
       
       
      String freno=" ";
       while (freno !="no") {
           System.out.println("ingrese los nombres y edad de las personas");
        nom(leer);
           
           System.out.println("¿Quiere seguir mostrando personas?");
         freno = leer.next();
       } 
       }
    public static String nom(Scanner leer){
        int num=0;
        String nombre = leer.next();
        edad(leer,nombre);
        return nombre;
    }
 public static int edad (Scanner leer,String nombre){
        
        int num = leer.nextInt();
        personas(num,nombre,leer);
       return num; 
    }
  
   public static void personas(int num,String nombre, Scanner leer){
        System.out.println("nombre: "+nombre);
        System.out.println("edad: "+num);
        if(num >=18){
        System.out.println(+num+" es mayor ");
        }else{
            System.out.println(num+" es menor");
        }
        
    }
}

