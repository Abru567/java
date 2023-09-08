/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personaguia;
//Crea un método void que reciba un objeto tipo persona como parámetro y utilice el get para mostrar sus atributos. Llama ese método desde el main.

import entidad.persona;
import java.util.Scanner;


/**
 *
 * @author Ester
 */
public class servicio {
    private Scanner leer=new Scanner(System.in);//.useDelimiter("\n" );
    public void servpersona(String persona){
        persona pers1=new persona();
         pers1.setNombre(leer.next());
        System.out.println(pers1.getNombre());
        
    }
}
