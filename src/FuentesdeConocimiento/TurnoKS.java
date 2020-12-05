package FuentesdeConocimiento;


import blackboardObjects.tirarDadosBBO;
import blackboardObjects.turnoBBO;
import blackboardPattern.AbstractKnowledgeSource;
import blackboardPattern.BlackBoard;
import blackboardObjects.BlackBoardObject;

/**
 * The FrontVehicleDataKS is an implementation of {@link AbstractKnowledgeSource}
 * This knowledge source operates on blackboard objects of the type FrontVehicleDataBBO
 * It transforms the FrontVehicleDataBBO into a DeltaSpeedDataBBO and adds it to the blackboard.
 * 
 * The process method in this class is just printing a message for now
 * 
 * @author Nalla Senthilnathan http://github.com/mapteb
 *
 */
public class TurnoKS extends AbstractKnowledgeSource {

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
      */
     public BlackBoardObject process(BlackBoardObject bbo) {
          BlackBoardObject tirardadosBBO = new tirarDadosBBO();


          try {
        	  //pretend the KS is working
               Thread.sleep(1000);
          } catch (InterruptedException iex) {
               //
          }
          
          System.out.println("==>> turnoKS procesó turnoBBO");
          return tirardadosBBO;

     }





}