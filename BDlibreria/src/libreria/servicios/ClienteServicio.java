/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libreria.servicios;

import java.util.List;
import java.util.Scanner;
import libreria.entidades.Cliente;
import libreria.persistencia.DAO;

/**
 *
 * @author Ester
 */
public class ClienteServicio extends DAO<Cliente>{
    Scanner leer=new Scanner(System.in);
    protected Cliente cliente=new Cliente();

    public Cliente CrearCliente(){
        conectar();
        try {
            System.out.println("Ingrese Nombre del cliente");
            cliente.setNombre(leer.next());
            System.out.println("Ingrese Apellido del cliente");
            cliente.setApellido(leer.next());
            System.out.println("Ingrese documento del cliente");
            cliente.setDocumento(leer.nextLong());
            System.out.println("Ingrese numero de telefono del cliente");
            cliente.setTelefono(leer.next());
            super.guardar(cliente);
            return cliente;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
     public Cliente ModificarClienteXapellido(){
        conectar();
        try {
            Cliente clien= em.find(Cliente.class,leer.nextLong());
            clien.setApellido(leer.next());
            super.editar(clien);
            return cliente;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
     
     public Cliente ModificarClienteXnombre(){
        conectar();
        try {
            Cliente clien= em.find(Cliente.class,leer.nextLong());
            clien.setNombre(leer.next());
            super.editar(clien);
            return cliente;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
     
     public Cliente ModificarClienteXdocumento(){
        conectar();
        try {
            Cliente clien= em.find(Cliente.class,leer.nextLong());
            clien.setDocumento(leer.nextLong());
            super.editar(clien);
            return cliente;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
     
     public Cliente ModificarClienteXtelefono(){
        conectar();
        try {
            Cliente clien= em.find(Cliente.class,leer.nextLong());
            clien.setTelefono(leer.next());
            super.editar(clien);
            return cliente;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public Cliente BuscarClienteXnombre(Object clientes){
        conectar();
        try {
           List<Cliente> client = em.createQuery("SELECT a FROM Cliente a WHERE a.nombre LIKE :A ")
                .setParameter("A", clientes).getResultList();
       client.forEach((clien) -> {
            System.out.println(clien);
        });
            return cliente;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public Cliente BuscarClienteXapellido(Object clientes){
        conectar();
        try {
           List<Cliente> client = em.createQuery("SELECT a FROM Cliente a WHERE a.apellido LIKE :A ")
                .setParameter("A", clientes).getResultList();
       client.forEach((clien) -> {
            System.out.println(clien);
        });
            return cliente;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
   
    public Cliente BuscarClienteXdocumento(Object clientes){
        conectar();
        try {
           List<Cliente> client = em.createQuery("SELECT a FROM Cliente a WHERE a.documento LIKE :A ")
                .setParameter("A", clientes).getResultList();
       client.forEach((clien) -> {
            System.out.println(clien);
        });
            return cliente;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
   
    public Cliente BuscarClienteXid(Object clientes){
        conectar();
        try {
           List<Cliente> client = em.createQuery("SELECT a FROM Cliente a WHERE a.id LIKE :A ")
                .setParameter("A", clientes).getResultList();
       client.forEach((clien) -> {
            System.out.println(clien);
        });
            return cliente;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
   
    public Cliente BuscarClienteXtelefono(Object clientes){
        conectar();
        try {
           List<Cliente> client = em.createQuery("SELECT a FROM Cliente a WHERE a.telefono LIKE :A ")
                .setParameter("A", clientes).getResultList();
       client.forEach((clien) -> {
            System.out.println(clien);
        });
            return cliente;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public Cliente eliminarCliente(Cliente objeto) {
        try{
        super.eliminar(objeto);
        return cliente;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

}
