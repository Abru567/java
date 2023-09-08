package entidad;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 /*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular". Luego, crea un método "retirar_dinero" que permita retirar una cantidad de dinero
del saldo de la cuenta. Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.
 */
/**
 *
 * @author Ester
 */
public class cuenta {

    public cuenta() {
    }

    public int saldo;
    public String titular;
public void retirardinero(){
    Scanner leer=new Scanner(System.in);
    System.out.println("ingrese el numbre del titular");
    titular=leer.next();
    System.out.println("ingrese el saldo a retirar de la cuenta");
    int retiro=leer.nextInt();
    saldo=(int)(Math.random()*300000);
    if((retiro-saldo)<=0){
        System.out.println("el retiro de dinero de la  cuenta, fue exitoso");
    }else{
        System.out.println("saldo insuficiente");
        
    }
}
}
