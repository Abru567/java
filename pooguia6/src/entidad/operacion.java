/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;

/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2. A continuación, se deben crear los siguientes métodos:
Método constructor con todos los atributos pasados por parámetro.
Método constructor sin los atributos pasados por parámetro.
Métodos get y set.
Método para crearOperacion(): que le pide al usuario los dos números y los guarda en los atributos del objeto.
Método sumar(): calcular la suma de los números y devolver el resultado al main.
Método restar(): calcular la resta de los números y devolver el resultado al main
Método multiplicar(): primero valida que no se haga una multiplicación por cero, si fuera a multiplicar por cero, el método devuelve 0 y se le informa 
al usuario el error. Si no, se hace la multiplicación y se devuelve el resultado al main
Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar una división por cero, el método devuelve 0 y se le informa al 
usuario el error se le informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
*/
/**
 *
 * @author Ester
 */
public class operacion {
    private int numero1;
private int numero2;
public int contruc1(int num,int num2){
    return numero1+numero2;
}
public int contruc2(){
    return numero1+numero2;
}

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public int getNumero2() {
        return numero2;
    }
    public int crearoperacion(){
        Scanner leer=new Scanner(System.in);
        numero1=leer.nextInt();
        numero2=leer.nextInt();
        return 0;
    }

public int sumar(){
    int num3=numero1+numero2;
    return num3;
}
public int restar(){
    int num3=numero1-numero2;
    return num3;
}
public int multiplicar(){
    if(numero1>0||numero2>0){
    int num3=numero1*numero2;
         return num3;
    }else{
    int num=0;
    return num;
    }
}
public int dividir(){
    if(numero1>0||numero2>0){
    int num3=numero1/numero2;
         return num3;
    }else{
    int num=0;
    return num;
    }
}

}



