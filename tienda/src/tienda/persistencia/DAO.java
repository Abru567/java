/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.persistencia;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ester
 */
public abstract class DAO {

    protected Connection conexion = null;
    protected ResultSet resultado = null;
    protected Statement sentencia = null;
    private final String USER ="abril";
    private final String PASWORD="root";
    private final String DATABASE="tienda";
    private final String DRIVER="com.mysql.jdbc.Driver";
    protected void conectarBD() throws Exception{
        try{
            Class.forName(DRIVER);
            String urlBaseDeDatos="jdbc:mysql://localhost:3306/"+DATABASE+"?useSSL=false";
            conexion = DriverManager.getConnection(urlBaseDeDatos, DRIVER, DRIVER);
        }catch(ClassNotFoundException | SQLException ex){
            throw ex;
        }
    }
    
    protected void desconectarBD() throws Exception{
        try {
            if (resultado !=null) {
                resultado.close();
            }
           if (sentencia !=null) {
                sentencia.close();
            } if (conexion !=null) {
                conexion.close();
            } 
        } catch (Exception e) {
       throw e;
        }
    }
    
    protected void instarModificElimin(String sql) throws Exception {
        try{
            conectarBD();
            sentencia =conexion.createStatement();
            sentencia.executeUpdate(sql);
        }catch(ClassNotFoundException |SQLException ex){
           throw ex;
        }finally{
            desconectarBD();
        }
    }
    protected void consultarBD(String sql) throws Exception{
           try{
            conectarBD();
            sentencia =conexion.createStatement();
            sentencia.executeUpdate(sql);
        }catch(Exception ex){
           throw ex;
        }
    }
}









