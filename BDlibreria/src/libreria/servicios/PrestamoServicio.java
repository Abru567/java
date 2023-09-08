/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import java.util.Date;
import java.util.List;
import java.util.Scanner;
import libreria.entidades.Cliente;
import libreria.entidades.Libro;
import libreria.entidades.Prestamo;
import libreria.persistencia.DAO;

/**
 *
 * @author Ester
 */
public class PrestamoServicio extends DAO<Prestamo> {

    Scanner leer = new Scanner(System.in);
    Prestamo prestamo = new Prestamo();

    public Prestamo CrearPrestamo(Libro libro, Cliente cliente) {
        conectar();
        try {
            System.out.println("Ingrese fecha de la entrega del prestamo");
            prestamo.setFechaPrestamo(new Date(leer.nextInt(), leer.nextInt(), 2023 - 1900));
            System.out.println("Ingrese fecha de devolucion del prestamo");
            prestamo.setFechaDevolucion(new Date(leer.nextInt(), leer.nextInt(), 2023 - 1900));
            prestamo.setLibro(libro);
            prestamo.setCliente(cliente);
            super.guardar(prestamo);
            return prestamo;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public Prestamo ModificarPrestamoXFechadepres(){
        conectar();
        try {
            System.out.println("Ingrese Id de la fecha del prestamo a cambiar");
            Prestamo pres= em.find(Prestamo.class,leer.nextLong());
            System.out.println("Ingrese la nueva fecha ");
            pres.setFechaPrestamo(new Date(leer.nextInt(), leer.nextInt(), 2023 - 1900));
            super.editar(pres);
            return prestamo;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public Prestamo ModificarPrestamoXFechadeDevol(){
        conectar();
        try {
            System.out.println("Ingrese Id de la fecha del prestamo a cambiar");
            Prestamo pres= em.find(Prestamo.class,leer.nextLong());
             System.out.println("Ingrese la nueva fecha ");
            pres.setFechaDevolucion(new Date(leer.nextInt(), leer.nextInt(), 2023 - 1900));
            super.editar(pres);
            return prestamo;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public Prestamo ModificarPrestamoXLibro(Libro libro){
        conectar();
        try {
            
            System.out.println("Ingrese Id del libro del prestamo a cambiar");
            Prestamo pres= em.find(Prestamo.class,leer.nextLong());
            pres.setLibro(libro);
            return prestamo;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public Prestamo ModificarPrestamoXCliente(Cliente cliente){
        conectar();
        try {
             System.out.println("Ingrese Id del libro del prestamo a cambiar");
            Prestamo pres= em.find(Prestamo.class,leer.nextLong());
            pres.setCliente(cliente);
            return prestamo;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public Prestamo BuscarPrestamoXFechadePres(Date fecha){
        conectar();
        try {
           List<Prestamo> fechadepres = em.createQuery("SELECT a FROM Prestamo a WHERE a.fechaPrestamo LIKE :A ")
                .setParameter("A", fecha).getResultList();
       fechadepres.forEach((fech) -> {
            System.out.println(fech);
        });
            return prestamo;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public Prestamo BuscarPrestamoXFechadedev(Date fecha){
        conectar();
        try {
           List<Prestamo> fechadedev = em.createQuery("SELECT a FROM Prestamo a WHERE a.fechaDevolucion LIKE :A ")
                .setParameter("A", fecha).getResultList();
       fechadedev.forEach((fech) -> {
            System.out.println(fech);
        });
            return prestamo;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public Prestamo BuscarPrestamoXclientenombre(Object cliente){
        conectar();
        try {
           List<Prestamo> client = em.createQuery("SELECT a FROM Prestamo a WHERE a.cliente.nombre LIKE :A ")
                .setParameter("A", cliente).getResultList();
       client.forEach((clien) -> {
            System.out.println(clien);
        });
            return prestamo;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public Prestamo BuscarPrestamoXclienteapellido(Object cliente){
        conectar();
        try {
           List<Prestamo> client = em.createQuery("SELECT a FROM Prestamo a WHERE a.cliente.apellido LIKE :A ")
                .setParameter("A", cliente).getResultList();
       client.forEach((clien) -> {
            System.out.println(clien);
        });
            return prestamo;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public Prestamo BuscarPrestamoXclientedocumento(Object cliente){
        conectar();
        try {
           List<Prestamo> client = em.createQuery("SELECT a FROM Prestamo a WHERE a.cliente.documento LIKE :A ")
                .setParameter("A", cliente).getResultList();
       client.forEach((clien) -> {
            System.out.println(clien);
        });
            return prestamo;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public Prestamo BuscarPrestamoXclienteid(Object cliente){
        conectar();
        try {
           List<Prestamo> client = em.createQuery("SELECT a FROM Prestamo a WHERE a.cliente.id LIKE :A ")
                .setParameter("A", cliente).getResultList();
       client.forEach((clien) -> {
            System.out.println(clien);
        });
            return prestamo;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public Prestamo BuscarPrestamoXclientetelefono(Object cliente){
        conectar();
        try {
           List<Prestamo> client = em.createQuery("SELECT a FROM Prestamo a WHERE a.cliente.telefono LIKE :A ")
                .setParameter("A", cliente).getResultList();
       client.forEach((clien) -> {
            System.out.println(clien);
        });
            return prestamo;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public Prestamo BuscarPrestamoXid(Object id){
        conectar();
        try {
           List<Prestamo> presid = em.createQuery("SELECT a FROM Prestamo a WHERE a.id LIKE :A ")
                .setParameter("A", id).getResultList();
       presid.forEach((ed) -> {
            System.out.println(ed);
        });
            return prestamo;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public Prestamo BuscarPrestamoXlibro(Object libro){
        conectar();
        try {
           List<Prestamo> libros = em.createQuery("SELECT a FROM Prestamo a WHERE a.libro.titulo LIKE :A ")
                .setParameter("A", libro).getResultList();
       libros.forEach((lib) -> {
            System.out.println(lib);
        });
            return prestamo;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    protected Prestamo eliminarPrestamo(Prestamo objeto) {
        try{
        super.eliminar(objeto);
        return prestamo;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
    
}
