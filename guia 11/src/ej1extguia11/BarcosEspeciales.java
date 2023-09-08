/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1extguia11;
/*Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.*/
/**
 *
 * @author Ester
 */
public class BarcosEspeciales {
  double numerodemastiles;
double potenciamotor; 
double numerodecamarotes;

    public BarcosEspeciales() {
    }

    public BarcosEspeciales(double numerodemastiles, double potenciamotor, double numerodecamarotes) {
        this.numerodemastiles = numerodemastiles;
        this.potenciamotor = potenciamotor;
        this.numerodecamarotes = numerodecamarotes;
    }

    public double getNumerodemastiles() {
        return numerodemastiles;
    }

    public void setNumerodemastiles(double numerodemastiles) {
        this.numerodemastiles = numerodemastiles;
    }

    public double getPotenciamotor() {
        return potenciamotor;
    }

    public void setPotenciamotor(double potenciamotor) {
        this.potenciamotor = potenciamotor;
    }

    public double getNumerodecamarotes() {
        return numerodecamarotes;
    }

    public void setNumerodecamarotes(double numerodecamarotes) {
        this.numerodecamarotes = numerodecamarotes;
    }

}
