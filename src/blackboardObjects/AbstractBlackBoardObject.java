package blackboardObjects;

/**
 * The AbstractBlackBoardObject is an implementation of {@link AbstractBlackBoardObject}
 * 
 * @author Nalla Senthilnathan http://github.com/mapteb
 *
 */
public abstract class AbstractBlackBoardObject implements BlackBoardObject {

     protected boolean isReady;

     @Override
     public boolean isReady() {
          return isReady;
     }
     public void setReady(boolean isReady) {
          this.isReady = isReady;
     }

}
