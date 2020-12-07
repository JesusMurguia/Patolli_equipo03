/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackboardObjects;

import Dominio.Jugador;

/**
 *
 * @author javie
 */
public class UnirsePartidaBBO extends AbstractBlackBoardObject {
      Jugador jugador;

    public UnirsePartidaBBO(Jugador jugadorUno) {
        this.jugador = jugadorUno;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugadorUno(Jugador jugadorUno) {
        this.jugador = jugadorUno;
    }
      
      
      
}
