/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thread;

import communication.Receiver;
import communication.Request;
import communication.Response;
import communication.Sender;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class ProcessClientsRequests extends Thread {

    Socket socket;
    Sender sender;
    Receiver receiver;

    public ProcessClientsRequests(Socket socket) {
        this.socket = socket;        
        sender = new Sender(socket);
        receiver = new Receiver(socket);
    }
    
    @Override
    public void run() {

        while (true) {
            try {

                Request request = (Request) receiver.receive();
                Response response = new Response();

                try {
                    switch (request.getOperation()) {
                        case UcitajListuMasinovodja:
                            
                            break;
                        default:
                            throw new AssertionError();
                    }
                } catch (Exception e) {
                    System.out.println("thread.ProcessClientsRequests.run()");
                    e.printStackTrace();
                    response.setException(e);
                }

            } catch (Exception ex) {
                Logger.getLogger(ProcessClientsRequests.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

}
