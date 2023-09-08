/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;

/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus atributos
serán, x1, y1, x2, y2, siendo cada x e y un punto. 
Generar un objeto puntos usando un método crearPuntos() que le pide al usuario los dos números
y los ingresa en los atributos del objeto. Después,
a través de otro método calcular y devolver la distancia que existe entre los dos puntos que 
existen en la clase Puntos. Para conocer como calcular 
la distancia entre dos puntos consulte el siguiente link:
*/
/**
 *
 * @author Ester
 */
public class puntos {
  public int x1, x2,y1,y2;
    public void crearpuntos() {
        System.out.println("ingrese las cordenadas de los puntos, para sacar la distancia entre estos");
        Scanner leer = new Scanner(System.in);
        x1 = leer.nextInt();
        x2 = leer.nextInt();
        y1 = leer.nextInt();
        y2 = leer.nextInt();
}
    public double distancia(){
     double distancia=(double)(Math.sqrt((x2 - x1)*2+(y2-y1)*2)); 
        return distancia;
    }

}
