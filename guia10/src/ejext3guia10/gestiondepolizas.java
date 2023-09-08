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

/*Gestión de Pólizas: Se registrará una póliza, donde se guardará los datos tanto de un
vehículo, como los datos de un solo cliente. Los datos incluidos en ella son: número de
póliza, fecha de inicio y fin de la póliza, cantidad de cuotas, forma de pago, monto total
asegurado, incluye granizo, monto máximo granizo, tipo de cobertura (total, contra
terceros, etc.). Nota: prestar atención al principio de este enunciado y pensar en las
relaciones entre clases. Recuerden que pueden ser de uno a uno, de uno a muchos, de
muchos a uno o de muchos a muchos.*/
/**
 *
 * @author Ester
 */
public class gestiondepolizas {

    public int númerodepóliza;
    public Date fechadeinicio;
    public Date findelapóliza;
    public int cantidaddecuotas;
    public String formadepago;
    public int montototalasegurado;
    public int montomáximogranizo;
    public String tipodecobertura;
    private List<gestionintegraldeclientes> clientes = new ArrayList();
    private List<gestiondevehiculos> vehiculos = new ArrayList();
    private gestiondevehiculos vehiculo = new gestiondevehiculos();
    private gestionintegraldeclientes cliente = new gestionintegraldeclientes();
    private Scanner leer = new Scanner(System.in);

    public void datosclientes() {
        System.out.println("--------ingrese los datos del cliente--------");
        System.out.print("nombre: ");
        cliente.nombre = leer.next();
        System.out.println("");
        System.out.print("apellido: ");
        cliente.apellido = leer.next();
        System.out.println("");
        System.out.print("documento (sin puntos): ");
        cliente.documento = leer.nextInt();
        System.out.println("");
        System.out.print("domicilio: ");
        cliente.domicilio = leer.next();
        System.out.println("");
        System.out.print("mail: ");
        cliente.mail = leer.next();
        System.out.println("");
        System.out.print("telefono: ");
        cliente.telefono = leer.nextInt();
        System.out.println("");
        clientes.add(cliente);
    }

    public void datosvehiculo() {
        System.out.println("--------ingrese los datos del vehiculo--------");
        System.out.print("tipo: ");
        vehiculo.tipo = leer.next();
        System.out.println("");
        System.out.print("modelo: ");
        vehiculo.modelo = leer.next();
        System.out.println("");
        System.out.print("marca: ");
        vehiculo.marca = leer.next();
        System.out.println("");
        System.out.print("color: ");
        vehiculo.color = leer.next();
        System.out.println("");
        System.out.print("Año: ");
        vehiculo.año = leer.nextInt();
        System.out.println("");
        System.out.print("numero de motor: ");
        vehiculo.numerodemotor = leer.nextInt();
        System.out.println("");
        System.out.print("chasis: ");
        vehiculo.chasis = leer.next();
        System.out.println("");
        vehiculos.add(vehiculo);
    }

    @Override
    public String toString() {
        return "gestiondepolizas{" + "n\u00famerodep\u00f3liza=" + númerodepóliza + ", fechadeinicio=" + fechadeinicio + ", findelap\u00f3liza=" + findelapóliza + ", cantidaddecuotas=" + cantidaddecuotas + ", formadepago=" + formadepago + ", montototalasegurado=" + montototalasegurado + ", montom\u00e1ximogranizo=" + montomáximogranizo + ", tipodecobertura=" + tipodecobertura + '}';
    }


}
