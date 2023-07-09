/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package thread;

import communication.Receiver;
import communication.Request;
import communication.Response;
import communication.Sender;
import controller.Controller;
import domain.DestinacijaVoznje;
import domain.Masinovodja;
import domain.Mesto;
import domain.Voz;
import domain.Voznja;
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
                            response.setResult(Controller.getInstance().ucitajListuMasinovodja());
                            break;
                        case KreirajMasinovodju:
                            Masinovodja masinovodja = (Masinovodja) request.getArgument();
                             Controller.getInstance().kreirajMasinovodju(masinovodja);
                            break;
                        case KreirajVoz:
                                Voz voz = (Voz) request.getArgument();
                            Controller.getInstance().kreirajVoz(voz);
                            break;
                        case UcitajListuVozova:
                            response.setResult(Controller.getInstance().ucitajListuVozova());
                            break;
                        case UcitajListuVoznji:
                            response.setResult(Controller.getInstance().ucitajListuVoznji());
                            break;    
                        case UcitajListuVrstaVozova:
                            response.setResult(Controller.getInstance().ucitajListuVrstiVozova());
                            break;  
                        case ZapamtiMasinovodju:
                            Masinovodja masinovodjaEdit = (Masinovodja) request.getArgument();
                            Controller.getInstance().zapamtiMasinovodju(masinovodjaEdit);
                            break;
                          case ZapamtiVoz:
                            Voz vozEdit = (Voz) request.getArgument();
                            Controller.getInstance().zapamtiVoz(vozEdit);
                            break;
                        case UcitajListuMesta:
                            response.setResult(Controller.getInstance().ucitajListuMesta());
                            break; 
                        case KreirajDestinacijuVoznje:
                            DestinacijaVoznje destinacija = (DestinacijaVoznje) request.getArgument();
                            Controller.getInstance().KreirajDestinaciju(destinacija);
                            break;
//                      case NadjiMasinovodju:
////                            Voznja voznjaEdit = (Voznja) request.getArgument();
//                            response.setResult(Controller.getInstance().nadjiMasinovodju());
//                            break;
//                      case PretraziVoznje:
//                            Voznja voznjaEdit = (Voznja) request.getArgument();
//                            Controller.getInstance().ZapamtiVoznju(voznjaEdit);
//                            break;
//                        case NadjiVoznju:
//                            Voznja voznjaEdit = (Voznja) request.getArgument();
//                            Controller.getInstance().ZapamtiVoznju(voznjaEdit);
//                            break;
//                        case KreirajDestinacijuVoznje:
//                            DestinacijaVoznje destinacija = (DestinacijaVoznje) request.getArgument();
//                            Controller.getInstance().KreirajDestinaciju(destinacija);
//                            break;
                        case KreirajVoznju:
                            Voznja voznja = (Voznja)request.getArgument();
                            response.setResult(Controller.getInstance().kreirajVoznju(voznja));
                            break;
                        case UcitajListuDestinacija:
                            response.setResult(Controller.getInstance().UcitajListuDestinacija());
                            break;  
//                        case DELETE_PRODUCT:
//                            Product productDelete = (Product) request.getArgument();
//                            Controller.getInstance().deleteProduct(productDelete);
//                            break;
//                        case ADD_INVOICE:
//                            Invoice invoiceInsert = (Invoice) request.getArgument();
//                            Controller.getInstance().addInvoice(invoiceInsert);
//                            response.setResult(invoiceInsert);
//                            break;

                    }
                } catch (Exception e) {
                    System.out.println("thread.ProcessClientsRequests.run()");
                    e.printStackTrace();
                    response.setException(e);
                }
                sender.send(response);
            } catch (Exception ex) {
                Logger.getLogger(ProcessClientsRequests.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

}
