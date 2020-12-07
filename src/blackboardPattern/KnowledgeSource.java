package blackboardPattern;

import blackboardObjects.BlackBoardObject;

/**
 * The BlackBoard notifies the BlackBoardController whenever it receives a BlackBoardObject
 * 
 * @author Nalla Senthilnathan http://github.com/mapteb
 *
 */
public interface KnowledgeSource  {

     public boolean isInterested(BlackBoardObject bbo, BlackBoard bb);

     public void process();

     public void updateBlackBoardObject(BlackBoardObject bbo);
}
