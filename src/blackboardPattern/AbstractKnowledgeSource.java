package blackboardPattern;

/**
 * The AbstractKnowledgeSource implements {@link KnowledgeSource}
 * 
 * @author Nalla Senthilnathan http://github.com/mapteb
 */

public abstract class AbstractKnowledgeSource implements KnowledgeSource {

     protected BlackBoardObject bbo;
     protected BlackBoard bb;

     @Override
     public void run() {
          updateBlackBoardObject(process(bbo));
     }

     @Override
     public void updateBlackBoardObject(BlackBoardObject bbo) {
          bb.addBlackBoardObject(bbo);
     }

}
