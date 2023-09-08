/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import java.util.List;
import libreria.entidades.Editorial;
import libreria.persistencia.DAO;

/**
 *
 * @author Ester
 */
public class EditorialServicio extends DAO<Editorial> {

    protected Editorial editorial = new Editorial();

    public Editorial CrearEditorial(String nombre, boolean Alta) {
        conectar();
        try {
            editorial.setNombre(nombre);
            editorial.setAlta(Alta);
            super.guardar(editorial);
            return editorial;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Editorial modificarEditorialxnombre(Long id, String nombre) {
        conectar();
        try {
            Editorial edit = em.find(Editorial.class, id);
            edit.setNombre(nombre);
            super.editar(edit);
            return editorial;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Editorial modificarEditorialxAlta(Long id, boolean Alta) {
        conectar();
        try {
            Editorial edit = em.find(Editorial.class, id);
            edit.setAlta(Alta);
            super.editar(edit);
            return editorial;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Editorial buscarxnombre(String nombre) {
        conectar();
        try {
            List<Editorial> Ednom = em.createQuery("SELECT a FROM Editorial a WHERE a.nombre LIKE :Ed ")
                    .setParameter("Ed", nombre).getResultList();
            Ednom.forEach((ednombre) -> {
                System.out.println(Ednom);
            });
            return editorial;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Editorial buscarxid(Long id) {
        conectar();
        try {
            List<Editorial> Editid = em.createQuery("SELECT a FROM Editorial a WHERE a.id LIKE :id ")
                    .setParameter("id", id).getResultList();
            Editid.forEach((Editorialid) -> {
                System.out.println(Editorialid);
            });
            return editorial;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public Editorial EliminarEditorial(Long id) {
        conectar();
        try {
            Editorial edit = em.find(Editorial.class, id);
            super.eliminar(edit);
            return editorial;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
