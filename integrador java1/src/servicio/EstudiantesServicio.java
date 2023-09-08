/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Estudiantes;
import java.util.Arrays;
import java.util.Scanner;
/*Una vez creado los estudiantes deberemos guardar los estudiantes en un arreglo de objetos tipo Estudiante, usando ese arreglo tenemos que realizar las 
dos tareas que nos ha pedido la escuela.
Calcular y mostrar el promedio de notas de todo el curso
Retornar otro arreglo con los nombre de los alumnos que recibieron una nota mayor al promedio del curso
Por último, deberemos mostrar todos los estudiantes con una nota mayor al promedio.*/

/**
 *
 * @author Ester
 */
public class EstudiantesServicio {
    private Estudiantes[] alumno=new Estudiantes[8];
    private Estudiantes[] alumn=new Estudiantes[8];
    private Estudiantes alum;
    private Scanner leer=new Scanner(System.in);
  private double promedio;  
public void cargar(){
    System.out.println("ingrese nombre y nota de los estudiantes");
    for(int i=0;i<8;i++){
        System.out.println("alumno "+(i+1));
        alumno[i]=new Estudiantes(leer.next(),leer.nextInt());
    }
    
}
public void promedio(){
  promedio=0;
    for(int i=0;i<8;i++){
        promedio=alumno[i].nota+promedio;
        }
    promedio=promedio/8;
    System.out.println("el promedio de todas las notas del curso es: "+promedio);
}
private int sum;
public void notamayotprom(){
    for(int i=0;i<8;i++){
        if(alumno[i].nota>promedio){
           alumn[i]=new Estudiantes(alumno[i].nombre,alumno[i].nota);
            sum++;
        
        }
    }
    
}
public void estudmayalprom(){
    System.out.println("alumnos con notas mayores al promedio");
    for(int i=0;i<sum;i++){
        System.out.println("alumno: ");
        System.out.println("nota: ");
    }
}
}
