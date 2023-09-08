/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3guia10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/*Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera*/
/**
 *
 * @author Ester
 */
public class cartasServicio {

    public cartas cartasr = new cartas();
    List<cartas> baraja=new ArrayList();
    HashMap<String, Integer>mazobarajado = new HashMap();
    Scanner leer=new Scanner(System.in);
    public void cartas() {
        int r = 0;
        int t=0;
      do{
          r=r+1;
          t=t+1;
          if(t==8){
              t=t+2;
              
          }
          cartasr.numero=t;
          if(r==10){
              t=0;
              cartasr.palo="basto";
          }else if(r==1){
              t=0;
              cartasr.palo="espada";
          }else if(r==20){
              t=0;
              cartasr.palo="oro";
          }else if(r==30){
              t=0;
              cartasr.palo="copas";
          }
          baraja.add(cartasr);
          
      }while(r==40);
        
    }

    // barajar(): cambia de posición todas las cartas aleatoriamente.
    public void barajar(){
        int r=0;
        for (cartas carta : baraja) {
r++;
            if(r==Math.random()*40){
            mazobarajado.put(carta.palo,carta.numero);
}else if(r==Math.random()*40){
            mazobarajado.put(carta.palo,carta.numero);
}else if(r==Math.random()*40){
            mazobarajado.put(carta.palo,carta.numero);
}else if(r==Math.random()*40){
            mazobarajado.put(carta.palo,carta.numero);
}else{
            mazobarajado.put(carta.palo,carta.numero);
}
          
        }

    }
   /* • siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.*/
    List<cartas> cartasentregadas;
    public void siguientecarta(){
        System.out.println("---------------");
    Integer r=mazobarajado.get(mazobarajado.size()-1);
    mazobarajado.remove(mazobarajado.size()-1);
        System.out.println(r);
        cartasr.palo=mazobarajado.toString();
        cartasr.numero=mazobarajado.hashCode();
        cartasentregadas.add(cartasr);
        System.out.println("---------------");
} 
     //cartasDisponibles(): indica el número de cartas que aún se puede repartir.
    public void cartasdisponibles(){
        System.out.println("---------------");
        System.out.println(mazobarajado.size());
        System.out.println("---------------");
    }
/*• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario. */
    int cart;
    public int darcartas(){
        System.out.println("---------------");
         cart=leer.nextInt();
         int r=0;
        if(cart< mazobarajado.size()-1){
            System.out.println("se le entrega "+cart+" cartas al jugador");
            System.out.println("---------------");
             r=r+cart;
            return r;
        }else{
            System.out.println("cartas insuficientes, se le entregan 0 cartas ");
           System.out.println("---------------");
            return cart=0;
        }
        
    }
   /*  cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario*/
    public void cartasmonton(){
      
        System.out.println("---------------");   
        if(mazobarajado.size()>cart-1){
             System.out.println("se entrego "+ cartasentregadas);
          
        }else{
           System.out.println("no ha salido singuna carta");
        }
        System.out.println("---------------");
    }
   /* mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera*/
public void mostrarbaraja(){
   System.out.println("---------------");
    System.out.println(mazobarajado);
    System.out.println("---------------");
}
}
