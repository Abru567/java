/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejext2guia10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


/*Para representar la sala con los espectadores vamos a utilizar una matriz. Los asientos son
etiquetados por una letra y un número la fila A1 empieza al final del mapa como se muestra en
la tabla. También deberemos saber si el asiento está ocupado por un espectador o no, si esta
ocupado se muestra una X, sino un espacio vacío.
8 A X | 8 B X | 8 C X | 8 D | 8 E X | 8 F X
7 A X | 7 B X | 7 C X | 7 D X | 7 E | 7 F X
6 A X | 6 B X | 6 C | 6 D X | 6 E X | 6 F
5 A X | 5 B X | 5 C X | 5 D X | 5 E X | 5 F X
4 A X | 4 B X | 4 C X | 4 D X | 4 E X | 4 F X
3 A X | 3 B X | 3 C X | 3 D | 3 E X | 3 F X
2 A X | 2 B | 2 C X | 2 D X | 2 E X | 2 F
1 A X | 1 B X | 1 C X | 1 D X | 1 E X | 1 F X
Se debe realizar una pequeña simulación, en la que se generen muchos espectadores y se los
ubique en los asientos aleatoriamente (no se puede ubicar un espectador donde ya este
ocupado el asiento).
Los espectadores serán ubicados de uno en uno y para ubicarlos tener en cuenta que sólo se
podrá sentar a un espectador si tiene el dinero suficiente para pagar la entrada, si hay espacio
libre en la sala y si tiene la edad requerida para ver la película. En caso de que el asiento este
ocupado se le debe buscar uno libre.
Al final del programa deberemos mostrar la tabla, podemos mostrarla con la letra y numero de
cada asiento o solo las X y espacios vacíos.*/
/**
 *
 * @author Ester
 */
public class servicio {

    public String[][] letra = new String[8][6];
    public int[][] numero = new int[8][6];
    public String[][] ocupado = new String[8][6];
    List<espectador> espectadores = new ArrayList();
    List<pelicula> pelicula = new ArrayList();
    List<cine> cin = new ArrayList();

    public void salaconespect() {
        int r = 8;
       int t=0;
        
       do{
            
            t++;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                numero[i][j] = r;
              for(pelicula pelicula:pelicula){
                for (espectador espectador: espectadores){ 
                for(cine cine:cin){
                    if(pelicula.edadmin<espectador.edad){
                    if(cine.precioentrada<espectador.dinero){
                        ocupado[i][j]="X";
                    }else{
                        ocupado[i][j]=" ";
                    }
                        }else{
                    ocupado[i][j]=" ";
                }
                    }
                    }
            }
            }
            r = r - 1;
            letra[i][0] = "A";
            letra[i][1] = "B";
            letra[i][2] = "C";
            letra[i][3] = "D";
            letra[i][4] = "E";
            letra[i][5] = "F";
            
        }
        
        }while(t!=5);
         
     System.out.println("-------------------sala"+ t+" -----------------------------");
           for (int y = 0; y < 8; y++) {
            for (int p = 0; p < 6; p++) {
                System.out.print(numero[y][p] + letra[y][p] +ocupado[y][p]+ "|");
            }
            System.out.println("");
        }
           System.out.println("------------------------------------------------");
         
    }
    HashMap<Integer,String> sala=new HashMap();
    /* Se debe realizar una pequeña simulación, en la que se generen muchos espectadores y se los
ubique en los asientos aleatoriamente (no se puede ubicar un espectador donde ya este
ocupado el asiento).
Los espectadores serán ubicados de uno en uno y para ubicarlos tener en cuenta que sólo se
podrá sentar a un espectador si tiene el dinero suficiente para pagar la entrada, si hay espacio
libre en la sala y si tiene la edad requerida para ver la película. En caso de que el asiento este
ocupado se le debe buscar uno libre.
Al final del programa deberemos mostrar la tabla, podemos mostrarla con la letra y numero de
cada asiento o solo las X y espacios vacíos.*/
    Scanner leer = new Scanner(System.in);
    public String eleccion = "";

    public void espectadores(espectador espectador) {
        System.out.println("----------------------crear espectadores--------------------------");
        do {
            System.out.println("ingrese nombre del espectador");
            espectador.nombre = leer.next();
            System.out.println("ingrese edad del espectador");
            espectador.edad = leer.nextInt();
            System.out.println("ingrese el dinero disponible del espectador");
            espectador.dinero = leer.nextDouble();
            espectadores.add(espectador);
            System.out.println("¿quiere seguir agregando espectadores?si/no");
            eleccion=leer.next();
        } while (eleccion.equals("si"));
    }

    public void pelicula(pelicula pelicu) {
         System.out.println("----------------------crear pelicula--------------------------");
        System.out.println("ingrese 5 peliculas:");
         int i = 0;
        do {
            i++;
            System.out.println("ingrese el titulo de la pelicula");
            pelicu.titulo = leer.next();
            System.out.println("ingrese el director de la pelicula");
            pelicu.director = leer.next();
            System.out.println("ingrese la edad minima de la pelicula");
            pelicu.edadmin = leer.nextInt();
            pelicula.add(pelicu);
        } while (i < 5);
         System.out.println("------------------------------------------------");
    }

    public void cine(cine cine) {
        int i = 0;
        do {
            i++;
            cine.pelicula = pelicula.toString();
            cine.precioentrada = 3;
            cine.sala = 5;
            cin.add(cine);
        } while (i<5);
    }

}
