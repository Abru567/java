/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import java.util.List;
import libreria.entidades.Autor;
import libreria.persistencia.DAO;

/**
 *
 * @author Ester
 */
public class AutorServicio extends DAO<Autor> {

    protected Autor autor = new Autor();

    public Autor CrearAutor(String nombre, boolean Alta) {
        conectar();
        try{
        autor.setNombre(nombre);
        autor.setAlta(Alta);
        super.guardar(autor);
    return autor;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
        }

    public Autor modificarAutorxnombre(Long id, String nombre) {
        conectar();
       try{
        Autor aut = em.find(Autor.class, id);
            aut.setNombre(nombre);
        super.editar(aut);
        return autor;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public Autor modificarAutorxAlta(Long id, boolean Alta) {
        conectar();
        try{
        Autor aut = em.find(Autor.class, id);
aut.setAlta(Alta);
        super.editar(aut);
        return autor;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public Autor buscarxnombre(String nombre){
        conectar();
        try{
        List<Autor> Autornom = em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :Au ")
                .setParameter("Au", nombre).getResultList();
        Autornom.forEach((Autorn) -> {
            System.out.println(Autorn);
        });
        return autor;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
                }
    
 public Autor buscarxid(Long id){
        conectar();
        try{      
        List<Autor> Autorid = em.createQuery("SELECT a FROM Autor a WHERE a.id LIKE :id ")
                .setParameter("id", id).getResultList();
        Autorid.forEach((Autori) -> {
            System.out.println(Autori);
        });
        return autor;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
                }
 
 public Autor EliminarAutor(Long id) {
        conectar();
        try{
        Autor aut = em.find(Autor.class, id);
        super.eliminar(aut);
        return autor;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}

