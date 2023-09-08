/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1extguia11;
//Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.

import java.util.Date;

/**
 *
 * @author Ester
 */
public class Barco {
  int matricula;
double eslora;
Date añofabricacion;

    public Barco() {
    }

    public Barco(int matricula, double eslora, Date añofabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.añofabricacion = añofabricacion;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public Date getAñofabricacion() {
        return añofabricacion;
    }

    public void setAñofabricacion(Date añofabricacion) {
        this.añofabricacion = añofabricacion;
    }

}
