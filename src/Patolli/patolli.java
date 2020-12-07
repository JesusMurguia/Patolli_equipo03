package Patolli;

import FuentesdeConocimiento.TirarDadosKS;
import FuentesdeConocimiento.TurnoKS;
import FuentesdeConocimiento.MovimientoKS;
import java.util.ArrayList;
import java.util.List;

import Blackboard.Blackboard;
import blackboardObjects.turnoBBO;
import Controller.Controller;
import blackboardPattern.KnowledgeSource;

/**
 * The patolli is the external driver of the blackboard system
 The patolli initializes the blackboard system
 by performing the following tasks:
 1. Add knowledge sources to the controller
 * 2. Register controller with the blackboard
 * 3. Add blackboard objects to the blackboard
 * 
 * @author Nalla Senthilnathan http://github.com/mapteb
 *
 */
public class patolli {

     private final Blackboard bb = new Blackboard();
     private final Controller controller = new Controller();

     /**
      * @param args
      */
     public static void main(String[] args) { 
          
          patolli feeder = new patolli();

          feeder.addKnowledgeSources();
          feeder.addController();
          feeder.addBlackBoardObjects();

     }


     /**
      * Add sensor data to the blackboard
      */
     public void addBlackBoardObjects() {
    	 
          int i = 0;
          while (i < 1) {
               bb.addBlackBoardObject(new turnoBBO());
               try {
                    Thread.sleep(1000);
               } catch (InterruptedException iex) {
                    //
               }
               i++;
          }

     }

     
     public void addController() {

          bb.addObserver(controller);
     }

     
     public void addKnowledgeSources() {

          List<KnowledgeSource> ksList = new ArrayList<KnowledgeSource>();
          ksList.add(new TurnoKS());
          ksList.add(new TirarDadosKS());
          ksList.add(new MovimientoKS());     
          controller.setKnowledgeSourceList(ksList);
     }


}
