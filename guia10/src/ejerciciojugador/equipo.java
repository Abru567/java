/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciojugador;

import java.util.List;

/**
 *
 * @author Ester
 */
public class equipo {
    public List<Jugador>jugadores;

    @Override
    public String toString() {
        return "equipo{" + "jugadores=" + jugadores + '}';
    }

    public equipo() {
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }
    
}
