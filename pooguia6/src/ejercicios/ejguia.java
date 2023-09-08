/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;
import entidad.persona;
import java.util.Scanner;
/**                                                                                         
 *
 * @author Ester
 */
public class ejguia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        persona primerapersona =new persona();
        persona segundapersona=new persona();
        persona edadprimerapersona=new persona();
        persona edadsegundapersona=new persona(22);
    primerapersona.setNombre(leer.next());
    primerapersona.setEdad(leer.nextInt());
        System.out.println(primerapersona.getNombre());
        System.out.println(primerapersona.getEdad());
        
    }
    
}
