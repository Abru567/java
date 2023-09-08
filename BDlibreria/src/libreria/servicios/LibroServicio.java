/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import java.util.List;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.persistencia.DAO;

/**
 *
 * @author Ester
 */
public class LibroServicio extends DAO<Libro> {

    protected Libro libro = new Libro();
    
    public Libro Crearlibro(String titulo, int anio, int ejemplares, int ejemplaresPrestados, boolean alta, Autor autor, Editorial Editorial) {
       try{
           
        libro.setEditorial(Editorial);
        libro.setAutor(autor);
        libro.setTitulo(titulo);
        libro.setAnio(anio);
        libro.setEjemplares(ejemplares);
        libro.setEjemplaresPrestados(ejemplaresPrestados);
        libro.setEjemplaresRestantes();
        libro.setAlta(alta);
        guardar(libro);
        return libro;
       }catch(Exception e){
           System.out.println(e.getMessage());
           return null;
       }
    }

    /*8) Búsqueda de un Autor por nombre.
9) Búsqueda de un libro por ISBN.
10) Búsqueda de un libro por Título.
11) Búsqueda de un libro/s por nombre de Autor.
12) Búsqueda de un libro/s por nombre de Editorial.*/
    public Libro buscarlibroxisbn(Long id) {
       conectar();
       try{ 
       if (id != null) {
            System.out.println(em.find(Libro.class, id));
        }
       return libro;
       }catch(Exception e){
           System.out.println(e.getMessage());
           return null;
       }
    }

    public Libro buscarlibroxtitulo(Object titulo) {
        conectar();
        try{
        List<Libro> librotit =  em.createQuery("SELECT a FROM Libro a WHERE a.titulo LIKE :Au ")
                .setParameter("Au", titulo).getResultList();
        librotit.forEach((libroti) -> {
            System.out.println(libroti);
            });
        return libro;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Libro buscarlibroxnombreAu(Object Autor) {
        conectar();
        try{
        List<Libro> libroAu = em.createQuery("SELECT a FROM Libro a WHERE a.autor.nombre LIKE :Au ")
                .setParameter("Au", Autor).getResultList();
        libroAu.forEach((libroA) -> {
            System.out.println(libroA);
        });
        return libro;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Libro buscarlibroxnombreED(Object Editorial) {
        conectar();
        try{
        List<Libro> libroED = em.createQuery("SELECT a FROM Libro a WHERE a.editorial.nombre LIKE :Ed ")
                .setParameter("Ed", Editorial).getResultList();
        libroED.forEach((libroE) -> {
            System.out.println(libroE);
        });
        return libro;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
   
     public Libro modificarlibxtitulo(Long libroamod, String mod) {
        conectar();
        try{
         Libro lib = em.find(Libro.class, libroamod);
        lib.setTitulo(mod);
        super.editar(lib);
        return libro;
        }catch(Exception e){
            return null;
        }
    }
     
    public Libro modificarlibxejemprest(Long libroamod, int mod) {
       conectar();
       try{
        Libro lib = em.find(Libro.class, libroamod);
        lib.setEjemplaresPrestados(mod);
        super.editar(lib);
        return libro;
       }catch(Exception e){
           System.out.println(e.getMessage());
           return null;
       }
    }
 
   public Libro modificarlibxejem(Long libroamod, int mod) {
       conectar();
       try{
       Libro lib = em.find(Libro.class, libroamod);
        lib.setEjemplares(mod);
        super.editar(lib);
        return libro;
       }catch(Exception e){
           System.out.println(e.getMessage());
           return null;
       }
    }
    
    public Libro modificarlibxEditorial(Long libroamod, Editorial editorial) {
       conectar();
       try{
        Libro lib = em.find(Libro.class, libroamod);
        lib.setEditorial(editorial);
        super.editar(lib);
        return libro;
       }catch(Exception e){
           System.out.println(e.getMessage());
           return null;
       }
    }
    
    public Libro modificarlibxAutor(Long libroamod, Autor autor) {
        conectar();
        try{
        Libro lib = em.find(Libro.class, libroamod);
        lib.setAutor(autor);
        super.editar(lib);
        return libro;
        } catch(Exception e){
            System.out.println(e.getMessage());
            return null;   
        }
    }
 
    public Libro modificarlibxalta(Long libroamod,boolean libmod) {
        conectar();
        try{
        Libro lib = em.find(Libro.class, libroamod);
        lib.setAlta(libmod);
        super.editar(lib);
        return libro;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public Libro modificarlibxanio(Long libroamod, int libmod) {
        conectar();
        try{
        Libro lib = em.find(Libro.class, libroamod);
        lib.setAnio(libmod);
        super.editar(lib);
        return libro;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    
    public Libro eliminarlibro(Long id) {
        conectar();
        try{
       Libro edit = em.find(Libro.class, id);
        super.eliminar(edit); //To change body of generated methods, choose Tools | Templates.
    return libro;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
        }    

}
