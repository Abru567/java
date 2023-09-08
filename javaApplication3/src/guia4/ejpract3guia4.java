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
public class ejpract3guia4 {
//Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese el tamaño del vector");
        int tamaño=leer.nextInt();
        int[] vector=new int[tamaño];
        System.out.println("ingrese los numeros a ingresar al vertor");
        int i=0;
       for (i=0;i<tamaño;i++){
           vector[i]=(int)(Math.random()*99999);
           System.out.println(vector[i]);
       }
       
       int a=0;
       int b=0;
       int c=0;
       int d=0;
       int e=0;
       
        for(i=0;i<tamaño;i++){
            int digitos=0;
            while(vector[i]!=0){
                vector[i]=vector[i]/10;
                digitos=digitos+1;
            }
            switch(digitos){
                case 1:
                    a=a+1;
                    break;
                case 2:
                    b=b+1;
                    break;
                case 3:
                    c=c+1;
                    break;
                case 4:
           
                    d=d+1;
                    break;
                case 5:
                     e=e+1;
                   break;
        }
        }
        
        System.out.println("la cantidad de numeros de 1 digito que hay en el vector es: "+a);
        System.out.println("la cantidad de numeros de 2 digito que hay en el vector es: "+b);
        System.out.println("la cantidad de numeros de 3 digito que hay en el vector es: "+c);
        System.out.println("la cantidad de numeros de 4 digito que hay en el vector es: "+d);
        System.out.println("la cantidad de numeros de 5 digito que hay en el vector es: "+e);
    }
    
}
