/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.persistencia;

import java.util.ArrayList;
import tienda.entidades.Producto;

/**
 *
 * @author Ester
 */
public class ProductoDAO extends DAO {

    public void GuardarProd(Producto Producto) throws Exception {
        try {
            if (Producto == null) {
                throw new Exception("Ingrese un nuevo producto");
            }
            String sql = "INSERT INTO Producto (nombre, codigo, precio, codigo_fabricante)" + "VALUES ( '"
                    + Producto.getNombre() + "' , '"+ Producto.getCodigo() +"','" + Producto.getPrecio() + "' , '" + 
                    Producto.getCodigoFabricante() + "' );";
            instarModificElimin(sql);
        } catch (Exception e) {
            throw e;
        }
    }

    public void ModProd(Producto Producto, String eleccion) throws Exception {
        try {
            if (Producto == null) {
                throw new Exception("Ingrese el producto a modificar");
            }
            if(eleccion.equals("nombre")){
            String sql = "UPDATE Producto SET" + " NOMBRE= '"
                    + Producto.getNombre() + "' WHERE Codigo ='" + Producto.getCodigo() + "';";
            instarModificElimin(sql);}
            if(eleccion.equals("precio")){
            String sql = "UPDATE Producto SET" + " PRECIO='" + Producto.getPrecio() +  "' WHERE Codigo ='" + Producto.getCodigo() + "';";
            instarModificElimin(sql);
            }
            if(eleccion.equals("codigo de fabricamte")){
                String sql = "UPDATE Producto SET" + " CODIGO_FABRICANTE='"
                    + Producto.getCodigoFabricante() + "' WHERE Codigo ='" + Producto.getCodigo() + "';";
            instarModificElimin(sql);
            }
        } catch (Exception e) {
            throw e;
        }
    }

    public void EliminarProd(String Nombre) throws Exception {
        try {
            String sql = "DELETE FROM Fabricante WHERE Nombre='" + Nombre + "';";
            instarModificElimin(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    public void ConsulProd(Producto Producto) throws Exception{
        try {
            if(Producto.getCodigo() !=0){
            String sql ="SELECT '"+Producto.getCodigo()+"' FROM Fabricante";
            consultarBD(sql);
            }
            if(Producto.getCodigoFabricante() !=0){
            String sql ="SELECT '"+Producto.getCodigoFabricante()+"' FROM Fabricante";
            consultarBD(sql);
            }
            if(Producto.getPrecio() !=0){
            String sql ="SELECT '"+Producto.getPrecio()+"' FROM Fabricante";
            consultarBD(sql);
            }
            if(Producto.getNombre() !=null){
            String sql ="SELECT '"+Producto.getNombre()+"' FROM Fabricante";
            consultarBD(sql);
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
