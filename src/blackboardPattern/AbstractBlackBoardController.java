package blackboardPattern;

import blackboardObjects.BlackBoardObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * The AbstractBlackBoardController implements {@link BlackBoardController}
 * 
 * @author Nalla Senthilnathan http://github.com/mapteb
 */
public abstract class AbstractBlackBoardController implements BlackBoardController {

     protected List<KnowledgeSource> ksList = new ArrayList<KnowledgeSource>();

     protected ExecutorService exsvc;

     @Override
     public void update(Observable bb, Object bbo) {
        
          if (((BlackBoardObject) bbo).isReady())
               execOutcome((BlackBoardObject) bbo);
          else {
            for (KnowledgeSource ks : ksList) {
                  
                    if (ks.isInterested((BlackBoardObject) bbo, (AbstractBlackBoard) bb)) {
                        
                         enrollKnowledgeSource(ks);
                         break;
                    }
               }
          }
     }

     @Override
     public void setKnowledgeSourceList(List<KnowledgeSource> ksList) {
          this.ksList = ksList;
     }

     @Override
     public void enrollKnowledgeSource(KnowledgeSource ks) {

        //  exsvc = Executors.newFixedThreadPool(1);
          //exsvc.submit(ks);
          //exsvc.shutdown();
          
          ks.process();

     }

}
