/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import entidad.libro;
import java.util.Scanner;
//Crear un método para cargar un libro pidiendo los datos al usuario y luego informar mediante otro método el número de
//ISBN, el título, el autor del libro y el número de páginas.
/**
 *
 * @author Ester
 */
public class ejpract1guia6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in); 
        System.out.println("ingrese el ISBN, titulo, Autor y numero de paginas, para cargar el libro"); 
       libro ISBN=new libro();
       libro Titulo=new libro();
        libro Autor=new libro();
        libro Numerodepaginas=new libro();
        libro ISBN1=new libro();
       libro Titulo2=new libro();
        libro Autor3=new libro();
        libro Numerodepaginas4=new libro();
        ISBN.setISBN(leer.next());
        Titulo.setTitulo(leer.next());
        Autor.setAutor(leer.next());
        Numerodepaginas.setNumerodepaginas(leer.nextInt());
        ISBN1.getISBN();
        Titulo2.getTitulo();
        Autor3.getAutor();
        Numerodepaginas4.getNumerodepaginas();
        System.out.println("Los libros cargados son:");
        System.out.println("titulo: "+Titulo2);
        System.out.println("ISBN: "+ISBN1);
        System.out.println("Autor: "+Autor3);
        System.out.println("Numero de paginas: "+Numerodepaginas4);
        
    }
    
}
