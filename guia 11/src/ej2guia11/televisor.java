/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2guia11;

import java.util.Scanner;

/*Se debe crear también una subclase llamada Televisor con los siguientes atributos:
resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de los atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.
*/
/**
 *
 * @author Ester
 */
public class televisor extends electrodomestico{
    public int resolucion;
    public boolean sintonizadorTDT;

    public televisor() {
    }

    public televisor(int resolucion, boolean sintonizadorTDT, double precio, String color, char consumoenergetico, double peso) {
        super(precio, color, consumoenergetico, peso);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }
 /* Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
los atributos del televisor.  */
    public void creartelevisor(){
         System.out.println("--------------------------televisor--------------------------");
        Scanner leer=new Scanner (System.in);
        super.crearElectrodomestico();
        System.out.print("resolucion (pulgadas): ");
        resolucion=leer.nextInt();
        System.out.print("sintentizador TDT: ");
        sintonizadorTDT=leer.hasNextBoolean();
    }
    /*• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
también deben afectar al precio.*/

    @Override
    public double precioFinal() {
        super.precioFinal(); 
        double r=0;
        if(resolucion>40){
            r=precio*0.30;
            precio=precio+r;
        }
        if(sintonizadorTDT==true){
            precio=precio+500;
        }
    return precio;
    }

    @Override
    public String toString() {
        return "televisor{" + "resolucion=" + resolucion + ", sintonizadorTDT=" + sintonizadorTDT +super.toString()+ '}';
    }
    
}
