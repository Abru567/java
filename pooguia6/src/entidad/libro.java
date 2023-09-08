/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;
//Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, Número de páginas, y un constructor con todos los atributos pasados
//por parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y luego informar mediante otro método el número de
//ISBN, el título, el autor del libro y el número de páginas.
/**
 *
 * @author Ester
 */
public class libro {
  public libro(){
      
  }
    public String ISBN;
    public String Titulo; 
    public String Autor;
    public int Numerodepaginas;
    public libro(String ISBN,String Titulo,String Autor,String Numerodepaginas){
        
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public int getNumerodepaginas() {
        return Numerodepaginas;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setNumerodepaginas(int Numerodepaginas) {
        this.Numerodepaginas = Numerodepaginas;
    }
    
}
