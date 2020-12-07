/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FuentesdeConocimiento;

import blackboardObjects.BlackBoardObject;
import blackboardObjects.tirarDadosBBO;
import blackboardObjects.turnoBBO;
import blackboardPattern.AbstractKnowledgeSource;
import blackboardPattern.BlackBoard;

/**
 *
 * @author javie
 */
public class SalirPartidaKS extends AbstractKnowledgeSource{

    @Override
    public boolean isInterested(BlackBoardObject bbo, BlackBoard bb) {

          if (bbo instanceof turnoBBO) {
               this.bbo = (turnoBBO) bbo;
               this.bb = bb;

               return true;
          }

          return false;
     }

     /**
      * Processes a turnoBBO and returns a transformed tirarDadosBBO
     * @param bbo
     * @return 
      */
    @Override
     public void process() {
          BlackBoardObject tirardadosBBO = new tirarDadosBBO();


          try {
        	  //pretend the KS is working
               Thread.sleep(1000);
          } catch (InterruptedException iex) {
               //
          }
          
          System.out.println("==>> turnoKS procesó turnoBBO");
          

     }

    
}
