package FuentesdeConocimiento;

import blackboardObjects.movimientoBBO;
import blackboardObjects.tirarDadosBBO;
import blackboardPattern.AbstractKnowledgeSource;
import blackboardPattern.BlackBoard;
import blackboardObjects.BlackBoardObject;

/**
 * The DeltaSpeedDataKS is an implementation of {@link AbstractKnowledgeSource}
 * This knowledge source operates on blackboard objects of the type DeltaSpeedDataBBO
 * It transforms the DeltaSpeedDataBBO into the BrakePedalBBO and adds it to the blackboard.
 * Also sets the isReady flag to true to indicate that a decision point has been reached
 * 
 * The process method in this class is just printing a message for now
 * 
 * @author Nalla Senthilnathan http://github.com/mapteb
 *
 */
public class tirarDadosKS extends AbstractKnowledgeSource {

     public boolean isInterested(BlackBoardObject bbo, BlackBoard bb) {

          if (bbo instanceof tirarDadosBBO) {
        	  
               this.bbo = (tirarDadosBBO)bbo;
               this.bb = bb;

               return true;
          }
          return false;
     }

     public BlackBoardObject process(BlackBoardObject bbo) {
    	 
          BlackBoardObject movimientoBBO = new movimientoBBO();
          
          
          System.out.println("==>> tirarDadosKS procesó tirarDadosBBO");
          return movimientoBBO;

     }
}
