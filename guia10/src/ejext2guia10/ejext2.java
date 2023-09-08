/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejext2guia10;

/**
 *
 * @author Ester
 */
public class ejext2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       espectador espectador=new espectador();
        servicio cine=new servicio();
        cine cin=new cine();
        pelicula pelicula=new pelicula();
       cine.cine(cin);
        cine.espectadores(espectador);
       cine.pelicula(pelicula);
       cine.salaconespect();
    }
    
}
