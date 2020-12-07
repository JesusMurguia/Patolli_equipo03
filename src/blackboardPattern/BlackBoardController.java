package blackboardPattern;

/**
 * The BlackBoardController is an Observer that gets notified
 * whenever the BlackBoard receives a new BlackBoardObject
 * 
 * @author Nalla Senthilnathan http://github.com/mapteb
 */
import blackboardObjects.BlackBoardObject;
import java.util.List;
import java.util.Observer;


public interface BlackBoardController extends Observer {

     public void setKnowledgeSourceList(List<KnowledgeSource> ksList);

     public void enrollKnowledgeSource(KnowledgeSource ks);

     public void execOutcome(BlackBoardObject bbo);

}
