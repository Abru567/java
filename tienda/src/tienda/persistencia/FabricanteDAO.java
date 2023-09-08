/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.persistencia;

import tienda.entidades.Fabricante;

/**
 *
 * @author Ester
 */
public class FabricanteDAO extends DAO {

    public void GuardarFab(Fabricante Fabricante) throws Exception {
        try {
            if (Fabricante == null) {
                throw new Exception("Ingrese un nuevo fabricante");
            }
            String sql = "INSERT INTO Fabricante (nombre, codigo)" + "VALUES ( '"
                    + Fabricante.getNombre() + "' , '" + Fabricante.getCodigo()+"' );";
            instarModificElimin(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    public void ModFab(Fabricante Fabricante) throws Exception {
        try {
            if (Fabricante == null) {
                throw new Exception("Ingrese el fabricante a modificar");
            }
            String sql = "UPDATE Fabricante SET" + " NOMBRE= '"
                    + Fabricante.getNombre() + "' WHERE Codigo ='" + Fabricante.getCodigo()+"';";
            instarModificElimin(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    public void EliminarFab(String Nombre) throws Exception {
        try {
            String sql = "DELETE FROM Fabricante WHERE Nombre='"+ Nombre + "';";
            instarModificElimin(sql);
        } catch (Exception e) {
            throw e;
        }
    }
    public void ConsulFab(Fabricante Fabricante) throws Exception{
        try {
            if(Fabricante.getCodigo() !=0){
            String sql ="SELECT '"+Fabricante.getCodigo()+"' FROM Fabricante";
            consultarBD(sql);
            }
            
            if(Fabricante.getNombre() !=null){
            String sql ="SELECT '"+Fabricante.getNombre()+"' FROM Fabricante";
            consultarBD(sql);
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
