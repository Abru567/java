
package entidad;
/*Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.*/

public class Carta {
    private int numero;
    private String palo;

    public Carta() {
    }

    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }
    
    

    @Override
    public String toString() {
        return "Carta{" + "numero=" + numero + ", palo=" + palo + '}';
    }
    
    
    
    
    
}
