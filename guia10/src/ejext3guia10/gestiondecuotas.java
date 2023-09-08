/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejext3guia10;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/*Gestión de cuotas: Se registrarán y podrán consultar las cuotas generadas en cada póliza.
Esas cuotas van a contener la siguiente información: número de cuota, monto total de la
cuota, si está o no pagada, fecha de vencimiento, forma de pago (efectivo, transferencia,
etc.).*/
 /*
/**
 *
 * @author Ester
 */
public class gestiondecuotas {

    public int númerodecuota;
    public int montototaldelacuota;
    public String pago;
    public Date fechadevencimiento;
    public String formadepago;
    private Scanner leer = new Scanner(System.in);
    private gestiondepolizas poliza = new gestiondepolizas();
    private List< gestiondepolizas> polizas = new ArrayList();

    public void poliza() {
        String eleccion = " ";
        int i = 0;

        do {
            i++;
            poliza.datosclientes();
            poliza.datosvehiculo();
            System.out.println("--------ingrese la informacion de la poliza--------");
            poliza.númerodepóliza = i;
            System.out.print("cantidad de cuotas: ");
            poliza.cantidaddecuotas = leer.nextInt();
            poliza.montototalasegurado = (int)(Math.random()*(100000*poliza.cantidaddecuotas));
            poliza.montomáximogranizo =(int)(Math.random()*(5000000*poliza.cantidaddecuotas)) ;
            System.out.println("");
            System.out.print("tipo de cobertura: ");
            poliza.tipodecobertura = leer.next();
            poliza.montototalasegurado = (int)(Math.random()*(5000000*poliza.cantidaddecuotas)) ;
            System.out.println("");
            System.out.print("fecha de inicio: ");
            poliza.fechadeinicio=new Date(leer.nextInt(),leer.nextInt(),(leer.nextInt()-1900));
            System.out.println("");
            System.out.print("fecha final de la poliza: ");
            poliza.findelapóliza=new Date(leer.nextInt(),leer.nextInt(),(leer.nextInt()-1900));
            System.out.println("");
            System.out.print("forma de pago: ");
            poliza.formadepago = leer.next();
            System.out.println("");
            System.out.println("¿quiere seguir agregando polizas?si/no");
            polizas.add(poliza);
            eleccion = leer.next();
        } while (eleccion.equals("si"));
    }
    public void cuotas(){
        
    }
    @Override
    public String toString() {
        return "gestiondecuotas{" + "n\u00famerodecuota=" + númerodecuota + ", montototaldelacuota=" + montototaldelacuota + ", pago=" + pago + ", fechadevencimiento=" + fechadevencimiento + ", formadepago=" + formadepago + '}';
    }

   
    
}
