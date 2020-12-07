/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;

import java.io.IOException;
import java.net.ServerSocket;

/**
 *
 * @author javie
 */
public class PatolliMultiServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       

        int portNumber = 4444;
        boolean listening = true;
      
        
        try (ServerSocket serverSocket = new ServerSocket(portNumber)) { 
            while (listening) {
                
	            new PatolliMultiServerThread(serverSocket.accept()).start();
                    
                  
	        }
	    } catch (IOException e) {
            System.err.println("Could not listen on port " + portNumber);
            System.exit(-1);
        }
    }
    
}
