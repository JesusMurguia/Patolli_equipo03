package FuentesdeConocimiento;

import blackboardObjects.apuestaBBO;
import blackboardObjects.movimientoBBO;
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
public class movimientoKS extends AbstractKnowledgeSource {

     public boolean isInterested(BlackBoardObject bbo, BlackBoard bb) {

          if (bbo instanceof movimientoBBO) {
        	  
               this.bbo = (movimientoBBO)bbo;
               this.bb = bb;

               return true;
          }
          return false;
     }

     public BlackBoardObject process(BlackBoardObject bbo) {
    	 
          BlackBoardObject apuestaBBO = new apuestaBBO();
          
          ((apuestaBBO)apuestaBBO).setReady(true);
          
          System.out.println("==>> movimientoKS procesó movimientoBBO");
          return apuestaBBO;

     }
}
