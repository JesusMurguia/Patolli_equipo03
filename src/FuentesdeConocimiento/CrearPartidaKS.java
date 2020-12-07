/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuentesdeConocimiento;

import Server.PatolliProtocol;
import blackboardObjects.BlackBoardObject;
import blackboardObjects.CrearPartidaBBO;
import blackboardObjects.tirarDadosBBO;
import blackboardObjects.turnoBBO;
import blackboardPattern.AbstractKnowledgeSource;
import blackboardPattern.BlackBoard;

/**
 *
 * @author javie
 */
public class CrearPartidaKS extends AbstractKnowledgeSource {

    @Override
    public boolean isInterested(BlackBoardObject bbo, BlackBoard bb) {

          if (bbo instanceof CrearPartidaBBO) {
               this.bbo = (CrearPartidaBBO) bbo;
               this.bb = bb;

               return true;
          }

          return false;
     }

     /**
      * Processes a turnoBBO and returns a transformed tirarDadosBBO
     * 
      */
    @Override
     public void process() {
          CrearPartidaBBO crearPartidaBBO = (CrearPartidaBBO)this.bbo;
       

          PatolliProtocol.blackboard.setTablero(crearPartidaBBO.getTablero()); //
          PatolliProtocol.blackboard.setJugador(crearPartidaBBO.getJugadorUno());
          PatolliProtocol.blackboard.setNombreTurno(crearPartidaBBO.getJugadorUno().getNombre());
          
          // Thread.sleep(1000);
          crearPartidaBBO.setReady(true);
          updateBlackBoardObject(crearPartidaBBO);
          System.out.println("==>> crearPartidaKS procesó crearPartidaBBO");
        

     }

    
}
