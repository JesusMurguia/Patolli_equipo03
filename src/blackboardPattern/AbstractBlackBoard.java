package blackboardPattern;

import blackboardObjects.BlackBoardObject;
import java.util.Observable;

/**
 * The AbstractBlackBoard is an implementation of {@link BlackBoard}
 * It extends JDK's Observable class so it can notify the {@link BlackBoardController}
 * whenever it receives a BlackBoardObject
 * 
 * @author Nalla Senthilnathan http://github.com/mapteb
 *
 */
public abstract class AbstractBlackBoard extends Observable implements BlackBoard {
     @Override
     public void addBlackBoardObject(BlackBoardObject bbo) {

          setChanged();

          notifyController(bbo);
     }

     @Override
     public void notifyController(BlackBoardObject bbo) {
          notifyObservers(bbo);
     }
}