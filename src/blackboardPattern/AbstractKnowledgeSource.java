package blackboardPattern;

import blackboardObjects.BlackBoardObject;

/**
 * The AbstractKnowledgeSource implements {@link KnowledgeSource}
 * 
 * @author Nalla Senthilnathan http://github.com/mapteb
 */

public abstract class AbstractKnowledgeSource implements KnowledgeSource {

     protected BlackBoardObject bbo;
     protected BlackBoard bb;

    public AbstractKnowledgeSource() {
    }

     
    
     @Override
     public void updateBlackBoardObject(BlackBoardObject bbo) {
          bb.addBlackBoardObject(bbo);
     }

}
