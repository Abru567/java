/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.servicios;

import java.util.ArrayList;
import java.util.Scanner;
import tienda.entidades.Producto;
import tienda.persistencia.ProductoDAO;

/**
 *
 * @author Ester
 */
public class ServicioProducto {
    
    ProductoDAO ProductoDAO = new ProductoDAO();
    Producto Producto = new Producto();
    ArrayList<Producto> Prod = new ArrayList();
    Scanner leer = new Scanner(System.in);
    
    public void IngProd() {
        Producto.setNombre(leer.next());
        Producto.setCodigo(leer.nextInt());
        Producto.setCodigoFabricante(leer.nextInt());
        Producto.setPrecio(leer.nextInt());
        try {
            ProductoDAO.GuardarProd(Producto);
        } catch (Exception e) {
            System.out.println("Error al guardar nuevo Producto");
        }
    }
    
    public void ModProd() {
        System.out.println("ingrese el codigo del producto a eliminar");
        Producto.setCodigo(leer.nextInt());
            try {
                 System.out.println("¿Cual es la informacion a modificar?(nombre,codigo de fabricante o precio)");
        String eleccion=leer.next();
        if(eleccion.equals("nombre")){    
        Producto.setNombre(leer.next());
        }
        if(eleccion.equals("codigo de fabricante")){
            Producto.setCodigoFabricante(leer.nextInt());
        }if(eleccion.equals("precio")){
            Producto.setPrecio(leer.nextInt());
        }
            ProductoDAO.ModProd(Producto);
        } catch (Exception e) {
            System.out.println("Error al modificar el Producto");
        }
    }
    
    public void ElimProd() {
        System.out.println("ingrese el nombre del producto a eliminar");
        try {
            ProductoDAO.EliminarProd(leer.next());
        } catch (Exception e) {
            System.out.println("Error al eliminar el Producto");
        }
    }
    
    public void ConsultProd(String eleccion) {
        try {
            if (eleccion.equals("nombre")) {
                System.out.println("Ingrese el nombre del Producto a consultar");
                Producto.setNombre(leer.next());
            }
            if (eleccion.equals("codigo")) {
                System.out.println("ingrese el codigo del Producto a consultar");
                Producto.setCodigo(leer.nextInt());
            }
        if(eleccion.equals("codigo de fabricante")){
            Producto.setCodigoFabricante(leer.nextInt());
        }if(eleccion.equals("precio")){
            Producto.setPrecio(leer.nextInt());
        }
            ProductoDAO.ConsulProd(Producto);
        } catch (Exception e) {
            System.out.println("Error al realizar la consulta");
        }
    }
}
