
package entidad;

;
import java.util.List;


public class Mazo {
    private List<Carta> baraja;

    public Mazo() {
    }

    public List<Carta> getBaraja() {
        return baraja;
    }

    public void setBaraja(List<Carta> baraja) {
        this.baraja = baraja;
    }

    @Override
    public String toString() {
        return "Mazo{" + "baraja=" + baraja + '}';
    }
    
    
}
