/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackboardObjects;

import Dominio.Jugador;
import Dominio.Tablero;
import java.util.ArrayList;

/**
 *
 * @author javie
 */
public class ClienteBBO extends AbstractBlackBoardObject {

    Tablero tablero;
    ArrayList<Jugador> jugadores;
    String nombreTurno;

    public ClienteBBO(Tablero tablero, ArrayList<Jugador> jugadores, String nombreTurno) {
        this.tablero = tablero;
        this.jugadores = jugadores;
        this.nombreTurno = nombreTurno;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public String getNombreTurno() {
        return nombreTurno;
    }

    public void setNombreTurno(String nombreTurno) {
        this.nombreTurno = nombreTurno;
    }

}
