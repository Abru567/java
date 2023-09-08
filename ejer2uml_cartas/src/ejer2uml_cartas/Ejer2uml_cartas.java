
package ejer2uml_cartas;

import java.util.Scanner;
import service.MazoServicio;


public class Ejer2uml_cartas {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
  
            MazoServicio ms= new MazoServicio();
       boolean salir=true;
        
        do{
        System.out.println("------Menu------");
       System.out.println("Ingrese el numero de opcion:");
        System.out.println("1 - Crear Baraja.");
        System.out.println("2 - Mostrar Baraja. ");
        System.out.println("3 - Barajar.");
        System.out.println("4 - Cartas Disponibles y cartas que salieron.");
        System.out.println("5 - Recibir cartas.");
        System.out.println("6 - SALIR.");
        int opc = leer.nextInt();

        if (opc > 6) {
            System.out.println("Ingrese una opcion valida entre 1 y 6.");
           
        }
        switch (opc) {
            case 1:
                System.out.println("1 - Crear Baraja.");
                ms.crearBaraja();
                break;
            case 2:
                System.out.println("2 - Mostrar Baraja. ");
                ms.mostrarBaraja();
                break;
            case 3:
                System.out.println("3 - Barajar.");
                ms.barajar();
                break;
            case 4:
                System.out.println("6 - Cartas que han salido y cartas disponibles");
                ms.cartasDisponibles();
                break;
            case 5:
                System.out.println("5 - Recibir cartas.");
                ms.darCartas();
                break;
            case 6:
                System.out.println("6 - SALIR.");
                if (opc == 6) {
                    System.out.println("Guardando el mazo...NV");
                    salir=false;
                    break;
                }
        }

    }while (salir);
     

    }
    
}
