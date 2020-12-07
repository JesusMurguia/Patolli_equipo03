/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import Blackboard.Blackboard;
import Controller.Controller;
import FuentesdeConocimiento.CrearPartidaKS;
import FuentesdeConocimiento.MovimientoKS;
import FuentesdeConocimiento.PagarApuestaKS;
import FuentesdeConocimiento.SalirPartidaKS;
import FuentesdeConocimiento.TirarDadosKS;
import FuentesdeConocimiento.TurnoKS;
import FuentesdeConocimiento.UnirsePartidaKS;
import blackboardObjects.BlackBoardObject;
import blackboardObjects.CrearPartidaBBO;
import blackboardObjects.UnirsePartidaBBO;
import blackboardPattern.KnowledgeSource;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author javie
 */
public class PatolliProtocol {

    /**
     *
     */
    public static final Blackboard blackboard = new Blackboard();
    Controller controller = new Controller();

    public void addObserver() {
        blackboard.addObserver(controller);
    }

    public void addKnowledgeSources() {

        List<KnowledgeSource> ksList = new ArrayList<>();
        ksList.add(new CrearPartidaKS());
        ksList.add(new UnirsePartidaKS());
        ksList.add(new TurnoKS());
        ksList.add(new TirarDadosKS());
        ksList.add(new MovimientoKS());
        ksList.add(new SalirPartidaKS());
        ksList.add(new PagarApuestaKS());
        controller.setKnowledgeSourceList(ksList);
    }

    public BlackBoardObject processInput(BlackBoardObject blackBoardObject) {

        if (blackBoardObject instanceof CrearPartidaBBO) {
            CrearPartidaBBO crearPartidaBBO = (CrearPartidaBBO) blackBoardObject;
            addKnowledgeSources();
            addObserver();
            blackboard.addBlackBoardObject(crearPartidaBBO);

        } else if (blackBoardObject instanceof UnirsePartidaBBO) {

            UnirsePartidaBBO unirsePartidaBBO = (UnirsePartidaBBO) blackBoardObject;
            blackboard.addBlackBoardObject(unirsePartidaBBO);
          

        }

        return blackboard.getbboCliente();
    }
}
