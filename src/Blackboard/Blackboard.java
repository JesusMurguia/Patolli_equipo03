package Blackboard;

import Dominio.Jugador;
import Dominio.Tablero;
import blackboardPattern.AbstractBlackBoard;
import blackboardObjects.BlackBoardObject;
import blackboardObjects.ClienteBBO;
import java.util.ArrayList;

public class Blackboard extends AbstractBlackBoard { 
Tablero tablero;
ArrayList<Jugador> jugadores = new ArrayList<>();
String nombreTurno;






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
    
     public void setJugador(Jugador jugador) {
        this.jugadores.add(jugador);
    }

    public String getNombreTurno() {
        return nombreTurno;
    }

    public void setNombreTurno(String nombreTurno) {
        this.nombreTurno = nombreTurno;
    }


    public ClienteBBO getbboCliente()
    {
        return new ClienteBBO(tablero, jugadores, nombreTurno);
    }
      




@Override
     public void addBlackBoardObject(BlackBoardObject bbo) {
    	 
          System.out.println("==>> Blackboard recibió BBO "+bbo.getClass().getName());

          super.addBlackBoardObject(bbo);
     }
}
