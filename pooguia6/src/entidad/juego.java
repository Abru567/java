/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;

/*
Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores jugar un juego de adivinanza de números. El primer jugador elige 
un número y el segundo jugador intenta adivinarlo. El segundo jugador tiene un número limitado de intentos y recibe una pista de "más alto" o "más bajo"
después de cada intento. El juego termina cuando el segundo jugador adivina el número o se queda sin intentos. Registra el número de intentos necesarios
para adivinar el número y el número de veces que cada jugador ha ganado.
 */
/**
 *
 * @author Ester
 */
public class juego {

  

    public int numero;
    public int numintentos;
    public int intentosnes;
    public int juegosganados;

    public juego() {

    }

    public void iniciar_juego() {
        Scanner leer = new Scanner(System.in);
        System.out.println("jugador 1: ingrese el numero que tiene que adivinar el jugador 2");
        numero = leer.nextInt();
        intentosnes = (int) (Math.random() * 20);
    }

    public void adivinar() {
        Scanner leer = new Scanner(System.in);
        System.out.println("jugador 2: ingrese el numero a adivinar");
    
            int num = leer.nextInt();
        
        do{
            if(num<numero){
                System.out.println("mas alto");
                num=leer.nextInt();
                numintentos++;
            }else if(num>numero){
                System.out.println("mas bajo");
                num=leer.nextInt();
               numintentos++; 
            }else{
                System.out.println("felicidades gano el juego");
                juegosganados++;
             break;  
            }
        }while(numintentos !=intentosnes);
             
        }
    
}

