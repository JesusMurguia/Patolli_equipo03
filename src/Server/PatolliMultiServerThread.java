/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import blackboardObjects.BlackBoardObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author javie
 */
public class PatolliMultiServerThread extends Thread {

    private Socket socket = null;
    public static final ArrayList<Socket> sockets = new ArrayList<>();

    public ArrayList<Socket> getSockets() {
        return sockets;
    }

    public PatolliMultiServerThread(Socket socket) {
        super("patolliServer");

        sockets.add(socket);
        this.socket = socket;
    }

    @Override
    public void run() {
          ObjectOutputStream out =null;
        try {

            //recibir bbos
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());

            BlackBoardObject input, output=null;
            PatolliProtocol kkp = new PatolliProtocol();

            while((input = (BlackBoardObject) in.readObject()) != null && sockets.size() < 4)
            {
                System.out.println("reciviendo from cliente");
                output = kkp.processInput(input);
                
                
                for (int i = 0; i < sockets.size(); i++) {
                     out = new ObjectOutputStream(sockets.get(i).getOutputStream());
                     System.out.println(out);
                    out.writeObject(output);
                    out.flush();
                }
//                 for (Socket cliente : sockets) {
//                    System.out.println("entre");
//                    
//                     out = new ObjectOutputStream(cliente.getOutputStream());
//                     System.out.println(out);
//                    out.writeObject(output);
//                    out.flush();
//                 
//                  
//                } 
            
            }
            
               
                
            
           out.close();
           in.close();
          
          //  in.close();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(PatolliMultiServerThread.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
