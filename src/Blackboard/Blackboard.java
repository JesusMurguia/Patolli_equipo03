package Blackboard;

import blackboardPattern.AbstractBlackBoard;
import blackboardObjects.BlackBoardObject;

public class Blackboard extends AbstractBlackBoard { 

     public void addBlackBoardObject(BlackBoardObject bbo) {
    	 
          System.out.println("==>> Blackboard recibió BBO "+bbo.getClass().getName());

          super.addBlackBoardObject(bbo);
     }
}
