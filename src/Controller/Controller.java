package Controller;

import blackboardPattern.AbstractBlackBoardController;
import blackboardPattern.BlackBoardObject;

/**
 * This blackboard controller gets notified when one or
 * more blackboard objects are added to the blackboard
 * 
 * @author Nalla Senthilnathan http://github.com/mapteb
 * 
 */
public class Controller extends AbstractBlackBoardController {

     public void execOutcome(BlackBoardObject bbo) {
          // TODO Auto-generated method stub
          System.out.println("==>> Se acabó el turno");
     }
}
