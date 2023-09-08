/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.servicios;

import java.util.ArrayList;
import java.util.Scanner;
import tienda.entidades.Fabricante;
import tienda.persistencia.FabricanteDAO;

/**
 *
 * @author Ester
 */
/*En este paquete se almacenarán aquellas clases que llevarán adelante lógica del negocio. En
general se crea un servicio para administrar cada una de las entidades y algunos servicios
para manejar operaciones muy específicas como las estadísticas.
Realizar un menú en Java a través del cual se permita elegir qué consulta se desea realizar.
Las consultas a realizar sobre la BD son las siguientes:
a) Lista el nombre de todos los productos que hay en la tabla producto.
b) Lista los nombres y los precios de todos los productos de la tabla producto.
c) Listar aquellos productos que su precio esté entre 120 y 202.
d) Buscar y listar todos los Portátiles de la tabla producto.
e) Listar el nombre y el precio del producto más barato.
f) Ingresar un producto a la base de datos.
g) Ingresar un fabricante a la base de datos
h) Editar un producto con datos a elección.*/
public class ServicioFabricante {
   Scanner leer=new Scanner (System.in);
   ArrayList<Fabricante> Fab=new ArrayList(); 
   FabricanteDAO FabrianteDAO;
   Fabricante Fabricante;
   public void IngFab(){
        String eleccion="";
        do{
            Fabricante.setNombre(leer.next());
            Fabricante.setCodigo(leer.nextInt());
            Fab.add(Fabricante);
        }while(eleccion.equals("Si"));
        try{
        FabrianteDAO.GuardarFab(Fabricante);
        }catch(Exception e){
            System.out.println("Error al guardar nuevo Fabricante");
        }
    }
   public void ModFab(){
      String eleccion="";
        do{
            Fabricante.setNombre(leer.next());
            Fab.add(Fabricante);
        }while(eleccion.equals("Si"));
        try{
        FabrianteDAO.ModFab(Fabricante);
        }catch(Exception e){
            System.out.println("Error al modificar al Fabricante");
        } 
   }
   public void ElimFab(){
       try {
           FabrianteDAO.EliminarFab(leer.next());
       } catch (Exception e) {
           System.out.println("Error al eliminar fabricante");
       }
   }
   public void ConsultFab(String eleccion){
       try {
           if(eleccion.equals("nombre")){
               System.out.println("Ingrese el nombre del Fabricante a consultar");
           Fabricante.setNombre(leer.next());
           }
           if(eleccion.equals("codigo")){
               System.out.println("ingrese el codigo del Fabricante a consultar");
       Fabricante.setCodigo(leer.nextInt());
           }
           FabrianteDAO.ConsulFab(Fabricante);
       } catch (Exception e) {
           System.out.println("Error al realizar la consulta");
       }
   }
}













