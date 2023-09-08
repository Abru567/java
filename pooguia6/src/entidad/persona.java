/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

/**
 *
 * @author Ester
 */
public class persona {
    public persona(){
        
    }
    public String nombre;
    public void persona(){
        nombre="adolfo";
    }
    public int edad;
    public persona(int edad){
        this.edad=edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
  
}
