/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1extguia11;

/*En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal y
sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y
el número de camarotes.*/
/**
 *
 * @author Ester
 */
public class ServicioBarcosEspeciales extends ServicioAlquiler {

    BarcosEspeciales barcos = new BarcosEspeciales();
    double barco;

    public double modulodebarcoespecial() {
         System.out.println("------------------informacion del barco especial----------------------");
         System.out.print("numero de camarotes: ");
        barcos.numerodecamarotes=leer.nextDouble();
        System.out.print("numero de mastiles: ");
        barcos.numerodemastiles=leer.nextDouble();
        System.out.print("potencia del motor: ");
        barcos.potenciamotor=leer.nextDouble();
        if (barcos.numerodemastiles != 0) {
            return barcos.numerodemastiles + super.modulodebarco();
        } else if (barcos.numerodecamarotes != 0) {
            return barcos.numerodecamarotes + barcos.potenciamotor + super.modulodebarco();
        } else if (barcos.potenciamotor != 0) {
            return barcos.potenciamotor + super.modulodebarco();
        }else{
        return barco;
        }
        
    }
    
}
