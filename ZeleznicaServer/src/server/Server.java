/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package server;

import java.net.ServerSocket;
import java.net.Socket;
import thread.ProcessClientsRequests;

/**
 *
 * @author User
 */
public class Server extends Thread {
      ProcessClientsRequests processClientsRequests=null;
    @Override
    public void run() { 
        try {
            ServerSocket serverSocket = new ServerSocket(9001);
            
            while (!isInterrupted()) {

                System.out.println("Waiting for connection...");
                Socket socket = serverSocket.accept();
                System.out.println("Connected!");
                handleClient(socket);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
   

    private void handleClient(Socket socket) throws Exception {
        processClientsRequests = new ProcessClientsRequests(socket);
        processClientsRequests.start();
    }

}
