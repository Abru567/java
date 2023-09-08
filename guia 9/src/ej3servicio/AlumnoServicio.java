/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3servicio;

import ej3entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;


/*En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
/**
 *
 * @author Ester
 */
public class AlumnoServicio {

    ArrayList<Alumno> alumno = new ArrayList();
    private Alumno alum ;
    private Scanner leer = new Scanner(System.in);
    private int a=0;

    public void crearAlum() {
        String respuesta = "";
        do {
            System.out.println("Ingrese el nombre y notas del alumno");
            alum=new Alumno(leer.next());
            alumno.add(alum);
           a++;
        System.out.println("¿quiere crear otro alumno?");
            
            respuesta = leer.next();
        } while (respuesta.equals("si"));

    }
     /*El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.*/
    public void notafinal(){
       crearAlum();
        System.out.println("ingrese el nombre del alumno buscado");
        String al=leer.next();
        int notafin=0;
        int nota=0;
        int r=0;
        for(Alumno estudiante:alumno){
            r++;
            if(estudiante.nombre.equals(al)){
                for(int i=0;i<3;i++){
                    
                   notafin=notafin+estudiante.notas.get(i);
                }
                System.out.println("el promedio final de "+al+" es: "+notafin/3);   
                break;
        }else if(r==a){
                System.out.println("el estudiante no se encuenta en la lista");
            }
        }
    }
}
