/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej2guia11;

import java.util.Scanner;

/*siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.
• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.
• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:*/
/**
 *
 * @author Ester
 */
public class electrodomestico {

    public double precio;
    public String color;
    public char consumoenergetico;
    public double peso;

    public electrodomestico() {
    }

    public electrodomestico(double precio, String color, char consumoenergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoenergetico = consumoenergetico;
        this.peso = peso;
    }

    /* comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.*/
    public char comprobarConsumoEnergetico(char letra) {
        String a = "a";
        String f = "f";

        if (letra > a.charAt(0) && letra < f.charAt(0)) {
            return letra;
        }else{
        return f.charAt(0);
        }
    }
 /*comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.*/
     public String comprobarColor(String color){
         String blanco="blanco";
         String rojo="rojo";
         String azul="azul";
         String gris="gris";
         String negro="negro";
         if(color.equals(blanco)||color.equals(rojo)||color.equals(azul)||color.equals(gris)||color.equals(negro)){
             return color;
         }else if(color.equals(blanco.toUpperCase())||color.equals(rojo.toUpperCase())||color.equals(azul.toUpperCase())||color.equals(gris.toUpperCase())||color.equals(negro.toUpperCase())){
         return color;
         }else {
             return "blanco";
         }
     } 
/*Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.*/
     public void crearElectrodomestico(){
     Scanner leer=new Scanner(System.in);
         System.out.println("ingrese la informacion");
         System.out.print("color: ");
         color=comprobarColor(leer.next());
         System.out.print("consumo energetico(entre a y f): ");
         String consumo=leer.next();
         consumoenergetico=comprobarConsumoEnergetico(consumo.charAt(0));
         System.out.print("peso: ");
         peso=leer.nextDouble();
         precio=1000.00;
     }
  /*Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
precio. Esta es la lista de precios:*/  
    /* LETRA PRECIO
A $1000
B $800
C $600
D $500
E $300
F $100
     PESO PRECIO
Entre 1 y 19 kg $100
Entre 20 y 49 kg $500
Entre 50 y 79 kg $800
Mayor que 80 kg $1000*/
     
    public double precioFinal(){
        String A="a";
        String B="b";
        String C="c";
        String D="d";
        String E="e";
        String F="f";
        if(A.charAt(0)==consumoenergetico){
            precio=precio+1000;
        }else if (B.charAt(0)==consumoenergetico){
            precio=precio+800;
        }else if (C.charAt(0)==consumoenergetico){
            precio=precio+600;
        }else if (D.charAt(0)==consumoenergetico){
            precio=precio+500;
        }else if (E.charAt(0)==consumoenergetico){
            precio=precio+300;
        }else if (F.charAt(0)==consumoenergetico){
            precio=precio+100;
        }
        if(peso>=1&&peso<=19){
            precio=precio+100;
        }else if(peso>=20&&peso<=49){
            precio=precio+500;
        }else if(peso>=50&&peso<=70){
            precio=precio+800;
        }if(peso>=80){
            precio=precio+1000;
        }
        return precio;
    }
     
     
     public double isPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoenergetico() {
        return consumoenergetico;
    }

    public void setConsumoenergetico(char consumoenergetico) {
        this.consumoenergetico = consumoenergetico;
    }

    public double isPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "electrodomestico{" + "precio=" + precio + ", color=" + color + ", consumoenergetico=" + consumoenergetico + ", peso=" + peso + '}';
    }

 

}
