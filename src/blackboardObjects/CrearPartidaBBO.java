/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackboardObjects;

import Dominio.Jugador;
import Dominio.Tablero;

/**
 *
 * @author javie
 */
public class CrearPartidaBBO extends AbstractBlackBoardObject {
    Jugador jugadorUno;
    Tablero tablero;

    public CrearPartidaBBO(Jugador jugadorUno, Tablero tablero) {
        this.jugadorUno = jugadorUno;
        this.tablero = tablero;
    }

    
    
    public CrearPartidaBBO(Jugador jugadorUno) {
        this.jugadorUno = jugadorUno;
    }

    public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }

    
    
    public Jugador getJugadorUno() {
        return jugadorUno;
    }

    public void setJugadorUno(Jugador jugadorUno) {
        this.jugadorUno = jugadorUno;
    }
    
    
}
