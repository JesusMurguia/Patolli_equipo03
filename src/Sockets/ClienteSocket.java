/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sockets;

import InterfazGrafica.FrmMain;
import blackboardObjects.BlackBoardObject;
import blackboardObjects.ClienteBBO;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author gilberto.borrego
 */
public class ClienteSocket extends Observable{

    /**
     * @param args the command line arguments
     */
    Socket kkSocket = null;
    ObjectOutputStream out = null;
    ObjectInputStream in = null;
    ClienteBBO fromServer = null;

    public void enviarBBO(BlackBoardObject blackBoardObject) {

        try {
            System.out.println("arriba de null");
            kkSocket = new Socket("localhost", 4444);
            //Enviar bbo
            out = new ObjectOutputStream(kkSocket.getOutputStream());
            // recibir cliente bbo

            //enviando
            if (blackBoardObject != null) {
                System.out.println("enviando from cliente");
                out.writeObject(blackBoardObject);

            }

            in = new ObjectInputStream(kkSocket.getInputStream());
            //reciviendo
           
                fromServer = (ClienteBBO) in.readObject();

                for (int i = 0; i < fromServer.getJugadores().size(); i++) {
                    System.out.println(fromServer.getJugadores().get(i).getNombre());
                
            }
            this.setChanged();
            this.addObserver(new FrmMain());
            this.notifyObservers(fromServer);
            this.clearChanged();
            
            
               
                    
            
           

           //  in.close();
            //out.close();
            //kkSocket.close();            
        } catch (IOException | ClassNotFoundException ex) {

            Logger.getLogger(ClienteSocket.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
    }

}
