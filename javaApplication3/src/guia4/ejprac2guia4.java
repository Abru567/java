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
public class ejprac2guia4 {
//Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y le pida al usuario un número a buscar en el vector. El programa mostrará
        //dónde se encuentra el numero y si se encuentra repetido
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese el tamaño del vector y el numero a buscar");
        int tamaño=leer.nextInt();
        int num=leer.nextInt();
        int i=0;
        int repeticiones=0;
        int[] vector= new int[tamaño];
        for(i=0;i<tamaño;i++){
        vector[i]=(int)(Math.random()*tamaño);
        }
        String ubicacion=" ";
        for(i=0;i<tamaño;i++){
        if(vector[i]==num){
        repeticiones++;
       ubicacion = ubicacion + " " + i;
        }
        }
        if(repeticiones==1){
            
            System.out.println("el numero "+num+" no se repite y se encuenta en "+ ubicacion);
            
        }else{
            System.out.println("el numero "+num+" se repite y se encuenta en "+ ubicacion);
        }
        }
    }

    

