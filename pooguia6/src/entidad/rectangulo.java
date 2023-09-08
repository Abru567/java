/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;
import java.util.Scanner;





//Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y un atributo privado altura. La clase incluirá un método para crear
//el rectángulo con los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la superficie del rectángulo y un método para 
//calcular el perímetro del rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura. Se deberán 
//además definir los métodos getters, setters y constructores correspondientes.
//Superficie = base * altura / Perímetro = (base + altura) * 2.
/**
 *
 * @author Ester
 */
public class rectangulo {

    public rectangulo() {
   
    }
   
    private int base;
    private int altura;

    public int getBase() {
        return base;
    }
    public int base(){
        return base;
    }
    public int altura(){
        return altura;
    }

    public int getAltura() {
        return altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
  
    public void crearRectangulo(){
        Scanner leer=new Scanner(System.in);
        base=leer.nextInt();
        altura=leer.nextInt();
    }
    
    public int perimetro(){
        int perimetro = (base + altura) * 2;
        return perimetro;
    }
    public int superficie(){
       int Superficie = base * altura;
       return Superficie;
    }
    public void rectangulo(){
      
       for(int i=0;i<altura-1;i++){
           if(i==0||i==altura-2){
           for(int j=0;j<base;j++){
        System.out.print("*");
        
           }System.out.println(" ");
           
           }
           if(i !=altura-2){
              
           System.out.print("*");
             
           if(i>=0&i<altura-2){
               for(int l=0;l<base-2;l++){
                  System.out.print(" ");
               }
               }
           System.out.print("*");
              
           }System.out.println(" ");
       }
            
       
    }
}

