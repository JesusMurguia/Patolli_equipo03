/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuentesdeConocimiento;

import Server.PatolliProtocol;
import blackboardObjects.BlackBoardObject;
import blackboardObjects.CrearPartidaBBO;
import blackboardObjects.UnirsePartidaBBO;
import blackboardObjects.tirarDadosBBO;
import blackboardObjects.turnoBBO;
import blackboardPattern.AbstractKnowledgeSource;
import blackboardPattern.BlackBoard;

/**
 *
 * @author javie
 */
public class UnirsePartidaKS extends AbstractKnowledgeSource{

   @Override
   public boolean isInterested(BlackBoardObject bbo, BlackBoard bb) {

          if (bbo instanceof UnirsePartidaBBO) {
               this.bbo = (UnirsePartidaBBO) bbo;
               this.bb = bb;

               return true;
          }

          return false;
     }

      /**
      * Processes a turnoBBO and returns a transformed tirarDadosBBO
     * @param blackBoardObject
     * @param bbo
     * @return 
      */
   @Override
     public void process() {
           UnirsePartidaBBO unirsePartidaBBO = (UnirsePartidaBBO)this.bbo;


           PatolliProtocol.blackboard.setJugador(unirsePartidaBBO.getJugador());
           
           unirsePartidaBBO.setReady(true);
           updateBlackBoardObject(unirsePartidaBBO);
          System.out.println("==>> unirsePartidaKS procesó unirsePartidaBBO");
         

     }

}
