package blackboardObjects;

import java.io.Serializable;

/**
 * The AbstractBlackBoardObject is an implementation of {@link AbstractBlackBoardObject}
 * 
 * @author Nalla Senthilnathan http://github.com/mapteb
 *
 */
public abstract class AbstractBlackBoardObject implements BlackBoardObject, Serializable {

     protected boolean isReady;

     @Override
     public boolean isReady() {
          return isReady;
     }
     public void setReady(boolean isReady) {
          this.isReady = isReady;
     }

}
