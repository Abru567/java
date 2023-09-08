/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2guia11;

import java.util.Scanner;

/*se debe crear una subclase llamada Lavadora, con el atributo carga,
además de los atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la carga y el resto de los atributos heredados. Recuerda que debes
llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set del atributo carga.
• Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
el atributo propio de la lavadora.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.*/
/**
 *
 * @author Ester
 */
public class lavadora extends electrodomestico{
public double carga;

    public lavadora() {
    }

    public lavadora(double carga, double precio, String color, char consumoenergetico, double peso) {
        super(precio, color, consumoenergetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
   public void crearlavadora(){
     Scanner leer=new Scanner(System.in);
       super.crearElectrodomestico();
       System.out.print("carga: ");
       carga =leer.nextDouble();
       System.out.println("");
   }
   /*  Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
carga es menor o igual, no se incrementará el precio. Este método debe llamar al
método padre y añadir el código necesario. Recuerda que las condiciones que hemos
visto en la clase Electrodoméstico también deben afectar al precio.*/

    @Override
    public double precioFinal() {
        super.precioFinal(); 
        if(carga>=30){
            precio=precio+500;
        }
        return precio;
    }

    @Override
    public String toString() {
        return "lavadora{" + "carga=" + carga + super.toString()+'}';
    }
   
}
